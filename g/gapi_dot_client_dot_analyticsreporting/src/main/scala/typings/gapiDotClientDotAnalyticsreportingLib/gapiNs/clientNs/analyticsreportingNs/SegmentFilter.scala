package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentFilter extends js.Object {
  /**
    * If true, match the complement of simple or sequence segment.
    * For example, to match all visits not from "New York", we can define the
    * segment as follows:
    *
    * "sessionSegment": {
    * "segmentFilters": [{
    * "simpleSegment" :{
    * "orFiltersForSegment": [{
    * "segmentFilterClauses":[{
    * "dimensionFilter": {
    * "dimensionName": "ga:city",
    * "expressions": ["New York"]
    * }
    * }]
    * }]
    * },
    * "not": "True"
    * }]
    * },
    */
  var not: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sequence conditions consist of one or more steps, where each step is
    * defined by one or more dimension/metric conditions. Multiple steps can
    * be combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.undefined
  /**
    * A Simple segment conditions consist of one or more dimension/metric
    * conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SimpleSegment] = js.undefined
}

