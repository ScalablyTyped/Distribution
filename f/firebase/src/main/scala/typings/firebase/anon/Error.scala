package typings.firebase.anon

import typings.firebase.mod.firestore.DocumentSnapshot
import typings.firebase.mod.firestore.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
}

object Error {
  @scala.inline
  def apply[T](
    complete: () => Unit = null,
    error: /* error */ FirestoreError => Unit = null,
    next: /* snapshot */ DocumentSnapshot[T] => Unit = null
  ): Error[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Error[T]]
  }
}

