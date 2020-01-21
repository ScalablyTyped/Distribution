package typings.firmata

import typings.firmata.mod.SERIAL_PORT_ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaud extends js.Object {
  var baud: Double
  var portId: SERIAL_PORT_ID
  var rxPin: js.UndefOr[Double] = js.undefined
  var txPin: js.UndefOr[Double] = js.undefined
}

object AnonBaud {
  @scala.inline
  def apply(baud: Double, portId: SERIAL_PORT_ID, rxPin: Int | Double = null, txPin: Int | Double = null): AnonBaud = {
    val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    if (rxPin != null) __obj.updateDynamic("rxPin")(rxPin.asInstanceOf[js.Any])
    if (txPin != null) __obj.updateDynamic("txPin")(txPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaud]
  }
}

