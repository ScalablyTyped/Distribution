package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of segment filters in the `OR` group are combined with the logical
  * OR operator.
  */
@js.native
trait Schema$OrFiltersForSegment extends js.Object {
  /**
    * List of segment filters to be combined with a `OR` operator.
    */
  var segmentFilterClauses: js.UndefOr[js.Array[Schema$SegmentFilterClause]] = js.native
}

object Schema$OrFiltersForSegment {
  @scala.inline
  def apply(segmentFilterClauses: js.Array[Schema$SegmentFilterClause] = null): Schema$OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    if (segmentFilterClauses != null) __obj.updateDynamic("segmentFilterClauses")(segmentFilterClauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrFiltersForSegment]
  }
}

