package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
trait MVCxClientGlobalEvents extends js.Object {
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

