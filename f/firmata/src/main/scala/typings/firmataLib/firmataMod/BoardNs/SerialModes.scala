package typings
package firmataLib.firmataMod.BoardNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CONTINUOUS_READ")(CONTINUOUS_READ)
    __obj.updateDynamic("STOP_READING")(STOP_READING)
    __obj.asInstanceOf[SerialModes]
  }
}

