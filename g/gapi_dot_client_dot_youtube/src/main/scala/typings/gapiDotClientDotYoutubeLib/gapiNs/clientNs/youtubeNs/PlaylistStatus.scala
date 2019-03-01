package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistStatus extends js.Object {
  /** The playlist's privacy status. */
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistStatus {
  @scala.inline
  def apply(privacyStatus: java.lang.String = null): PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.asInstanceOf[PlaylistStatus]
  }
}

