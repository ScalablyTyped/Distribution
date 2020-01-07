package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HttpRouteRuleMatch criteria for field values that must stay within the
  * specified integer range.
  */
@js.native
trait Schema$Int64RangeMatch extends js.Object {
  /**
    * The end of the range (exclusive) in signed long integer format.
    */
  var rangeEnd: js.UndefOr[String] = js.native
  /**
    * The start of the range (inclusive) in signed long integer format.
    */
  var rangeStart: js.UndefOr[String] = js.native
}

object Schema$Int64RangeMatch {
  @scala.inline
  def apply(rangeEnd: String = null, rangeStart: String = null): Schema$Int64RangeMatch = {
    val __obj = js.Dynamic.literal()
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Int64RangeMatch]
  }
}

