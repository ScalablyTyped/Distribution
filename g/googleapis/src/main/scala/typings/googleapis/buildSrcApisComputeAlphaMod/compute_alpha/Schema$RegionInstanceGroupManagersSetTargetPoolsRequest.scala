package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  /**
    * Fingerprint of the target pools information, which is a hash of the
    * contents. This field is used for optimistic locking when you update the
    * target pool entries. This field is optional.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The URL of all TargetPool resources to which instances in the
    * instanceGroup field are added. The target pools automatically apply to
    * all of the instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RegionInstanceGroupManagersSetTargetPoolsRequest {
  @scala.inline
  def apply(fingerprint: String = null, targetPools: js.Array[String] = null): Schema$RegionInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersSetTargetPoolsRequest]
  }
}

