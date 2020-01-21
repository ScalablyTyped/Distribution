package typings.firebaseFirestoreTypes

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
}

object AnonComplete {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    error: /* error */ Error => Unit = null,
    next: /* value */ Unit => Unit = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[AnonComplete]
  }
}

