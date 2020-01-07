package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Time extends js.Object {
  var time: js.UndefOr[String] = js.native
}

object Anon_Time {
  @scala.inline
  def apply(time: String = null): Anon_Time = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Time]
  }
}

