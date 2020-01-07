package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Simple segment conditions consist of one or more dimension/metric
  * conditions that can be combined.
  */
@js.native
trait Schema$SimpleSegment extends js.Object {
  /**
    * A list of segment filters groups which are combined with logical `AND`
    * operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[Schema$OrFiltersForSegment]] = js.native
}

object Schema$SimpleSegment {
  @scala.inline
  def apply(orFiltersForSegment: js.Array[Schema$OrFiltersForSegment] = null): Schema$SimpleSegment = {
    val __obj = js.Dynamic.literal()
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SimpleSegment]
  }
}

