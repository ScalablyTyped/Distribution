package typings.esfxAsyncCanceltoken

import typings.esfxCancelable.distMod.CancelSignal
import typings.esfxCancelable.distMod.CancelSubscription
import typings.esfxCancelable.distMod.Cancelable
import typings.esfxCancelable.distMod.CancelableSource
import typings.esfxDisposable.distMod.Disposable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@esfx/async-canceltoken/dist", "CancelError")
  @js.native
  class CancelError ()
    extends typings.esfxCancelable.mod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    @JSImport("@esfx/async-canceltoken/dist", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCancelable.distMod.CancelSubscription]
  }
  
  @JSImport("@esfx/async-canceltoken/dist", "CancelToken")
  @js.native
  /* private */ class CancelToken ()
    extends StObject
       with Cancelable
       with CancelSignal {
    
    /* private */ var _state: js.Any = js.native
    
    /**
      * Gets a value indicating whether the token can be signaled.
      */
    val canBeSignaled: Boolean = js.native
    
    /**
      * Gets a value indicating whether cancellation was signaled.
      */
    /* CompleteClass */
    override val signaled: Boolean = js.native
    
    /**
      * Subscribes to notifications for when the object becomes signaled.
      */
    /* CompleteClass */
    override def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    
    /**
      * Throws a CancelError if the token was signaled.
      */
    def throwIfSignaled(): Unit = js.native
  }
  /* static members */
  object CancelToken {
    
    @JSImport("@esfx/async-canceltoken/dist", "CancelToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    inline def all(cancelables: Iterable[Cancelable]): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(cancelables.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    @JSImport("@esfx/async-canceltoken/dist", "CancelToken.canceled")
    @js.native
    val canceled: CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    inline def from(): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[CancelToken]
    inline def from(cancelable: Cancelable): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    @JSImport("@esfx/async-canceltoken/dist", "CancelToken.none")
    @js.native
    val none: CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    inline def race(cancelables: Iterable[Cancelable]): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(cancelables.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    /**
      * Creates a new CancelSource.
      */
    inline def source(): CancelSource = ^.asInstanceOf[js.Dynamic].applyDynamic("source")().asInstanceOf[CancelSource]
  }
  
  @js.native
  trait CancelSource
    extends StObject
       with CancelableSource
       with Disposable {
    
    /**
      * Cancels the source, evaluating any subscribed callbacks. If any callback raises an exception,
      * the exception is propagated to a host specific unhanedle exception mechanism.
      */
    def cancel(): Unit = js.native
    
    /**
      * Closes the source, preventing the possibility of future cancellation.
      */
    def close(): Unit = js.native
    
    /**
      * Gets the CancelToken linked to this source.
      */
    val token: CancelToken = js.native
  }
}
