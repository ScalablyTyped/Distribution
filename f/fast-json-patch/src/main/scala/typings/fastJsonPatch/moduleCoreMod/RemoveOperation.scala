package typings.fastJsonPatch.moduleCoreMod

import typings.fastJsonPatch.fastJsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation
  extends BaseOperation
     with _Operation {
  var op: remove
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOperation]
  }
}

