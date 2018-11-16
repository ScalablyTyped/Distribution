package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side counterpart of the FileManager extension.
 */
@js.native
trait MVCxClientFileManager extends ASPxClientFileManager {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientFileManager: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientFileManager]] = js.native
  /**
       * Sends a callback with a parameter to update the FileManager by processing the passed information on the server, in an Action specified via the extension's CustomActionRouteValues property.
       * @param data An object containing any information that needs to be passed to a handling Action specified via the file manager's CustomActionRouteValues property.
       */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
       * @param data A string value that specifies any information that needs to be sent to the server-side CustomCallback event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

