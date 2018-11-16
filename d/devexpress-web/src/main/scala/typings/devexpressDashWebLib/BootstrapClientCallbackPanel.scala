package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapCallbackPanel control.
 */
@js.native
trait BootstrapClientCallbackPanel extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[BootstrapClientCallbackPanel]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by the BootstrapClientCallbackPanel.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[BootstrapClientCallbackPanel]] = js.native
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[BootstrapClientCallbackPanel]] = js.native
  /**
       * Returns the HTML code that specifies the contents of the control's window.
       */
  def GetContentHtml(): java.lang.String = js.native
  /**
       * Returns a value specifying whether a callback panel is enabled.
       */
  def GetEnabled(): scala.Boolean = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
       */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(parameter: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Sets the HTML markup specifying the contents of the control's window.
       * @param html A string value that specifies the HTML markup.
       */
  def SetContentHtml(html: java.lang.String): scala.Unit = js.native
  /**
       * Sets a value specifying whether the callback panel is enabled.
       * @param enabled true, to enable the callback panel; false to disable it.
       */
  def SetEnabled(enabled: scala.Boolean): scala.Unit = js.native
}

