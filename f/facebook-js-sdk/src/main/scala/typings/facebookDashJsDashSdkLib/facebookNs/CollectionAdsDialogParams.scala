package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAdsDialogParams extends InstantExperiencesAdsDialogParams {
  var account_id: java.lang.String
  @JSName("canvas_id")
  var canvas_id_CollectionAdsDialogParams: js.UndefOr[scala.Nothing] = js.undefined
  var product_catalog_id: js.UndefOr[java.lang.String] = js.undefined
  var product_set_id: js.UndefOr[java.lang.String] = js.undefined
  var template_id: java.lang.String
}

object CollectionAdsDialogParams {
  @scala.inline
  def apply(
    account_id: java.lang.String,
    business_id: java.lang.String,
    display: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.popup,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.canvas_editor,
    page_id: java.lang.String,
    template_id: java.lang.String,
    app_id: java.lang.String = null,
    canvas_id: js.UndefOr[scala.Nothing] = js.undefined,
    product_catalog_id: java.lang.String = null,
    product_set_id: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): CollectionAdsDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_id")(account_id)
    __obj.updateDynamic("business_id")(business_id)
    __obj.updateDynamic("display")(display)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("page_id")(page_id)
    __obj.updateDynamic("template_id")(template_id)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (!js.isUndefined(canvas_id)) __obj.updateDynamic("canvas_id")(canvas_id)
    if (product_catalog_id != null) __obj.updateDynamic("product_catalog_id")(product_catalog_id)
    if (product_set_id != null) __obj.updateDynamic("product_set_id")(product_set_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[CollectionAdsDialogParams]
  }
}

