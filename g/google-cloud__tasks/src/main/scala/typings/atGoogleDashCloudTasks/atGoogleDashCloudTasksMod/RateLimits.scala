package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimits extends js.Object {
  var maxBurstSize: Double
  var maxConcurrentDispatches: Double
  var maxDispatchesPerSecond: Double
}

object RateLimits {
  @scala.inline
  def apply(maxBurstSize: Double, maxConcurrentDispatches: Double, maxDispatchesPerSecond: Double): RateLimits = {
    val __obj = js.Dynamic.literal(maxBurstSize = maxBurstSize, maxConcurrentDispatches = maxConcurrentDispatches, maxDispatchesPerSecond = maxDispatchesPerSecond)
  
    __obj.asInstanceOf[RateLimits]
  }
}

