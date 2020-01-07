package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesSetMinCpuPlatformRequest extends js.Object {
  /**
    * Minimum cpu/platform this instance should be started at.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object Schema$InstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(minCpuPlatform: String = null): Schema$InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesSetMinCpuPlatformRequest]
  }
}

