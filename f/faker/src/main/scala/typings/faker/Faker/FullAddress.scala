package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullAddress extends js.Object {
  var city: String
  var county: String
  var geo: Geo
  var state: String
  var streetA: String
  var streetB: String
  var streetC: String
  var streetD: String
  var zipcode: String
}

object FullAddress {
  @scala.inline
  def apply(
    city: String,
    county: String,
    geo: Geo,
    state: String,
    streetA: String,
    streetB: String,
    streetC: String,
    streetD: String,
    zipcode: String
  ): FullAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetA = streetA.asInstanceOf[js.Any], streetB = streetB.asInstanceOf[js.Any], streetC = streetC.asInstanceOf[js.Any], streetD = streetD.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullAddress]
  }
}

