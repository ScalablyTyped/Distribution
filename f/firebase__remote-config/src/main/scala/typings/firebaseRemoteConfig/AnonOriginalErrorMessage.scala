package typings.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.undefined
}

object AnonOriginalErrorMessage {
  @scala.inline
  def apply(originalErrorMessage: String = null): AnonOriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (originalErrorMessage != null) __obj.updateDynamic("originalErrorMessage")(originalErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalErrorMessage]
  }
}

