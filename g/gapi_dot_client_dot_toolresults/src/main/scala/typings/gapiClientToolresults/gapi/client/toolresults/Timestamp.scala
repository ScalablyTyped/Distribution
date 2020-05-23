package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  /**
    * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count
    * forward in time. Must be from 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double] = js.undefined
  /** Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. */
  var seconds: js.UndefOr[String] = js.undefined
}

object Timestamp {
  @scala.inline
  def apply(nanos: js.UndefOr[Double] = js.undefined, seconds: String = null): Timestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
}

