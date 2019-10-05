package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionClickThroughOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var creativeId: js.UndefOr[String] = js.undefined
}

object CompanionClickThroughOverride {
  @scala.inline
  def apply(clickThroughUrl: ClickThroughUrl = null, creativeId: String = null): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
}

