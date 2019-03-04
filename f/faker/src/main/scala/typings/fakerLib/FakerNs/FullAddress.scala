package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullAddress extends js.Object {
  var city: java.lang.String
  var county: java.lang.String
  var geo: Geo
  var state: java.lang.String
  var streetA: java.lang.String
  var streetB: java.lang.String
  var streetC: java.lang.String
  var streetD: java.lang.String
  var zipcode: java.lang.String
}

object FullAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    county: java.lang.String,
    geo: Geo,
    state: java.lang.String,
    streetA: java.lang.String,
    streetB: java.lang.String,
    streetC: java.lang.String,
    streetD: java.lang.String,
    zipcode: java.lang.String
  ): FullAddress = {
    val __obj = js.Dynamic.literal(city = city, county = county, geo = geo, state = state, streetA = streetA, streetB = streetB, streetC = streetC, streetD = streetD, zipcode = zipcode)
  
    __obj.asInstanceOf[FullAddress]
  }
}

