package typings.fastDashJsonDashPatch.libCoreMod

import typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.remove
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
    val __obj = js.Dynamic.literal(op = op, path = path)
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

