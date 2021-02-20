package typings.esfxCancelable

import typings.esfxDisposable.distMod.Disposable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@esfx/cancelable/dist", "CancelError")
  @js.native
  class CancelError () extends Error {
    def this(message: String) = this()
  }
  
  @js.native
  trait CancelSubscription extends Disposable {
    
    /**
      * Unsubscribes from a cancellation signal.
      */
    def unsubscribe(): Unit = js.native
  }
  object CancelSubscription {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    @JSImport("@esfx/cancelable/dist", "CancelSubscription.create")
    @js.native
    def create(unsubscribe: js.Function0[Unit]): CancelSubscription = js.native
  }
  
  @js.native
  trait Cancelable extends StObject
  object Cancelable {
    
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
    @JSImport("@esfx/cancelable/dist", "Cancelable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.isCancelable")
    @js.native
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.isSignaled")
    @js.native
    def isSignaled(): Boolean = js.native
    @JSImport("@esfx/cancelable/dist", "Cancelable.isSignaled")
    @js.native
    def isSignaled(cancelable: Cancelable): Boolean = js.native
    
    @JSImport("@esfx/cancelable/dist", "Cancelable.name")
    @js.native
    val name: /* "Cancelable" */ String = js.native
    
    /**
      * A `Cancelable` that can never be signaled.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.none")
    @js.native
    val none: CancelableCancelSignal = js.native
    
    @JSImport("@esfx/cancelable/dist", "Cancelable.subscribe")
    @js.native
    def subscribe(cancelable: js.UndefOr[scala.Nothing], onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.subscribe")
    @js.native
    def subscribe(cancelable: Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    @JSImport("@esfx/cancelable/dist", "Cancelable.throwIfSignaled")
    @js.native
    def throwIfSignaled(): Unit = js.native
    @JSImport("@esfx/cancelable/dist", "Cancelable.throwIfSignaled")
    @js.native
    def throwIfSignaled(cancelable: Cancelable): Unit = js.native
  }
  
  @js.native
  trait CancelableSource extends Cancelable
  object CancelableSource {
    
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
    @JSImport("@esfx/cancelable/dist", "CancelableSource.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable/dist", "CancelableSource.isCancelable")
    @js.native
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      * @deprecated Use `CancelableSource.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable/dist", "CancelableSource.isCancelableSource")
    @js.native
    def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
    
    @JSImport("@esfx/cancelable/dist", "CancelableSource.name")
    @js.native
    val name: /* "CancelableSource" */ String = js.native
  }
  
  @js.native
  trait CancelSignal extends StObject {
    
    /**
      * Gets a value indicating whether cancellation was signaled.
      */
    val signaled: Boolean = js.native
    
    /**
      * Subscribes to notifications for when the object becomes signaled.
      */
    def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription = js.native
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
  trait CancelableCancelSignal extends CancelSignal
}
