package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrFiltersForSegment extends js.Object {
  var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.undefined
}

object OrFiltersForSegment {
  @scala.inline
  def apply(segmentFilterClauses: js.Array[SegmentFilterClause] = null): OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    if (segmentFilterClauses != null) __obj.updateDynamic("segmentFilterClauses")(segmentFilterClauses)
    __obj.asInstanceOf[OrFiltersForSegment]
  }
}

