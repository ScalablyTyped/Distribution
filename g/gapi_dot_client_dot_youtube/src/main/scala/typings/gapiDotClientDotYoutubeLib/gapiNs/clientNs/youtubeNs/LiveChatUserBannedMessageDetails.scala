package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatUserBannedMessageDetails extends js.Object {
  /** The duration of the ban. This property is only present if the banType is temporary. */
  var banDurationSeconds: js.UndefOr[java.lang.String] = js.undefined
  /** The type of ban. */
  var banType: js.UndefOr[java.lang.String] = js.undefined
  /** The details of the user that was banned. */
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

