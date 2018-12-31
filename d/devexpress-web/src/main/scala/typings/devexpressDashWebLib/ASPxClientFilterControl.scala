package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxFilterControl.
  */
trait ASPxClientFilterControl extends ASPxClientControl {
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): scala.Unit
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): java.lang.String
  /**
    * Returns the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  def GetEditor(editorIndex: scala.Double): ASPxClientEditBase
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): java.lang.String
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): scala.Boolean
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): scala.Unit
}

