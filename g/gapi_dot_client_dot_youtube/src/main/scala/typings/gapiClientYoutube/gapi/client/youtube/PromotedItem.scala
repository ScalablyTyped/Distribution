package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItem extends js.Object {
  /** A custom message to display for this promotion. This field is currently ignored unless the promoted item is a website. */
  var customMessage: js.UndefOr[String] = js.undefined
  /** Identifies the promoted item. */
  var id: js.UndefOr[PromotedItemId] = js.undefined
  /**
    * If true, the content owner's name will be used when displaying the promotion. This field can only be set when the update is made on behalf of the
    * content owner.
    */
  var promotedByContentOwner: js.UndefOr[Boolean] = js.undefined
  /** The temporal position within the video where the promoted item will be displayed. If present, it overrides the default timing. */
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

