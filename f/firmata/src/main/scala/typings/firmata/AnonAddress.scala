package typings.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: Double
  var bus: Double
}

object AnonAddress {
  @scala.inline
  def apply(address: Double, bus: Double): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

