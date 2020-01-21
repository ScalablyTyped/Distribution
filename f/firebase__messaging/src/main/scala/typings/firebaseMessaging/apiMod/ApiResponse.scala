package typings.firebaseMessaging.apiMod

import typings.firebaseMessaging.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResponse extends js.Object {
  var error: js.UndefOr[AnonMessage] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object ApiResponse {
  @scala.inline
  def apply(error: AnonMessage = null, token: String = null): ApiResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResponse]
  }
}

