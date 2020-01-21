package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTodoId extends js.Object {
  var todoId: js.UndefOr[Double] = js.undefined
}

object AnonTodoId {
  @scala.inline
  def apply(todoId: Int | Double = null): AnonTodoId = {
    val __obj = js.Dynamic.literal()
    if (todoId != null) __obj.updateDynamic("todoId")(todoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTodoId]
  }
}

