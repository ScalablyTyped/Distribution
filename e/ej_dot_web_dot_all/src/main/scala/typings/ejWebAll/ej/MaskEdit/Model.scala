package typings.ejWebAll.ej.MaskEdit

import typings.ejWebAll.ej.InputMode
import typings.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires when value changed in mask edit textbox control.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires after MaskEdit control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the cssClass to achieve custom theme.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specify the custom character allowed to entered in mask edit textbox control.
    * @Default {null}
    */
  var customCharacter: js.UndefOr[String] = js.native
  /** Fires when the MaskEdit is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specify the enablePersistence to mask edit textbox to save current model value to browser cookies for state maintains.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Specify the state of the mask edit textbox control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when focused in mask edit textbox control.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Fires when focused out in mask edit textbox control.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Specifies the height for the mask edit textbox control.
    * @Default {28 px}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies whether hide the prompt characters with spaces on blur. Prompt chars will be shown again on focus the textbox.
    * @Default {false}
    */
  var hidePromptOnLeave: js.UndefOr[Boolean] = js.native
  /** Specifies the list of HTML attributes to be added to mask edit textbox.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specify the inputMode for mask edit textbox control. See InputMode
    * @Default {ej.InputMode.Text}
    */
  var inputMode: js.UndefOr[InputMode | String] = js.native
  /** Fires when key press in mask edit textbox control.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.native
  /** Fires when keyup in mask edit textbox control.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.native
  /** Defines the localization culture for MaskEdit.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the input mask.
    * @Default {null}
    */
  var maskFormat: js.UndefOr[String] = js.native
  /** Fires when mouse out in mask edit textbox control.
    */
  var mouseOut: js.UndefOr[js.Function1[/* e */ MouseOutEventArgs, Unit]] = js.native
  /** Fires when mouse over in mask edit textbox control.
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.native
  /** Specifies the name attribute value for the mask edit textbox.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  /** Fires when keydown in mask edit textbox control.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ OnKeyDownEventArgs, Unit]] = js.native
  /** Toggles the readonly state of the mask edit textbox. When the mask edit textbox is readonly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Specifies whether the error will show until correct value entered in the mask edit textbox control.
    * @Default {false}
    */
  var showError: js.UndefOr[Boolean] = js.native
  /** when showPromptChar is true, the hide the prompt characters are shown in focus of the control and hides in focus out of the control.
    * @Default {true}
    */
  var showPromptChar: js.UndefOr[Boolean] = js.native
  /** MaskEdit input is displayed in rounded corner style when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specify the text alignment for mask edit textbox control.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the jQuery validation error message in mask edit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules to the MaskEdit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Specifies the value for the mask edit textbox control.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Specifies the water mark text to be displayed in input text.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Specifies the width for the mask edit textbox control.
    * @Default {143pixel}
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
    def setCustomCharacter(value: String): Self = this.set("customCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCharacter: Self = this.set("customCharacter", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidePromptOnLeave(value: Boolean): Self = this.set("hidePromptOnLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePromptOnLeave: Self = this.set("hidePromptOnLeave", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setInputMode(value: InputMode | String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = this.set("keyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyPress: Self = this.set("keyPress", js.undefined)
    @scala.inline
    def setKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = this.set("keyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyUp: Self = this.set("keyUp", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaskFormat(value: String): Self = this.set("maskFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskFormat: Self = this.set("maskFormat", js.undefined)
    @scala.inline
    def setMouseOut(value: /* e */ MouseOutEventArgs => Unit): Self = this.set("mouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseOut: Self = this.set("mouseOut", js.undefined)
    @scala.inline
    def setMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = this.set("mouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseOver: Self = this.set("mouseOver", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ OnKeyDownEventArgs => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setShowError(value: Boolean): Self = this.set("showError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowError: Self = this.set("showError", js.undefined)
    @scala.inline
    def setShowPromptChar(value: Boolean): Self = this.set("showPromptChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPromptChar: Self = this.set("showPromptChar", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setTextAlign(value: TextAlign | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
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

