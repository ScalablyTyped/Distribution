package typings.fastJsonStableStringify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareDescriptor extends js.Object {
  var key: String
  var value: js.Any
}

object CompareDescriptor {
  @scala.inline
  def apply(key: String, value: js.Any): CompareDescriptor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareDescriptor]
  }
}

