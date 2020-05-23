package typings.firmata.anon

import typings.firmata.mod.SERIAL_PORT_ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Baud extends js.Object {
  var baud: Double
  var portId: SERIAL_PORT_ID
  var rxPin: js.UndefOr[Double] = js.undefined
  var txPin: js.UndefOr[Double] = js.undefined
}

object Baud {
  @scala.inline
  def apply(
    baud: Double,
    portId: SERIAL_PORT_ID,
    rxPin: js.UndefOr[Double] = js.undefined,
    txPin: js.UndefOr[Double] = js.undefined
  ): Baud = {
    val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    if (!js.isUndefined(rxPin)) __obj.updateDynamic("rxPin")(rxPin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(txPin)) __obj.updateDynamic("txPin")(txPin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baud]
  }
}

