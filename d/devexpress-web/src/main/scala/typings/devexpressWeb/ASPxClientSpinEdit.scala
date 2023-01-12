package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSpinEdit control.
  */
trait ASPxClientSpinEdit
  extends StObject
     with ASPxClientSpinEditBase {
  
  /**
    * Gets the maximum value of the editor.
    */
  def GetMaxValue(): Double
  
  /**
    * Gets the minimum value of the editor.
    */
  def GetMinValue(): Double
  
  /**
    * Gets a number which represents the spin editor's value.
    */
  def GetNumber(): Double
  
  /**
    * Occurs on the client when a user changes the editor's value.
    */
  var NumberChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]]
  
  /**
    * Sets the maximum value of the editor.
    * @param value A decimal value specifying the maximum value of the editor.
    */
  def SetMaxValue(value: Double): Unit
  
  /**
    * Sets the minimum value of the editor.
    * @param value A decimal value specifying the minimum value of the editor.
    */
  def SetMinValue(value: Double): Unit
  
  /**
    * Sets the spin editor's value.
    * @param number A decimal number specifying the value to assign to the spin editor.
    */
  def SetNumber(number: Double): Unit
  
  /**
    * Specifies the value of the spin edit control on the client side.
    * @param number A Decimal value specifying the control value.
    */
  def SetValue(number: Double): Unit
}
object ASPxClientSpinEdit {
  
  inline def apply(
    AdjustControl: () => Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    Focus: () => Unit,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => Any,
    GetMaxValue: () => Double,
    GetMinValue: () => Double,
    GetNumber: () => Double,
    GetParentControl: () => Any,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetValue: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    NumberChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]],
    SelectAll: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetButtonVisible: (Double, Boolean) => Unit,
    SetCaption: String => Unit,
    SetCaretPosition: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxValue: Double => Unit,
    SetMinValue: Double => Unit,
    SetNumber: Double => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelection: (Double, Double, Boolean) => Unit,
    SetText: String => Unit,
    SetValue: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientSpinEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ButtonClick = ButtonClick.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetNumber = js.Any.fromFunction0(GetNumber), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], NumberChanged = NumberChanged.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxValue = js.Any.fromFunction1(SetMaxValue), SetMinValue = js.Any.fromFunction1(SetMinValue), SetNumber = js.Any.fromFunction1(SetNumber), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpinEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSpinEdit] (val x: Self) extends AnyVal {
    
    inline def setGetMaxValue(value: () => Double): Self = StObject.set(x, "GetMaxValue", js.Any.fromFunction0(value))
    
    inline def setGetMinValue(value: () => Double): Self = StObject.set(x, "GetMinValue", js.Any.fromFunction0(value))
    
    inline def setGetNumber(value: () => Double): Self = StObject.set(x, "GetNumber", js.Any.fromFunction0(value))
    
    inline def setNumberChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]]): Self = StObject.set(x, "NumberChanged", value.asInstanceOf[js.Any])
    
    inline def setSetMaxValue(value: Double => Unit): Self = StObject.set(x, "SetMaxValue", js.Any.fromFunction1(value))
    
    inline def setSetMinValue(value: Double => Unit): Self = StObject.set(x, "SetMinValue", js.Any.fromFunction1(value))
    
    inline def setSetNumber(value: Double => Unit): Self = StObject.set(x, "SetNumber", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
  }
}
