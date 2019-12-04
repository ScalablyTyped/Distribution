package typings.expo

import typings.std.Error
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorResponse extends js.Object {
  var error: Error
  var response: js.UndefOr[Response] = js.undefined
}

object Anon_ErrorResponse {
  @scala.inline
  def apply(error: Error, response: Response = null): Anon_ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorResponse]
  }
}

