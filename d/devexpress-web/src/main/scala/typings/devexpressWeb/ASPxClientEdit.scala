package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base object for all the editors that support validation.
  */
trait ASPxClientEdit
  extends StObject
     with ASPxClientEditBase {
  
  /**
    * Sets input focus to the editor.
    */
  def Focus(): Unit
  
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  def GetErrorText(): String
  
  /**
    * Returns an HTML element that represents the control's input element.
    */
  def GetInputElement(): js.Any
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  def GetIsValid(): Boolean
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  def GetReadOnly(): Boolean
  
  /**
    * Fires on the client side when the editor receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  
  /**
    * Fires on the client side when the editor loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  def SetErrorText(errorText: String): Unit
  
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  def SetIsValid(isValid: Boolean): Unit
  
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  def SetReadOnly(readOnly: Boolean): Unit
  
  /**
    * Performs the editor's validation.
    */
  def Validate(): Unit
  
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  var Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]
  
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  var ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]
}
object ASPxClientEdit {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetReadOnly: Boolean => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEdit]
  }
  
  @scala.inline
  implicit class ASPxClientEditMutableBuilder[Self <: ASPxClientEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorText(value: () => String): Self = StObject.set(x, "GetErrorText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputElement(value: () => js.Any): Self = StObject.set(x, "GetInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsValid(value: () => Boolean): Self = StObject.set(x, "GetIsValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "GetReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGotFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "GotFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLostFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "LostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetErrorText(value: String => Unit): Self = StObject.set(x, "SetErrorText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsValid(value: Boolean => Unit): Self = StObject.set(x, "SetIsValid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnly(value: Boolean => Unit): Self = StObject.set(x, "SetReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: () => Unit): Self = StObject.set(x, "Validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidation(value: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "ValueChanged", value.asInstanceOf[js.Any])
  }
}
