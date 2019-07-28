package typings.atEsfxDisposable.distMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/disposable/dist", "Disposable")
@js.native
object DisposableNs extends js.Object {
  /**
    * A well-known symbol used to define an explicit resource disposal method on an object.
    */
  val dispose: js.Symbol = js.native
  val name: typings.atEsfxDisposable.atEsfxDisposableStrings.Disposable = js.native
  /**
    * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
    */
  def create(dispose: js.Function0[Unit]): Disposable = js.native
  /**
    * Creates a `Disposable` wrapper around a set of other disposables.
    * @param disposables An `Iterable` of `Disposable` objects.
    */
  def from(disposables: Iterable[js.UndefOr[Disposable | Null]]): Disposable = js.native
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
  def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U]): U = js.native
}

