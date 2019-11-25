package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCuepoint extends js.Object {
  var broadcastId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var settings: js.UndefOr[CuepointSettings] = js.undefined
}

object LiveCuepoint {
  @scala.inline
  def apply(
    broadcastId: String = null,
    id: String = null,
    kind: String = null,
    settings: CuepointSettings = null
  ): LiveCuepoint = {
    val __obj = js.Dynamic.literal()
    if (broadcastId != null) __obj.updateDynamic("broadcastId")(broadcastId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCuepoint]
  }
}

