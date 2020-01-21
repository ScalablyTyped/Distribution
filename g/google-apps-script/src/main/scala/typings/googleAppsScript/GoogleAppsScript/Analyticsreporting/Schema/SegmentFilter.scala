package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentFilter extends js.Object {
  var not: js.UndefOr[Boolean] = js.undefined
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.undefined
  var simpleSegment: js.UndefOr[SimpleSegment] = js.undefined
}

object SegmentFilter {
  @scala.inline
  def apply(
    not: js.UndefOr[Boolean] = js.undefined,
    sequenceSegment: SequenceSegment = null,
    simpleSegment: SimpleSegment = null
  ): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (sequenceSegment != null) __obj.updateDynamic("sequenceSegment")(sequenceSegment.asInstanceOf[js.Any])
    if (simpleSegment != null) __obj.updateDynamic("simpleSegment")(simpleSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentFilter]
  }
}

