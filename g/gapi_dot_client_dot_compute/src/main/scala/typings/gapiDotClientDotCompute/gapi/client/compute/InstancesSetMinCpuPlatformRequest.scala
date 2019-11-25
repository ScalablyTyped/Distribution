package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetMinCpuPlatformRequest extends js.Object {
  /** Minimum cpu/platform this instance should be started at. */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
}

object InstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(minCpuPlatform: String = null): InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesSetMinCpuPlatformRequest]
  }
}

