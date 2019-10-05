package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDefinition extends js.Object {
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.undefined
}

object SegmentDefinition {
  @scala.inline
  def apply(segmentFilters: js.Array[SegmentFilter] = null): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    if (segmentFilters != null) __obj.updateDynamic("segmentFilters")(segmentFilters)
    __obj.asInstanceOf[SegmentDefinition]
  }
}

