package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: String
  var geo: Geo
  var state: String
  var street: String
  var suite: String
  var zipcode: String
}

object Address {
  @scala.inline
  def apply(city: String, geo: Geo, state: String, street: String, suite: String, zipcode: String): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

