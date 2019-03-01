package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection object used on the client side to maintain particular client control objects
  */
trait ASPxClientControlCollection extends js.Object {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]]
  /**
    * Occurs when the browser window is being resized.
    */
  var BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any DevExpress web control.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]]
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]]
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]]
  /**
    * Occurs after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  var ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  /**
    * Performs the specified action for each control in the collection.
    * @param action An ASPxClientControlAction object specifying an action to perform.
    */
  def ForEachControl(action: ASPxClientControlAction): scala.Unit
  /**
    * Returns a collection item identified by its unique hierarchically-qualified identifier.
    * @param name A string value representing the hierarchically-qualified identifier of the required control.
    */
  def Get(name: js.Object): js.Object
  /**
    * Returns a DevExpress client control object identified by its unique hierarchically-qualified identifier (either ClientInstanceName or ClientID property value).
    * @param name A string value that is the hierarchically-qualified identifier of the required DevExpress control.
    */
  def GetByName(name: java.lang.String): js.Object
  /**
    * Returns all controls in the collection that satisfy the specified predicate.
    * @param predicate An ASPxClientControlPredicate object that is a predicate used to search for controls in the collection.
    */
  def GetControlsByPredicate(predicate: ASPxClientControlPredicate): js.Array[js.Object]
  /**
    * Returns all controls of the specified type.
    * @param type The object specifying the client control type.
    */
  def GetControlsByType(`type`: js.Object): js.Array[js.Object]
}

object ASPxClientControlCollection {
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: js.Function1[ASPxClientControlAction, scala.Unit],
    Get: js.Function1[js.Object, js.Object],
    GetByName: js.Function1[java.lang.String, js.Object],
    GetControlsByPredicate: js.Function1[ASPxClientControlPredicate, js.Array[js.Object]],
    GetControlsByType: js.Function1[js.Object, js.Array[js.Object]],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientControlCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginCallback")(BeginCallback)
    __obj.updateDynamic("BrowserWindowResized")(BrowserWindowResized)
    __obj.updateDynamic("CallbackError")(CallbackError)
    __obj.updateDynamic("ControlsInitialized")(ControlsInitialized)
    __obj.updateDynamic("EndCallback")(EndCallback)
    __obj.updateDynamic("ForEachControl")(ForEachControl)
    __obj.updateDynamic("Get")(Get)
    __obj.updateDynamic("GetByName")(GetByName)
    __obj.updateDynamic("GetControlsByPredicate")(GetControlsByPredicate)
    __obj.updateDynamic("GetControlsByType")(GetControlsByType)
    __obj.updateDynamic("ValidationCompleted")(ValidationCompleted)
    __obj.asInstanceOf[ASPxClientControlCollection]
  }
}

