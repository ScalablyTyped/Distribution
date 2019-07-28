package typings.firmata

import typings.firmata.firmataMod.STEPPER_RUN_STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACCEL extends js.Object {
  var ACCEL: STEPPER_RUN_STATE
  var DECEL: STEPPER_RUN_STATE
  var RUN: STEPPER_RUN_STATE
  var STOP: STEPPER_RUN_STATE
}

object Anon_ACCEL {
  @scala.inline
  def apply(
    ACCEL: STEPPER_RUN_STATE,
    DECEL: STEPPER_RUN_STATE,
    RUN: STEPPER_RUN_STATE,
    STOP: STEPPER_RUN_STATE
  ): Anon_ACCEL = {
    val __obj = js.Dynamic.literal(ACCEL = ACCEL, DECEL = DECEL, RUN = RUN, STOP = STOP)
  
    __obj.asInstanceOf[Anon_ACCEL]
  }
}

