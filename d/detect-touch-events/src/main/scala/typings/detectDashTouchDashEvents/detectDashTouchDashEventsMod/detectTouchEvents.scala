package typings.detectDashTouchDashEvents.detectDashTouchDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectTouchEvents extends js.Object {
  var hasApi: Boolean
  var maxTouchPoints: Double
  def update(): Unit
}

object detectTouchEvents {
  @scala.inline
  def apply(hasApi: Boolean, maxTouchPoints: Double, update: () => Unit): detectTouchEvents = {
    val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectTouchEvents]
  }
}

