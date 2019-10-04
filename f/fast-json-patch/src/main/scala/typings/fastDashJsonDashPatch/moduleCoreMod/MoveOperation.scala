package typings.fastDashJsonDashPatch.moduleCoreMod

import typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOperation
  extends BaseOperation
     with _Operation {
  var from: String
  var op: move
}

object MoveOperation {
  @scala.inline
  def apply(from: String, op: move, path: String): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[MoveOperation]
  }
}

