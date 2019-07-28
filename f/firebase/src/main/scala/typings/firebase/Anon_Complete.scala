package typings.firebase

import typings.firebase.firebaseMod.firestoreNs.DocumentSnapshot
import typings.firebase.firebaseMod.firestoreNs.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot, Unit]] = js.undefined
}

object Anon_Complete {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    error: /* error */ FirestoreError => Unit = null,
    next: /* snapshot */ DocumentSnapshot => Unit = null
  ): Anon_Complete = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Anon_Complete]
  }
}

