package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemResource extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object GroupItemResource {
  @scala.inline
  def apply(id: String = null, kind: String = null): GroupItemResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[GroupItemResource]
  }
}

