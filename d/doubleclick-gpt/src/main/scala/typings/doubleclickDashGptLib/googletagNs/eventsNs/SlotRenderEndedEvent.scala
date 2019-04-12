package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotRenderEndedEvent extends Event {
  var advertiserId: js.UndefOr[scala.Double] = js.undefined
  var creativeId: js.UndefOr[scala.Double] = js.undefined
  var isEmpty: scala.Boolean
  var lineItemId: js.UndefOr[scala.Double] = js.undefined
  var size: js.Array[scala.Double] | java.lang.String
  var sourceAgnosticCreativeId: js.UndefOr[scala.Double] = js.undefined
  var sourceAgnosticLineItemId: js.UndefOr[scala.Double] = js.undefined
}

object SlotRenderEndedEvent {
  @scala.inline
  def apply(
    isEmpty: scala.Boolean,
    serviceName: java.lang.String,
    size: js.Array[scala.Double] | java.lang.String,
    slot: doubleclickDashGptLib.googletagNs.Slot,
    advertiserId: scala.Int | scala.Double = null,
    creativeId: scala.Int | scala.Double = null,
    lineItemId: scala.Int | scala.Double = null,
    sourceAgnosticCreativeId: scala.Int | scala.Double = null,
    sourceAgnosticLineItemId: scala.Int | scala.Double = null
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

