package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the RichEdit extension.
  */
@JSGlobal("MVCxClientRichEdit")
@js.native
class MVCxClientRichEdit () extends ASPxClientRichEdit {
  /**
    * Sends a callback with a parameter to update the RichEdit by processing the passed information on the server, in an Action specified via the RichEditSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the RichEditSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientRichEdit")
@js.native
object MVCxClientRichEdit extends js.Object {
  /**
    * Converts the specified object to the MVCxClientRichEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientRichEdit = js.native
}

