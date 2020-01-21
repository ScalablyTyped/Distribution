package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityData extends js.Object {
  /** The IATA character ID of a city. For example, for Boston this is BOS. */
  var code: js.UndefOr[String] = js.undefined
  /** The two-character country code of the country the city is located in. For example, US for the United States of America. */
  var country: js.UndefOr[String] = js.undefined
  /** Identifies this as a city, typically with one or more airports. Value: the fixed string qpxexpress#cityData. */
  var kind: js.UndefOr[String] = js.undefined
  /** The full name of a city. An example would be: New York. */
  var name: js.UndefOr[String] = js.undefined
}

object CityData {
  @scala.inline
  def apply(code: String = null, country: String = null, kind: String = null, name: String = null): CityData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityData]
  }
}

