package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogBucket extends js.Object {
  var logBucket: js.UndefOr[String] = js.native
  var logObjectPrefix: js.UndefOr[String] = js.native
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

