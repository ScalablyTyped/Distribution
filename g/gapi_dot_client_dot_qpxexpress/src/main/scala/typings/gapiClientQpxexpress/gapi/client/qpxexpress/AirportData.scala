package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AirportData extends js.Object {
  /** The city code an airport is located in. For example, for JFK airport, this is NYC. */
  var city: js.UndefOr[String] = js.native
  /** An airport's code. For example, for Boston Logan airport, this is BOS. */
  var code: js.UndefOr[String] = js.native
  /** Identifies this as an airport object. Value: the fixed string qpxexpress#airportData. */
  var kind: js.UndefOr[String] = js.native
  /** The name of an airport. For example, for airport BOS the name is "Boston Logan International". */
  var name: js.UndefOr[String] = js.native
}

object AirportData {
  @scala.inline
  def apply(): AirportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AirportData]
  }
  @scala.inline
  implicit class AirportDataOps[Self <: AirportData] (val x: Self) extends AnyVal {
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
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
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

