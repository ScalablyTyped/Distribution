package typings.esfxCancelable

import typings.esfxDisposable.distMod.Disposable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@esfx/cancelable/dist", "CancelError")
  @js.native
  class CancelError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait CancelSubscription
    extends StObject
       with Disposable {
    
    /**
      * Unsubscribes from a cancellation signal.
      */
    def unsubscribe(): Unit = js.native
  }
  object CancelSubscription {
    
    @JSImport("@esfx/cancelable/dist", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    @scala.inline
    def create(unsubscribe: js.Function0[Unit]): CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[CancelSubscription]
  }
  
  @js.native
  trait Cancelable extends StObject
  object Cancelable {
    
    @JSImport("@esfx/cancelable/dist", "Cancelable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.cancelSignal")
    @js.native
    val cancelSignal: js.Symbol = js.native
    
    /**
      * A `Cancelable` that is already signaled.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.canceled")
    @js.native
    val canceled: CancelableCancelSignal = js.native
    
    /**
      * Determines whether a value is a `Cancelable` object.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @scala.inline
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    @scala.inline
    def isSignaled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")().asInstanceOf[Boolean]
    @scala.inline
    def isSignaled(cancelable: Cancelable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@esfx/cancelable/dist", "Cancelable.name")
    @js.native
    val name: /* "Cancelable" */ String = js.native
    
    /**
      * A `Cancelable` that can never be signaled.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.none")
    @js.native
    val none: CancelableCancelSignal = js.native
    
    @scala.inline
    def subscribe(cancelable: Unit, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    @scala.inline
    def subscribe(cancelable: Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    @scala.inline
    def throwIfSignaled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")().asInstanceOf[Unit]
    @scala.inline
    def throwIfSignaled(cancelable: Cancelable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait CancelableSource
    extends StObject
       with Cancelable
  object CancelableSource {
    
    @JSImport("@esfx/cancelable/dist", "CancelableSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/cancelable/dist", "CancelableSource.cancel")
    @js.native
    val cancel: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    @JSImport("@esfx/cancelable/dist", "CancelableSource.cancelSignal")
    @js.native
    val cancelSignal: js.Symbol = js.native
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean]
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @scala.inline
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      * @deprecated Use `CancelableSource.hasInstance` instead.
      */
    @scala.inline
    def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelableSource")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean]
    
    @JSImport("@esfx/cancelable/dist", "CancelableSource.name")
    @js.native
    val name: /* "CancelableSource" */ String = js.native
  }
  
  trait CancelSignal extends StObject {
    
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
    
    @scala.inline
    def apply(signaled: Boolean, subscribe: js.Function0[Unit] => CancelSubscription): CancelSignal = {
      val __obj = js.Dynamic.literal(signaled = signaled.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[CancelSignal]
    }
    
    @scala.inline
    implicit class CancelSignalMutableBuilder[Self <: CancelSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignaled(value: Boolean): Self = StObject.set(x, "signaled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribe(value: js.Function0[Unit] => CancelSubscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CancelableCancelSignal
    extends StObject
       with CancelSignal
}
