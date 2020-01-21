package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoPromotion extends js.Object {
  var defaultTiming: js.UndefOr[InvideoTiming] = js.undefined
  var items: js.UndefOr[js.Array[PromotedItem]] = js.undefined
  var position: js.UndefOr[InvideoPosition] = js.undefined
  var useSmartTiming: js.UndefOr[Boolean] = js.undefined
}

object InvideoPromotion {
  @scala.inline
  def apply(
    defaultTiming: InvideoTiming = null,
    items: js.Array[PromotedItem] = null,
    position: InvideoPosition = null,
    useSmartTiming: js.UndefOr[Boolean] = js.undefined
  ): InvideoPromotion = {
    val __obj = js.Dynamic.literal()
    if (defaultTiming != null) __obj.updateDynamic("defaultTiming")(defaultTiming.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(useSmartTiming)) __obj.updateDynamic("useSmartTiming")(useSmartTiming.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvideoPromotion]
  }
}

