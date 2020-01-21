package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TokenBox and TokenBoxFor extensions.
  */
@JSGlobal("MVCxClientTokenBox")
@js.native
class MVCxClientTokenBox () extends ASPxClientTokenBox {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTokenBox: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTokenBox]] = js.native
  /**
    * Sends a callback with a parameter to update the TokenBox by processing the passed information on the server, in an Action specified by the TokenBox's AutoCompleteBoxBaseSettings.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the AutoCompleteBoxBaseSettings.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientTokenBox")
@js.native
object MVCxClientTokenBox extends js.Object {
  /**
    * Converts the specified object to the MVCxClientTokenBox type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientTokenBox = js.native
}

