package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDataField
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.DataFieldElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormOptions extends WidgetOptions[dxForm] {
  /** @name dxForm.Options.alignItemLabels */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.alignItemLabelsInAllGroups */
  var alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.colCount */
  var colCount: js.UndefOr[Double | auto] = js.undefined
  /** @name dxForm.Options.colCountByScreen */
  var colCountByScreen: js.UndefOr[js.Any] = js.undefined
  /** @name dxForm.Options.customizeItem */
  var customizeItem: js.UndefOr[
    js.Function1[
      /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem, 
      _
    ]
  ] = js.undefined
  /** @name dxForm.Options.formData */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** @name dxForm.Options.items */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.undefined
  /** @name dxForm.Options.labelLocation */
  var labelLocation: js.UndefOr[left | right | top] = js.undefined
  /** @name dxForm.Options.minColWidth */
  var minColWidth: js.UndefOr[Double] = js.undefined
  /** @name dxForm.Options.onEditorEnterKey */
  var onEditorEnterKey: js.UndefOr[js.Function1[/* e */ ComponentDataField, _]] = js.undefined
  /** @name dxForm.Options.onFieldDataChanged */
  var onFieldDataChanged: js.UndefOr[js.Function1[/* e */ DataFieldElement, _]] = js.undefined
  /** @name dxForm.Options.optionalMark */
  var optionalMark: js.UndefOr[String] = js.undefined
  /** @name dxForm.Options.readOnly */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.requiredMark */
  var requiredMark: js.UndefOr[String] = js.undefined
  /** @name dxForm.Options.requiredMessage */
  var requiredMessage: js.UndefOr[String] = js.undefined
  /** @name dxForm.Options.screenByWidth */
  var screenByWidth: js.UndefOr[js.Function] = js.undefined
  /** @name dxForm.Options.scrollingEnabled */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.showColonAfterLabel */
  var showColonAfterLabel: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.showOptionalMark */
  var showOptionalMark: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.showRequiredMark */
  var showRequiredMark: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.showValidationSummary */
  var showValidationSummary: js.UndefOr[Boolean] = js.undefined
  /** @name dxForm.Options.validationGroup */
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
    minColWidth: js.UndefOr[Double] = js.undefined,
    onContentReady: /* e */ ComponentElement[dxForm] => _ = null,
    onDisposing: /* e */ Model[dxForm] => _ = null,
    onEditorEnterKey: /* e */ ComponentDataField => _ = null,
    onFieldDataChanged: /* e */ DataFieldElement => _ = null,
    onInitialized: /* e */ Element[dxForm] => _ = null,
    onOptionChanged: /* e */ Name[dxForm] => _ = null,
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
    tabIndex: js.UndefOr[Double] = js.undefined,
    validationGroup: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFormOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alignItemLabels)) __obj.updateDynamic("alignItemLabels")(alignItemLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alignItemLabelsInAllGroups)) __obj.updateDynamic("alignItemLabelsInAllGroups")(alignItemLabelsInAllGroups.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (colCount != null) __obj.updateDynamic("colCount")(colCount.asInstanceOf[js.Any])
    if (colCountByScreen != null) __obj.updateDynamic("colCountByScreen")(colCountByScreen.asInstanceOf[js.Any])
    if (customizeItem != null) __obj.updateDynamic("customizeItem")(js.Any.fromFunction1(customizeItem))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (labelLocation != null) __obj.updateDynamic("labelLocation")(labelLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(minColWidth)) __obj.updateDynamic("minColWidth")(minColWidth.get.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditorEnterKey != null) __obj.updateDynamic("onEditorEnterKey")(js.Any.fromFunction1(onEditorEnterKey))
    if (onFieldDataChanged != null) __obj.updateDynamic("onFieldDataChanged")(js.Any.fromFunction1(onFieldDataChanged))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (optionalMark != null) __obj.updateDynamic("optionalMark")(optionalMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (requiredMark != null) __obj.updateDynamic("requiredMark")(requiredMark.asInstanceOf[js.Any])
    if (requiredMessage != null) __obj.updateDynamic("requiredMessage")(requiredMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (screenByWidth != null) __obj.updateDynamic("screenByWidth")(screenByWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingEnabled)) __obj.updateDynamic("scrollingEnabled")(scrollingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColonAfterLabel)) __obj.updateDynamic("showColonAfterLabel")(showColonAfterLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOptionalMark)) __obj.updateDynamic("showOptionalMark")(showOptionalMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRequiredMark)) __obj.updateDynamic("showRequiredMark")(showRequiredMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValidationSummary)) __obj.updateDynamic("showValidationSummary")(showValidationSummary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormOptions]
  }
}

