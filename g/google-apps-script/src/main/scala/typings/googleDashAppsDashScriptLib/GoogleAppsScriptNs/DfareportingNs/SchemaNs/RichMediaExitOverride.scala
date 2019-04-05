package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichMediaExitOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var exitId: js.UndefOr[java.lang.String] = js.undefined
}

object RichMediaExitOverride {
  @scala.inline
  def apply(
    clickThroughUrl: ClickThroughUrl = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    exitId: java.lang.String = null
  ): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (exitId != null) __obj.updateDynamic("exitId")(exitId)
    __obj.asInstanceOf[RichMediaExitOverride]
  }
}

