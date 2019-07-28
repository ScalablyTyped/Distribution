package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialModes extends js.Object {
  var CONTINUOUS_READ: SERIAL_MODE
  var STOP_READING: SERIAL_MODE
}

object SerialModes {
  @scala.inline
  def apply(CONTINUOUS_READ: SERIAL_MODE, STOP_READING: SERIAL_MODE): SerialModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ, STOP_READING = STOP_READING)
  
    __obj.asInstanceOf[SerialModes]
  }
}

