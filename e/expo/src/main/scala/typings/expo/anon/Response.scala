package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var error: typings.std.Error
  var response: js.UndefOr[typings.std.Response] = js.undefined
}

object Response {
  @scala.inline
  def apply(error: typings.std.Error, response: typings.std.Response = null): Response = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

