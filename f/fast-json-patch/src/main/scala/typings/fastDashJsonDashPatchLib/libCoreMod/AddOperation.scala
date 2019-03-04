package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOperation[T] extends BaseOperation {
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.add
  var value: T
}

object AddOperation {
  @scala.inline
  def apply[T](op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.add, path: java.lang.String, value: T): AddOperation[T] = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddOperation[T]]
  }
}

