package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
trait MVCxClientGlobalEvents extends StObject {
  
  /**
    * Occurs on the client when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a DevExpress MVC extension.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]]
  
  /**
    * Occurs on the client side after client object models of all DevExpress MVC extensions contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]]
  
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]]
}
object MVCxClientGlobalEvents {
  
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]]
  ): MVCxClientGlobalEvents = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientGlobalEvents]
  }
  
  @scala.inline
  implicit class MVCxClientGlobalEventsMutableBuilder[Self <: MVCxClientGlobalEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsInitialized(value: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]]): Self = StObject.set(x, "ControlsInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
  }
}
