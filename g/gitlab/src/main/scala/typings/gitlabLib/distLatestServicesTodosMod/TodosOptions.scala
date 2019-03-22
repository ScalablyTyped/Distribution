package typings
package gitlabLib.distLatestServicesTodosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodosOptions extends js.Object {
  var todoId: TodoId
}

object TodosOptions {
  @scala.inline
  def apply(todoId: TodoId): TodosOptions = {
    val __obj = js.Dynamic.literal(todoId = todoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TodosOptions]
  }
}

