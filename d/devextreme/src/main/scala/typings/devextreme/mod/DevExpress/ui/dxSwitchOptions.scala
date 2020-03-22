package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSwitchOptions extends EditorOptions[dxSwitch] {
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.undefined
  /** @deprecated Use the switchedOffText option instead. */
  /** Text displayed when the widget is in a disabled state. */
  var offText: js.UndefOr[String] = js.undefined
  /** @deprecated Use the switchedOnText option instead. */
  /** Text displayed when the widget is in an enabled state. */
  var onText: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed when the widget is switched off. */
  var switchedOffText: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed when the widget is switched on. */
  var switchedOnText: js.UndefOr[String] = js.undefined
  /** A Boolean value specifying whether the current switch state is "On" or "Off". */
  @JSName("value")
  var value_dxSwitchOptions: js.UndefOr[Boolean] = js.undefined
}

object dxSwitchOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxSwitch] => _ = null,
    onDisposing: /* e */ AnonModel[dxSwitch] => _ = null,
    onInitialized: /* e */ AnonElement[dxSwitch] => _ = null,
    onOptionChanged: /* e */ AnonName[dxSwitch] => _ = null,
    onText: String = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxSwitch] => _ = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    switchedOffText: String = null,
    switchedOnText: String = null,
    tabIndex: Int | Double = null,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offText != null) __obj.updateDynamic("offText")(offText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onText != null) __obj.updateDynamic("onText")(onText.asInstanceOf[js.Any])
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (switchedOffText != null) __obj.updateDynamic("switchedOffText")(switchedOffText.asInstanceOf[js.Any])
    if (switchedOnText != null) __obj.updateDynamic("switchedOnText")(switchedOnText.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSwitchOptions]
  }
}

