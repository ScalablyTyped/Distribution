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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("county")(county)
    __obj.updateDynamic("geo")(geo)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("streetA")(streetA)
    __obj.updateDynamic("streetB")(streetB)
    __obj.updateDynamic("streetC")(streetC)
    __obj.updateDynamic("streetD")(streetD)
    __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[FullAddress]
  }
}

