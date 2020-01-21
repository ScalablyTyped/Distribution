package typings.forms

import typings.forms.mod.Form
import typings.forms.mod.FormHandleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmpty extends js.Object {
  var empty: js.UndefOr[FormHandleCallback] = js.undefined
  var error: js.UndefOr[FormHandleCallback] = js.undefined
  var other: js.UndefOr[FormHandleCallback] = js.undefined
  var success: js.UndefOr[FormHandleCallback] = js.undefined
}

object AnonEmpty {
  @scala.inline
  def apply(
    empty: /* form */ Form => Unit = null,
    error: /* form */ Form => Unit = null,
    other: /* form */ Form => Unit = null,
    success: /* form */ Form => Unit = null
  ): AnonEmpty = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction1(empty))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (other != null) __obj.updateDynamic("other")(js.Any.fromFunction1(other))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonEmpty]
  }
}

