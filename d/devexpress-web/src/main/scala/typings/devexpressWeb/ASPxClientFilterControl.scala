package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxFilterControl.
  */
@JSGlobal("ASPxClientFilterControl")
@js.native
class ASPxClientFilterControl () extends ASPxClientControl {
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): Unit = js.native
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): String = js.native
  /**
    * Returns the editor used to edit operand values for the specified filter column. An ASPxClientEditBase descendant that represents the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  def GetEditor(editorIndex: Double): ASPxClientEditBase = js.native
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): String = js.native
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): Boolean = js.native
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientFilterControl")
@js.native
object ASPxClientFilterControl extends js.Object {
  /**
    * Converts the specified object to the ASPxClientFilterControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientFilterControl = js.native
}

