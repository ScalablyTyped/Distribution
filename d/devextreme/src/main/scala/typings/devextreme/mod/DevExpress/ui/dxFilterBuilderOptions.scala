package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.And
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Contains
import typings.devextreme.anon.EditorElement
import typings.devextreme.anon.EditorName
import typings.devextreme.anon.Element
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelPreviousValue
import typings.devextreme.anon.Name
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
  var filterOperationDescriptions: js.UndefOr[Contains] = js.undefined
  /** @name dxFilterBuilder.Options.groupOperationDescriptions */
  var groupOperationDescriptions: js.UndefOr[And] = js.undefined
  /** @name dxFilterBuilder.Options.groupOperations */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.undefined
  /** @name dxFilterBuilder.Options.maxGroupLevel */
  var maxGroupLevel: js.UndefOr[Double] = js.undefined
  /** @name dxFilterBuilder.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ EditorElement, _]] = js.undefined
  /** @name dxFilterBuilder.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ EditorName, _]] = js.undefined
  /** @name dxFilterBuilder.Options.onValueChanged */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ModelPreviousValue, _]] = js.undefined
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
    filterOperationDescriptions: Contains = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupOperationDescriptions: And = null,
    groupOperations: js.Array[and | or | notAnd | notOr] = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxGroupLevel: js.UndefOr[Double] = js.undefined,
    onContentReady: /* e */ ComponentElement[dxFilterBuilder] => _ = null,
    onDisposing: /* e */ Model[dxFilterBuilder] => _ = null,
    onEditorPrepared: /* e */ EditorElement => _ = null,
    onEditorPreparing: /* e */ EditorName => _ = null,
    onInitialized: /* e */ Element[dxFilterBuilder] => _ = null,
    onOptionChanged: /* e */ Name[dxFilterBuilder] => _ = null,
    onValueChanged: /* e */ ModelPreviousValue => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    value: String | js.Array[_] | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHierarchicalFields)) __obj.updateDynamic("allowHierarchicalFields")(allowHierarchicalFields.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customOperations != null) __obj.updateDynamic("customOperations")(customOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterOperationDescriptions != null) __obj.updateDynamic("filterOperationDescriptions")(filterOperationDescriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (groupOperationDescriptions != null) __obj.updateDynamic("groupOperationDescriptions")(groupOperationDescriptions.asInstanceOf[js.Any])
    if (groupOperations != null) __obj.updateDynamic("groupOperations")(groupOperations.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGroupLevel)) __obj.updateDynamic("maxGroupLevel")(maxGroupLevel.get.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1(onEditorPrepared))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1(onEditorPreparing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
}

