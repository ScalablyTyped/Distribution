package typings.facebookDashJsDashSdk.facebookNs

import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.canvas_editor
import typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.popup
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
    canvas_id: js.UndefOr[scala.Nothing] = js.undefined,
    product_catalog_id: String = null,
    product_set_id: String = null,
    redirect_uri: String = null
  ): CollectionAdsDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id, business_id = business_id, display = display, method = method, page_id = page_id, template_id = template_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (!js.isUndefined(canvas_id)) __obj.updateDynamic("canvas_id")(canvas_id)
    if (product_catalog_id != null) __obj.updateDynamic("product_catalog_id")(product_catalog_id)
    if (product_set_id != null) __obj.updateDynamic("product_set_id")(product_set_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[CollectionAdsDialogParams]
  }
}

