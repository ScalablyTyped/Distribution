package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** A customer's physical address. An address can be composed of one to three lines. The addressline2 and addressLine3 are optional. */
  var addressLine1: js.UndefOr[java.lang.String] = js.undefined
  /** Line 2 of the address. */
  var addressLine2: js.UndefOr[java.lang.String] = js.undefined
  /** Line 3 of the address. */
  var addressLine3: js.UndefOr[java.lang.String] = js.undefined
  /** The customer contact's name. This is required. */
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For countryCode information, see the ISO 3166 country code elements. Verify that country is approved for resale of Google products. This property is
    * required when creating a new customer.
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the resource as a customer address. Value: customers#address */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An example of a locality value is the city of San Francisco. */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** The company or company division name. This is required. */
  var organizationName: js.UndefOr[java.lang.String] = js.undefined
  /** A postalCode example is a postal zip code such as 94043. This property is required when creating a new customer. */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** An example of a region value is CA for the state of California. */
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    addressLine1: java.lang.String = null,
    addressLine2: java.lang.String = null,
    addressLine3: java.lang.String = null,
    contactName: java.lang.String = null,
    countryCode: java.lang.String = null,
    kind: java.lang.String = null,
    locality: java.lang.String = null,
    organizationName: java.lang.String = null,
    postalCode: java.lang.String = null,
    region: java.lang.String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1)
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2)
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3)
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Address]
  }
}

