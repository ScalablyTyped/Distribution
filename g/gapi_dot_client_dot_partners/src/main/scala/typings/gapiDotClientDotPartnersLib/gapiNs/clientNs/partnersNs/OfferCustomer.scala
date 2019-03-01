package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferCustomer extends js.Object {
  /** URL to the customer's AdWords page. */
  var adwordsUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Country code of the customer. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** Time the customer was created. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** Days the customer is still eligible. */
  var eligibilityDaysLeft: js.UndefOr[scala.Double] = js.undefined
  /** External CID for the customer. */
  var externalCid: js.UndefOr[java.lang.String] = js.undefined
  /** Formatted Get Y amount with currency code. */
  var getYAmount: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the customer. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the offer */
  var offerType: js.UndefOr[java.lang.String] = js.undefined
  /** Formatted Spend X amount with currency code. */
  var spendXAmount: js.UndefOr[java.lang.String] = js.undefined
}

object OfferCustomer {
  @scala.inline
  def apply(
    adwordsUrl: java.lang.String = null,
    countryCode: java.lang.String = null,
    creationTime: java.lang.String = null,
    eligibilityDaysLeft: scala.Int | scala.Double = null,
    externalCid: java.lang.String = null,
    getYAmount: java.lang.String = null,
    name: java.lang.String = null,
    offerType: java.lang.String = null,
    spendXAmount: java.lang.String = null
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

