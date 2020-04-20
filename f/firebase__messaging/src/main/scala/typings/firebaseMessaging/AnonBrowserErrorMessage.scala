package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowserErrorMessage extends js.Object {
  var browserErrorMessage: String
}

object AnonBrowserErrorMessage {
  @scala.inline
  def apply(browserErrorMessage: String): AnonBrowserErrorMessage = {
    val __obj = js.Dynamic.literal(browserErrorMessage = browserErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowserErrorMessage]
  }
}

