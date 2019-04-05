package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimHistory extends js.Object {
  var event: js.UndefOr[js.Array[ClaimEvent]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var uploaderChannelId: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimHistory {
  @scala.inline
  def apply(
    event: js.Array[ClaimEvent] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    uploaderChannelId: java.lang.String = null
  ): ClaimHistory = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (uploaderChannelId != null) __obj.updateDynamic("uploaderChannelId")(uploaderChannelId)
    __obj.asInstanceOf[ClaimHistory]
  }
}

