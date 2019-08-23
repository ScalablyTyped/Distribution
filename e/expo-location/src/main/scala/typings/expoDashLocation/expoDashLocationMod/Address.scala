package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: String
  var country: String
  var name: String
  var postalCode: String
  var region: String
  var street: String
}

object Address {
  @scala.inline
  def apply(city: String, country: String, name: String, postalCode: String, region: String, street: String): Address = {
    val __obj = js.Dynamic.literal(city = city, country = country, name = name, postalCode = postalCode, region = region, street = street)
  
    __obj.asInstanceOf[Address]
  }
}

