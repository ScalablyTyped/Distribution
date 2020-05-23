package typings.firmata.anon

import typings.firmata.mod.STEPPER_DIRECTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CCW extends js.Object {
  var CCW: STEPPER_DIRECTION
  var CW: STEPPER_DIRECTION
}

object CCW {
  @scala.inline
  def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): CCW = {
    val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
    __obj.asInstanceOf[CCW]
  }
}

