package typings.firmata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: Double
  var bus: Double
}

object Address {
  @scala.inline
  def apply(address: Double, bus: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

