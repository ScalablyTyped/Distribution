package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonEditorOptions
import typings.devextreme.AnonLocation
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormSimpleItem extends js.Object {
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the path to the formData object field bound to the current form item. */
  var dataField: js.UndefOr[String] = js.undefined
  /** Configures the form item's editor. */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** Specifies which editor widget is used to display and edit the form item value. */
  var editorType: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox
  ] = js.undefined
  /** Specifies the help text displayed for the current form item. */
  var helpText: js.UndefOr[String] = js.undefined
  /** Specifies whether the current form item is required. */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /** Specifies the item's type. Set it to "simple" to create a simple item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Specifies options for the form item label. */
  var label: js.UndefOr[AnonLocation] = js.undefined
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.undefined
  /** A template to be used for rendering the form item. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** An array of validation rules to be checked for the form item editor. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormSimpleItem {
  @scala.inline
  def apply(
    colSpan: Int | Double = null,
    cssClass: String = null,
    dataField: String = null,
    editorOptions: js.Any = null,
    editorType: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox = null,
    helpText: String = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    itemType: empty | group | simple | tabbed | button = null,
    label: AnonLocation = null,
    name: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery]) = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormSimpleItem]
  }
}

