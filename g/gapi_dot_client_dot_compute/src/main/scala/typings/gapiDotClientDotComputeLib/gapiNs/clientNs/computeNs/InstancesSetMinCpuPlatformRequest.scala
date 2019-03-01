package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetMinCpuPlatformRequest extends js.Object {
  /** Minimum cpu/platform this instance should be started at. */
  var minCpuPlatform: js.UndefOr[java.lang.String] = js.undefined
}

object InstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(minCpuPlatform: java.lang.String = null): InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform)
    __obj.asInstanceOf[InstancesSetMinCpuPlatformRequest]
  }
}

