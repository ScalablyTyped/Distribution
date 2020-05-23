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
    complete: js.UndefOr[Null | (() => Unit)] = js.undefined,
    error: js.UndefOr[Null | (/* error */ Error | FirebaseStorageError => Unit)] = js.undefined,
    next: js.UndefOr[Null | (T => Unit)] = js.undefined
  ): StorageObserver[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(if (complete != null) js.Any.fromFunction0(complete.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(if (error != null) js.Any.fromFunction1(error.asInstanceOf[/* error */ Error | FirebaseStorageError => Unit]) else null)
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(if (next != null) js.Any.fromFunction1(next.asInstanceOf[T => Unit]) else null)
    __obj.asInstanceOf[StorageObserver[T]]
  }
}

