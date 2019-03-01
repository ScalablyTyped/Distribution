package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityData extends js.Object {
  /** The IATA character ID of a city. For example, for Boston this is BOS. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** The two-character country code of the country the city is located in. For example, US for the United States of America. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a city, typically with one or more airports. Value: the fixed string qpxexpress#cityData. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The full name of a city. An example would be: New York. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object CityData {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    country: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): CityData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (country != null) __obj.updateDynamic("country")(country)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CityData]
  }
}

