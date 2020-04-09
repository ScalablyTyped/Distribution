package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAnd
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonContains
import typings.devextreme.AnonEditorElement
import typings.devextreme.AnonEditorName
import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelPreviousValue
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.and
import typings.devextreme.devextremeStrings.notAnd
import typings.devextreme.devextremeStrings.notOr
import typings.devextreme.devextremeStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderOptions extends WidgetOptions[dxFilterBuilder] {
  /** @name dxFilterBuilder.Options.allowHierarchicalFields */
  var allowHierarchicalFields: js.UndefOr[Boolean] = js.undefined
  /** @name dxFilterBuilder.Options.customOperations */
  var customOperations: js.UndefOr[js.Array[dxFilterBuilderCustomOperation]] = js.undefined
  /** @name dxFilterBuilder.Options.fields */
  var fields: js.UndefOr[js.Array[dxFilterBuilderField]] = js.undefined
  /** @name dxFilterBuilder.Options.filterOperationDescriptions */
  var filterOperationDescriptions: js.UndefOr[AnonContains] = js.undefined
  /** @name dxFilterBuilder.Options.groupOperationDescriptions */
  var groupOperationDescriptions: js.UndefOr[AnonAnd] = js.undefined
  /** @name dxFilterBuilder.Options.groupOperations */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.undefined
  /** @name dxFilterBuilder.Options.maxGroupLevel */
  var maxGroupLevel: js.UndefOr[Double] = js.undefined
  /** @name dxFilterBuilder.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ AnonEditorElement, _]] = js.undefined
  /** @name dxFilterBuilder.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonEditorName, _]] = js.undefined
  /** @name dxFilterBuilder.Options.onValueChanged */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelPreviousValue, _]] = js.undefined
  /** @name dxFilterBuilder.Options.value */
  var value: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
}

object dxFilterBuilderOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowHierarchicalFields: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    customOperations: js.Array[dxFilterBuilderCustomOperation] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    fields: js.Array[dxFilterBuilderField] = null,
    filterOperationDescriptions: AnonContains = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupOperationDescriptions: AnonAnd = null,
    groupOperations: js.Array[and | or | notAnd | notOr] = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxGroupLevel: Int | Double = null,
    onContentReady: /* e */ AnonComponentElement[dxFilterBuilder] => _ = null,
    onDisposing: /* e */ AnonModel[dxFilterBuilder] => _ = null,
    onEditorPrepared: /* e */ AnonEditorElement => _ = null,
    onEditorPreparing: /* e */ AnonEditorName => _ = null,
    onInitialized: /* e */ AnonElement[dxFilterBuilder] => _ = null,
    onOptionChanged: /* e */ AnonName[dxFilterBuilder] => _ = null,
    onValueChanged: /* e */ AnonModelPreviousValue => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    value: String | js.Array[_] | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHierarchicalFields)) __obj.updateDynamic("allowHierarchicalFields")(allowHierarchicalFields.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customOperations != null) __obj.updateDynamic("customOperations")(customOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterOperationDescriptions != null) __obj.updateDynamic("filterOperationDescriptions")(filterOperationDescriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupOperationDescriptions != null) __obj.updateDynamic("groupOperationDescriptions")(groupOperationDescriptions.asInstanceOf[js.Any])
    if (groupOperations != null) __obj.updateDynamic("groupOperations")(groupOperations.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (maxGroupLevel != null) __obj.updateDynamic("maxGroupLevel")(maxGroupLevel.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1(onEditorPrepared))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1(onEditorPreparing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
}

