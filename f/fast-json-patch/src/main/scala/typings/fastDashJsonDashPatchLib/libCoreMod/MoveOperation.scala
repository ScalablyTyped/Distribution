package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOperation
  extends BaseOperation
     with _Operation {
  var from: java.lang.String
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.move
}

object MoveOperation {
  @scala.inline
  def apply(
    from: java.lang.String,
    op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.move,
    path: java.lang.String
  ): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[MoveOperation]
  }
}

