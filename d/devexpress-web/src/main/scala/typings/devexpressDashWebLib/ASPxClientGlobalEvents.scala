package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the ASPxGlobalEvents component.
 */

trait ASPxClientGlobalEvents extends js.Object {
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

