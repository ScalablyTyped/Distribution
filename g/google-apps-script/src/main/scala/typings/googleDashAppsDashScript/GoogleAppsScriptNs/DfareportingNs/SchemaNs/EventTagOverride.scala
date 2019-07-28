package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagOverride extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object EventTagOverride {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, id: String = null): EventTagOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[EventTagOverride]
  }
}

