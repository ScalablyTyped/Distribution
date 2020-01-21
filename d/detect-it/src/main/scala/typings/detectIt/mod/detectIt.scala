package typings.detectIt.mod

import typings.detectIt.detectItStrings.coarse
import typings.detectIt.detectItStrings.fine
import typings.detectIt.detectItStrings.hover
import typings.detectIt.detectItStrings.hybrid
import typings.detectIt.detectItStrings.mouseOnly
import typings.detectIt.detectItStrings.none
import typings.detectIt.detectItStrings.touchOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectIt extends js.Object {
  var deviceType: hybrid | mouseOnly | touchOnly
  var hasMouse: Boolean
  var hasTouch: Boolean
  var maxTouchPoints: Double
  var passiveEvents: Boolean
  var primaryHover: hover | none
  var primaryPointer: coarse | fine | none
  var state: typings.detectIt.mod.state
  def update(): Unit
}

object detectIt {
  @scala.inline
  def apply(
    deviceType: hybrid | mouseOnly | touchOnly,
    hasMouse: Boolean,
    hasTouch: Boolean,
    maxTouchPoints: Double,
    passiveEvents: Boolean,
    primaryHover: hover | none,
    primaryPointer: coarse | fine | none,
    state: state,
    update: () => Unit
  ): detectIt = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectIt]
  }
}

