package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SequenceSegment extends js.Object {
  /**
               * If set, first step condition must match the first hit of the visitor (in
               * the date range).
               */
  var firstStepShouldMatchFirstHit: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of steps in the sequence. */
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.undefined
}

