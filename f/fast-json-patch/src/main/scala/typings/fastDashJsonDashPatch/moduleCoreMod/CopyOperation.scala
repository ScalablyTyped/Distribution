package typings.fastDashJsonDashPatch.moduleCoreMod

import typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOperation
  extends BaseOperation
     with _Operation {
  var from: String
  var op: copy
}

object CopyOperation {
  @scala.inline
  def apply(from: String, op: copy, path: String): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[CopyOperation]
  }
}

