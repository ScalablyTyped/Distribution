package typings.firebaseStorage.observerMod

import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageObserver[T] extends js.Object {
  var complete: js.UndefOr[CompleteFn | Null] = js.undefined
  var error: js.UndefOr[ErrorFn | Null] = js.undefined
  var next: js.UndefOr[NextFn[T] | Null] = js.undefined
}

object StorageObserver {
  @scala.inline
  def apply[T](
    complete: () => Unit = null,
    error: /* error */ Error | FirebaseStorageError => Unit = null,
    next: T => Unit = null
  ): StorageObserver[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[StorageObserver[T]]
  }
}

