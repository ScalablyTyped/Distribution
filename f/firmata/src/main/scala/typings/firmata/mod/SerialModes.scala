package typings.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialModes extends js.Object {
  var CONTINUOUS_READ: SERIAL_MODE = js.native
  var STOP_READING: SERIAL_MODE = js.native
}

object SerialModes {
  @scala.inline
  def apply(CONTINUOUS_READ: SERIAL_MODE, STOP_READING: SERIAL_MODE): SerialModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ.asInstanceOf[js.Any], STOP_READING = STOP_READING.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialModes]
  }
  @scala.inline
  implicit class SerialModesOps[Self <: SerialModes] (val x: Self) extends AnyVal {
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
    def setCONTINUOUS_READ(value: SERIAL_MODE): Self = this.set("CONTINUOUS_READ", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTOP_READING(value: SERIAL_MODE): Self = this.set("STOP_READING", value.asInstanceOf[js.Any])
  }
  
}

