package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCuepoint extends js.Object {
  var broadcastId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var settings: js.UndefOr[CuepointSettings] = js.undefined
}

object LiveCuepoint {
  @scala.inline
  def apply(
    broadcastId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    settings: CuepointSettings = null
  ): LiveCuepoint = {
    val __obj = js.Dynamic.literal()
    if (broadcastId != null) __obj.updateDynamic("broadcastId")(broadcastId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[LiveCuepoint]
  }
}

