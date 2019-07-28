package typings.atEsfxDisposable.distMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/disposable/dist", "AsyncDisposable")
@js.native
object AsyncDisposableNs extends js.Object {
  /**
    * A well-known symbol used to define an async explicit resource disposal method on an object.
    */
  val asyncDispose: js.Symbol = js.native
  val name: typings.atEsfxDisposable.atEsfxDisposableStrings.AsyncDisposable = js.native
  /**
    * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
    */
  def create(dispose: js.Function0[Unit | js.Thenable[Unit]]): AsyncDisposable = js.native
  /**
    * Creates an `AsyncDisposable` wrapper around a set of other disposables.
    * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
    */
  def from(resources: Iterable[js.UndefOr[AsyncDisposable | Disposable | Null]]): AsyncDisposable = js.native
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
    resource: AsyncDisposable,
    callback: js.Function1[/* resource */ AsyncDisposable, U | js.Thenable[U]]
  ): js.Promise[U] = js.native
  def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U | js.Thenable[U]]): js.Promise[U] = js.native
}

