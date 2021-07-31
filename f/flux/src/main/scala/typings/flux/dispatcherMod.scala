package typings.flux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcherMod {
  
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
  class ^[TPayload] ()
    extends StObject
       with Dispatcher[TPayload] {
    
    /**
      * Dispatches a payload to all registered callbacks
      */
    /* CompleteClass */
    override def dispatch(payload: TPayload): Unit = js.native
    
    /**
      * Gets whether the dispatcher is currently dispatching
      */
    /* CompleteClass */
    override def isDispatching(): Boolean = js.native
    
    /**
      * Registers a callback that will be invoked with every payload sent to the dispatcher.
      * Returns a string token to identify the callback to be used with waitFor() or unregister.
      */
    /* CompleteClass */
    override def register(callback: js.Function1[TPayload, Unit]): String = js.native
    
    /**
      * Unregisters a callback with the given ID token
      */
    /* CompleteClass */
    override def unregister(id: String): Unit = js.native
    
    /**
      * Waits for the callbacks with the specified IDs to be invoked before continuing execution
      * of the current callback. This method should only be used by a callback in response
      * to a dispatched payload.
      */
    /* CompleteClass */
    override def waitFor(IDs: js.Array[String]): Unit = js.native
  }
  
  trait Dispatcher[TPayload] extends StObject {
    
    /**
      * Dispatches a payload to all registered callbacks
      */
    def dispatch(payload: TPayload): Unit
    
    /**
      * Gets whether the dispatcher is currently dispatching
      */
    def isDispatching(): Boolean
    
    /**
      * Registers a callback that will be invoked with every payload sent to the dispatcher.
      * Returns a string token to identify the callback to be used with waitFor() or unregister.
      */
    def register(callback: js.Function1[/* payload */ TPayload, Unit]): String
    
    /**
      * Unregisters a callback with the given ID token
      */
    def unregister(id: String): Unit
    
    /**
      * Waits for the callbacks with the specified IDs to be invoked before continuing execution
      * of the current callback. This method should only be used by a callback in response
      * to a dispatched payload.
      */
    def waitFor(IDs: js.Array[String]): Unit
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
    implicit class DispatcherMutableBuilder[Self <: Dispatcher[?], TPayload] (val x: Self & Dispatcher[TPayload]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: TPayload => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDispatching(value: () => Boolean): Self = StObject.set(x, "isDispatching", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: js.Function1[/* payload */ TPayload, Unit] => String): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregister(value: String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWaitFor(value: js.Array[String] => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    }
  }
}
