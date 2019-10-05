package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimHistory extends js.Object {
  var event: js.UndefOr[js.Array[ClaimEvent]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var uploaderChannelId: js.UndefOr[String] = js.undefined
}

object ClaimHistory {
  @scala.inline
  def apply(
    event: js.Array[ClaimEvent] = null,
    id: String = null,
    kind: String = null,
    uploaderChannelId: String = null
  ): ClaimHistory = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (uploaderChannelId != null) __obj.updateDynamic("uploaderChannelId")(uploaderChannelId)
    __obj.asInstanceOf[ClaimHistory]
  }
}

