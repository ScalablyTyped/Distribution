package typings
package fluxLib.libDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatcher[TPayload] extends js.Object {
  /**
    * Dispatches a payload to all registered callbacks
    */
  def dispatch(payload: TPayload): scala.Unit
  /**
    * Gets whether the dispatcher is currently dispatching
    */
  def isDispatching(): scala.Boolean
  /**
    * Registers a callback that will be invoked with every payload sent to the dispatcher.
    * Returns a string token to identify the callback to be used with waitFor() or unregister.
    */
  def register(callback: js.Function1[/* payload */ TPayload, scala.Unit]): java.lang.String
  /**
    * Unregisters a callback with the given ID token
    */
  def unregister(id: java.lang.String): scala.Unit
  /**
    * Waits for the callbacks with the specified IDs to be invoked before continuing execution
    * of the current callback. This method should only be used by a callback in response
    * to a dispatched payload.
    */
  def waitFor(IDs: js.Array[java.lang.String]): scala.Unit
}

object Dispatcher {
  @scala.inline
  def apply[TPayload](
    dispatch: js.Function1[TPayload, scala.Unit],
    isDispatching: js.Function0[scala.Boolean],
    register: js.Function1[js.Function1[/* payload */ TPayload, scala.Unit], java.lang.String],
    unregister: js.Function1[java.lang.String, scala.Unit],
    waitFor: js.Function1[js.Array[java.lang.String], scala.Unit]
  ): Dispatcher[TPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch)
    __obj.updateDynamic("isDispatching")(isDispatching)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("unregister")(unregister)
    __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[Dispatcher[TPayload]]
  }
}

