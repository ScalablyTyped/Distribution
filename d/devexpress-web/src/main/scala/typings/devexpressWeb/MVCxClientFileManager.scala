package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Sends a callback to the server and generates the server-side ASPxFileManager.CustomCallback event, passing it the specified argument.
    * @param data A string value that specifies any information that needs to be sent to the server-side ASPxFileManager.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
