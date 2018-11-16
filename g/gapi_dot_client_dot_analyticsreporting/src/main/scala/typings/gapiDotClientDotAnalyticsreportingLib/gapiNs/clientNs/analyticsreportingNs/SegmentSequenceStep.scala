package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SegmentSequenceStep extends js.Object {
  /**
               * Specifies if the step immediately precedes or can be any time before the
               * next step.
               */
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A sequence is specified with a list of Or grouped filters which are
               * combined with `AND` operator.
               */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}

