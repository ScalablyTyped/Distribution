package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.alignCenter
import typings.devextreme.devextremeStrings.alignJustify
import typings.devextreme.devextremeStrings.alignLeft
import typings.devextreme.devextremeStrings.alignRight
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.background
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.blockquote
import typings.devextreme.devextremeStrings.bold
import typings.devextreme.devextremeStrings.bulletList
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.codeBlock
import typings.devextreme.devextremeStrings.color
import typings.devextreme.devextremeStrings.decreaseIndent
import typings.devextreme.devextremeStrings.header
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.inMenu
import typings.devextreme.devextremeStrings.increaseIndent
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.link
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.orderedList
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.strike
import typings.devextreme.devextremeStrings.subscript
import typings.devextreme.devextremeStrings.superscript
import typings.devextreme.devextremeStrings.underline
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.variable
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  /** Specifies the predefined item that this object customizes or a format with multiple choices. */
  var formatName: js.UndefOr[
    background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
  ] = js.undefined
  /** Specifies values for a format with multiple choices. Should be used with the formatName. */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
}

object dxHtmlEditorToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatName: background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String = null,
    formatValues: js.Array[String | Double | Boolean] = null,
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
  ): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatName != null) __obj.updateDynamic("formatName")(formatName.asInstanceOf[js.Any])
    if (formatValues != null) __obj.updateDynamic("formatValues")(formatValues.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
}

