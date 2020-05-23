package typings.doubleclickGpt.googletag.events

import typings.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotRenderEndedEvent extends Event {
  var advertiserId: js.UndefOr[Double] = js.undefined
  var creativeId: js.UndefOr[Double] = js.undefined
  var isEmpty: Boolean
  var lineItemId: js.UndefOr[Double] = js.undefined
  var size: js.Array[Double] | String
  var sourceAgnosticCreativeId: js.UndefOr[Double] = js.undefined
  var sourceAgnosticLineItemId: js.UndefOr[Double] = js.undefined
}

object SlotRenderEndedEvent {
  @scala.inline
  def apply(
    isEmpty: Boolean,
    serviceName: String,
    size: js.Array[Double] | String,
    slot: Slot,
    advertiserId: js.UndefOr[Double] = js.undefined,
    creativeId: js.UndefOr[Double] = js.undefined,
    lineItemId: js.UndefOr[Double] = js.undefined,
    sourceAgnosticCreativeId: js.UndefOr[Double] = js.undefined,
    sourceAgnosticLineItemId: js.UndefOr[Double] = js.undefined
  ): SlotRenderEndedEvent = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    if (!js.isUndefined(advertiserId)) __obj.updateDynamic("advertiserId")(advertiserId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creativeId)) __obj.updateDynamic("creativeId")(creativeId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineItemId)) __obj.updateDynamic("lineItemId")(lineItemId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceAgnosticCreativeId)) __obj.updateDynamic("sourceAgnosticCreativeId")(sourceAgnosticCreativeId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceAgnosticLineItemId)) __obj.updateDynamic("sourceAgnosticLineItemId")(sourceAgnosticLineItemId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotRenderEndedEvent]
  }
}

