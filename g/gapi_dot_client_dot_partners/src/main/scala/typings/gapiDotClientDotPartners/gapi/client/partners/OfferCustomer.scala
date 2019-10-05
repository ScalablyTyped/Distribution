package typings.gapiDotClientDotPartners.gapi.client.partners

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
    eligibilityDaysLeft: Int | Double = null,
    externalCid: String = null,
    getYAmount: String = null,
    name: String = null,
    offerType: String = null,
    spendXAmount: String = null
  ): OfferCustomer = {
    val __obj = js.Dynamic.literal()
    if (adwordsUrl != null) __obj.updateDynamic("adwordsUrl")(adwordsUrl)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (eligibilityDaysLeft != null) __obj.updateDynamic("eligibilityDaysLeft")(eligibilityDaysLeft.asInstanceOf[js.Any])
    if (externalCid != null) __obj.updateDynamic("externalCid")(externalCid)
    if (getYAmount != null) __obj.updateDynamic("getYAmount")(getYAmount)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (spendXAmount != null) __obj.updateDynamic("spendXAmount")(spendXAmount)
    __obj.asInstanceOf[OfferCustomer]
  }
}

