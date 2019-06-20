package typings
package atEsfxDisposableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/disposable", JSImport.Namespace)
@js.native
object atEsfxDisposableMod extends js.Object {
  @JSName("AsyncDisposable")
  @js.native
  object AsyncDisposableNs extends js.Object {
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      */
    val asyncDispose: js.Symbol = js.native
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      */
    def create(dispose: js.Function0[scala.Unit | js.Thenable[scala.Unit]]): atEsfxDisposableLib.distMod.AsyncDisposable = js.native
    /**
      * Creates an `AsyncDisposable` wrapper around a set of other disposables.
      * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
      */
    def from(
      resources: stdLib.Iterable[
          js.UndefOr[
            atEsfxDisposableLib.distMod.AsyncDisposable | atEsfxDisposableLib.distMod.Disposable | scala.Null
          ]
        ]
    ): atEsfxDisposableLib.distMod.AsyncDisposable = js.native
    /**
      * Determines whether a value is [[AsyncDisposable]].
      */
    def isAsyncDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ scala.Boolean = js.native
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    /**
      * Executes a callback with the provided `AsyncDisposable` resource, disposing the resource when the callback completes asynchronously.
      */
    def use[U](
      resource: atEsfxDisposableLib.distMod.AsyncDisposable,
      callback: js.Function1[/* resource */ atEsfxDisposableLib.distMod.AsyncDisposable, U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    def use[U](
      resource: atEsfxDisposableLib.distMod.Disposable,
      callback: js.Function1[/* resource */ atEsfxDisposableLib.distMod.Disposable, U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    def use[U](resource: scala.Null, callback: js.Function1[/* resource */ scala.Null, U | js.Thenable[U]]): js.Promise[U] = js.native
  }
  
  @JSName("Disposable")
  @js.native
  object DisposableNs extends js.Object {
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      */
    val dispose: js.Symbol = js.native
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      */
    def create(dispose: js.Function0[scala.Unit]): atEsfxDisposableLib.distMod.Disposable = js.native
    /**
      * Creates a `Disposable` wrapper around a set of other disposables.
      * @param disposables An `Iterable` of `Disposable` objects.
      */
    def from(disposables: stdLib.Iterable[js.UndefOr[atEsfxDisposableLib.distMod.Disposable | scala.Null]]): atEsfxDisposableLib.distMod.Disposable = js.native
    /**
      * Determines whether a value is [[Disposable]].
      */
    def isDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ scala.Boolean = js.native
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U]
    ): U = js.native
    /**
      * Executes a callback with the provided `Disposable` resource, disposing the resource when the callback completes.
      */
    def use[U](
      resource: atEsfxDisposableLib.distMod.Disposable,
      callback: js.Function1[/* resource */ atEsfxDisposableLib.distMod.Disposable, U]
    ): U = js.native
    def use[U](resource: scala.Null, callback: js.Function1[/* resource */ scala.Null, U]): U = js.native
  }
  
}

