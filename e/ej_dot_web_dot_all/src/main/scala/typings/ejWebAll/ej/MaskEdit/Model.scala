package typings.ejWebAll.ej.MaskEdit

import typings.ejWebAll.ej.InputMode
import typings.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when value changed in mask edit textbox control.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires after MaskEdit control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the cssClass to achieve custom theme.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specify the custom character allowed to entered in mask edit textbox control.
    * @Default {null}
    */
  var customCharacter: js.UndefOr[String] = js.undefined
  /** Fires when the MaskEdit is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specify the enablePersistence to mask edit textbox to save current model value to browser cookies for state maintains.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Specify the state of the mask edit textbox control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Fires when focused in mask edit textbox control.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Fires when focused out in mask edit textbox control.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Specifies the height for the mask edit textbox control.
    * @Default {28 px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies whether hide the prompt characters with spaces on blur. Prompt chars will be shown again on focus the textbox.
    * @Default {false}
    */
  var hidePromptOnLeave: js.UndefOr[Boolean] = js.undefined
  /** Specifies the list of HTML attributes to be added to mask edit textbox.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specify the inputMode for mask edit textbox control. See InputMode
    * @Default {ej.InputMode.Text}
    */
  var inputMode: js.UndefOr[InputMode | String] = js.undefined
  /** Fires when key press in mask edit textbox control.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.undefined
  /** Fires when keyup in mask edit textbox control.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.undefined
  /** Defines the localization culture for MaskEdit.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the input mask.
    * @Default {null}
    */
  var maskFormat: js.UndefOr[String] = js.undefined
  /** Fires when mouse out in mask edit textbox control.
    */
  var mouseOut: js.UndefOr[js.Function1[/* e */ MouseOutEventArgs, Unit]] = js.undefined
  /** Fires when mouse over in mask edit textbox control.
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.undefined
  /** Specifies the name attribute value for the mask edit textbox.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Fires when keydown in mask edit textbox control.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ OnKeyDownEventArgs, Unit]] = js.undefined
  /** Toggles the readonly state of the mask edit textbox. When the mask edit textbox is readonly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the error will show until correct value entered in the mask edit textbox control.
    * @Default {false}
    */
  var showError: js.UndefOr[Boolean] = js.undefined
  /** when showPromptChar is true, the hide the prompt characters are shown in focus of the control and hides in focus out of the control.
    * @Default {true}
    */
  var showPromptChar: js.UndefOr[Boolean] = js.undefined
  /** MaskEdit input is displayed in rounded corner style when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specify the text alignment for mask edit textbox control.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Sets the jQuery validation error message in mask edit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation rules to the MaskEdit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value for the mask edit textbox control.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Specifies the width for the mask edit textbox control.
    * @Default {143pixel}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    change: /* e */ ChangeEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    customCharacter: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    focusIn: /* e */ FocusInEventArgs => Unit = null,
    focusOut: /* e */ FocusOutEventArgs => Unit = null,
    height: String = null,
    hidePromptOnLeave: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    inputMode: InputMode | String = null,
    keyPress: /* e */ KeyPressEventArgs => Unit = null,
    keyUp: /* e */ KeyUpEventArgs => Unit = null,
    locale: String = null,
    maskFormat: String = null,
    mouseOut: /* e */ MouseOutEventArgs => Unit = null,
    mouseOver: /* e */ MouseOverEventArgs => Unit = null,
    name: String = null,
    onKeyDown: /* e */ OnKeyDownEventArgs => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    showError: js.UndefOr[Boolean] = js.undefined,
    showPromptChar: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    textAlign: TextAlign | String = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String = null,
    watermarkText: String = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customCharacter != null) __obj.updateDynamic("customCharacter")(customCharacter.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePromptOnLeave)) __obj.updateDynamic("hidePromptOnLeave")(hidePromptOnLeave.get.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (keyPress != null) __obj.updateDynamic("keyPress")(js.Any.fromFunction1(keyPress))
    if (keyUp != null) __obj.updateDynamic("keyUp")(js.Any.fromFunction1(keyUp))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maskFormat != null) __obj.updateDynamic("maskFormat")(maskFormat.asInstanceOf[js.Any])
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(js.Any.fromFunction1(mouseOut))
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(js.Any.fromFunction1(mouseOver))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showError)) __obj.updateDynamic("showError")(showError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPromptChar)) __obj.updateDynamic("showPromptChar")(showPromptChar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

