package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
trait ASPxClientHiddenField
  extends StObject
     with ASPxClientControl {
  
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  def Add(propertyName: String, propertyValue: js.Any): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]
  
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  def Clear(): Unit
  
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection. true if this value is contained within the collection; otherwise, false.
    * @param propertyName A string value that specifies the property name.
    */
  def Contains(propertyName: String): Boolean
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]
  
  /**
    * Returns the value with the specified property name. An object that represents the value of the specified property.
    * @param propertyName A string value that specifies the property name.
    */
  def Get(propertyName: String): js.Any
  
  /**
    * Sends a callback to the server and generates the server-side ASPxHiddenField.CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxHiddenField.CustomCallback event.
    */
  def PerformCallback(parameter: String): Unit
  
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  def Remove(propertyName: String): Unit
  
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  def Set(propertyName: String, propertyValue: js.Any): Unit
}
object ASPxClientHiddenField {
  
  @scala.inline
  def apply(
    Add: (String, js.Any) => Unit,
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]],
    Clear: () => Unit,
    Contains: String => Boolean,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]],
    Get: String => js.Any,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PerformCallback: String => Unit,
    Remove: String => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    Set: (String, js.Any) => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientHiddenField = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Contains = js.Any.fromFunction1(Contains), EndCallback = EndCallback.asInstanceOf[js.Any], Get = js.Any.fromFunction1(Get), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], PerformCallback = js.Any.fromFunction1(PerformCallback), Remove = js.Any.fromFunction1(Remove), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), Set = js.Any.fromFunction2(Set), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHiddenField]
  }
  
  @scala.inline
  implicit class ASPxClientHiddenFieldMutableBuilder[Self <: ASPxClientHiddenField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, js.Any) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContains(value: String => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPerformCallback(value: String => Unit): Self = StObject.set(x, "PerformCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction2(value))
  }
}
