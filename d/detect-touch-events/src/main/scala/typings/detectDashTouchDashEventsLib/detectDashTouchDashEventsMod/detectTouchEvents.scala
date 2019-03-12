package typings
package detectDashTouchDashEventsLib.detectDashTouchDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectTouchEvents extends js.Object {
  var hasApi: scala.Boolean
  var maxTouchPoints: scala.Double
  def update(): scala.Unit
}

object detectTouchEvents {
  @scala.inline
  def apply(hasApi: scala.Boolean, maxTouchPoints: scala.Double, update: () => scala.Unit): detectTouchEvents = {
    val __obj = js.Dynamic.literal(hasApi = hasApi, maxTouchPoints = maxTouchPoints, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectTouchEvents]
  }
}

