package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  /**
    * The fingerprint of the target pools information. Use this optional
    * property to prevent conflicts when multiple users change the target pools
    * settings concurrently. Obtain the fingerprint with the
    * instanceGroupManagers.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of target pool URLs that instances in this managed instance
    * group belong to. The managed instance group applies these target pools to
    * all of the instances in the group. Existing instances and new instances
    * in the group all receive these target pool settings.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstanceGroupManagersSetTargetPoolsRequest {
  @scala.inline
  def apply(fingerprint: String = null, targetPools: js.Array[String] = null): SchemaInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetTargetPoolsRequest]
  }
}

