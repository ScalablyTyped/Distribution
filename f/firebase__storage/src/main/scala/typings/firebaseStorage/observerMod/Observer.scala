package typings.firebaseStorage.observerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/observer", "Observer")
@js.native
class Observer[T] () extends StorageObserver[T] {
  def this(nextOrObserver: NextFn[T]) = this()
  def this(nextOrObserver: StorageObserver[T]) = this()
  def this(nextOrObserver: Null, error: ErrorFn) = this()
  def this(nextOrObserver: NextFn[T], error: ErrorFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: ErrorFn) = this()
  def this(nextOrObserver: Null, error: Null, complete: CompleteFn) = this()
  def this(nextOrObserver: Null, error: ErrorFn, complete: CompleteFn) = this()
  def this(nextOrObserver: NextFn[T], error: Null, complete: CompleteFn) = this()
  def this(nextOrObserver: NextFn[T], error: ErrorFn, complete: CompleteFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: Null, complete: CompleteFn) = this()
  def this(nextOrObserver: StorageObserver[T], error: ErrorFn, complete: CompleteFn) = this()
}

