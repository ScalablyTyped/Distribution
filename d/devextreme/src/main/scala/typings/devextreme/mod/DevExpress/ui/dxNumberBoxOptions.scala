package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventJQueryEvent
import typings.devextreme.AnonJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.spins
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxNumberBoxOptions extends dxTextEditorOptions[dxNumberBox] {
  /** Allows you to add custom buttons to the input text field. */
  @JSName("buttons")
  var buttons_dxNumberBoxOptions: js.UndefOr[js.Array[clear | spins | dxTextEditorButton]] = js.undefined
  /** Specifies the value's display format and controls user input accordingly. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Specifies the text of the message displayed if the specified value is not a number. */
  var invalidValueMessage: js.UndefOr[String] = js.undefined
  /** The maximum value accepted by the number box. */
  var max: js.UndefOr[Double] = js.undefined
  /** The minimum value accepted by the number box. */
  var min: js.UndefOr[Double] = js.undefined
  /** Specifies the value to be passed to the type attribute of the underlying `` element. */
  var mode: js.UndefOr[number | text | tel] = js.undefined
  /** Specifies whether to show the buttons that change the value by a step. */
  var showSpinButtons: js.UndefOr[Boolean] = js.undefined
  /** Specifies how much the widget's value changes when using the spin buttons, Up/Down arrow keys, or mouse wheel. */
  var step: js.UndefOr[Double] = js.undefined
  /** Specifies whether to use touch friendly spin buttons. Applies only if showSpinButtons is true. */
  var useLargeSpinButtons: js.UndefOr[Boolean] = js.undefined
  /** The current number box value. */
  @JSName("value")
  var value_dxNumberBoxOptions: js.UndefOr[Double] = js.undefined
}

object dxNumberBoxOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | spins | dxTextEditorButton] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    format: format = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    invalidValueMessage: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    mode: number | text | tel = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxNumberBox] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onDisposing: /* e */ AnonModel[dxNumberBox] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onInitialized: /* e */ AnonElement[dxNumberBox] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onOptionChanged: /* e */ AnonName[dxNumberBox] => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxNumberBox] => _ = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxNumberBox] => _ = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    showSpinButtons: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useLargeSpinButtons: js.UndefOr[Boolean] = js.undefined,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: Int | Double = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxNumberBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (invalidValueMessage != null) __obj.updateDynamic("invalidValueMessage")(invalidValueMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1(onEnterKey))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1(onFocusIn))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1(onFocusOut))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpinButtons)) __obj.updateDynamic("showSpinButtons")(showSpinButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useLargeSpinButtons)) __obj.updateDynamic("useLargeSpinButtons")(useLargeSpinButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxNumberBoxOptions]
  }
}

