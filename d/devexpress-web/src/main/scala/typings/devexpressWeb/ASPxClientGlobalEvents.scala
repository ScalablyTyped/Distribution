package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxGlobalEvents component.
  */
trait ASPxClientGlobalEvents extends StObject {
  
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]]
  
  /**
    * Occurs when the browser window is being resized.
    */
  var BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any of DevExpress web controls.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]]
  
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]]
  
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]]
  
  /**
    * Occurs on the client side after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  var ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]]
}
object ASPxClientGlobalEvents {
  
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]]
  ): ASPxClientGlobalEvents = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEvents]
  }
  
  @scala.inline
  implicit class ASPxClientGlobalEventsMutableBuilder[Self <: ASPxClientGlobalEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserWindowResized(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "BrowserWindowResized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsInitialized(value: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "ControlsInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationCompleted(value: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]]): Self = StObject.set(x, "ValidationCompleted", value.asInstanceOf[js.Any])
  }
}
