package typings.firmata.anon

import typings.firmata.mod.SERIAL_PORT_ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Baud extends js.Object {
  var baud: Double = js.native
  var portId: SERIAL_PORT_ID = js.native
  var rxPin: js.UndefOr[Double] = js.native
  var txPin: js.UndefOr[Double] = js.native
}

object Baud {
  @scala.inline
  def apply(baud: Double, portId: SERIAL_PORT_ID): Baud = {
    val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baud]
  }
  @scala.inline
  implicit class BaudOps[Self <: Baud] (val x: Self) extends AnyVal {
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
    def setBaud(value: Double): Self = this.set("baud", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortId(value: SERIAL_PORT_ID): Self = this.set("portId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRxPin(value: Double): Self = this.set("rxPin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRxPin: Self = this.set("rxPin", js.undefined)
    @scala.inline
    def setTxPin(value: Double): Self = this.set("txPin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxPin: Self = this.set("txPin", js.undefined)
  }
  
}

