package typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithCode extends Error {
  var code: Double
}

object ErrorWithCode {
  @scala.inline
  def apply(code: Double, message: String, name: String, stack: String = null): ErrorWithCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithCode]
  }
}

