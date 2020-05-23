package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAdsDialogParams extends InstantExperiencesAdsDialogParams {
  var account_id: String
  @JSName("canvas_id")
  var canvas_id_CollectionAdsDialogParams: js.UndefOr[scala.Nothing] = js.undefined
  var product_catalog_id: js.UndefOr[String] = js.undefined
  var product_set_id: js.UndefOr[String] = js.undefined
  var template_id: String
}

object CollectionAdsDialogParams {
  @scala.inline
  def apply(
    account_id: String,
    business_id: String,
    display: popup,
    method: canvas_editor,
    page_id: String,
    template_id: String,
    app_id: String = null,
    canvas_id: String = null,
    product_catalog_id: String = null,
    product_set_id: String = null,
    redirect_uri: String = null
  ): CollectionAdsDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (canvas_id != null) __obj.updateDynamic("canvas_id")(canvas_id.asInstanceOf[js.Any])
    if (product_catalog_id != null) __obj.updateDynamic("product_catalog_id")(product_catalog_id.asInstanceOf[js.Any])
    if (product_set_id != null) __obj.updateDynamic("product_set_id")(product_set_id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAdsDialogParams]
  }
}

