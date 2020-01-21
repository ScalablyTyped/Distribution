package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogBucket extends js.Object {
  /** The destination bucket where the current bucket's logs should be placed. */
  var logBucket: js.UndefOr[String] = js.undefined
  /** A prefix for log object names. */
  var logObjectPrefix: js.UndefOr[String] = js.undefined
}

object AnonLogBucket {
  @scala.inline
  def apply(logBucket: String = null, logObjectPrefix: String = null): AnonLogBucket = {
    val __obj = js.Dynamic.literal()
    if (logBucket != null) __obj.updateDynamic("logBucket")(logBucket.asInstanceOf[js.Any])
    if (logObjectPrefix != null) __obj.updateDynamic("logObjectPrefix")(logObjectPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogBucket]
  }
}

