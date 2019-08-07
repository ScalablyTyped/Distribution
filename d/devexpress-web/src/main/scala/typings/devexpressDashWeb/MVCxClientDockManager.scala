package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the DockManager extension.
  */
@JSGlobal("MVCxClientDockManager")
@js.native
class MVCxClientDockManager () extends ASPxClientDockManager {
  /**
    * Sends a callback with a parameter to update the DockManager by processing the passed information on the server, in an Action specified by the DockManager's DockManagerSettings.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the DockManagerSettings.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientDockManager")
@js.native
object MVCxClientDockManager extends js.Object {
  /**
    * Converts the specified object to the MVCxClientDockManager type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientDockManager = js.native
}

