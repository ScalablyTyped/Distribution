package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxButton control.
  */
trait ASPxClientButton
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]
  
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]
  
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): Unit
  
  /**
    * Sets input focus to the button.
    */
  def Focus(): Unit
  
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): Boolean
  
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): String
  
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): String
  
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit
  
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: String): Unit
}
object ASPxClientButton {
  
  inline def apply(
    AdjustControl: () => Unit,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: () => Unit,
    Focus: () => Unit,
    GetChecked: () => Boolean,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetImageUrl: () => String,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetText: () => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetChecked: Boolean => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetImageUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], DoClick = js.Any.fromFunction0(DoClick), Focus = js.Any.fromFunction0(Focus), GetChecked = js.Any.fromFunction0(GetChecked), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetChecked = js.Any.fromFunction1(SetChecked), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButton]
  }
  
  extension [Self <: ASPxClientButton](x: Self) {
    
    inline def setCheckedChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]): Self = StObject.set(x, "CheckedChanged", value.asInstanceOf[js.Any])
    
    inline def setClick(value: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
    
    inline def setDoClick(value: () => Unit): Self = StObject.set(x, "DoClick", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    inline def setGetChecked(value: () => Boolean): Self = StObject.set(x, "GetChecked", js.Any.fromFunction0(value))
    
    inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    inline def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    inline def setGotFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = StObject.set(x, "GotFocus", value.asInstanceOf[js.Any])
    
    inline def setLostFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = StObject.set(x, "LostFocus", value.asInstanceOf[js.Any])
    
    inline def setSetChecked(value: Boolean => Unit): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1(value))
    
    inline def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    inline def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
  }
}
