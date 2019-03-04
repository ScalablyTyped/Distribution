package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOfferDialogParams extends DialogParams {
  var account_id: java.lang.String
  @JSName("display")
  var display_CreateOfferDialogParams: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup
  var method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.create_offer
  var objective: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.APP_INSTALLS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.CONVERSIONS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.LINK_CLICKS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.OFFER_CLAIMS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.PRODUCT_CATALOG_SALES | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.STORE_VISITS
  var page_id: java.lang.String
}

object CreateOfferDialogParams {
  @scala.inline
  def apply(
    account_id: java.lang.String,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.create_offer,
    objective: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.APP_INSTALLS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.CONVERSIONS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.LINK_CLICKS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.OFFER_CLAIMS | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.PRODUCT_CATALOG_SALES | facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.STORE_VISITS,
    page_id: java.lang.String,
    app_id: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): CreateOfferDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id, display = display, method = method, objective = objective.asInstanceOf[js.Any], page_id = page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
}

