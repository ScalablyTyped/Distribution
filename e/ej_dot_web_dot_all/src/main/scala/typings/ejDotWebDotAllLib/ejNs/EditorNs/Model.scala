package typings
package ejDotWebDotAllLib.ejNs.EditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires after Editor control value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires after Editor control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for Editors which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the currency symbol of currency textbox, used when the user wants to overwrite the currency symbol commonly instead of the current culture symbol.
    * @Default {Based on the culture}
    */
  var currencySymbol: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the number of digits that is allowed after the decimal point. When the decimalPlaces is set to â€œ-1â€, it allows the decimals without any limit in the Textboxes.
    * @Default {0}
    */
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
  /** Fires when the Editor is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specify the enablePersistence to editor to save current editor control value to browser cookies for state maintenance.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the Right to Left Direction to editor.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class,otherwise it internally changed to the correct value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the editor control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires after Editor control is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Fires after Editor control is loss the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** It provides the options to get the customized character to separate the digits. If not set, the separator defined by the current culture.
    * @Default {Based on the culture}
    */
  var groupSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the number of digits in each group to the editor.
    * @Default {Based on the culture.}
    */
  var groupSize: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height of the editor.
    * @Default {30}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** It allows to define the characteristics of the Editors control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** The Editor value increment or decrement based an incrementStep value.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[scala.Double] = js.undefined
  /** Defines the localization culture for editor.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum value of the editor.
    * @Default {Number.MAX_VALUE}
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum value of the editor.
    * @Default {-(Number.MAX_VALUE) and 0 for Currency Textbox.}
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the name of the editor.
    * @Default {Sets id as name if it is null.}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the negative pattern. you have to specify 'n' to place the digit in your
    * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
    * @Default {Based on the culture}
    */
  var negativePattern: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the positive pattern. you have to specify 'n' to place the digit in your
    * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
    * @Default {Based on the culture}
    */
  var positivePattern: js.UndefOr[java.lang.String] = js.undefined
  /** Toggles the readonly state of the editor. When the Editor is readonly it doesn't allow user interactions.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to Change the sharped edges into rounded corner for the Editor.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the up and down spin buttons should be displayed in editor.
    * @Default {true}
    */
  var showSpinButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables decimal separator position validation on type .
    * @Default {false}
    */
  var validateOnType: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the jQuery validation error message in editor.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules to the editor.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value of the editor.
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Specifies the watermark text to editor.
    * @Default {Based on the culture.}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the editor.
    * @Default {143}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

