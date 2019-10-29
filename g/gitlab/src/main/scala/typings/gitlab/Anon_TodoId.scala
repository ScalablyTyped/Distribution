package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TodoId extends js.Object {
  var todoId: js.UndefOr[Double] = js.undefined
}

object Anon_TodoId {
  @scala.inline
  def apply(todoId: Int | Double = null): Anon_TodoId = {
    val __obj = js.Dynamic.literal()
    if (todoId != null) __obj.updateDynamic("todoId")(todoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TodoId]
  }
}

