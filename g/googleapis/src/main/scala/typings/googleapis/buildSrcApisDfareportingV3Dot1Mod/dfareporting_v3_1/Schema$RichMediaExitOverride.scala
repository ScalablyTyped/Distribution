package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rich Media Exit Override.
  */
@js.native
trait Schema$RichMediaExitOverride extends js.Object {
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[Schema$ClickThroughUrl] = js.native
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.native
}

object Schema$RichMediaExitOverride {
  @scala.inline
  def apply(
    clickThroughUrl: Schema$ClickThroughUrl = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exitId: String = null
  ): Schema$RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (exitId != null) __obj.updateDynamic("exitId")(exitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RichMediaExitOverride]
  }
}

