package typings
package firmataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Baud extends js.Object {
  var baud: scala.Double
  var portId: firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  var rxPin: js.UndefOr[scala.Double] = js.undefined
  var txPin: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Baud {
  @scala.inline
  def apply(
    baud: scala.Double,
    portId: firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID,
    rxPin: scala.Int | scala.Double = null,
    txPin: scala.Int | scala.Double = null
  ): Anon_Baud = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baud")(baud)
    __obj.updateDynamic("portId")(portId)
    if (rxPin != null) __obj.updateDynamic("rxPin")(rxPin.asInstanceOf[js.Any])
    if (txPin != null) __obj.updateDynamic("txPin")(txPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Baud]
  }
}

