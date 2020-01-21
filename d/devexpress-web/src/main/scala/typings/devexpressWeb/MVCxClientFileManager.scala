package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the FileManager extension.
  */
@JSGlobal("MVCxClientFileManager")
@js.native
class MVCxClientFileManager () extends ASPxClientFileManager {
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

/* static members */
@JSGlobal("MVCxClientFileManager")
@js.native
object MVCxClientFileManager extends js.Object {
  /**
    * Converts the specified object to the MVCxClientFileManager type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientFileManager = js.native
}

