package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /** The aircraft that is flying between an origin and destination. */
  var aircraft: js.UndefOr[js.Array[AircraftData]] = js.native
  /** The airport of an origin or destination. */
  var airport: js.UndefOr[js.Array[AirportData]] = js.native
  /** The airline carrier of the aircraft flying between an origin and destination. Allowed values are IATA carrier codes. */
  var carrier: js.UndefOr[js.Array[CarrierData]] = js.native
  /** The city that is either the origin or destination of part of a trip. */
  var city: js.UndefOr[js.Array[CityData]] = js.native
  /**
    * Identifies this as QPX Express response resource, including a trip's airport, city, taxes, airline, and aircraft. Value: the fixed string
    * qpxexpress#data.
    */
  var kind: js.UndefOr[String] = js.native
  /** The taxes due for flying between an origin and a destination. */
  var tax: js.UndefOr[js.Array[TaxData]] = js.native
}

object Data {
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setAircraftVarargs(value: AircraftData*): Self = this.set("aircraft", js.Array(value :_*))
    @scala.inline
    def setAircraft(value: js.Array[AircraftData]): Self = this.set("aircraft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAircraft: Self = this.set("aircraft", js.undefined)
    @scala.inline
    def setAirportVarargs(value: AirportData*): Self = this.set("airport", js.Array(value :_*))
    @scala.inline
    def setAirport(value: js.Array[AirportData]): Self = this.set("airport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAirport: Self = this.set("airport", js.undefined)
    @scala.inline
    def setCarrierVarargs(value: CarrierData*): Self = this.set("carrier", js.Array(value :_*))
    @scala.inline
    def setCarrier(value: js.Array[CarrierData]): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setCityVarargs(value: CityData*): Self = this.set("city", js.Array(value :_*))
    @scala.inline
    def setCity(value: js.Array[CityData]): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTaxVarargs(value: TaxData*): Self = this.set("tax", js.Array(value :_*))
    @scala.inline
    def setTax(value: js.Array[TaxData]): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
  
}

