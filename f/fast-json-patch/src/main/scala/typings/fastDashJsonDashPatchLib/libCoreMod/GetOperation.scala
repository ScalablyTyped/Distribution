package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperation[T] extends BaseOperation {
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings._get
  var value: T
}

object GetOperation {
  @scala.inline
  def apply[T](
    op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings._get,
    path: java.lang.String,
    value: T
  ): GetOperation[T] = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOperation[T]]
  }
}

