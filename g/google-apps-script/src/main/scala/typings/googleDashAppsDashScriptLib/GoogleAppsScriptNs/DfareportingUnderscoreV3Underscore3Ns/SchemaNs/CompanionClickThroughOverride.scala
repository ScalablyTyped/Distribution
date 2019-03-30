package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionClickThroughOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
}

object CompanionClickThroughOverride {
  @scala.inline
  def apply(clickThroughUrl: ClickThroughUrl = null, creativeId: java.lang.String = null): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
}

