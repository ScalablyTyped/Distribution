package typings.forms

import typings.forms.formsMod.Form
import typings.forms.formsMod.FormHandleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty extends js.Object {
  var empty: js.UndefOr[FormHandleCallback] = js.undefined
  var error: js.UndefOr[FormHandleCallback] = js.undefined
  var other: js.UndefOr[FormHandleCallback] = js.undefined
  var success: js.UndefOr[FormHandleCallback] = js.undefined
}

object Anon_Empty {
  @scala.inline
  def apply(
    empty: /* form */ Form => Unit = null,
    error: /* form */ Form => Unit = null,
    other: /* form */ Form => Unit = null,
    success: /* form */ Form => Unit = null
  ): Anon_Empty = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction1(empty))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (other != null) __obj.updateDynamic("other")(js.Any.fromFunction1(other))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_Empty]
  }
}

