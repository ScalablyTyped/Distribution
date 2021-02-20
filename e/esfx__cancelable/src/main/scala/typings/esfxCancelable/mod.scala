package typings.esfxCancelable

import typings.esfxCancelable.distMod.CancelSubscription
import typings.esfxCancelable.distMod.CancelableCancelSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/cancelable", "CancelError")
  @js.native
  class CancelError ()
    extends typings.esfxCancelable.distMod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    @JSImport("@esfx/cancelable", "CancelSubscription.create")
    @js.native
    def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  object Cancelable {
    
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
    @JSImport("@esfx/cancelable", "Cancelable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable", "Cancelable.isCancelable")
    @js.native
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    @JSImport("@esfx/cancelable", "Cancelable.isSignaled")
    @js.native
    def isSignaled(): Boolean = js.native
    @JSImport("@esfx/cancelable", "Cancelable.isSignaled")
    @js.native
    def isSignaled(cancelable: typings.esfxCancelable.distMod.Cancelable): Boolean = js.native
    
    @JSImport("@esfx/cancelable", "Cancelable.name")
    @js.native
    val name: /* "Cancelable" */ String = js.native
    
    /**
      * A `Cancelable` that can never be signaled.
      */
    @JSImport("@esfx/cancelable", "Cancelable.none")
    @js.native
    val none: CancelableCancelSignal = js.native
    
    @JSImport("@esfx/cancelable", "Cancelable.subscribe")
    @js.native
    def subscribe(cancelable: js.UndefOr[scala.Nothing], onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    @JSImport("@esfx/cancelable", "Cancelable.subscribe")
    @js.native
    def subscribe(cancelable: typings.esfxCancelable.distMod.Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    @JSImport("@esfx/cancelable", "Cancelable.throwIfSignaled")
    @js.native
    def throwIfSignaled(): Unit = js.native
    @JSImport("@esfx/cancelable", "Cancelable.throwIfSignaled")
    @js.native
    def throwIfSignaled(cancelable: typings.esfxCancelable.distMod.Cancelable): Unit = js.native
  }
  
  object CancelableSource {
    
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
    @JSImport("@esfx/cancelable", "CancelableSource.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
    
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable", "CancelableSource.isCancelable")
    @js.native
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    
    /**
      * Determines whether a value is a `CancelableSource` object.
      * @deprecated Use `CancelableSource.hasInstance` instead.
      */
    @JSImport("@esfx/cancelable", "CancelableSource.isCancelableSource")
    @js.native
    def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
    
    @JSImport("@esfx/cancelable", "CancelableSource.name")
    @js.native
    val name: /* "CancelableSource" */ String = js.native
  }
}
