package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentInfo extends js.Object {
  /** The booking code or class for this segment. */
  var bookingCode: js.UndefOr[String] = js.native
  /** The number of seats available in this booking code on this segment. */
  var bookingCodeCount: js.UndefOr[Double] = js.native
  /** The cabin booked for this segment. */
  var cabin: js.UndefOr[String] = js.native
  /** In minutes, the duration of the connection following this segment. */
  var connectionDuration: js.UndefOr[Double] = js.native
  /** The duration of the flight segment in minutes. */
  var duration: js.UndefOr[Double] = js.native
  /** The flight this is a segment of. */
  var flight: js.UndefOr[FlightInfo] = js.native
  /** An id uniquely identifying the segment in the solution. */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this as a segment object. A segment is one or more consecutive legs on the same flight. For example a hypothetical flight ZZ001, from DFW to
    * OGG, could have one segment with two legs: DFW to HNL (leg 1), HNL to OGG (leg 2). Value: the fixed string qpxexpress#segmentInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** The legs composing this segment. */
  var leg: js.UndefOr[js.Array[LegInfo]] = js.native
  /**
    * The solution-based index of a segment in a married segment group. Married segments can only be booked together. For example, an airline might report a
    * certain booking code as sold out from Boston to Pittsburgh, but as available as part of two married segments Boston to Chicago connecting through
    * Pittsburgh. For example content of this field, consider the round-trip flight ZZ1 PHX-PHL ZZ2 PHL-CLT ZZ3 CLT-PHX. This has three segments, with the
    * two outbound ones (ZZ1 ZZ2) married. In this case, the two outbound segments belong to married segment group 0, and the return segment belongs to
    * married segment group 1.
    */
  var marriedSegmentGroup: js.UndefOr[String] = js.native
  /** Whether the operation of this segment remains subject to government approval. */
  var subjectToGovernmentApproval: js.UndefOr[Boolean] = js.native
}

object SegmentInfo {
  @scala.inline
  def apply(): SegmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentInfo]
  }
  @scala.inline
  implicit class SegmentInfoOps[Self <: SegmentInfo] (val x: Self) extends AnyVal {
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
    def setBookingCode(value: String): Self = this.set("bookingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookingCode: Self = this.set("bookingCode", js.undefined)
    @scala.inline
    def setBookingCodeCount(value: Double): Self = this.set("bookingCodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookingCodeCount: Self = this.set("bookingCodeCount", js.undefined)
    @scala.inline
    def setCabin(value: String): Self = this.set("cabin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCabin: Self = this.set("cabin", js.undefined)
    @scala.inline
    def setConnectionDuration(value: Double): Self = this.set("connectionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionDuration: Self = this.set("connectionDuration", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFlight(value: FlightInfo): Self = this.set("flight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlight: Self = this.set("flight", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLegVarargs(value: LegInfo*): Self = this.set("leg", js.Array(value :_*))
    @scala.inline
    def setLeg(value: js.Array[LegInfo]): Self = this.set("leg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeg: Self = this.set("leg", js.undefined)
    @scala.inline
    def setMarriedSegmentGroup(value: String): Self = this.set("marriedSegmentGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarriedSegmentGroup: Self = this.set("marriedSegmentGroup", js.undefined)
    @scala.inline
    def setSubjectToGovernmentApproval(value: Boolean): Self = this.set("subjectToGovernmentApproval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectToGovernmentApproval: Self = this.set("subjectToGovernmentApproval", js.undefined)
  }
  
}

