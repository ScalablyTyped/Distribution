package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YoutubeActorInfo extends js.Object {
  /** Actor info specific to YouTube clients. */
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.undefined
}

object YoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: ChannelId = null): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[YoutubeActorInfo]
  }
}

