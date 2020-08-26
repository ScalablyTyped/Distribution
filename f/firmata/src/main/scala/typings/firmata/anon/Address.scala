package typings.firmata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: Double = js.native
  var bus: Double = js.native
}

object Address {
  @scala.inline
  def apply(address: Double, bus: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setBus(value: Double): Self = this.set("bus", value.asInstanceOf[js.Any])
  }
  
}

