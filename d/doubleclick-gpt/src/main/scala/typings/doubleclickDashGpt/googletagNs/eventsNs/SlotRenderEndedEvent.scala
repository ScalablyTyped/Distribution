package typings.doubleclickDashGpt.googletagNs.eventsNs

import typings.doubleclickDashGpt.googletagNs.Slot
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
    advertiserId: Int | Double = null,
    creativeId: Int | Double = null,
    lineItemId: Int | Double = null,
    sourceAgnosticCreativeId: Int | Double = null,
    sourceAgnosticLineItemId: Int | Double = null
  ): SlotRenderEndedEvent = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty, serviceName = serviceName, size = size.asInstanceOf[js.Any], slot = slot)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (sourceAgnosticCreativeId != null) __obj.updateDynamic("sourceAgnosticCreativeId")(sourceAgnosticCreativeId.asInstanceOf[js.Any])
    if (sourceAgnosticLineItemId != null) __obj.updateDynamic("sourceAgnosticLineItemId")(sourceAgnosticLineItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotRenderEndedEvent]
  }
}

