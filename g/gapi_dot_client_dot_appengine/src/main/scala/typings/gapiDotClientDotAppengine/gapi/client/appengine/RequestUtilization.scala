package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestUtilization extends js.Object {
  /** Target number of concurrent requests. */
  var targetConcurrentRequests: js.UndefOr[Double] = js.undefined
  /** Target requests per second. */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.undefined
}

object RequestUtilization {
  @scala.inline
  def apply(targetConcurrentRequests: Int | Double = null, targetRequestCountPerSecond: Int | Double = null): RequestUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetConcurrentRequests != null) __obj.updateDynamic("targetConcurrentRequests")(targetConcurrentRequests.asInstanceOf[js.Any])
    if (targetRequestCountPerSecond != null) __obj.updateDynamic("targetRequestCountPerSecond")(targetRequestCountPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUtilization]
  }
}

