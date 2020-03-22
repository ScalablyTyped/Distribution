package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inMenu
import typings.devextreme.devextremeStrings.never
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxToolbarItem extends CollectionWidgetItem {
  /** Specifies a CSS class to be applied to the item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies when to display an item in the toolbar's overflow menu. */
  var locateInMenu: js.UndefOr[always | auto | never] = js.undefined
  /** Specifies a location for the item on the toolbar. */
  var location: js.UndefOr[after | before | center] = js.undefined
  /** Specifies a template that should be used to render a menu item. */
  var menuItemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.undefined
  /** Configures the DevExtreme widget used as a toolbar item. */
  var options: js.UndefOr[js.Any] = js.undefined
  /** Specifies when to display the text for the widget item. */
  var showText: js.UndefOr[always | inMenu] = js.undefined
  /** A widget that presents a toolbar item. To configure it, use the options object. */
  var widget: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
  ] = js.undefined
}

object dxToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    locateInMenu: always | auto | never = null,
    location: after | before | center = null,
    menuItemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    options: js.Any = null,
    showText: always | inMenu = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (locateInMenu != null) __obj.updateDynamic("locateInMenu")(locateInMenu.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxToolbarItem]
  }
}

