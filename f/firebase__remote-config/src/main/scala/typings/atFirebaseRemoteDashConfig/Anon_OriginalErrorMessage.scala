package typings.atFirebaseRemoteDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.undefined
}

object Anon_OriginalErrorMessage {
  @scala.inline
  def apply(originalErrorMessage: String = null): Anon_OriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (originalErrorMessage != null) __obj.updateDynamic("originalErrorMessage")(originalErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OriginalErrorMessage]
  }
}

