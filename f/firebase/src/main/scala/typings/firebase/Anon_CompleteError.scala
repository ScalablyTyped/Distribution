package typings.firebase

import typings.firebase.firebaseMod.firestore.DocumentSnapshot
import typings.firebase.firebaseMod.firestore.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteError extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot, Unit]] = js.undefined
}

object Anon_CompleteError {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    error: /* error */ FirestoreError => Unit = null,
    next: /* snapshot */ DocumentSnapshot => Unit = null
  ): Anon_CompleteError = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Anon_CompleteError]
  }
}

