package typings
package ejDotWebDotAllLib.ejNs.MaskEditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Fires when value changed in mask edit textbox control.
               */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires after MaskEdit control is created.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the cssClass to achieve custom theme.
               * @Default {null}
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the custom character allowed to entered in mask edit textbox control.
               * @Default {null}
               */
  var customCharacter: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the MaskEdit is destroyed successfully.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specify the enablePersistence to mask edit textbox to save current model value to browser cookies for state maintains.
               */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the state of the mask edit textbox control.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when focused in mask edit textbox control.
               */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires when focused out in mask edit textbox control.
               */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Specifies the height for the mask edit textbox control.
               * @Default {28 px}
               */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether hide the prompt characters with spaces on blur. Prompt chars will be shown again on focus the textbox.
               * @Default {false}
               */
  var hidePromptOnLeave: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the list of HTML attributes to be added to mask edit textbox.
               * @Default {{}}
               */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specify the inputMode for mask edit textbox control. See InputMode
               * @Default {ej.InputMode.Text}
               */
  var inputMode: js.UndefOr[ejDotWebDotAllLib.ejNs.InputMode | java.lang.String] = js.undefined
  /** Fires when key press in mask edit textbox control.
               */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, scala.Unit]] = js.undefined
  /** Fires when keyup in mask edit textbox control.
               */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, scala.Unit]] = js.undefined
  /** Defines the localization culture for MaskEdit.
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the input mask.
               * @Default {null}
               */
  var maskFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when mouse out in mask edit textbox control.
               */
  var mouseOut: js.UndefOr[js.Function1[/* e */ MouseOutEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse over in mask edit textbox control.
               */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, scala.Unit]] = js.undefined
  /** Specifies the name attribute value for the mask edit textbox.
               * @Default {null}
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when keydown in mask edit textbox control.
               */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ OnKeyDownEventArgs, scala.Unit]] = js.undefined
  /** Toggles the readonly state of the mask edit textbox. When the mask edit textbox is readonly, it doesn't allow your input.
               * @Default {false}
               */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the error will show until correct value entered in the mask edit textbox control.
               * @Default {false}
               */
  var showError: js.UndefOr[scala.Boolean] = js.undefined
  /** when showPromptChar is true, the hide the prompt characters are shown in focus of the control and hides in focus out of the control.
               * @Default {true}
               */
  var showPromptChar: js.UndefOr[scala.Boolean] = js.undefined
  /** MaskEdit input is displayed in rounded corner style when this property is set to true.
               * @Default {false}
               */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the text alignment for mask edit textbox control.See TextAlign
               * @Default {left}
               */
  var textAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
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
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
               * @Default {null}
               */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width for the mask edit textbox control.
               * @Default {143pixel}
               */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

