package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Location
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormSimpleItem extends js.Object {
  /** @name dxFormSimpleItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** @name dxFormSimpleItem.cssClass */
  var cssClass: js.UndefOr[String] = js.undefined
  /** @name dxFormSimpleItem.dataField */
  var dataField: js.UndefOr[String] = js.undefined
  /** @name dxFormSimpleItem.editorOptions */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** @name dxFormSimpleItem.editorType */
  var editorType: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox
  ] = js.undefined
  /** @name dxFormSimpleItem.helpText */
  var helpText: js.UndefOr[String] = js.undefined
  /** @name dxFormSimpleItem.isRequired */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /** @name dxFormSimpleItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** @name dxFormSimpleItem.label */
  var label: js.UndefOr[Location] = js.undefined
  /** @name dxFormSimpleItem.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFormSimpleItem.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ typings.devextreme.anon.EditorOptions, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxFormSimpleItem.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** @name dxFormSimpleItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxFormSimpleItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormSimpleItem {
  @scala.inline
  def apply(
    colSpan: js.UndefOr[Double] = js.undefined,
    cssClass: String = null,
    dataField: String = null,
    editorOptions: js.Any = null,
    editorType: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox = null,
    helpText: String = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    itemType: empty | group | simple | tabbed | button = null,
    label: Location = null,
    name: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ typings.devextreme.anon.EditorOptions, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined
  ): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormSimpleItem]
  }
}

