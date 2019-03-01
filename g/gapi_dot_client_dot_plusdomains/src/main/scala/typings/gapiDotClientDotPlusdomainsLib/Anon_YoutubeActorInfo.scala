package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_YoutubeActorInfo extends js.Object {
  /** Actor info specific to YouTube clients. */
  var youtubeActorInfo: js.UndefOr[Anon_ChannelId] = js.undefined
}

object Anon_YoutubeActorInfo {
  @scala.inline
  def apply(youtubeActorInfo: Anon_ChannelId = null): Anon_YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    if (youtubeActorInfo != null) __obj.updateDynamic("youtubeActorInfo")(youtubeActorInfo)
    __obj.asInstanceOf[Anon_YoutubeActorInfo]
  }
}

