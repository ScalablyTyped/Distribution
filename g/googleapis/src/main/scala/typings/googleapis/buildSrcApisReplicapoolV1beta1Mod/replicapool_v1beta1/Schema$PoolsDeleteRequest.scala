package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PoolsDeleteRequest extends js.Object {
  /**
    * If there are instances you would like to keep, you can specify them here.
    * These instances won&#39;t be deleted, but the associated replica objects
    * will be removed.
    */
  var abandonInstances: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PoolsDeleteRequest {
  @scala.inline
  def apply(abandonInstances: js.Array[String] = null): Schema$PoolsDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (abandonInstances != null) __obj.updateDynamic("abandonInstances")(abandonInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PoolsDeleteRequest]
  }
}

