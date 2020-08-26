package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClientSqladmin.anon.Available
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInstance extends js.Object {
  /**
    * FIRST_GEN: Basic Cloud SQL instance that runs in a Google-managed container.
    * SECOND_GEN: A newer Cloud SQL backend that runs in a Compute Engine VM.
    * EXTERNAL: A MySQL server that is not managed by Google.
    */
  var backendType: js.UndefOr[String] = js.native
  /** Connection name of the Cloud SQL instance used in connection strings. */
  var connectionName: js.UndefOr[String] = js.native
  /**
    * The current disk usage of the instance in bytes. This property has been deprecated. Users should use the
    * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see
    * https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ for details.
    */
  var currentDiskSize: js.UndefOr[String] = js.native
  /**
    * The database engine type and version. The databaseVersion field can not be changed after instance creation. MySQL Second Generation instances:
    * MYSQL_5_7 (default) or MYSQL_5_6. PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or MYSQL_5_5
    */
  var databaseVersion: js.UndefOr[String] = js.native
  /** HTTP 1.1 Entity tag for the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The name and status of the failover replica. This property is applicable only to Second Generation instances. */
  var failoverReplica: js.UndefOr[Available] = js.native
  /**
    * The GCE zone that the instance is serving from. In case when the instance is failed over to standby zone, this value may be different with what user
    * specified in the settings.
    */
  var gceZone: js.UndefOr[String] = js.native
  /**
    * The instance type. This can be one of the following.
    * CLOUD_SQL_INSTANCE: A Cloud SQL instance that is not replicating from a master.
    * ON_PREMISES_INSTANCE: An instance running on the customer's premises.
    * READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
    */
  var instanceType: js.UndefOr[String] = js.native
  /** The assigned IP addresses for the instance. */
  var ipAddresses: js.UndefOr[js.Array[IpMapping]] = js.native
  /** The IPv6 address assigned to the instance. This property is applicable only to First Generation instances. */
  var ipv6Address: js.UndefOr[String] = js.native
  /** This is always sql#instance. */
  var kind: js.UndefOr[String] = js.native
  /** The name of the instance which will act as master in the replication setup. */
  var masterInstanceName: js.UndefOr[String] = js.native
  /** The maximum disk size of the instance in bytes. */
  var maxDiskSize: js.UndefOr[String] = js.native
  /** Name of the Cloud SQL instance. This does not include the project ID. */
  var name: js.UndefOr[String] = js.native
  /** Configuration specific to on-premises instances. */
  var onPremisesConfiguration: js.UndefOr[OnPremisesConfiguration] = js.native
  /** The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable. */
  var project: js.UndefOr[String] = js.native
  /**
    * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN instances only), asia-east1 or europe-west1. Defaults to
    * us-central or us-central1 depending on the instance type (First Generation or Second Generation). The region can not be changed after instance
    * creation.
    */
  var region: js.UndefOr[String] = js.native
  /** Configuration specific to read-replicas replicating from on-premises masters. */
  var replicaConfiguration: js.UndefOr[ReplicaConfiguration] = js.native
  /** The replicas of the instance. */
  var replicaNames: js.UndefOr[js.Array[String]] = js.native
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** SSL configuration. */
  var serverCaCert: js.UndefOr[SslCert] = js.native
  /** The service account email address assigned to the instance. This property is applicable only to Second Generation instances. */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
  /** The user settings. */
  var settings: js.UndefOr[Settings] = js.native
  /**
    * The current serving state of the Cloud SQL instance. This can be one of the following.
    * RUNNABLE: The instance is running, or is ready to run when accessed.
    * SUSPENDED: The instance is not available, for example due to problems with billing.
    * PENDING_CREATE: The instance is being created.
    * MAINTENANCE: The instance is down for maintenance.
    * FAILED: The instance creation failed.
    * UNKNOWN_STATE: The state of the instance is unknown.
    */
  var state: js.UndefOr[String] = js.native
  /** If the instance state is SUSPENDED, the reason for the suspension. */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.native
}

object DatabaseInstance {
  @scala.inline
  def apply(): DatabaseInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInstance]
  }
  @scala.inline
  implicit class DatabaseInstanceOps[Self <: DatabaseInstance] (val x: Self) extends AnyVal {
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
    def setBackendType(value: String): Self = this.set("backendType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendType: Self = this.set("backendType", js.undefined)
    @scala.inline
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
    @scala.inline
    def setCurrentDiskSize(value: String): Self = this.set("currentDiskSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDiskSize: Self = this.set("currentDiskSize", js.undefined)
    @scala.inline
    def setDatabaseVersion(value: String): Self = this.set("databaseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseVersion: Self = this.set("databaseVersion", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFailoverReplica(value: Available): Self = this.set("failoverReplica", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailoverReplica: Self = this.set("failoverReplica", js.undefined)
    @scala.inline
    def setGceZone(value: String): Self = this.set("gceZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGceZone: Self = this.set("gceZone", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setIpAddressesVarargs(value: IpMapping*): Self = this.set("ipAddresses", js.Array(value :_*))
    @scala.inline
    def setIpAddresses(value: js.Array[IpMapping]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddresses: Self = this.set("ipAddresses", js.undefined)
    @scala.inline
    def setIpv6Address(value: String): Self = this.set("ipv6Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Address: Self = this.set("ipv6Address", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMasterInstanceName(value: String): Self = this.set("masterInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterInstanceName: Self = this.set("masterInstanceName", js.undefined)
    @scala.inline
    def setMaxDiskSize(value: String): Self = this.set("maxDiskSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDiskSize: Self = this.set("maxDiskSize", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnPremisesConfiguration(value: OnPremisesConfiguration): Self = this.set("onPremisesConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesConfiguration: Self = this.set("onPremisesConfiguration", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setReplicaConfiguration(value: ReplicaConfiguration): Self = this.set("replicaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaConfiguration: Self = this.set("replicaConfiguration", js.undefined)
    @scala.inline
    def setReplicaNamesVarargs(value: String*): Self = this.set("replicaNames", js.Array(value :_*))
    @scala.inline
    def setReplicaNames(value: js.Array[String]): Self = this.set("replicaNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaNames: Self = this.set("replicaNames", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setServerCaCert(value: SslCert): Self = this.set("serverCaCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerCaCert: Self = this.set("serverCaCert", js.undefined)
    @scala.inline
    def setServiceAccountEmailAddress(value: String): Self = this.set("serviceAccountEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountEmailAddress: Self = this.set("serviceAccountEmailAddress", js.undefined)
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSuspensionReasonVarargs(value: String*): Self = this.set("suspensionReason", js.Array(value :_*))
    @scala.inline
    def setSuspensionReason(value: js.Array[String]): Self = this.set("suspensionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspensionReason: Self = this.set("suspensionReason", js.undefined)
  }
  
}

