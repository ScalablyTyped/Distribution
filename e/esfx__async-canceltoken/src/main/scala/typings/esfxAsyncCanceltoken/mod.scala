package typings.esfxAsyncCanceltoken

import typings.esfxAsyncCanceltoken.distMod.CancelSource
import typings.esfxCancelable.distMod.Cancelable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/async-canceltoken", "CancelError")
  @js.native
  class CancelError ()
    extends typings.esfxAsyncCanceltoken.distMod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    @JSImport("@esfx/async-canceltoken", "CancelSubscription.create")
    @js.native
    def create(unsubscribe: js.Function0[Unit]): typings.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  @JSImport("@esfx/async-canceltoken", "CancelToken")
  @js.native
  class CancelToken protected ()
    extends typings.esfxAsyncCanceltoken.distMod.CancelToken
  /* static members */
  object CancelToken {
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.all")
    @js.native
    def all(cancelables: Iterable[Cancelable]): typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.canceled")
    @js.native
    val canceled: typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.from")
    @js.native
    def from(): typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    @JSImport("@esfx/async-canceltoken", "CancelToken.from")
    @js.native
    def from(cancelable: Cancelable): typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.none")
    @js.native
    val none: typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.race")
    @js.native
    def race(cancelables: Iterable[Cancelable]): typings.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Creates a new CancelSource.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.source")
    @js.native
    def source(): CancelSource = js.native
  }
}
