package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullAddress extends js.Object {
  var city: String = js.native
  var county: String = js.native
  var geo: Geo = js.native
  var state: String = js.native
  var streetA: String = js.native
  var streetB: String = js.native
  var streetC: String = js.native
  var streetD: String = js.native
  var zipcode: String = js.native
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
  @scala.inline
  implicit class FullAddressOps[Self <: FullAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounty(value: String): Self = this.set("county", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeo(value: Geo): Self = this.set("geo", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetA(value: String): Self = this.set("streetA", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetB(value: String): Self = this.set("streetB", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetC(value: String): Self = this.set("streetC", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetD(value: String): Self = this.set("streetD", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipcode(value: String): Self = this.set("zipcode", value.asInstanceOf[js.Any])
  }
  
}

