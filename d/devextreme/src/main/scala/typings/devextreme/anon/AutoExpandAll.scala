package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoExpandAll extends js.Object {
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _])
  ] = js.undefined
}

object AutoExpandAll {
  @scala.inline
  def apply(
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    template: template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _]) = null
  ): AutoExpandAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExpandAll]
  }
}

