package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentPricing extends js.Object {
  /** A segment identifier unique within a single solution. It is used to refer to different parts of the same solution. */
  var fareId: js.UndefOr[String] = js.undefined
  /** Details of the free baggage allowance on this segment. */
  var freeBaggageOption: js.UndefOr[js.Array[FreeBaggageAllowance]] = js.undefined
  /** Identifies this as a segment pricing object, representing the price of this segment. Value: the fixed string qpxexpress#segmentPricing. */
  var kind: js.UndefOr[String] = js.undefined
  /** Unique identifier in the response of this segment. */
  var segmentId: js.UndefOr[String] = js.undefined
}

object SegmentPricing {
  @scala.inline
  def apply(
    fareId: String = null,
    freeBaggageOption: js.Array[FreeBaggageAllowance] = null,
    kind: String = null,
    segmentId: String = null
  ): SegmentPricing = {
    val __obj = js.Dynamic.literal()
    if (fareId != null) __obj.updateDynamic("fareId")(fareId.asInstanceOf[js.Any])
    if (freeBaggageOption != null) __obj.updateDynamic("freeBaggageOption")(freeBaggageOption.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentPricing]
  }
}

