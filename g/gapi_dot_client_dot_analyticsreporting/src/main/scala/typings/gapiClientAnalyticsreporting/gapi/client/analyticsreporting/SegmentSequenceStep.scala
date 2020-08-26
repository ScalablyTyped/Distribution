package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentSequenceStep extends js.Object {
  /**
    * Specifies if the step immediately precedes or can be any time before the
    * next step.
    */
  var matchType: js.UndefOr[String] = js.native
  /**
    * A sequence is specified with a list of Or grouped filters which are
    * combined with `AND` operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.native
}

object SegmentSequenceStep {
  @scala.inline
  def apply(): SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSequenceStep]
  }
  @scala.inline
  implicit class SegmentSequenceStepOps[Self <: SegmentSequenceStep] (val x: Self) extends AnyVal {
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
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    @scala.inline
    def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = this.set("orFiltersForSegment", js.Array(value :_*))
    @scala.inline
    def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = this.set("orFiltersForSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrFiltersForSegment: Self = this.set("orFiltersForSegment", js.undefined)
  }
  
}

