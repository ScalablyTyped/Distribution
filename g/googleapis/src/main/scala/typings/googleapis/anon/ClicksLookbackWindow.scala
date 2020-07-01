package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClicksLookbackWindow extends js.Object {
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}

object ClicksLookbackWindow {
  @scala.inline
  def apply(
    clicksLookbackWindow: js.UndefOr[Double] = js.undefined,
    impressionsLookbackWindow: js.UndefOr[Double] = js.undefined,
    includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    maximumClickInteractions: js.UndefOr[Double] = js.undefined,
    maximumImpressionInteractions: js.UndefOr[Double] = js.undefined,
    maximumInteractionGap: js.UndefOr[Double] = js.undefined,
    pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
  ): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clicksLookbackWindow)) __obj.updateDynamic("clicksLookbackWindow")(clicksLookbackWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impressionsLookbackWindow)) __obj.updateDynamic("impressionsLookbackWindow")(impressionsLookbackWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumClickInteractions)) __obj.updateDynamic("maximumClickInteractions")(maximumClickInteractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumImpressionInteractions)) __obj.updateDynamic("maximumImpressionInteractions")(maximumImpressionInteractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumInteractionGap)) __obj.updateDynamic("maximumInteractionGap")(maximumInteractionGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotOnInteractionPath)) __obj.updateDynamic("pivotOnInteractionPath")(pivotOnInteractionPath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
}

