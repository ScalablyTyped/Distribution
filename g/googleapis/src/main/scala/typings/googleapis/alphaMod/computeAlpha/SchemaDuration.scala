package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Duration represents a fixed-length span of time represented as a count of
  * seconds and fractions of seconds at nanosecond resolution. It is
  * independent of any calendar and concepts like &quot;day&quot; or
  * &quot;month&quot;. Range is approximately 10,000 years.
  */
@js.native
trait SchemaDuration extends js.Object {
  /**
    * Span of time that&#39;s a fraction of a second at nanosecond resolution.
    * Durations less than one second are represented with a 0 `seconds` field
    * and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double] = js.native
  /**
    * Span of time at a resolution of a second. Must be from 0 to
    * 315,576,000,000 inclusive. Note: these bounds are computed from: 60
    * sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
    */
  var seconds: js.UndefOr[String] = js.native
}

object SchemaDuration {
  @scala.inline
  def apply(nanos: js.UndefOr[Double] = js.undefined, seconds: String = null): SchemaDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuration]
  }
}

