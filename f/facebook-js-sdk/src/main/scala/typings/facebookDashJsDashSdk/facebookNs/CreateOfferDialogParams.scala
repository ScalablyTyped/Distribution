package typings.facebookDashJsDashSdk.facebookNs

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.APP_INSTALLS
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.CONVERSIONS
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.LINK_CLICKS
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.OFFER_CLAIMS
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.PRODUCT_CATALOG_SALES
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.STORE_VISITS
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.create_offer
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOfferDialogParams extends DialogParams {
  var account_id: String
  @JSName("display")
  var display_CreateOfferDialogParams: popup
  var method: create_offer
  var objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS
  var page_id: String
}

object CreateOfferDialogParams {
  @scala.inline
  def apply(
    account_id: String,
    display: popup,
    method: create_offer,
    objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS,
    page_id: String,
    app_id: String = null,
    redirect_uri: String = null
  ): CreateOfferDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id, display = display, method = method, objective = objective.asInstanceOf[js.Any], page_id = page_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
}

