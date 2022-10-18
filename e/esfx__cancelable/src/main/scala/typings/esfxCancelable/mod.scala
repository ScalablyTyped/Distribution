package typings.esfxCancelable

import typings.esfxDisposable.distTypesDisposableMod.Disposable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/cancelable", "CancelError")
  @js.native
  open class CancelError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait CancelSubscription extends Disposable {
    
    /**
      * Unsubscribes from a cancellation signal.
      */
    def unsubscribe(): Unit = js.native
  }
  object CancelSubscription {
    
    @JSImport("@esfx/cancelable", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[CancelSubscription]
  }
  
  @js.native
  trait Cancelable extends StObject
  object Cancelable {
    
    @JSImport("@esfx/cancelable", "Cancelable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    @JSImport("@esfx/cancelable", "Cancelable.cancelSignal")
    @js.native
    val cancelSignal: js.Symbol = js.native
    
    /**
      * A `Cancelable` that is already signaled.
      */
    @JSImport("@esfx/cancelable", "Cancelable.canceled")
    @js.native
    val canceled: CancelableCancelSignal = js.native
    
    /**
      * Gets the reason for cancelation.
      */
    inline def getReason(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getReason")().asInstanceOf[Any]
    inline def getReason(cancelable: Cancelable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getReason")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Determines whether a value is a `Cancelable` object.
      */
    inline def hasInstance(value: Any): /* is @esfx/cancelable.@esfx/cancelable.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable.Cancelable */ Boolean]
    
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    inline def isSignaled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")().asInstanceOf[Boolean]
    inline def isSignaled(cancelable: Cancelable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@esfx/cancelable", "Cancelable.name")
    @js.native
    val name: /* "Cancelable" */ String = js.native
    
    /**
      * A `Cancelable` that can never be signaled.
      */
    @JSImport("@esfx/cancelable", "Cancelable.none")
    @js.native
    val none: CancelableCancelSignal = js.native
    
    inline def subscribe(cancelable: Null, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    inline def subscribe(cancelable: Unit, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    inline def subscribe(cancelable: Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    inline def throwIfSignaled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")().asInstanceOf[Unit]
    inline def throwIfSignaled(cancelable: Cancelable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait CancelableSource
    extends StObject
       with Cancelable
  object CancelableSource {
    
    @JSImport("@esfx/cancelable", "CancelableSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/cancelable", "CancelableSource.cancel")
    @js.native
    val cancel: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    @JSImport("@esfx/cancelable", "CancelableSource.cancelSignal")
    @js.native
    val cancelSignal: js.Symbol = js.native
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      */
    inline def hasInstance(value: Any): /* is @esfx/cancelable.@esfx/cancelable.CancelableSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable.CancelableSource */ Boolean]
    
    @JSImport("@esfx/cancelable", "CancelableSource.name")
    @js.native
    val name: /* "CancelableSource" */ String = js.native
  }
  
  trait CancelSignal extends StObject {
    
    /**
      * Gets the reason cancellation was signaled.
      */
    val reason: Any
    
    /**
      * Gets a value indicating whether cancellation was signaled.
      */
    val signaled: Boolean
    
    /**
      * Subscribes to notifications for when the object becomes signaled.
      */
    def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription
  }
  object CancelSignal {
    
    inline def apply(reason: Any, signaled: Boolean, subscribe: js.Function0[Unit] => CancelSubscription): CancelSignal = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], signaled = signaled.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[CancelSignal]
    }
    
    extension [Self <: CancelSignal](x: Self) {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setSignaled(value: Boolean): Self = StObject.set(x, "signaled", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: js.Function0[Unit] => CancelSubscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CancelableCancelSignal
    extends StObject
       with CancelSignal
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    2 extends std.ConstructorParameters<std.ErrorConstructor>['length'] ? std.ConstructorParameters<std.ErrorConstructor> extends [message: string | undefined, options: infer O | undefined] ? std.NonNullable<O> : never : never
    }}}
    */
  @js.native
  trait ErrorOptions extends StObject
}
