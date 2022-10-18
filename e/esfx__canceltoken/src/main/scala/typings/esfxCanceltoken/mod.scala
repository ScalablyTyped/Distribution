package typings.esfxCanceltoken

import typings.esfxCancelable.mod.CancelSignal
import typings.esfxCancelable.mod.CancelSubscription
import typings.esfxCancelable.mod.Cancelable
import typings.esfxCancelable.mod.CancelableSource
import typings.esfxCancelable.mod.ErrorOptions
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/canceltoken", "CancelError")
  @js.native
  open class CancelError ()
    extends typings.esfxCancelable.mod.CancelError {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
  }
  
  object CancelSubscription {
    
    @JSImport("@esfx/canceltoken", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.mod.CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCancelable.mod.CancelSubscription]
  }
  
  @JSImport("@esfx/canceltoken", "CancelToken")
  @js.native
  /* private */ open class CancelToken ()
    extends StObject
       with Cancelable
       with CancelSignal {
    
    /**
      * Gets a value indicating whether the token can be signaled.
      */
    def canBeSignaled: Boolean = js.native
    
    /**
      * Gets the reason cancellation was signaled.
      */
    /* CompleteClass */
    override val reason: Any = js.native
    /**
      * Gets the reason for cancellation.
      */
    @JSName("reason")
    def reason_MCancelToken: Any = js.native
    
    /**
      * Gets a value indicating whether cancellation was signaled.
      */
    /* CompleteClass */
    override val signaled: Boolean = js.native
    /**
      * Gets a value indicating whether the token is signaled.
      */
    @JSName("signaled")
    def signaled_MCancelToken: Boolean = js.native
    
    /**
      * Subscribes to notifications for when the object becomes signaled.
      */
    /* CompleteClass */
    override def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    
    /**
      * Throws a {@link @esfx/cancelable!CancelError} if the token was signaled.
      */
    def throwIfSignaled(): Unit = js.native
  }
  /* static members */
  object CancelToken {
    
    @JSImport("@esfx/canceltoken", "CancelToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a {@link CancelToken} that becomes signaled when all of the provided cancelables are signaled.
      *
      * @param cancelables An iterable of {@link @esfx/cancelable!Cancelable} objects.
      */
    inline def all(cancelables: js.Iterable[js.UndefOr[Cancelable | DOMAbortSignal | Null]]): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(cancelables.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    @JSImport("@esfx/canceltoken", "CancelToken.canceled")
    @js.native
    val canceled: CancelToken = js.native
    
    /**
      * Gets a {@link CancelToken} that is already canceled with the provided reason.
      */
    inline def canceledWith(reason: Any): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("canceledWith")(reason.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    /**
      * Adapts a {@link CancelToken} from a cancelable.
      */
    inline def from(): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[CancelToken]
    inline def from(cancelable: Cancelable): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    inline def from(cancelable: DOMAbortSignal): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
    @JSImport("@esfx/canceltoken", "CancelToken.none")
    @js.native
    val none: CancelToken = js.native
    
    /**
      * Returns a {@link CancelToken} that becomes signaled when any of the provided cancelables are signaled.
      *
      * @param cancelables An iterable of {@link @esfx/cancelable!Cancelable} objects.
      *
      * @remarks This is similar to calling {@link source} with the provided `cancelables`. In general,
      * calling {@link source} is preferred as it provides better resource management.
      */
    inline def race(cancelables: js.Iterable[js.UndefOr[Cancelable | DOMAbortSignal | Null]]): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(cancelables.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    
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
    inline def timeout(ms: Double): CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[CancelToken]
    inline def timeout(ms: Double, reason: Any): CancelToken = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[CancelToken]
  }
  
  @js.native
  trait CancelSource
    extends Disposable
       with CancelableSource {
    
    /**
      * Cancels the source, evaluating any subscribed callbacks. If any callback raises an exception,
      * the exception is propagated to a host specific unhandled exception mechanism.
      */
    def cancel(): Unit = js.native
    def cancel(reason: Any): Unit = js.native
    
    /**
      * Closes the source, preventing the possibility of future cancellation.
      */
    def close(): Unit = js.native
    
    /**
      * Gets the {@link CancelToken} linked to this source.
      */
    val token: CancelToken = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * globalThis * / any extends {  AbortSignal :/ * Inlined std.Function & {  prototype :infer TAbortSignal} * /
  {apply (this : std.Function, thisArg : any): any, apply (this : std.Function, thisArg : any, argArray : any): any, call (this : std.Function, thisArg : any, argArray : ...any): any, bind (this : std.Function, thisArg : any, argArray : ...any): any, toString (): string,  readonly length :number,   arguments :any,   caller :std.Function,  readonly name :string, [Symbol.hasInstance] : (value : any): boolean}} ? TAbortSignal : never
    }}}
    */
  @js.native
  trait DOMAbortSignal extends StObject
}
