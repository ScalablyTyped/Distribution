package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_YoutubeActorInfo extends js.Object {
  var youtubeActorInfo: js.UndefOr[Anon_ChannelId] = js.native
}

object Anon_YoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: Anon_ChannelId = null): Anon_YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_YoutubeActorInfo]
  }
}

