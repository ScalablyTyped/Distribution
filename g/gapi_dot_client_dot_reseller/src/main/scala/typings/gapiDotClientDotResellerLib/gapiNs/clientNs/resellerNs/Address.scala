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

