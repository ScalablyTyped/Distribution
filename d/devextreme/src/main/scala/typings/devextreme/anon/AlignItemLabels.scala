package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFormButtonItem
import typings.devextreme.mod.DevExpress.ui.dxFormEmptyItem
import typings.devextreme.mod.DevExpress.ui.dxFormGroupItem
import typings.devextreme.mod.DevExpress.ui.dxFormSimpleItem
import typings.devextreme.mod.DevExpress.ui.dxFormTabbedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignItemLabels extends js.Object {
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  var badge: js.UndefOr[String] = js.undefined
  var colCount: js.UndefOr[Double] = js.undefined
  var colCountByScreen: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.undefined
  var tabTemplate: js.UndefOr[
    template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.undefined
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AlignItemLabels {
  @scala.inline
  def apply(
    alignItemLabels: js.UndefOr[Boolean] = js.undefined,
    badge: String = null,
    colCount: js.UndefOr[Double] = js.undefined,
    colCountByScreen: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    items: js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ] = null,
    tabTemplate: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _]) = null,
    template: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _]) = null,
    title: String = null
  ): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignItemLabels)) __obj.updateDynamic("alignItemLabels")(alignItemLabels.get.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(colCount)) __obj.updateDynamic("colCount")(colCount.get.asInstanceOf[js.Any])
    if (colCountByScreen != null) __obj.updateDynamic("colCountByScreen")(colCountByScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemLabels]
  }
}

