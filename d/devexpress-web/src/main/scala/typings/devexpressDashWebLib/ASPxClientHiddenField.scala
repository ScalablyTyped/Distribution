package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
trait ASPxClientHiddenField extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  def Add(propertyName: java.lang.String, propertyValue: js.Object): scala.Unit
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  def Clear(): scala.Unit
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection.
    * @param propertyName A string value that specifies the property name.
    */
  def Contains(propertyName: java.lang.String): scala.Boolean
  /**
    * Returns the value with the specified property name.
    * @param propertyName A string value that specifies the property name.
    */
  def Get(propertyName: java.lang.String): js.Object
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side CustomCallback event.
    */
  def PerformCallback(parameter: java.lang.String): scala.Unit
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  def Remove(propertyName: java.lang.String): scala.Unit
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  def Set(propertyName: java.lang.String, propertyValue: js.Object): scala.Unit
}

object ASPxClientHiddenField {
  @scala.inline
  def apply(
    Add: (java.lang.String, js.Object) => scala.Unit,
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]],
    Clear: () => scala.Unit,
    Contains: java.lang.String => scala.Boolean,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]],
    Get: java.lang.String => js.Object,
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PerformCallback: java.lang.String => scala.Unit,
    Remove: java.lang.String => scala.Unit,
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    Set: (java.lang.String, js.Object) => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientHiddenField = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, Clear = js.Any.fromFunction0(Clear), Contains = js.Any.fromFunction1(Contains), EndCallback = EndCallback, Get = js.Any.fromFunction1(Get), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, PerformCallback = js.Any.fromFunction1(PerformCallback), Remove = js.Any.fromFunction1(Remove), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), Set = js.Any.fromFunction2(Set), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientHiddenField]
  }
}

