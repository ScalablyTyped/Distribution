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

object Model {
  @scala.inline
  def apply(
    change: /* e */ ChangeEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    currencySymbol: java.lang.String = null,
    decimalPlaces: scala.Int | scala.Double = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableStrictMode: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    focusIn: /* e */ FocusInEventArgs => scala.Unit = null,
    focusOut: /* e */ FocusOutEventArgs => scala.Unit = null,
    groupSeparator: java.lang.String = null,
    groupSize: java.lang.String = null,
    height: java.lang.String = null,
    htmlAttributes: js.Any = null,
    incrementStep: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    negativePattern: java.lang.String = null,
    positivePattern: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    showSpinButton: js.UndefOr[scala.Boolean] = js.undefined,
    validateOnType: js.UndefOr[scala.Boolean] = js.undefined,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: scala.Double | java.lang.String = null,
    watermarkText: java.lang.String = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (currencySymbol != null) __obj.updateDynamic("currencySymbol")(currencySymbol)
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableStrictMode)) __obj.updateDynamic("enableStrictMode")(enableStrictMode)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (groupSize != null) __obj.updateDynamic("groupSize")(groupSize)
    if (height != null) __obj.updateDynamic("height")(height)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (incrementStep != null) __obj.updateDynamic("incrementStep")(incrementStep.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativePattern != null) __obj.updateDynamic("negativePattern")(negativePattern)
    if (positivePattern != null) __obj.updateDynamic("positivePattern")(positivePattern)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (!js.isUndefined(showSpinButton)) __obj.updateDynamic("showSpinButton")(showSpinButton)
    if (!js.isUndefined(validateOnType)) __obj.updateDynamic("validateOnType")(validateOnType)
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

