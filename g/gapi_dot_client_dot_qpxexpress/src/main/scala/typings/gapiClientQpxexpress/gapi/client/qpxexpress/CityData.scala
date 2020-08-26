package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CityData extends js.Object {
  /** The IATA character ID of a city. For example, for Boston this is BOS. */
  var code: js.UndefOr[String] = js.native
  /** The two-character country code of the country the city is located in. For example, US for the United States of America. */
  var country: js.UndefOr[String] = js.native
  /** Identifies this as a city, typically with one or more airports. Value: the fixed string qpxexpress#cityData. */
  var kind: js.UndefOr[String] = js.native
  /** The full name of a city. An example would be: New York. */
  var name: js.UndefOr[String] = js.native
}

object CityData {
  @scala.inline
  def apply(): CityData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CityData]
  }
  @scala.inline
  implicit class CityDataOps[Self <: CityData] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

