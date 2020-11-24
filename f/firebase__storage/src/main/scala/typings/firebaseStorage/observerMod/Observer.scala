package typings.firebaseStorage.observerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/observer", "Observer")
@js.native
class Observer[T] () extends StorageObserver[T] {
  def this(nextOrObserver: NextFn[T]) = this()
  def this(nextOrObserver: StorageObserver[T]) = this()
  def this(nextOrObserver: js.UndefOr[scala.Nothing], error: ErrorFn) = this()
  def this(nextOrObserver: NextFn[T], error: ErrorFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: ErrorFn) = this()
  def this(nextOrObserver: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
  def this(nextOrObserver: js.UndefOr[scala.Nothing], error: ErrorFn, complete: CompleteFn) = this()
  def this(nextOrObserver: NextFn[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
  def this(nextOrObserver: NextFn[T], error: ErrorFn, complete: CompleteFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: ErrorFn, complete: CompleteFn) = this()
}
