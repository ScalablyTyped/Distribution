package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaConfiguration extends js.Object {
  /**
    * Specifies if the replica is the failover target. If the field is set to true the replica will be designated as a failover replica. In case the master
    * instance fails, the replica instance will be promoted as the new master instance.
    * Only one replica can be specified as failover target, and the replica has to be in different zone with the master instance.
    */
  var failoverTarget: js.UndefOr[Boolean] = js.native
  /** This is always sql#replicaConfiguration. */
  var kind: js.UndefOr[String] = js.native
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises master. Replication configuration information such as the username, password,
    * certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is
    * stored by MySQL in a file named master.info in the data directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[MySqlReplicaConfiguration] = js.native
}

object ReplicaConfiguration {
  @scala.inline
  def apply(): ReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaConfiguration]
  }
  @scala.inline
  implicit class ReplicaConfigurationOps[Self <: ReplicaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailoverTarget(value: Boolean): Self = this.set("failoverTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailoverTarget: Self = this.set("failoverTarget", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMysqlReplicaConfiguration(value: MySqlReplicaConfiguration): Self = this.set("mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMysqlReplicaConfiguration: Self = this.set("mysqlReplicaConfiguration", js.undefined)
  }
  
}

