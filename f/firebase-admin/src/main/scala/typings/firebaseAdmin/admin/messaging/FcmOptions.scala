package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents platform-independent options for features provided by the FCM SDKs.
  */
trait FcmOptions extends js.Object {
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.undefined
}

object FcmOptions {
  @scala.inline
  def apply(analyticsLabel: String = null): FcmOptions = {
    val __obj = js.Dynamic.literal()
    if (analyticsLabel != null) __obj.updateDynamic("analyticsLabel")(analyticsLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FcmOptions]
  }
}

