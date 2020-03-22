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
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTextEditorOptions[T] extends EditorOptions[T] {
  /** Allows you to add custom buttons to the input text field. */
  var buttons: js.UndefOr[js.Array[String | clear | dxTextEditorButton]] = js.undefined
  /** Specifies the attributes to be passed on to the underlying HTML element. */
  var inputAttr: js.UndefOr[js.Any] = js.undefined
  /** The editor mask that specifies the custom format of the entered string. */
  var mask: js.UndefOr[String] = js.undefined
  /** Specifies a mask placeholder. A single character is recommended. */
  var maskChar: js.UndefOr[String] = js.undefined
  /** A message displayed when the entered text does not match the specified pattern. */
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  /** Specifies custom mask rules. */
  var maskRules: js.UndefOr[js.Any] = js.undefined
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.undefined
  /** A function that is executed when the widget loses focus after the text field's content was changed using the keyboard. */
  var onChange: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the widget's input has been copied. */
  var onCopy: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the widget's input has been cut. */
  var onCut: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the Enter key has been pressed while the widget is focused. */
  var onEnterKey: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the widget gets focus. */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the widget loses focus. */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed each time the widget's input is changed while the widget is focused. */
  var onInput: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when a user is pressing a key on the keyboard. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when a user presses a key on the keyboard. */
  var onKeyPress: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when a user releases a key on the keyboard. */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** A function that is executed when the widget's input has been pasted. */
  var onPaste: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.undefined
  /** The text displayed by the widget when the widget value is empty. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Specifies whether to display the Clear button in the widget. */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  /** Specifies when the widget shows the mask. Applies only if useMaskedValue is true. */
  var showMaskMode: js.UndefOr[always | onFocus] = js.undefined
  /** Specifies whether or not the widget checks the inner text for spelling mistakes. */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  /** Specifies how the widget's text field is styled. */
  var stylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  /** The read-only option that holds the text displayed by the widget input element. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies whether the value should contain mask characters or not. */
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the DOM events after which the widget's value should be updated. */
  var valueChangeEvent: js.UndefOr[String] = js.undefined
}

object dxTextEditorOptions {
  @scala.inline
  def apply[T](
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttons: js.Array[String | clear | dxTextEditorButton] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onContentReady: /* e */ AnonComponentElement[T] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onValueChanged: /* e */ AnonJQueryEvent[T] => _ = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Any = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTextEditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
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
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTextEditorOptions[T]]
  }
}

