package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelStatus extends js.Object {
  /** If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity. */
  var isLinked: js.UndefOr[scala.Boolean] = js.undefined
  /** The long uploads status of this channel. See */
  var longUploadsStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Privacy status of the channel. */
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
}

