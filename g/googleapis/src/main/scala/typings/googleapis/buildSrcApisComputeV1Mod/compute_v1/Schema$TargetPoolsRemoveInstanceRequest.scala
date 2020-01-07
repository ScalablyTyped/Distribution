package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetPoolsRemoveInstanceRequest extends js.Object {
  /**
    * URLs of the instances to be removed from target pool.
    */
  var instances: js.UndefOr[js.Array[Schema$InstanceReference]] = js.native
}

object Schema$TargetPoolsRemoveInstanceRequest {
  @scala.inline
  def apply(instances: js.Array[Schema$InstanceReference] = null): Schema$TargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetPoolsRemoveInstanceRequest]
  }
}

