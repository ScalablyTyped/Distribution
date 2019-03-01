package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteError extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[
    js.Function1[
      /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_CompleteError {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit] = null,
    error: js.Function1[/* error */ nodeLib.Error, scala.Unit] = null,
    next: js.Function1[
      /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
      scala.Unit
    ] = null
  ): Anon_CompleteError = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_CompleteError]
  }
}

