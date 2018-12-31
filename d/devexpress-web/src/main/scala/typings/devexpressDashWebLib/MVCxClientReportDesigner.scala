package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the MVCxReportDesigner class.
  */
@js.native
trait MVCxClientReportDesigner extends ASPxClientReportDesigner {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientReportDesigner: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientReportDesigner]] = js.native
  /**
    * Occurs after executing the Save command on the client.
    */
  var SaveCommandExecuted: ASPxClientEvent[
    MVCxClientReportDesignerSaveCommandExecutedEventHandler[MVCxClientReportDesigner]
  ] = js.native
  /**
    * Sends a callback to the server with the specified argument.
    * @param arg A Object value, specifying the callback argument.
    */
  def PerformCallback(arg: js.Object): scala.Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side event, passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(arg: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

