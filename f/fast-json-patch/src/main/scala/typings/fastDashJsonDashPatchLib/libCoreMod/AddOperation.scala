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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOperation[T]]
  }
}

