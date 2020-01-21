package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonYoutubeActorInfo extends js.Object {
  /** Actor info specific to YouTube clients. */
  var youtubeActorInfo: js.UndefOr[AnonChannelId] = js.undefined
}

object AnonYoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: AnonChannelId = null): AnonYoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonYoutubeActorInfo]
  }
}

