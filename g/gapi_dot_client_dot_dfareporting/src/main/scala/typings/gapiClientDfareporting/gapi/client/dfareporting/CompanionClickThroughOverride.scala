package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionClickThroughOverride extends js.Object {
  /** Click-through URL of this companion click-through override. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  /** ID of the creative for this companion click-through override. */
  var creativeId: js.UndefOr[String] = js.undefined
}

object CompanionClickThroughOverride {
  @scala.inline
  def apply(clickThroughUrl: ClickThroughUrl = null, creativeId: String = null): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
}

