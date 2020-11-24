package typings.flux.dispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatcher[TPayload] extends js.Object {
  
  /**
    * Dispatches a payload to all registered callbacks
    */
  def dispatch(payload: TPayload): Unit = js.native
  
  /**
    * Gets whether the dispatcher is currently dispatching
    */
  def isDispatching(): Boolean = js.native
  
  /**
    * Registers a callback that will be invoked with every payload sent to the dispatcher.
    * Returns a string token to identify the callback to be used with waitFor() or unregister.
    */
  def register(callback: js.Function1[/* payload */ TPayload, Unit]): String = js.native
  
  /**
    * Unregisters a callback with the given ID token
    */
  def unregister(id: String): Unit = js.native
  
  /**
    * Waits for the callbacks with the specified IDs to be invoked before continuing execution
    * of the current callback. This method should only be used by a callback in response
    * to a dispatched payload.
    */
  def waitFor(IDs: js.Array[String]): Unit = js.native
}
object Dispatcher {
  
  @scala.inline
  def apply[TPayload](
    dispatch: TPayload => Unit,
    isDispatching: () => Boolean,
    register: js.Function1[/* payload */ TPayload, Unit] => String,
    unregister: String => Unit,
    waitFor: js.Array[String] => Unit
  ): Dispatcher[TPayload] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), isDispatching = js.Any.fromFunction0(isDispatching), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister), waitFor = js.Any.fromFunction1(waitFor))
    __obj.asInstanceOf[Dispatcher[TPayload]]
  }
  
  @scala.inline
  implicit class DispatcherOps[Self <: Dispatcher[_], TPayload] (val x: Self with Dispatcher[TPayload]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispatch(value: TPayload => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDispatching(value: () => Boolean): Self = this.set("isDispatching", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: js.Function1[/* payload */ TPayload, Unit] => String): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: String => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitFor(value: js.Array[String] => Unit): Self = this.set("waitFor", js.Any.fromFunction1(value))
  }
}
