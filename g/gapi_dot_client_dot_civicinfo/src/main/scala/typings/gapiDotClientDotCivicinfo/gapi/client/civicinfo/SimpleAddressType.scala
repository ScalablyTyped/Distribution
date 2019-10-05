package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleAddressType extends js.Object {
  /** The city or town for the address. */
  var city: js.UndefOr[String] = js.undefined
  /** The street name and number of this address. */
  var line1: js.UndefOr[String] = js.undefined
  /** The second line the address, if needed. */
  var line2: js.UndefOr[String] = js.undefined
  /** The third line of the address, if needed. */
  var line3: js.UndefOr[String] = js.undefined
  /** The name of the location. */
  var locationName: js.UndefOr[String] = js.undefined
  /** The US two letter state abbreviation of the address. */
  var state: js.UndefOr[String] = js.undefined
  /** The US Postal Zip Code of the address. */
  var zip: js.UndefOr[String] = js.undefined
}

object SimpleAddressType {
  @scala.inline
  def apply(
    city: String = null,
    line1: String = null,
    line2: String = null,
    line3: String = null,
    locationName: String = null,
    state: String = null,
    zip: String = null
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

