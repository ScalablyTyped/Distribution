package typings.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.undefined
}

object OriginalErrorMessage {
  @scala.inline
  def apply(originalErrorMessage: String = null): OriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (originalErrorMessage != null) __obj.updateDynamic("originalErrorMessage")(originalErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalErrorMessage]
  }
}

