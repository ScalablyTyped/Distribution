package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistContentDetails extends js.Object {
  /** The number of videos in the playlist. */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
}

object PlaylistContentDetails {
  @scala.inline
  def apply(itemCount: scala.Int | scala.Double = null): PlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistContentDetails]
  }
}

