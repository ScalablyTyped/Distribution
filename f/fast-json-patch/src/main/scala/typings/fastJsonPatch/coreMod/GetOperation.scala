package typings.fastJsonPatch.coreMod

import typings.fastJsonPatch.fastJsonPatchStrings._get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperation[T] extends BaseOperation {
  var op: _get
  var value: T
}

object GetOperation {
  @scala.inline
  def apply[T](op: _get, path: String, value: T): GetOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperation[T]]
  }
}

