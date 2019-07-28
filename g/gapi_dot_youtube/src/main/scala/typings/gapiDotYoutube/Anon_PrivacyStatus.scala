package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivacyStatus extends js.Object {
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String
}

object Anon_PrivacyStatus {
  @scala.inline
  def apply(privacyStatus: String): Anon_PrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus)
  
    __obj.asInstanceOf[Anon_PrivacyStatus]
  }
}

