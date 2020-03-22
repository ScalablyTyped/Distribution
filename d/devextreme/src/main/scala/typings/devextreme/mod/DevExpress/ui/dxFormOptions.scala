package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentDataField
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonDataFieldElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormOptions extends WidgetOptions[dxForm] {
  /** Specifies whether or not all root item labels are aligned. */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not item labels in all groups are aligned. */
  var alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.undefined
  /** The count of columns in the form layout. */
  var colCount: js.UndefOr[Double | auto] = js.undefined
  /** Specifies dependency between the screen factor and the count of columns in the form layout. */
  var colCountByScreen: js.UndefOr[js.Any] = js.undefined
  /** Specifies a function that customizes a form item after it has been created. */
  var customizeItem: js.UndefOr[
    js.Function1[
      /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem, 
      _
    ]
  ] = js.undefined
  /** Provides the Form's data. Gets updated every time form fields change. */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** Holds an array of form items. */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.undefined
  /** Specifies the location of a label against the editor. */
  var labelLocation: js.UndefOr[left | right | top] = js.undefined
  /** The minimum column width used for calculating column count in the form layout. */
  var minColWidth: js.UndefOr[Double] = js.undefined
  /** A function that is executed when the Enter key has been pressed while an editor is focused. */
  var onEditorEnterKey: js.UndefOr[js.Function1[/* e */ AnonComponentDataField, _]] = js.undefined
  /** A function that is executed when the value of a formData object field is changed. */
  var onFieldDataChanged: js.UndefOr[js.Function1[/* e */ AnonDataFieldElement, _]] = js.undefined
  /** The text displayed for optional fields. */
  var optionalMark: js.UndefOr[String] = js.undefined
  /** Specifies whether all editors on the form are read-only. Applies only to non-templated items. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** The text displayed for required fields. */
  var requiredMark: js.UndefOr[String] = js.undefined
  /** Specifies the message that is shown for end-users if a required field value is not specified. */
  var requiredMessage: js.UndefOr[String] = js.undefined
  /** Specifies a function that categorizes screens by their width. */
  var screenByWidth: js.UndefOr[js.Function] = js.undefined
  /** A Boolean value specifying whether to enable or disable form scrolling. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not a colon is displayed at the end of form labels. */
  var showColonAfterLabel: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the optional mark is displayed for optional fields. */
  var showOptionalMark: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the required mark is displayed for required fields. */
  var showRequiredMark: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the total validation summary is displayed on the form. */
  var showValidationSummary: js.UndefOr[Boolean] = js.undefined
  /** Gives a name to the internal validation group. */
  var validationGroup: js.UndefOr[String] = js.undefined
}

object dxFormOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    alignItemLabels: js.UndefOr[Boolean] = js.undefined,
    alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    colCount: Double | auto = null,
    colCountByScreen: js.Any = null,
    customizeItem: /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem => _ = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    formData: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ] = null,
    labelLocation: left | right | top = null,
    minColWidth: Int | Double = null,
    onContentReady: /* e */ AnonComponentElement[dxForm] => _ = null,
    onDisposing: /* e */ AnonModel[dxForm] => _ = null,
    onEditorEnterKey: /* e */ AnonComponentDataField => _ = null,
    onFieldDataChanged: /* e */ AnonDataFieldElement => _ = null,
    onInitialized: /* e */ AnonElement[dxForm] => _ = null,
    onOptionChanged: /* e */ AnonName[dxForm] => _ = null,
    optionalMark: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    requiredMark: String = null,
    requiredMessage: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    screenByWidth: js.Function = null,
    scrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    showColonAfterLabel: js.UndefOr[Boolean] = js.undefined,
    showOptionalMark: js.UndefOr[Boolean] = js.undefined,
    showRequiredMark: js.UndefOr[Boolean] = js.undefined,
    showValidationSummary: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    validationGroup: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFormOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(alignItemLabels)) __obj.updateDynamic("alignItemLabels")(alignItemLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(alignItemLabelsInAllGroups)) __obj.updateDynamic("alignItemLabelsInAllGroups")(alignItemLabelsInAllGroups.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (colCount != null) __obj.updateDynamic("colCount")(colCount.asInstanceOf[js.Any])
    if (colCountByScreen != null) __obj.updateDynamic("colCountByScreen")(colCountByScreen.asInstanceOf[js.Any])
    if (customizeItem != null) __obj.updateDynamic("customizeItem")(js.Any.fromFunction1(customizeItem))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (labelLocation != null) __obj.updateDynamic("labelLocation")(labelLocation.asInstanceOf[js.Any])
    if (minColWidth != null) __obj.updateDynamic("minColWidth")(minColWidth.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditorEnterKey != null) __obj.updateDynamic("onEditorEnterKey")(js.Any.fromFunction1(onEditorEnterKey))
    if (onFieldDataChanged != null) __obj.updateDynamic("onFieldDataChanged")(js.Any.fromFunction1(onFieldDataChanged))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (optionalMark != null) __obj.updateDynamic("optionalMark")(optionalMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (requiredMark != null) __obj.updateDynamic("requiredMark")(requiredMark.asInstanceOf[js.Any])
    if (requiredMessage != null) __obj.updateDynamic("requiredMessage")(requiredMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (screenByWidth != null) __obj.updateDynamic("screenByWidth")(screenByWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingEnabled)) __obj.updateDynamic("scrollingEnabled")(scrollingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showColonAfterLabel)) __obj.updateDynamic("showColonAfterLabel")(showColonAfterLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showOptionalMark)) __obj.updateDynamic("showOptionalMark")(showOptionalMark.asInstanceOf[js.Any])
    if (!js.isUndefined(showRequiredMark)) __obj.updateDynamic("showRequiredMark")(showRequiredMark.asInstanceOf[js.Any])
    if (!js.isUndefined(showValidationSummary)) __obj.updateDynamic("showValidationSummary")(showValidationSummary.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormOptions]
  }
}

