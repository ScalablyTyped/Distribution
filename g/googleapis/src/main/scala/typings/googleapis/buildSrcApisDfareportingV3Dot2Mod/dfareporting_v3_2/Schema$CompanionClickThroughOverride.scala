package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Companion Click-through override.
  */
@js.native
trait Schema$CompanionClickThroughOverride extends js.Object {
  /**
    * Click-through URL of this companion click-through override.
    */
  var clickThroughUrl: js.UndefOr[Schema$ClickThroughUrl] = js.native
  /**
    * ID of the creative for this companion click-through override.
    */
  var creativeId: js.UndefOr[String] = js.native
}

object Schema$CompanionClickThroughOverride {
  @scala.inline
  def apply(clickThroughUrl: Schema$ClickThroughUrl = null, creativeId: String = null): Schema$CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompanionClickThroughOverride]
  }
}

