package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the ListBox and ListBoxFor extensions.
  */
@JSGlobal("MVCxClientListBox")
@js.native
class MVCxClientListBox () extends ASPxClientListBox {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientListBox: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientListBox]] = js.native
  /**
    * Sends a callback with a parameter to update the ListBox by processing the passed information on the server, in an Action specified by the ListBox's ListBoxSettings.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the ListBoxSettings.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientListBox")
@js.native
object MVCxClientListBox extends js.Object {
  /**
    * Converts the specified object to the MVCxClientListBox type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientListBox = js.native
}

