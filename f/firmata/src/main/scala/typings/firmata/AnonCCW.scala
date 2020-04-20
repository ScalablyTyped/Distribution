package typings.firmata

import typings.firmata.mod.STEPPER_DIRECTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCCW extends js.Object {
  var CCW: STEPPER_DIRECTION
  var CW: STEPPER_DIRECTION
}

object AnonCCW {
  @scala.inline
  def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): AnonCCW = {
    val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCCW]
  }
}

