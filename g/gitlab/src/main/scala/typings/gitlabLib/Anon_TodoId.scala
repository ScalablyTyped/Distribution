package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TodoId extends js.Object {
  var todoId: js.UndefOr[gitlabLib.distServicesMod.TodoId] = js.undefined
}

object Anon_TodoId {
  @scala.inline
  def apply(todoId: js.UndefOr[gitlabLib.distServicesMod.TodoId] = js.undefined): Anon_TodoId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(todoId)) __obj.updateDynamic("todoId")(todoId)
    __obj.asInstanceOf[Anon_TodoId]
  }
}

