package typings.firmata

import typings.firmata.firmataMod.STEPPER_DIRECTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CCW extends js.Object {
  var CCW: STEPPER_DIRECTION
  var CW: STEPPER_DIRECTION
}

object Anon_CCW {
  @scala.inline
  def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): Anon_CCW = {
    val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CCW]
  }
}

