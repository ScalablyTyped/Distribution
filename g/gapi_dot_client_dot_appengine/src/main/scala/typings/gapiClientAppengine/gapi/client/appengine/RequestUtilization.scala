package typings.gapiClientAppengine.gapi.client.appengine

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
  def apply(
    targetConcurrentRequests: js.UndefOr[Double] = js.undefined,
    targetRequestCountPerSecond: js.UndefOr[Double] = js.undefined
  ): RequestUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetConcurrentRequests)) __obj.updateDynamic("targetConcurrentRequests")(targetConcurrentRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRequestCountPerSecond)) __obj.updateDynamic("targetRequestCountPerSecond")(targetRequestCountPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUtilization]
  }
}

