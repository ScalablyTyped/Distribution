package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferCustomer extends js.Object {
  /** URL to the customer's AdWords page. */
  var adwordsUrl: js.UndefOr[String] = js.undefined
  /** Country code of the customer. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** Time the customer was created. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** Days the customer is still eligible. */
  var eligibilityDaysLeft: js.UndefOr[Double] = js.undefined
  /** External CID for the customer. */
  var externalCid: js.UndefOr[String] = js.undefined
  /** Formatted Get Y amount with currency code. */
  var getYAmount: js.UndefOr[String] = js.undefined
  /** Name of the customer. */
  var name: js.UndefOr[String] = js.undefined
  /** Type of the offer */
  var offerType: js.UndefOr[String] = js.undefined
  /** Formatted Spend X amount with currency code. */
  var spendXAmount: js.UndefOr[String] = js.undefined
}

object OfferCustomer {
  @scala.inline
  def apply(
    adwordsUrl: String = null,
    countryCode: String = null,
    creationTime: String = null,
    eligibilityDaysLeft: js.UndefOr[Double] = js.undefined,
    externalCid: String = null,
    getYAmount: String = null,
    name: String = null,
    offerType: String = null,
    spendXAmount: String = null
  ): OfferCustomer = {
    val __obj = js.Dynamic.literal()
    if (adwordsUrl != null) __obj.updateDynamic("adwordsUrl")(adwordsUrl.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(eligibilityDaysLeft)) __obj.updateDynamic("eligibilityDaysLeft")(eligibilityDaysLeft.get.asInstanceOf[js.Any])
    if (externalCid != null) __obj.updateDynamic("externalCid")(externalCid.asInstanceOf[js.Any])
    if (getYAmount != null) __obj.updateDynamic("getYAmount")(getYAmount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (spendXAmount != null) __obj.updateDynamic("spendXAmount")(spendXAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferCustomer]
  }
}

