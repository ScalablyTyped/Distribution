package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for the ASPxClientCheckBoxList and ASPxClientRadioButtonList objects.
  */
trait ASPxClientCheckListBase
  extends StObject
     with ASPxClientListEdit {
  
  /**
    * Returns the editor's item specified by its index. An ASPxClientListEditItem object that is the item located at the specified index.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientListEditItem
  
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): Double
}
object ASPxClientCheckListBase {
  
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
    GetItem: Double => ASPxClientListEditItem,
    GetItemCount: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetSelectedIndex: () => Double,
    GetSelectedItem: () => ASPxClientListEditItem,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelectedIndex: Double => Unit,
    SetSelectedItem: ASPxClientListEditItem => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckListBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetItem = js.Any.fromFunction1(GetItem), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedIndex = js.Any.fromFunction0(GetSelectedIndex), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectedIndexChanged = SelectedIndexChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedIndex = js.Any.fromFunction1(SetSelectedIndex), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCheckListBase]
  }
  
  @scala.inline
  implicit class ASPxClientCheckListBaseMutableBuilder[Self <: ASPxClientCheckListBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItem(value: Double => ASPxClientListEditItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
  }
}
