package typings
package fluxLib.libDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/lib/Dispatcher", JSImport.Namespace)
@js.native
/**
  * Create an instance of the Dispatcher class to use throughout the application.
  *
  * Specify a type in the 'TPayload' generic argument to use strongly-typed payloads,
  * otherwise specify 'any'
  *
  * Examples:
  *     var dispatcher = new flux.Dispatcher<any>()
  *     var typedDispatcher = new flux.Dispatcher<MyCustomActionType>()
  */
class ^[TPayload] () extends Dispatcher[TPayload] {
  /**
    * Dispatches a payload to all registered callbacks
    */
  /* CompleteClass */
  override def dispatch(payload: TPayload): scala.Unit = js.native
  /**
    * Gets whether the dispatcher is currently dispatching
    */
  /* CompleteClass */
  override def isDispatching(): scala.Boolean = js.native
  /**
    * Registers a callback that will be invoked with every payload sent to the dispatcher.
    * Returns a string token to identify the callback to be used with waitFor() or unregister.
    */
  /* CompleteClass */
  override def register(callback: js.Function1[TPayload, scala.Unit]): java.lang.String = js.native
  /**
    * Unregisters a callback with the given ID token
    */
  /* CompleteClass */
  override def unregister(id: java.lang.String): scala.Unit = js.native
  /**
    * Waits for the callbacks with the specified IDs to be invoked before continuing execution
    * of the current callback. This method should only be used by a callback in response
    * to a dispatched payload.
    */
  /* CompleteClass */
  override def waitFor(IDs: js.Array[java.lang.String]): scala.Unit = js.native
}

