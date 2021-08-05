package typings.esfxCancelable

import typings.esfxCancelable.distMod.CancelSubscription
import typings.esfxCancelable.distMod.CancelableCancelSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/cancelable", "CancelError")
  @js.native
  class CancelError ()
    extends typings.esfxCancelable.distMod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    @JSImport("@esfx/cancelable", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCancelable.distMod.CancelSubscription]
  }
  
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
      * Determines whether a value is a `Cancelable` object.
      */
    inline def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    inline def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    inline def isSignaled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")().asInstanceOf[Boolean]
    inline def isSignaled(cancelable: typings.esfxCancelable.distMod.Cancelable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@esfx/cancelable", "Cancelable.name")
    @js.native
    val name: /* "Cancelable" */ String = js.native
    
    /**
      * A `Cancelable` that can never be signaled.
      */
    @JSImport("@esfx/cancelable", "Cancelable.none")
    @js.native
    val none: CancelableCancelSignal = js.native
    
    inline def subscribe(cancelable: Unit, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    inline def subscribe(cancelable: typings.esfxCancelable.distMod.Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(cancelable.asInstanceOf[js.Any], onSignaled.asInstanceOf[js.Any])).asInstanceOf[CancelSubscription]
    
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    inline def throwIfSignaled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")().asInstanceOf[Unit]
    inline def throwIfSignaled(cancelable: typings.esfxCancelable.distMod.Cancelable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfSignaled")(cancelable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
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
    inline def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean]
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    inline def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean]
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      * @deprecated Use `CancelableSource.hasInstance` instead.
      */
    inline def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelableSource")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean]
    
    @JSImport("@esfx/cancelable", "CancelableSource.name")
    @js.native
    val name: /* "CancelableSource" */ String = js.native
  }
}
