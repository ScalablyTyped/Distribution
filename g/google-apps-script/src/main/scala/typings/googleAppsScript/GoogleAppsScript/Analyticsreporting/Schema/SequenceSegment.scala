package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceSegment extends js.Object {
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.undefined
}

object SequenceSegment {
  @scala.inline
  def apply(
    firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined,
    segmentSequenceSteps: js.Array[SegmentSequenceStep] = null
  ): SequenceSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(firstStepShouldMatchFirstHit)) __obj.updateDynamic("firstStepShouldMatchFirstHit")(firstStepShouldMatchFirstHit.asInstanceOf[js.Any])
    if (segmentSequenceSteps != null) __obj.updateDynamic("segmentSequenceSteps")(segmentSequenceSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceSegment]
  }
}

