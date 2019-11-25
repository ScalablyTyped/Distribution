package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var code: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

object RequestError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: String = null,
    errors: js.Array[Error] = null,
    stack: String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestError]
  }
}

