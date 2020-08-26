package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentPricing extends js.Object {
  /** A segment identifier unique within a single solution. It is used to refer to different parts of the same solution. */
  var fareId: js.UndefOr[String] = js.native
  /** Details of the free baggage allowance on this segment. */
  var freeBaggageOption: js.UndefOr[js.Array[FreeBaggageAllowance]] = js.native
  /** Identifies this as a segment pricing object, representing the price of this segment. Value: the fixed string qpxexpress#segmentPricing. */
  var kind: js.UndefOr[String] = js.native
  /** Unique identifier in the response of this segment. */
  var segmentId: js.UndefOr[String] = js.native
}

object SegmentPricing {
  @scala.inline
  def apply(): SegmentPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentPricing]
  }
  @scala.inline
  implicit class SegmentPricingOps[Self <: SegmentPricing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFareId(value: String): Self = this.set("fareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFareId: Self = this.set("fareId", js.undefined)
    @scala.inline
    def setFreeBaggageOptionVarargs(value: FreeBaggageAllowance*): Self = this.set("freeBaggageOption", js.Array(value :_*))
    @scala.inline
    def setFreeBaggageOption(value: js.Array[FreeBaggageAllowance]): Self = this.set("freeBaggageOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeBaggageOption: Self = this.set("freeBaggageOption", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
  }
  
}

