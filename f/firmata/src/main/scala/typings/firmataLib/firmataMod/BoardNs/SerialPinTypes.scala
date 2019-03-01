package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialPinTypes extends js.Object {
  var RES_RX0: SERIAL_PIN_TYPE
  var RES_RX1: SERIAL_PIN_TYPE
  var RES_RX2: SERIAL_PIN_TYPE
  var RES_RX3: SERIAL_PIN_TYPE
  var RES_TX0: SERIAL_PIN_TYPE
  var RES_TX1: SERIAL_PIN_TYPE
  var RES_TX2: SERIAL_PIN_TYPE
  var RES_TX3: SERIAL_PIN_TYPE
}

object SerialPinTypes {
  @scala.inline
  def apply(
    RES_RX0: SERIAL_PIN_TYPE,
    RES_RX1: SERIAL_PIN_TYPE,
    RES_RX2: SERIAL_PIN_TYPE,
    RES_RX3: SERIAL_PIN_TYPE,
    RES_TX0: SERIAL_PIN_TYPE,
    RES_TX1: SERIAL_PIN_TYPE,
    RES_TX2: SERIAL_PIN_TYPE,
    RES_TX3: SERIAL_PIN_TYPE
  ): SerialPinTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RES_RX0")(RES_RX0)
    __obj.updateDynamic("RES_RX1")(RES_RX1)
    __obj.updateDynamic("RES_RX2")(RES_RX2)
    __obj.updateDynamic("RES_RX3")(RES_RX3)
    __obj.updateDynamic("RES_TX0")(RES_TX0)
    __obj.updateDynamic("RES_TX1")(RES_TX1)
    __obj.updateDynamic("RES_TX2")(RES_TX2)
    __obj.updateDynamic("RES_TX3")(RES_TX3)
    __obj.asInstanceOf[SerialPinTypes]
  }
}

