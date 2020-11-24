package typings.ejWebAll.ej.Editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires after Editor control value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires after Editor control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for Editors which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Specifies the currency symbol of currency textbox, used when the user wants to overwrite the currency symbol commonly instead of the current culture symbol.
    * @Default {Based on the culture}
    */
  var currencySymbol: js.UndefOr[String] = js.native
  
  /** Specifies the number of digits that is allowed after the decimal point. When the decimalPlaces is set to â€œ-1â€, it allows the decimals without any limit in the Textboxes.
    * @Default {0}
    */
  var decimalPlaces: js.UndefOr[Double] = js.native
  
  /** Fires when the Editor is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specify the enablePersistence to editor to save current editor control value to browser cookies for state maintenance.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Specifies the Right to Left Direction to editor.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class,otherwise it internally changed to the correct value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  
  /** Specifies the editor control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Fires after Editor control is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  
  /** Fires after Editor control is loss the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  
  /** It provides the options to get the customized character to separate the digits. If not set, the separator defined by the current culture.
    * @Default {Based on the culture}
    */
  var groupSeparator: js.UndefOr[String] = js.native
  
  /** Specifies the number of digits in each group to the editor.
    * @Default {Based on the culture.}
    */
  var groupSize: js.UndefOr[String] = js.native
  
  /** Specifies the height of the editor.
    * @Default {30}
    */
  var height: js.UndefOr[String] = js.native
  
  /** It allows to define the characteristics of the Editors control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** The Editor value increment or decrement based an incrementStep value.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.native
  
  /** Defines the localization culture for editor.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the maximum value of the editor.
    * @Default {Number.MAX_VALUE}
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum value of the editor.
    * @Default {-(Number.MAX_VALUE) and 0 for Currency Textbox.}
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /** Specifies the name of the editor.
    * @Default {Sets id as name if it is null.}
    */
  var name: js.UndefOr[String] = js.native
  
  /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the negative pattern. you have to specify 'n' to place the digit in your
    * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
    * @Default {Based on the culture}
    */
  var negativePattern: js.UndefOr[String] = js.native
  
  /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the positive pattern. you have to specify 'n' to place the digit in your
    * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
    * @Default {Based on the culture}
    */
  var positivePattern: js.UndefOr[String] = js.native
  
  /** Toggles the readonly state of the editor. When the Editor is readonly it doesn't allow user interactions.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Specifies to Change the sharped edges into rounded corner for the Editor.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether the up and down spin buttons should be displayed in editor.
    * @Default {true}
    */
  var showSpinButton: js.UndefOr[Boolean] = js.native
  
  /** Enables decimal separator position validation on type .
    * @Default {false}
    */
  var validateOnType: js.UndefOr[Boolean] = js.native
  
  /** Set the jQuery validation error message in editor.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Set the jQuery validation rules to the editor.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Specifies the value of the editor.
    * @Default {null}
    */
  var value: js.UndefOr[Double | String] = js.native
  
  /** Specifies the watermark text to editor.
    * @Default {Based on the culture.}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Specifies the width of the editor.
    * @Default {143}
    */
  var width: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = this.set("currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencySymbol: Self = this.set("currencySymbol", js.undefined)
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableStrictMode(value: Boolean): Self = this.set("enableStrictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStrictMode: Self = this.set("enableStrictMode", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = this.set("focusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusIn: Self = this.set("focusIn", js.undefined)
    
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    
    @scala.inline
    def setGroupSize(value: String): Self = this.set("groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSize: Self = this.set("groupSize", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIncrementStep(value: Double): Self = this.set("incrementStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementStep: Self = this.set("incrementStep", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNegativePattern(value: String): Self = this.set("negativePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativePattern: Self = this.set("negativePattern", js.undefined)
    
    @scala.inline
    def setPositivePattern(value: String): Self = this.set("positivePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositivePattern: Self = this.set("positivePattern", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setShowSpinButton(value: Boolean): Self = this.set("showSpinButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSpinButton: Self = this.set("showSpinButton", js.undefined)
    
    @scala.inline
    def setValidateOnType(value: Boolean): Self = this.set("validateOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnType: Self = this.set("validateOnType", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWatermarkText(value: String): Self = this.set("watermarkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermarkText: Self = this.set("watermarkText", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
