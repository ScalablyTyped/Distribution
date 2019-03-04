package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation
  extends BaseOperation
     with _Operation {
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.remove
}

object RemoveOperation {
  @scala.inline
  def apply(op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.remove, path: java.lang.String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path)
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

