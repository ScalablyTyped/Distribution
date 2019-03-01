package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleAddressType extends js.Object {
  /** The city or town for the address. */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /** The street name and number of this address. */
  var line1: js.UndefOr[java.lang.String] = js.undefined
  /** The second line the address, if needed. */
  var line2: js.UndefOr[java.lang.String] = js.undefined
  /** The third line of the address, if needed. */
  var line3: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the location. */
  var locationName: js.UndefOr[java.lang.String] = js.undefined
  /** The US two letter state abbreviation of the address. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** The US Postal Zip Code of the address. */
  var zip: js.UndefOr[java.lang.String] = js.undefined
}

object SimpleAddressType {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    line1: java.lang.String = null,
    line2: java.lang.String = null,
    line3: java.lang.String = null,
    locationName: java.lang.String = null,
    state: java.lang.String = null,
    zip: java.lang.String = null
  ): SimpleAddressType = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (line1 != null) __obj.updateDynamic("line1")(line1)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (line3 != null) __obj.updateDynamic("line3")(line3)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    if (state != null) __obj.updateDynamic("state")(state)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[SimpleAddressType]
  }
}

