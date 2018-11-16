package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AvailableOffer extends js.Object {
  /** The number of codes for this offer that are available for distribution. */
  var available: js.UndefOr[scala.Double] = js.undefined
  /** Offer info by country. */
  var countryOfferInfos: js.UndefOr[js.Array[CountryOfferInfo]] = js.undefined
  /** Description of the offer. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this offer. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum age of an account [in days] to be eligible. */
  var maxAccountAge: js.UndefOr[scala.Double] = js.undefined
  /** Name of the offer. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Level of this offer. */
  var offerLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Type of offer. */
  var offerType: js.UndefOr[java.lang.String] = js.undefined
  /** Customers who qualify for this offer. */
  var qualifiedCustomer: js.UndefOr[js.Array[OfferCustomer]] = js.undefined
  /** Whether or not the list of qualified customers is definitely complete. */
  var qualifiedCustomersComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** Should special text be shown on the offers page. */
  var showSpecialOfferCopy: js.UndefOr[scala.Boolean] = js.undefined
  /** Terms of the offer. */
  var terms: js.UndefOr[java.lang.String] = js.undefined
}

