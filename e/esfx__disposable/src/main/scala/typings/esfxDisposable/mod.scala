package typings.esfxDisposable

import typings.esfxDisposable.distMod.Disposable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AsyncDisposable {
    
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.asyncDispose")
    @js.native
    val asyncDispose: js.Symbol = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.create")
    @js.native
    def create(dispose: js.Function0[Unit | js.Thenable[Unit]]): typings.esfxDisposable.distMod.AsyncDisposable = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a set of other disposables.
      * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.from")
    @js.native
    def from(
      resources: Iterable[js.UndefOr[typings.esfxDisposable.distMod.AsyncDisposable | Disposable | Null]]
    ): typings.esfxDisposable.distMod.AsyncDisposable = js.native
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      * @deprecated Use `AsyncDisposable.hasInstance` instead.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.isAsyncDisposable")
    @js.native
    def isAsyncDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    
    @JSImport("@esfx/disposable", "AsyncDisposable.name")
    @js.native
    val name: /* "AsyncDisposable" */ String = js.native
    
    @JSImport("@esfx/disposable", "AsyncDisposable.use")
    @js.native
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    @JSImport("@esfx/disposable", "AsyncDisposable.use")
    @js.native
    def use[U](resource: Null, callback: js.Function1[/* resource */ Null, U | js.Thenable[U]]): js.Promise[U] = js.native
    /**
      * Executes a callback with the provided `AsyncDisposable` resource, disposing the resource when the callback completes asynchronously.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.use")
    @js.native
    def use[U](
      resource: typings.esfxDisposable.distMod.AsyncDisposable,
      callback: js.Function1[/* resource */ typings.esfxDisposable.distMod.AsyncDisposable, U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    @JSImport("@esfx/disposable", "AsyncDisposable.use")
    @js.native
    def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U | js.Thenable[U]]): js.Promise[U] = js.native
  }
  
  object Disposable {
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      */
    @JSImport("@esfx/disposable", "Disposable.create")
    @js.native
    def create(dispose: js.Function0[Unit]): typings.esfxDisposable.distMod.Disposable = js.native
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      */
    @JSImport("@esfx/disposable", "Disposable.dispose")
    @js.native
    val dispose: js.Symbol = js.native
    
    /**
      * Creates a `Disposable` wrapper around a set of other disposables.
      * @param disposables An `Iterable` of `Disposable` objects.
      */
    @JSImport("@esfx/disposable", "Disposable.from")
    @js.native
    def from(disposables: Iterable[js.UndefOr[typings.esfxDisposable.distMod.Disposable | Null]]): typings.esfxDisposable.distMod.Disposable = js.native
    
    /**
      * Determines whether a value is Disposable.
      */
    @JSImport("@esfx/disposable", "Disposable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    
    /**
      * Determines whether a value is Disposable.
      * @deprecated Use `Disposable.hasInstance` instead.
      */
    @JSImport("@esfx/disposable", "Disposable.isDisposable")
    @js.native
    def isDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    
    @JSImport("@esfx/disposable", "Disposable.name")
    @js.native
    val name: /* "Disposable" */ String = js.native
    
    /**
      * Executes a callback with the provided `Disposable` resource, disposing the resource when the callback completes.
      */
    @JSImport("@esfx/disposable", "Disposable.use")
    @js.native
    def use[T /* <: js.UndefOr[typings.esfxDisposable.distMod.Disposable | Null] */, U](resource: T, callback: js.Function1[/* resource */ T, U]): U = js.native
  }
}
