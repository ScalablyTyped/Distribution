package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Time extends js.Object {
  /** The time the media was captured. Formatted as an RFC 3339 timestamp. */
  var time: js.UndefOr[String] = js.undefined
}

object Anon_Time {
  @scala.inline
  def apply(time: String = null): Anon_Time = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Time]
  }
}

