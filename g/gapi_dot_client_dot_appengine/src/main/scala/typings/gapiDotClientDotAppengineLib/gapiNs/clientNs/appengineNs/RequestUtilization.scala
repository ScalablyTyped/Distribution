package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestUtilization extends js.Object {
  /** Target number of concurrent requests. */
  var targetConcurrentRequests: js.UndefOr[scala.Double] = js.undefined
  /** Target requests per second. */
  var targetRequestCountPerSecond: js.UndefOr[scala.Double] = js.undefined
}

object RequestUtilization {
  @scala.inline
  def apply(
    targetConcurrentRequests: scala.Int | scala.Double = null,
    targetRequestCountPerSecond: scala.Int | scala.Double = null
  ): RequestUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetConcurrentRequests != null) __obj.updateDynamic("targetConcurrentRequests")(targetConcurrentRequests.asInstanceOf[js.Any])
    if (targetRequestCountPerSecond != null) __obj.updateDynamic("targetRequestCountPerSecond")(targetRequestCountPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUtilization]
  }
}

