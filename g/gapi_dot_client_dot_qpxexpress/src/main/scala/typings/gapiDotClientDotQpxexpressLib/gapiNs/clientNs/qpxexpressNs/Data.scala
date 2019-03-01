package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /** The aircraft that is flying between an origin and destination. */
  var aircraft: js.UndefOr[js.Array[AircraftData]] = js.undefined
  /** The airport of an origin or destination. */
  var airport: js.UndefOr[js.Array[AirportData]] = js.undefined
  /** The airline carrier of the aircraft flying between an origin and destination. Allowed values are IATA carrier codes. */
  var carrier: js.UndefOr[js.Array[CarrierData]] = js.undefined
  /** The city that is either the origin or destination of part of a trip. */
  var city: js.UndefOr[js.Array[CityData]] = js.undefined
  /**
    * Identifies this as QPX Express response resource, including a trip's airport, city, taxes, airline, and aircraft. Value: the fixed string
    * qpxexpress#data.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The taxes due for flying between an origin and a destination. */
  var tax: js.UndefOr[js.Array[TaxData]] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    aircraft: js.Array[AircraftData] = null,
    airport: js.Array[AirportData] = null,
    carrier: js.Array[CarrierData] = null,
    city: js.Array[CityData] = null,
    kind: java.lang.String = null,
    tax: js.Array[TaxData] = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (aircraft != null) __obj.updateDynamic("aircraft")(aircraft)
    if (airport != null) __obj.updateDynamic("airport")(airport)
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (city != null) __obj.updateDynamic("city")(city)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    __obj.asInstanceOf[Data]
  }
}

