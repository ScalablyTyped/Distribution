package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var not: js.UndefOr[Boolean] = js.native
  /**
    * Sequence conditions consist of one or more steps, where each step is
    * defined by one or more dimension/metric conditions. Multiple steps can
    * be combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
  /**
    * A Simple segment conditions consist of one or more dimension/metric
    * conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SimpleSegment] = js.native
}

object SegmentFilter {
  @scala.inline
  def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  @scala.inline
  implicit class SegmentFilterOps[Self <: SegmentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setSequenceSegment(value: SequenceSegment): Self = this.set("sequenceSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceSegment: Self = this.set("sequenceSegment", js.undefined)
    @scala.inline
    def setSimpleSegment(value: SimpleSegment): Self = this.set("simpleSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleSegment: Self = this.set("simpleSegment", js.undefined)
  }
  
}

