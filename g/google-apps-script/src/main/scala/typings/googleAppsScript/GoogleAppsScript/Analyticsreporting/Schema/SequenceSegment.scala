package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceSegment extends js.Object {
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.native
}

object SequenceSegment {
  @scala.inline
  def apply(): SequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceSegment]
  }
  @scala.inline
  implicit class SequenceSegmentOps[Self <: SequenceSegment] (val x: Self) extends AnyVal {
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
    def setFirstStepShouldMatchFirstHit(value: Boolean): Self = this.set("firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstStepShouldMatchFirstHit: Self = this.set("firstStepShouldMatchFirstHit", js.undefined)
    @scala.inline
    def setSegmentSequenceStepsVarargs(value: SegmentSequenceStep*): Self = this.set("segmentSequenceSteps", js.Array(value :_*))
    @scala.inline
    def setSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = this.set("segmentSequenceSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentSequenceSteps: Self = this.set("segmentSequenceSteps", js.undefined)
  }
  
}

