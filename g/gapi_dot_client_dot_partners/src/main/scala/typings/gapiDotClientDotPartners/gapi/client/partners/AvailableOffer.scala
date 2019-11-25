package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableOffer extends js.Object {
  /** The number of codes for this offer that are available for distribution. */
  var available: js.UndefOr[Double] = js.undefined
  /** Offer info by country. */
  var countryOfferInfos: js.UndefOr[js.Array[CountryOfferInfo]] = js.undefined
  /** Description of the offer. */
  var description: js.UndefOr[String] = js.undefined
  /** ID of this offer. */
  var id: js.UndefOr[String] = js.undefined
  /** The maximum age of an account [in days] to be eligible. */
  var maxAccountAge: js.UndefOr[Double] = js.undefined
  /** Name of the offer. */
  var name: js.UndefOr[String] = js.undefined
  /** Level of this offer. */
  var offerLevel: js.UndefOr[String] = js.undefined
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.undefined
  /** Customers who qualify for this offer. */
  var qualifiedCustomer: js.UndefOr[js.Array[OfferCustomer]] = js.undefined
  /** Whether or not the list of qualified customers is definitely complete. */
  var qualifiedCustomersComplete: js.UndefOr[Boolean] = js.undefined
  /** Should special text be shown on the offers page. */
  var showSpecialOfferCopy: js.UndefOr[Boolean] = js.undefined
  /** Terms of the offer. */
  var terms: js.UndefOr[String] = js.undefined
}

object AvailableOffer {
  @scala.inline
  def apply(
    available: Int | Double = null,
    countryOfferInfos: js.Array[CountryOfferInfo] = null,
    description: String = null,
    id: String = null,
    maxAccountAge: Int | Double = null,
    name: String = null,
    offerLevel: String = null,
    offerType: String = null,
    qualifiedCustomer: js.Array[OfferCustomer] = null,
    qualifiedCustomersComplete: js.UndefOr[Boolean] = js.undefined,
    showSpecialOfferCopy: js.UndefOr[Boolean] = js.undefined,
    terms: String = null
  ): AvailableOffer = {
    val __obj = js.Dynamic.literal()
    if (available != null) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (countryOfferInfos != null) __obj.updateDynamic("countryOfferInfos")(countryOfferInfos.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxAccountAge != null) __obj.updateDynamic("maxAccountAge")(maxAccountAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offerLevel != null) __obj.updateDynamic("offerLevel")(offerLevel.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (qualifiedCustomer != null) __obj.updateDynamic("qualifiedCustomer")(qualifiedCustomer.asInstanceOf[js.Any])
    if (!js.isUndefined(qualifiedCustomersComplete)) __obj.updateDynamic("qualifiedCustomersComplete")(qualifiedCustomersComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpecialOfferCopy)) __obj.updateDynamic("showSpecialOfferCopy")(showSpecialOfferCopy.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableOffer]
  }
}

