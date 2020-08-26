package typings.firmata.mod

import typings.firmata.anon.ACCEL
import typings.firmata.anon.CCW
import typings.firmata.anon.DRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperConstants extends js.Object {
  var DIRECTION: CCW = js.native
  var RUNSTATE: ACCEL = js.native
  var TYPE: DRIVER = js.native
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: CCW, RUNSTATE: ACCEL, TYPE: DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], RUNSTATE = RUNSTATE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperConstants]
  }
  @scala.inline
  implicit class StepperConstantsOps[Self <: StepperConstants] (val x: Self) extends AnyVal {
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
    def setDIRECTION(value: CCW): Self = this.set("DIRECTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUNSTATE(value: ACCEL): Self = this.set("RUNSTATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE(value: DRIVER): Self = this.set("TYPE", value.asInstanceOf[js.Any])
  }
  
}

