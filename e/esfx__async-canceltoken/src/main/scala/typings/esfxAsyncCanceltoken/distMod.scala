package typings.esfxAsyncCanceltoken

import typings.esfxCancelable.distMod.CancelSignal
import typings.esfxCancelable.distMod.Cancelable
import typings.esfxCancelable.distMod.CancelableSource
import typings.esfxDisposable.distMod.Disposable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/async-canceltoken/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  
  @js.native
  class CancelError ()
    extends typings.esfxCancelable.mod.CancelError {
    def this(message: String) = this()
  }
  
  @js.native
  trait CancelSource
    extends CancelableSource
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
  
  @js.native
  object CancelSubscription extends js.Object {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  @js.native
  class CancelToken protected ()
    extends Cancelable
       with CancelSignal {
    
    var _state: js.Any = js.native
    
    /**
      * Gets a value indicating whether the token can be signaled.
      */
    val canBeSignaled: Boolean = js.native
    
    /**
      * Throws a CancelError if the token was signaled.
      */
    def throwIfSignaled(): Unit = js.native
  }
  /* static members */
  @js.native
  object CancelToken extends js.Object {
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    def all(cancelables: Iterable[Cancelable]): CancelToken = js.native
    
    val canceled: CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    def from(): CancelToken = js.native
    def from(cancelable: Cancelable): CancelToken = js.native
    
    val none: CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    def race(cancelables: Iterable[Cancelable]): CancelToken = js.native
    
    /**
      * Creates a new CancelSource.
      */
    def source(): CancelSource = js.native
  }
}
