package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual Replica within a Pool. Replicas are automatically created by
  * the replica pool, using the template provided by the user. You cannot
  * directly create replicas.
  */
@js.native
trait Schema$Replica extends js.Object {
  /**
    * [Output Only] The name of the Replica object.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The self-link of the Replica.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Last known status of the Replica.
    */
  var status: js.UndefOr[Schema$ReplicaStatus] = js.native
}

object Schema$Replica {
  @scala.inline
  def apply(name: String = null, selfLink: String = null, status: Schema$ReplicaStatus = null): Schema$Replica = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Replica]
  }
}

