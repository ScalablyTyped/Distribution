package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonYoutubeActorInfo extends js.Object {
  var youtubeActorInfo: js.UndefOr[AnonChannelId] = js.native
}

object AnonYoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: AnonChannelId = null): AnonYoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonYoutubeActorInfo]
  }
}

