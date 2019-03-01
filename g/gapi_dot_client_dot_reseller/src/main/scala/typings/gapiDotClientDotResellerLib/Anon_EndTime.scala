package typings
package gapiDotClientDotResellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTime extends js.Object {
  /** An annual commitment plan's interval's endTime in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** An annual commitment plan's interval's startTime in milliseconds using UNIX Epoch format. See an example Epoch converter. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EndTime {
  @scala.inline
  def apply(endTime: java.lang.String = null, startTime: java.lang.String = null): Anon_EndTime = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[Anon_EndTime]
  }
}

