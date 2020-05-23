package typings.firebaseMessaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserErrorMessage extends js.Object {
  var browserErrorMessage: String
}

object BrowserErrorMessage {
  @scala.inline
  def apply(browserErrorMessage: String): BrowserErrorMessage = {
    val __obj = js.Dynamic.literal(browserErrorMessage = browserErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserErrorMessage]
  }
}

