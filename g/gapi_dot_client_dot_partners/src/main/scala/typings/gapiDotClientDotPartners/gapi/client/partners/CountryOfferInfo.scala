package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryOfferInfo extends js.Object {
  /** (localized) Get Y amount for that country's offer. */
  var getYAmount: js.UndefOr[String] = js.undefined
  /** Country code for which offer codes may be requested. */
  var offerCountryCode: js.UndefOr[String] = js.undefined
  /** Type of offer country is eligible for. */
  var offerType: js.UndefOr[String] = js.undefined
  /** (localized) Spend X amount for that country's offer. */
  var spendXAmount: js.UndefOr[String] = js.undefined
}

object CountryOfferInfo {
  @scala.inline
  def apply(
    getYAmount: String = null,
    offerCountryCode: String = null,
    offerType: String = null,
    spendXAmount: String = null
  ): CountryOfferInfo = {
    val __obj = js.Dynamic.literal()
    if (getYAmount != null) __obj.updateDynamic("getYAmount")(getYAmount.asInstanceOf[js.Any])
    if (offerCountryCode != null) __obj.updateDynamic("offerCountryCode")(offerCountryCode.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType.asInstanceOf[js.Any])
    if (spendXAmount != null) __obj.updateDynamic("spendXAmount")(spendXAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryOfferInfo]
  }
}

