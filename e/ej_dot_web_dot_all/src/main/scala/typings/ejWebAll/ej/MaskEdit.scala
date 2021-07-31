package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskEdit
  extends StObject
     with Widget_ {
  
  /** To clear the text in mask edit textbox control.
    * @returns {void}
    */
  def clear(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To disable the mask edit textbox control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the mask edit textbox control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To obtained the pure value of the text value, removes all the symbols in mask edit textbox control.
    * @returns {string}
    */
  def get_StrippedValue(): String = js.native
  
  /** To obtained the textbox value as such that, Just replace all '_' to ' '(space) in mask edit textbox control.
    * @returns {string}
    */
  def get_UnstrippedValue(): String = js.native
  
  @JSName("model")
  var model_MaskEdit: Model = js.native
}
object MaskEdit {
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the MaskEdit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the MaskEdit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object FocusInEventArgs {
    
    @scala.inline
    def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    @scala.inline
    implicit class FocusInEventArgsMutableBuilder[Self <: FocusInEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object FocusOutEventArgs {
    
    @scala.inline
    def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit class FocusOutEventArgsMutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait KeyPressEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object KeyPressEventArgs {
    
    @scala.inline
    def apply(): KeyPressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPressEventArgs]
    }
    
    @scala.inline
    implicit class KeyPressEventArgsMutableBuilder[Self <: KeyPressEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait KeyUpEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object KeyUpEventArgs {
    
    @scala.inline
    def apply(): KeyUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyUpEventArgs]
    }
    
    @scala.inline
    implicit class KeyUpEventArgsMutableBuilder[Self <: KeyUpEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
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
    def apply(): typings.ejWebAll.ej.MaskEdit.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.MaskEdit.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.MaskEdit.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomCharacter(value: String): Self = StObject.set(x, "customCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCharacterUndefined: Self = StObject.set(x, "customCharacter", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      @scala.inline
      def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidePromptOnLeave(value: Boolean): Self = StObject.set(x, "hidePromptOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePromptOnLeaveUndefined: Self = StObject.set(x, "hidePromptOnLeave", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setInputMode(value: InputMode | String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyPressUndefined: Self = StObject.set(x, "keyPress", js.undefined)
      
      @scala.inline
      def setKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = StObject.set(x, "keyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyUpUndefined: Self = StObject.set(x, "keyUp", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaskFormat(value: String): Self = StObject.set(x, "maskFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskFormatUndefined: Self = StObject.set(x, "maskFormat", js.undefined)
      
      @scala.inline
      def setMouseOut(value: /* e */ MouseOutEventArgs => Unit): Self = StObject.set(x, "mouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseOutUndefined: Self = StObject.set(x, "mouseOut", js.undefined)
      
      @scala.inline
      def setMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = StObject.set(x, "mouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseOverUndefined: Self = StObject.set(x, "mouseOver", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ OnKeyDownEventArgs => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setShowError(value: Boolean): Self = StObject.set(x, "showError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrorUndefined: Self = StObject.set(x, "showError", js.undefined)
      
      @scala.inline
      def setShowPromptChar(value: Boolean): Self = StObject.set(x, "showPromptChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPromptCharUndefined: Self = StObject.set(x, "showPromptChar", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: js.Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseOutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object MouseOutEventArgs {
    
    @scala.inline
    def apply(): MouseOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseOutEventArgs]
    }
    
    @scala.inline
    implicit class MouseOutEventArgsMutableBuilder[Self <: MouseOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MouseOverEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object MouseOverEventArgs {
    
    @scala.inline
    def apply(): MouseOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseOverEventArgs]
    }
    
    @scala.inline
    implicit class MouseOverEventArgsMutableBuilder[Self <: MouseOverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OnKeyDownEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mask edit model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns unstripped value in mask edit textbox control.
      */
    var unmaskedValue: js.UndefOr[String] = js.undefined
    
    /** returns the mask edit value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object OnKeyDownEventArgs {
    
    @scala.inline
    def apply(): OnKeyDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnKeyDownEventArgs]
    }
    
    @scala.inline
    implicit class OnKeyDownEventArgsMutableBuilder[Self <: OnKeyDownEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnmaskedValue(value: String): Self = StObject.set(x, "unmaskedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmaskedValueUndefined: Self = StObject.set(x, "unmaskedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
