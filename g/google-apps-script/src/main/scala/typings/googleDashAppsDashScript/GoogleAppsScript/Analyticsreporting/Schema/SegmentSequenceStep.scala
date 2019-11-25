package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentSequenceStep extends js.Object {
  var matchType: js.UndefOr[String] = js.undefined
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}

object SegmentSequenceStep {
  @scala.inline
  def apply(matchType: String = null, orFiltersForSegment: js.Array[OrFiltersForSegment] = null): SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentSequenceStep]
  }
}

