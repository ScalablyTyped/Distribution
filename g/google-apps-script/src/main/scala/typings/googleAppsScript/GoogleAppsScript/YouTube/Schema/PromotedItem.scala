package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItem extends js.Object {
  var customMessage: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[PromotedItemId] = js.undefined
  var promotedByContentOwner: js.UndefOr[Boolean] = js.undefined
  var timing: js.UndefOr[InvideoTiming] = js.undefined
}

object PromotedItem {
  @scala.inline
  def apply(
    customMessage: String = null,
    id: PromotedItemId = null,
    promotedByContentOwner: js.UndefOr[Boolean] = js.undefined,
    timing: InvideoTiming = null
  ): PromotedItem = {
    val __obj = js.Dynamic.literal()
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(promotedByContentOwner)) __obj.updateDynamic("promotedByContentOwner")(promotedByContentOwner.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromotedItem]
  }
}

