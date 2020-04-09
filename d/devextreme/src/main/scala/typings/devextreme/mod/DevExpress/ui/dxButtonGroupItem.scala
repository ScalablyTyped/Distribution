package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.back
import typings.devextreme.devextremeStrings.danger
import typings.devextreme.devextremeStrings.default_
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.success
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxButtonGroupItem extends CollectionWidgetItem {
  /** @name dxButtonGroupItem.hint */
  var hint: js.UndefOr[String] = js.undefined
  /** @name dxButtonGroupItem.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxButtonGroupItem.type */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.undefined
}

object dxButtonGroupItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    html: String = null,
    icon: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    `type`: back | danger | default_ | normal | success = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxButtonGroupItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxButtonGroupItem]
  }
}

