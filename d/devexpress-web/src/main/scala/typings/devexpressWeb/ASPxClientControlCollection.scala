package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection object used on the client side to maintain particular client control objects
  */
trait ASPxClientControlCollection extends StObject {
  
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
    * Performs the specified action for each control in the collection.
    * @param action An ASPxClientControlAction object specifying an action to perform.
    */
  def ForEachControl(action: ASPxClientControlAction): Unit
  
  /** @deprecated Use the GetByName method instead. */
  /**
    * Returns a collection item identified by its unique hierarchically-qualified identifier. An object representing the collection item found.
    * @param name A string value representing the hierarchically-qualified identifier of the required control.
    */
  def Get(name: js.Any): js.Any
  
  /**
    * Returns a DevExpress client control object identified by its unique hierarchically-qualified identifier (either ClientInstanceName or ClientID property value). An object that is the client control object found.
    * @param name A string value that is the hierarchically-qualified identifier of the required DevExpress control.
    */
  def GetByName(name: String): js.Any
  
  /**
    * Returns all controls in the collection that satisfy the specified predicate. An array of all client controls found.
    * @param predicate An ASPxClientControlPredicate object that is a predicate used to search for controls in the collection.
    */
  def GetControlsByPredicate(predicate: ASPxClientControlPredicate): js.Array[js.Any]
  
  /**
    * Returns all controls of the specified type. An array of all client controls found.
    * @param type The object specifying the client control type.
    */
  def GetControlsByType(`type`: js.Any): js.Array[js.Any]
  
  /**
    * Occurs after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  var ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
}
object ASPxClientControlCollection {
  
  inline def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => Unit,
    Get: js.Any => js.Any,
    GetByName: String => js.Any,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[js.Any],
    GetControlsByType: js.Any => js.Array[js.Any],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientControlCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCollection]
  }
  
  extension [Self <: ASPxClientControlCollection](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setBrowserWindowResized(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "BrowserWindowResized", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setControlsInitialized(value: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "ControlsInitialized", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setForEachControl(value: ASPxClientControlAction => Unit): Self = StObject.set(x, "ForEachControl", js.Any.fromFunction1(value))
    
    inline def setGet(value: js.Any => js.Any): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    inline def setGetByName(value: String => js.Any): Self = StObject.set(x, "GetByName", js.Any.fromFunction1(value))
    
    inline def setGetControlsByPredicate(value: ASPxClientControlPredicate => js.Array[js.Any]): Self = StObject.set(x, "GetControlsByPredicate", js.Any.fromFunction1(value))
    
    inline def setGetControlsByType(value: js.Any => js.Array[js.Any]): Self = StObject.set(x, "GetControlsByType", js.Any.fromFunction1(value))
    
    inline def setValidationCompleted(value: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]): Self = StObject.set(x, "ValidationCompleted", value.asInstanceOf[js.Any])
  }
}
