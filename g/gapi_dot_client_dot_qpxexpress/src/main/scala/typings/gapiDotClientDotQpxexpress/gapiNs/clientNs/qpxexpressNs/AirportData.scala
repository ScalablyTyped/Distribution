package typings.gapiDotClientDotQpxexpress.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AirportData extends js.Object {
  /** The city code an airport is located in. For example, for JFK airport, this is NYC. */
  var city: js.UndefOr[String] = js.undefined
  /** An airport's code. For example, for Boston Logan airport, this is BOS. */
  var code: js.UndefOr[String] = js.undefined
  /** Identifies this as an airport object. Value: the fixed string qpxexpress#airportData. */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of an airport. For example, for airport BOS the name is "Boston Logan International". */
  var name: js.UndefOr[String] = js.undefined
}

object AirportData {
  @scala.inline
  def apply(city: String = null, code: String = null, kind: String = null, name: String = null): AirportData = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (code != null) __obj.updateDynamic("code")(code)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AirportData]
  }
}

