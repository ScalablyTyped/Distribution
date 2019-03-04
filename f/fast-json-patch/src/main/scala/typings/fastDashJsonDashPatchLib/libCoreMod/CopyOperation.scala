package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOperation
  extends BaseOperation
     with _Operation {
  var from: java.lang.String
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.copy
}

object CopyOperation {
  @scala.inline
  def apply(
    from: java.lang.String,
    op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.copy,
    path: java.lang.String
  ): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[CopyOperation]
  }
}

