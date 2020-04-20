package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorInfo extends js.Object {
  var errorInfo: String
}

object AnonErrorInfo {
  @scala.inline
  def apply(errorInfo: String): AnonErrorInfo = {
    val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorInfo]
  }
}

