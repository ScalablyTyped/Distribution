package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxColorEdit control.
  */
trait ASPxClientColorEdit
  extends StObject
     with ASPxClientDropDownEditBase {
  
  /**
    * Fires after the selected color has been changed within the color editor via end-user interaction.
    */
  var ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
  
  /**
    * Returns the color editor's value.
    */
  def GetColor(): String
  
  /**
    * Indicates whether the automatic color item is selected.
    */
  def IsAutomaticColorSelected(): Boolean
  
  /**
    * Specifies the color value for the color editor.
    * @param value A string value specifying the editor color.
    */
  def SetColor(value: String): Unit
  
  /**
    * This event is not in effect for the ASPxClientColorEdit. Use the ASPxClientColorEdit.ColorChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientColorEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
}
object ASPxClientColorEdit {
  
  inline def apply(
    AdjustControl: () => Unit,
    AdjustDropDownWindow: () => Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: () => Unit,
    GetButton: Double => js.Any,
    GetButtonVisible: Double => Boolean,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetColor: () => String,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    HideDropDown: () => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsAutomaticColorSelected: () => Boolean,
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    SelectAll: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetButtonVisible: (Double, Boolean) => Unit,
    SetCaption: String => Unit,
    SetCaretPosition: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetColor: String => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelection: (Double, Double, Boolean) => Unit,
    SetText: String => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowDropDown: () => Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientColorEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), ButtonClick = ButtonClick.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], ColorChanged = ColorChanged.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetColor = js.Any.fromFunction0(GetColor), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsAutomaticColorSelected = js.Any.fromFunction0(IsAutomaticColorSelected), KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetColor = js.Any.fromFunction1(SetColor), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientColorEdit]
  }
  
  extension [Self <: ASPxClientColorEdit](x: Self) {
    
    inline def setColorChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]): Self = StObject.set(x, "ColorChanged", value.asInstanceOf[js.Any])
    
    inline def setGetColor(value: () => String): Self = StObject.set(x, "GetColor", js.Any.fromFunction0(value))
    
    inline def setIsAutomaticColorSelected(value: () => Boolean): Self = StObject.set(x, "IsAutomaticColorSelected", js.Any.fromFunction0(value))
    
    inline def setSetColor(value: String => Unit): Self = StObject.set(x, "SetColor", js.Any.fromFunction1(value))
    
    inline def setTextChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]): Self = StObject.set(x, "TextChanged", value.asInstanceOf[js.Any])
  }
}
