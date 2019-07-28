package typings.fastDashJsonDashPatch.libCoreMod

import typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOperation[T] extends BaseOperation {
  var op: replace
  var value: T
}

object ReplaceOperation {
  @scala.inline
  def apply[T](op: replace, path: String, value: T): ReplaceOperation[T] = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceOperation[T]]
  }
}

