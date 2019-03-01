package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Time extends js.Object {
  /** The time the media was captured. Formatted as an RFC 3339 timestamp. */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Time {
  @scala.inline
  def apply(time: java.lang.String = null): Anon_Time = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Anon_Time]
  }
}

