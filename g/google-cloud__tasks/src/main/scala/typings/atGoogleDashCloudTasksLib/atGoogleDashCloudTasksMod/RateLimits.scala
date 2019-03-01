package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimits extends js.Object {
  var maxBurstSize: scala.Double
  var maxConcurrentDispatches: scala.Double
  var maxDispatchesPerSecond: scala.Double
}

object RateLimits {
  @scala.inline
  def apply(
    maxBurstSize: scala.Double,
    maxConcurrentDispatches: scala.Double,
    maxDispatchesPerSecond: scala.Double
  ): RateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxBurstSize")(maxBurstSize)
    __obj.updateDynamic("maxConcurrentDispatches")(maxConcurrentDispatches)
    __obj.updateDynamic("maxDispatchesPerSecond")(maxDispatchesPerSecond)
    __obj.asInstanceOf[RateLimits]
  }
}

