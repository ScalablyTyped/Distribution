package typings.firebase.anon

import typings.firebase.mod.firestore.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteError[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ typings.std.Error, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
}

object CompleteError {
  @scala.inline
  def apply[T](
    complete: () => Unit = null,
    error: /* error */ typings.std.Error => Unit = null,
    next: /* snapshot */ QuerySnapshot[T] => Unit = null
  ): CompleteError[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[CompleteError[T]]
  }
}

