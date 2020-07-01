package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YoutubeActorInfo extends js.Object {
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.native
}

object YoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: ChannelId = null): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[YoutubeActorInfo]
  }
}

