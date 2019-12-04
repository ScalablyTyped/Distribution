package typings.atFirebaseFirestore.distSrcApiObserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialObserver[T] extends js.Object {
  var complete: js.UndefOr[CompleteFn] = js.undefined
  var error: js.UndefOr[ErrorFn] = js.undefined
  var next: js.UndefOr[NextFn[T]] = js.undefined
}

object PartialObserver {
  @scala.inline
  def apply[T](complete: () => Unit = null, error: /* error */ Error => Unit = null, next: T => Unit = null): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[PartialObserver[T]]
  }
}

