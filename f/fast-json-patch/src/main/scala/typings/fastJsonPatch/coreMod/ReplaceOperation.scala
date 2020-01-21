package typings.fastJsonPatch.coreMod

import typings.fastJsonPatch.fastJsonPatchStrings.replace
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
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceOperation[T]]
  }
}

