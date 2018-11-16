package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side counterpart of the DockManager extension.
 */
@js.native
trait MVCxClientDockManager extends ASPxClientDockManager {
  /**
       * Sends a callback with a parameter to update the DockManager by processing the passed information on the server, in an Action specified by the DockManager's CallbackRouteValues property.
       * @param data An object containing any information that needs to be passed to a handling Action specified by the CallbackRouteValues property.
       */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
       * Sends a callback with a parameter to update the DockManager by processing the passed information on the server, in an Action specified by the DockManager's CallbackRouteValues property.
       * @param data An object containing any information that needs to be passed to a handling Action specified by the CallbackRouteValues property.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

