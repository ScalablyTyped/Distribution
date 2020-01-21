package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichMediaExitOverride extends js.Object {
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var exitId: js.UndefOr[String] = js.undefined
}

object RichMediaExitOverride {
  @scala.inline
  def apply(
    clickThroughUrl: ClickThroughUrl = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exitId: String = null
  ): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (exitId != null) __obj.updateDynamic("exitId")(exitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichMediaExitOverride]
  }
}

