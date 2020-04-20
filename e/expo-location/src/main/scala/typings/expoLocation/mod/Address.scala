package typings.expoLocation.mod

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
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

