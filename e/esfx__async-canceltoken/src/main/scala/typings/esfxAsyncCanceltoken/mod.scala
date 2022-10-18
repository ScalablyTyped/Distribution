package typings.esfxAsyncCanceltoken

import typings.esfxCancelable.mod.Cancelable
import typings.esfxCancelable.mod.ErrorOptions
import typings.esfxCanceltoken.mod.CancelSource
import typings.esfxCanceltoken.mod.DOMAbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/async-canceltoken", "CancelError")
  @js.native
  open class CancelError ()
    extends typings.esfxCanceltoken.mod.CancelError {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
  }
  
  object CancelSubscription {
    
    @JSImport("@esfx/async-canceltoken", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.mod.CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCancelable.mod.CancelSubscription]
  }
  
  @JSImport("@esfx/async-canceltoken", "CancelToken")
  @js.native
  /* private */ open class CancelToken ()
    extends typings.esfxCanceltoken.mod.CancelToken
  /* static members */
  object CancelToken {
    
    @JSImport("@esfx/async-canceltoken", "CancelToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a {@link CancelToken} that becomes signaled when all of the provided cancelables are signaled.
      *
      * @param cancelables An iterable of {@link @esfx/cancelable!Cancelable} objects.
      */
    inline def all(cancelables: js.Iterable[js.UndefOr[Cancelable | DOMAbortSignal | Null]]): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(cancelables.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.canceled")
    @js.native
    val canceled: typings.esfxCanceltoken.mod.CancelToken = js.native
    
    /**
      * Gets a {@link CancelToken} that is already canceled with the provided reason.
      */
    inline def canceledWith(reason: Any): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("canceledWith")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    
    /**
      * Adapts a {@link CancelToken} from a cancelable.
      */
    inline def from(): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    inline def from(cancelable: Cancelable): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    inline def from(cancelable: DOMAbortSignal): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.none")
    @js.native
    val none: typings.esfxCanceltoken.mod.CancelToken = js.native
    
    /**
      * Returns a {@link CancelToken} that becomes signaled when any of the provided cancelables are signaled.
      *
      * @param cancelables An iterable of {@link @esfx/cancelable!Cancelable} objects.
      *
      * @remarks This is similar to calling {@link source} with the provided `cancelables`. In general,
      * calling {@link source} is preferred as it provides better resource management.
      */
    inline def race(cancelables: js.Iterable[js.UndefOr[Cancelable | DOMAbortSignal | Null]]): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(cancelables.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    
    /**
      * Creates a new {@link CancelSource}.
      *
      * @param cancelables An optional iterable of {@link @esfx/cancelable!Cancelable} objects. If present,
      * the source becomes linked to the provided cancelables and will be canceled
      * when a linked cancelable is canceled.
      *
      * @remarks Calling {@link source} with `cancelables` is similar to {@link race}, except you can
      * individually cancel or close the resulting source. This can be better for memory or GC purposes,
      * since when the resulting source is canceled or closed it can be unlinked from the cancelables,
      * removing references from each cancelable to the resulting source which could otherwise prevent
      * garbage collection.
      */
    inline def source(): CancelSource = ^.asInstanceOf[js.Dynamic].applyDynamic("source")().asInstanceOf[CancelSource]
    inline def source(cancelables: js.Iterable[js.UndefOr[Cancelable | DOMAbortSignal | Null]]): CancelSource = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(cancelables.asInstanceOf[js.Any]).asInstanceOf[CancelSource]
    
    /**
      * Gets a {@link CancelToken} that will be canceled with the provided reason after a timeout has elapsed.
      */
    inline def timeout(ms: Double): typings.esfxCanceltoken.mod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
    inline def timeout(ms: Double, reason: Any): typings.esfxCanceltoken.mod.CancelToken = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[typings.esfxCanceltoken.mod.CancelToken]
  }
}
