package typings.firebaseMessaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var errorInfo: String
}

object ErrorInfo {
  @scala.inline
  def apply(errorInfo: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

