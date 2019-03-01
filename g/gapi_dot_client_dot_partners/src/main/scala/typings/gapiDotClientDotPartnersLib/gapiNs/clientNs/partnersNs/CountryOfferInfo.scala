package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryOfferInfo extends js.Object {
  /** (localized) Get Y amount for that country's offer. */
  var getYAmount: js.UndefOr[java.lang.String] = js.undefined
  /** Country code for which offer codes may be requested. */
  var offerCountryCode: js.UndefOr[java.lang.String] = js.undefined
  /** Type of offer country is eligible for. */
  var offerType: js.UndefOr[java.lang.String] = js.undefined
  /** (localized) Spend X amount for that country's offer. */
  var spendXAmount: js.UndefOr[java.lang.String] = js.undefined
}

object CountryOfferInfo {
  @scala.inline
  def apply(
    getYAmount: java.lang.String = null,
    offerCountryCode: java.lang.String = null,
    offerType: java.lang.String = null,
    spendXAmount: java.lang.String = null
  ): CountryOfferInfo = {
    val __obj = js.Dynamic.literal()
    if (getYAmount != null) __obj.updateDynamic("getYAmount")(getYAmount)
    if (offerCountryCode != null) __obj.updateDynamic("offerCountryCode")(offerCountryCode)
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (spendXAmount != null) __obj.updateDynamic("spendXAmount")(spendXAmount)
    __obj.asInstanceOf[CountryOfferInfo]
  }
}

