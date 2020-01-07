package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment sequence definition.
  */
@js.native
trait Schema$SegmentSequenceStep extends js.Object {
  /**
    * Specifies if the step immediately precedes or can be any time before the
    * next step.
    */
  var matchType: js.UndefOr[String] = js.native
  /**
    * A sequence is specified with a list of Or grouped filters which are
    * combined with `AND` operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[Schema$OrFiltersForSegment]] = js.native
}

object Schema$SegmentSequenceStep {
  @scala.inline
  def apply(matchType: String = null, orFiltersForSegment: js.Array[Schema$OrFiltersForSegment] = null): Schema$SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SegmentSequenceStep]
  }
}

