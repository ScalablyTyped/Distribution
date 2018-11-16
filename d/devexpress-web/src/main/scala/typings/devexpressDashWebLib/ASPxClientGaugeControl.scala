package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client ASPxGaugeControl.
 */
@js.native
trait ASPxClientGaugeControl extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGaugeControl]] = js.native
  /**
       * Fires when errors have occurred during callback processing.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGaugeControl]] = js.native
  /**
       * Occurs on the client after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGaugeControl]] = js.native
  /**
       * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side CustomCallback event.
       */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side CustomCallback event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(parameter: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

