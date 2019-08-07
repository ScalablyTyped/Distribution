package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
@JSGlobal("ASPxClientHiddenField")
@js.native
class ASPxClientHiddenField () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]] = js.native
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  def Add(propertyName: String, propertyValue: js.Any): Unit = js.native
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  def Clear(): Unit = js.native
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection. true if this value is contained within the collection; otherwise, false.
    * @param propertyName A string value that specifies the property name.
    */
  def Contains(propertyName: String): Boolean = js.native
  /**
    * Returns the value with the specified property name. An object that represents the value of the specified property.
    * @param propertyName A string value that specifies the property name.
    */
  def Get(propertyName: String): js.Any = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxHiddenField.CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxHiddenField.CustomCallback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  def Remove(propertyName: String): Unit = js.native
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  def Set(propertyName: String, propertyValue: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientHiddenField")
@js.native
object ASPxClientHiddenField extends js.Object {
  /**
    * Converts the specified object to the ASPxClientHiddenField type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientHiddenField = js.native
}

