package typings.firebaseDashAdmin.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents options for features provided by the FCM SDK for iOS.
  */
trait ApnsFcmOptions extends js.Object {
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.undefined
}

object ApnsFcmOptions {
  @scala.inline
  def apply(analyticsLabel: String = null): ApnsFcmOptions = {
    val __obj = js.Dynamic.literal()
    if (analyticsLabel != null) __obj.updateDynamic("analyticsLabel")(analyticsLabel)
    __obj.asInstanceOf[ApnsFcmOptions]
  }
}

