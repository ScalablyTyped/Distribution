package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBanSnippet extends js.Object {
  /** The duration of a ban, only filled if the ban has type TEMPORARY. */
  var banDurationSeconds: js.UndefOr[java.lang.String] = js.undefined
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  /** The chat this ban is pertinent to. */
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of ban. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

