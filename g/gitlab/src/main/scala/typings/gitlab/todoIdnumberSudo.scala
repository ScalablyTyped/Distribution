package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  todoId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait todoIdnumberSudo extends js.Object {
  var sudo: js.UndefOr[String | Double] = js.undefined
  var todoId: js.UndefOr[Double] = js.undefined
}

object todoIdnumberSudo {
  @scala.inline
  def apply(sudo: String | Double = null, todoId: Int | Double = null): todoIdnumberSudo = {
    val __obj = js.Dynamic.literal()
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (todoId != null) __obj.updateDynamic("todoId")(todoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[todoIdnumberSudo]
  }
}

