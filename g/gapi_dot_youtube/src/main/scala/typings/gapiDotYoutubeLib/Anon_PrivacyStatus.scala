package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivacyStatus extends js.Object {
  /**
    * The playlists privacy status.
    */
  var privacyStatus: java.lang.String
}

object Anon_PrivacyStatus {
  @scala.inline
  def apply(privacyStatus: java.lang.String): Anon_PrivacyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.asInstanceOf[Anon_PrivacyStatus]
  }
}

