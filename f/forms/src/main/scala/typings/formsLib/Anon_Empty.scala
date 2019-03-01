package typings
package formsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty extends js.Object {
  var empty: js.UndefOr[formsLib.formsMod.FormHandleCallback] = js.undefined
  var error: js.UndefOr[formsLib.formsMod.FormHandleCallback] = js.undefined
  var other: js.UndefOr[formsLib.formsMod.FormHandleCallback] = js.undefined
  var success: js.UndefOr[formsLib.formsMod.FormHandleCallback] = js.undefined
}

object Anon_Empty {
  @scala.inline
  def apply(
    empty: formsLib.formsMod.FormHandleCallback = null,
    error: formsLib.formsMod.FormHandleCallback = null,
    other: formsLib.formsMod.FormHandleCallback = null,
    success: formsLib.formsMod.FormHandleCallback = null
  ): Anon_Empty = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (error != null) __obj.updateDynamic("error")(error)
    if (other != null) __obj.updateDynamic("other")(other)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Empty]
  }
}

