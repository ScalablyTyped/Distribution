package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoExpandAll extends js.Object {
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ AnonWatch, _])
  ] = js.undefined
}

object AnonAutoExpandAll {
  @scala.inline
  def apply(
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    template: template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ AnonWatch, _]) = null
  ): AnonAutoExpandAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoExpandAll]
  }
}

