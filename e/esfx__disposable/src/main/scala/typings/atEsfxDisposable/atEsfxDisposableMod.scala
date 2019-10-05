package typings.atEsfxDisposable

import typings.atEsfxDisposable.distMod.Disposable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/disposable", JSImport.Namespace)
@js.native
object atEsfxDisposableMod extends js.Object {
  @js.native
  object AsyncDisposable extends js.Object {
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      */
    val asyncDispose: js.Symbol = js.native
    val name: typings.atEsfxDisposable.atEsfxDisposableStrings.AsyncDisposable = js.native
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      */
    def create(dispose: js.Function0[Unit | js.Thenable[Unit]]): typings.atEsfxDisposable.distMod.AsyncDisposable = js.native
    /**
      * Creates an `AsyncDisposable` wrapper around a set of other disposables.
      * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
      */
    def from(
      resources: Iterable[js.UndefOr[typings.atEsfxDisposable.distMod.AsyncDisposable | Disposable | Null]]
    ): typings.atEsfxDisposable.distMod.AsyncDisposable = js.native
    /**
      * Determines whether a value is [[AsyncDisposable]].
      */
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    /**
      * Determines whether a value is [[AsyncDisposable]].
      * @deprecated Use `AsyncDisposable.hasInstance` instead.
      */
    def isAsyncDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    def use[U](resource: Null, callback: js.Function1[/* resource */ Null, U | js.Thenable[U]]): js.Promise[U] = js.native
    /**
      * Executes a callback with the provided `AsyncDisposable` resource, disposing the resource when the callback completes asynchronously.
      */
    def use[U](
      resource: typings.atEsfxDisposable.distMod.AsyncDisposable,
      callback: js.Function1[
          /* resource */ typings.atEsfxDisposable.distMod.AsyncDisposable, 
          U | js.Thenable[U]
        ]
    ): js.Promise[U] = js.native
    def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U | js.Thenable[U]]): js.Promise[U] = js.native
  }
  
  @js.native
  object Disposable extends js.Object {
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      */
    val dispose: js.Symbol = js.native
    val name: typings.atEsfxDisposable.atEsfxDisposableStrings.Disposable = js.native
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      */
    def create(dispose: js.Function0[Unit]): typings.atEsfxDisposable.distMod.Disposable = js.native
    /**
      * Creates a `Disposable` wrapper around a set of other disposables.
      * @param disposables An `Iterable` of `Disposable` objects.
      */
    def from(disposables: Iterable[js.UndefOr[typings.atEsfxDisposable.distMod.Disposable | Null]]): typings.atEsfxDisposable.distMod.Disposable = js.native
    /**
      * Determines whether a value is Disposable.
      */
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    /**
      * Determines whether a value is Disposable.
      * @deprecated Use `Disposable.hasInstance` instead.
      */
    def isDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U]
    ): U = js.native
    def use[U](resource: Null, callback: js.Function1[/* resource */ Null, U]): U = js.native
    /**
      * Executes a callback with the provided `Disposable` resource, disposing the resource when the callback completes.
      */
    def use[U](
      resource: typings.atEsfxDisposable.distMod.Disposable,
      callback: js.Function1[/* resource */ typings.atEsfxDisposable.distMod.Disposable, U]
    ): U = js.native
  }
  
}

