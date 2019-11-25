package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceSegment extends js.Object {
  /**
    * If set, first step condition must match the first hit of the visitor (in
    * the date range).
    */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined
  /** The list of steps in the sequence. */
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

