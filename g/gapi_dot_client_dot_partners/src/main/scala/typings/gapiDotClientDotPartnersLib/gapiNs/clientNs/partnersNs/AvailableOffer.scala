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

object AvailableOffer {
  @scala.inline
  def apply(
    available: scala.Int | scala.Double = null,
    countryOfferInfos: js.Array[CountryOfferInfo] = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    maxAccountAge: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    offerLevel: java.lang.String = null,
    offerType: java.lang.String = null,
    qualifiedCustomer: js.Array[OfferCustomer] = null,
    qualifiedCustomersComplete: js.UndefOr[scala.Boolean] = js.undefined,
    showSpecialOfferCopy: js.UndefOr[scala.Boolean] = js.undefined,
    terms: java.lang.String = null
  ): AvailableOffer = {
    val __obj = js.Dynamic.literal()
    if (available != null) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (countryOfferInfos != null) __obj.updateDynamic("countryOfferInfos")(countryOfferInfos)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxAccountAge != null) __obj.updateDynamic("maxAccountAge")(maxAccountAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offerLevel != null) __obj.updateDynamic("offerLevel")(offerLevel)
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (qualifiedCustomer != null) __obj.updateDynamic("qualifiedCustomer")(qualifiedCustomer)
    if (!js.isUndefined(qualifiedCustomersComplete)) __obj.updateDynamic("qualifiedCustomersComplete")(qualifiedCustomersComplete)
    if (!js.isUndefined(showSpecialOfferCopy)) __obj.updateDynamic("showSpecialOfferCopy")(showSpecialOfferCopy)
    if (terms != null) __obj.updateDynamic("terms")(terms)
    __obj.asInstanceOf[AvailableOffer]
  }
}

