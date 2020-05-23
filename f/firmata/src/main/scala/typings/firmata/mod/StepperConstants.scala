package typings.firmata.mod

import typings.firmata.anon.ACCEL
import typings.firmata.anon.CCW
import typings.firmata.anon.DRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperConstants extends js.Object {
  var DIRECTION: CCW
  var RUNSTATE: ACCEL
  var TYPE: DRIVER
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: CCW, RUNSTATE: ACCEL, TYPE: DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], RUNSTATE = RUNSTATE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperConstants]
  }
}

