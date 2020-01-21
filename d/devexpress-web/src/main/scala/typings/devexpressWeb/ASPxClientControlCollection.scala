package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection object used on the client side to maintain particular client control objects
  */
@JSGlobal("ASPxClientControlCollection")
@js.native
class ASPxClientControlCollection () extends js.Object {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Occurs when the browser window is being resized.
    */
  var BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any DevExpress web control.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Occurs after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  var ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]] = js.native
  /**
    * Performs the specified action for each control in the collection.
    * @param action An ASPxClientControlAction object specifying an action to perform.
    */
  def ForEachControl(action: ASPxClientControlAction): Unit = js.native
  /** @deprecated Use the GetByName method instead. */
  /**
    * Returns a collection item identified by its unique hierarchically-qualified identifier. An object representing the collection item found.
    * @param name A string value representing the hierarchically-qualified identifier of the required control.
    */
  def Get(name: js.Any): js.Any = js.native
  /**
    * Returns a DevExpress client control object identified by its unique hierarchically-qualified identifier (either ClientInstanceName or ClientID property value). An object that is the client control object found.
    * @param name A string value that is the hierarchically-qualified identifier of the required DevExpress control.
    */
  def GetByName(name: String): js.Any = js.native
  /**
    * Returns all controls in the collection that satisfy the specified predicate. An array of all client controls found.
    * @param predicate An ASPxClientControlPredicate object that is a predicate used to search for controls in the collection.
    */
  def GetControlsByPredicate(predicate: ASPxClientControlPredicate): js.Array[_] = js.native
  /**
    * Returns all controls of the specified type. An array of all client controls found.
    * @param type The object specifying the client control type.
    */
  def GetControlsByType(`type`: js.Any): js.Array[_] = js.native
}

