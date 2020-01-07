package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GroupItemResource extends js.Object {
  /**
    * The channel, video, playlist, or asset ID that YouTube uses to uniquely
    * identify the item that is being added to the group.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the type of resource being added to the group.  Valid values
    * for this property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$GroupItemResource {
  @scala.inline
  def apply(id: String = null, kind: String = null): Schema$GroupItemResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupItemResource]
  }
}

