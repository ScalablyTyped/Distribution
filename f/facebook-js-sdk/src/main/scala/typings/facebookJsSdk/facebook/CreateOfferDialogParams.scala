package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.APP_INSTALLS
import typings.facebookJsSdk.facebookJsSdkStrings.CONVERSIONS
import typings.facebookJsSdk.facebookJsSdkStrings.LINK_CLICKS
import typings.facebookJsSdk.facebookJsSdkStrings.OFFER_CLAIMS
import typings.facebookJsSdk.facebookJsSdkStrings.PRODUCT_CATALOG_SALES
import typings.facebookJsSdk.facebookJsSdkStrings.STORE_VISITS
import typings.facebookJsSdk.facebookJsSdkStrings.create_offer
import typings.facebookJsSdk.facebookJsSdkStrings.popup
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
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], objective = objective.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
}

