package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSegment extends js.Object {
  /**
    * A list of segment filters groups which are combined with logical `AND`
    * operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}

object SimpleSegment {
  @scala.inline
  def apply(orFiltersForSegment: js.Array[OrFiltersForSegment] = null): SimpleSegment = {
    val __obj = js.Dynamic.literal()
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSegment]
  }
}

