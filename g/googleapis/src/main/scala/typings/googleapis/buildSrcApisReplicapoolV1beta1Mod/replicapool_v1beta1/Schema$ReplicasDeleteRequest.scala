package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReplicasDeleteRequest extends js.Object {
  /**
    * Whether the instance resource represented by this replica should be
    * deleted or abandoned. If abandoned, the replica will be deleted but the
    * virtual machine instance will remain. By default, this is set to false
    * and the instance will be deleted along with the replica.
    */
  var abandonInstance: js.UndefOr[Boolean] = js.native
}

object Schema$ReplicasDeleteRequest {
  @scala.inline
  def apply(abandonInstance: js.UndefOr[Boolean] = js.undefined): Schema$ReplicasDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abandonInstance)) __obj.updateDynamic("abandonInstance")(abandonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplicasDeleteRequest]
  }
}

