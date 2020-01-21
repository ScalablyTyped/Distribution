package typings.firmata.mod

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
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ.asInstanceOf[js.Any], STOP_READING = STOP_READING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerialModes]
  }
}

