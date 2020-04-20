package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivacyStatus extends js.Object {
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String
}

object AnonPrivacyStatus {
  @scala.inline
  def apply(privacyStatus: String): AnonPrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivacyStatus]
  }
}

