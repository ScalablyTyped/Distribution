package typings.esfxAsyncCanceltoken

import typings.esfxAsyncCanceltoken.distMod.CancelSource
import typings.esfxCancelable.distMod.Cancelable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/async-canceltoken", "CancelError")
  @js.native
  class CancelError ()
    extends typings.esfxAsyncCanceltoken.distMod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    @JSImport("@esfx/async-canceltoken", "CancelSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    inline def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(unsubscribe.asInstanceOf[js.Any]).asInstanceOf[typings.esfxCancelable.distMod.CancelSubscription]
  }
  
  @JSImport("@esfx/async-canceltoken", "CancelToken")
  @js.native
  /* private */ class CancelToken ()
    extends typings.esfxAsyncCanceltoken.distMod.CancelToken
  /* static members */
  object CancelToken {
    
    @JSImport("@esfx/async-canceltoken", "CancelToken")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    inline def all(cancelables: Iterable[Cancelable]): typings.esfxAsyncCanceltoken.distMod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(cancelables.asInstanceOf[js.Any]).asInstanceOf[typings.esfxAsyncCanceltoken.distMod.CancelToken]
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.canceled")
    @js.native
    val canceled: typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    inline def from(): typings.esfxAsyncCanceltoken.distMod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.esfxAsyncCanceltoken.distMod.CancelToken]
    inline def from(cancelable: Cancelable): typings.esfxAsyncCanceltoken.distMod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(cancelable.asInstanceOf[js.Any]).asInstanceOf[typings.esfxAsyncCanceltoken.distMod.CancelToken]
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.none")
    @js.native
    val none: typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    inline def race(cancelables: Iterable[Cancelable]): typings.esfxAsyncCanceltoken.distMod.CancelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(cancelables.asInstanceOf[js.Any]).asInstanceOf[typings.esfxAsyncCanceltoken.distMod.CancelToken]
    
    /**
      * Creates a new CancelSource.
      */
    inline def source(): CancelSource = ^.asInstanceOf[js.Dynamic].applyDynamic("source")().asInstanceOf[CancelSource]
  }
}
