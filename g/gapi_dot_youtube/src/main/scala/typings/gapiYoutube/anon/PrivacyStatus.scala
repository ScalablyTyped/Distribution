package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivacyStatus extends js.Object {
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String
}

object PrivacyStatus {
  @scala.inline
  def apply(privacyStatus: String): PrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyStatus]
  }
}

