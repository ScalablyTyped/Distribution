package typings.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: Double
  var bus: Double
}

object Anon_Address {
  @scala.inline
  def apply(address: Double, bus: Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, bus = bus)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

