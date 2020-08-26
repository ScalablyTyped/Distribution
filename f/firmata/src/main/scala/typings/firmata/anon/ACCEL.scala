package typings.firmata.anon

import typings.firmata.mod.STEPPER_RUN_STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACCEL extends js.Object {
  var ACCEL: STEPPER_RUN_STATE = js.native
  var DECEL: STEPPER_RUN_STATE = js.native
  var RUN: STEPPER_RUN_STATE = js.native
  var STOP: STEPPER_RUN_STATE = js.native
}

object ACCEL {
  @scala.inline
  def apply(
    ACCEL: STEPPER_RUN_STATE,
    DECEL: STEPPER_RUN_STATE,
    RUN: STEPPER_RUN_STATE,
    STOP: STEPPER_RUN_STATE
  ): ACCEL = {
    val __obj = js.Dynamic.literal(ACCEL = ACCEL.asInstanceOf[js.Any], DECEL = DECEL.asInstanceOf[js.Any], RUN = RUN.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACCEL]
  }
  @scala.inline
  implicit class ACCELOps[Self <: ACCEL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setACCEL(value: STEPPER_RUN_STATE): Self = this.set("ACCEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDECEL(value: STEPPER_RUN_STATE): Self = this.set("DECEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUN(value: STEPPER_RUN_STATE): Self = this.set("RUN", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTOP(value: STEPPER_RUN_STATE): Self = this.set("STOP", value.asInstanceOf[js.Any])
  }
  
}

