package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialPortIds extends js.Object {
  var DEFAULT: SERIAL_PORT_ID
  var HW_SERIAL0: SERIAL_PORT_ID
  var HW_SERIAL1: SERIAL_PORT_ID
  var HW_SERIAL2: SERIAL_PORT_ID
  var HW_SERIAL3: SERIAL_PORT_ID
  var SW_SERIAL0: SERIAL_PORT_ID
  var SW_SERIAL1: SERIAL_PORT_ID
  var SW_SERIAL2: SERIAL_PORT_ID
  var SW_SERIAL3: SERIAL_PORT_ID
}

object SerialPortIds {
  @scala.inline
  def apply(
    DEFAULT: SERIAL_PORT_ID,
    HW_SERIAL0: SERIAL_PORT_ID,
    HW_SERIAL1: SERIAL_PORT_ID,
    HW_SERIAL2: SERIAL_PORT_ID,
    HW_SERIAL3: SERIAL_PORT_ID,
    SW_SERIAL0: SERIAL_PORT_ID,
    SW_SERIAL1: SERIAL_PORT_ID,
    SW_SERIAL2: SERIAL_PORT_ID,
    SW_SERIAL3: SERIAL_PORT_ID
  ): SerialPortIds = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT, HW_SERIAL0 = HW_SERIAL0, HW_SERIAL1 = HW_SERIAL1, HW_SERIAL2 = HW_SERIAL2, HW_SERIAL3 = HW_SERIAL3, SW_SERIAL0 = SW_SERIAL0, SW_SERIAL1 = SW_SERIAL1, SW_SERIAL2 = SW_SERIAL2, SW_SERIAL3 = SW_SERIAL3)
  
    __obj.asInstanceOf[SerialPortIds]
  }
}

