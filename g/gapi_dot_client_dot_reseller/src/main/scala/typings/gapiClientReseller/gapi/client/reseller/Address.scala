package typings.gapiClientReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** A customer's physical address. An address can be composed of one to three lines. The addressline2 and addressLine3 are optional. */
  var addressLine1: js.UndefOr[String] = js.undefined
  /** Line 2 of the address. */
  var addressLine2: js.UndefOr[String] = js.undefined
  /** Line 3 of the address. */
  var addressLine3: js.UndefOr[String] = js.undefined
  /** The customer contact's name. This is required. */
  var contactName: js.UndefOr[String] = js.undefined
  /**
    * For countryCode information, see the ISO 3166 country code elements. Verify that country is approved for resale of Google products. This property is
    * required when creating a new customer.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /** Identifies the resource as a customer address. Value: customers#address */
  var kind: js.UndefOr[String] = js.undefined
  /** An example of a locality value is the city of San Francisco. */
  var locality: js.UndefOr[String] = js.undefined
  /** The company or company division name. This is required. */
  var organizationName: js.UndefOr[String] = js.undefined
  /** A postalCode example is a postal zip code such as 94043. This property is required when creating a new customer. */
  var postalCode: js.UndefOr[String] = js.undefined
  /** An example of a region value is CA for the state of California. */
  var region: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    addressLine1: String = null,
    addressLine2: String = null,
    addressLine3: String = null,
    contactName: String = null,
    countryCode: String = null,
    kind: String = null,
    locality: String = null,
    organizationName: String = null,
    postalCode: String = null,
    region: String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1.asInstanceOf[js.Any])
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2.asInstanceOf[js.Any])
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

