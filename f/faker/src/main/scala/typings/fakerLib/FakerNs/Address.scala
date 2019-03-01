package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: java.lang.String
  var geo: Geo
  var state: java.lang.String
  var street: java.lang.String
  var suite: java.lang.String
  var zipcode: java.lang.String
}

object Address {
  @scala.inline
  def apply(
    city: java.lang.String,
    geo: Geo,
    state: java.lang.String,
    street: java.lang.String,
    suite: java.lang.String,
    zipcode: java.lang.String
  ): Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("geo")(geo)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("street")(street)
    __obj.updateDynamic("suite")(suite)
    __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[Address]
  }
}

