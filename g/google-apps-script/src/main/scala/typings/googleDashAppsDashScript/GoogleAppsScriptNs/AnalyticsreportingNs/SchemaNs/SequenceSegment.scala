package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

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
    if (!js.isUndefined(firstStepShouldMatchFirstHit)) __obj.updateDynamic("firstStepShouldMatchFirstHit")(firstStepShouldMatchFirstHit)
    if (segmentSequenceSteps != null) __obj.updateDynamic("segmentSequenceSteps")(segmentSequenceSteps)
    __obj.asInstanceOf[SequenceSegment]
  }
}

