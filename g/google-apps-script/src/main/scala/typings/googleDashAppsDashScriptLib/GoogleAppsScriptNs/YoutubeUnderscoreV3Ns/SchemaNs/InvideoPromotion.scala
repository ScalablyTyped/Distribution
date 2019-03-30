package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoPromotion extends js.Object {
  var defaultTiming: js.UndefOr[InvideoTiming] = js.undefined
  var items: js.UndefOr[js.Array[PromotedItem]] = js.undefined
  var position: js.UndefOr[InvideoPosition] = js.undefined
  var useSmartTiming: js.UndefOr[scala.Boolean] = js.undefined
}

object InvideoPromotion {
  @scala.inline
  def apply(
    defaultTiming: InvideoTiming = null,
    items: js.Array[PromotedItem] = null,
    position: InvideoPosition = null,
    useSmartTiming: js.UndefOr[scala.Boolean] = js.undefined
  ): InvideoPromotion = {
    val __obj = js.Dynamic.literal()
    if (defaultTiming != null) __obj.updateDynamic("defaultTiming")(defaultTiming)
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(useSmartTiming)) __obj.updateDynamic("useSmartTiming")(useSmartTiming)
    __obj.asInstanceOf[InvideoPromotion]
  }
}

