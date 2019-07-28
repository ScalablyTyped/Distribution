package typings.firmata.firmataMod

import typings.firmata.Anon_ACCEL
import typings.firmata.Anon_CCW
import typings.firmata.Anon_DRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperConstants extends js.Object {
  var DIRECTION: Anon_CCW
  var RUNSTATE: Anon_ACCEL
  var TYPE: Anon_DRIVER
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: Anon_CCW, RUNSTATE: Anon_ACCEL, TYPE: Anon_DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION, RUNSTATE = RUNSTATE, TYPE = TYPE)
  
    __obj.asInstanceOf[StepperConstants]
  }
}

