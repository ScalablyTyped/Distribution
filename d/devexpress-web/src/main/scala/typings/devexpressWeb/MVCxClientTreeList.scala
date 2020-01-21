package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TreeList extension.
  */
@JSGlobal("MVCxClientTreeList")
@js.native
class MVCxClientTreeList () extends ASPxClientTreeList {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTreeList: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeList]] = js.native
  /**
    * Sends a callback with a parameter to update the TreeList by processing the passed information on the server, in an Action specified via the TreeList's TreeListSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the TreeListSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the TreeList's TreeListSettings.CustomDataActionRouteValues property, and then return the processing result to the client, to the ASPxClientTreeList.CustomDataCallback event. This method does not update the TreeList.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the TreeListSettings.CustomDataActionRouteValues property.
    */
  def PerformCustomDataCallback(data: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientTreeList")
@js.native
object MVCxClientTreeList extends js.Object {
  /**
    * Converts the specified object to the MVCxClientTreeList type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientTreeList = js.native
}

