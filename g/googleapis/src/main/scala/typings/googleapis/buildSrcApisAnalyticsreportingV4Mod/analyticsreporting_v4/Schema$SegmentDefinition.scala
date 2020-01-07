package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SegmentDefinition defines the segment to be a set of SegmentFilters which
  * are combined together with a logical `AND` operation.
  */
@js.native
trait Schema$SegmentDefinition extends js.Object {
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[Schema$SegmentFilter]] = js.native
}

object Schema$SegmentDefinition {
  @scala.inline
  def apply(segmentFilters: js.Array[Schema$SegmentFilter] = null): Schema$SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    if (segmentFilters != null) __obj.updateDynamic("segmentFilters")(segmentFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SegmentDefinition]
  }
}

