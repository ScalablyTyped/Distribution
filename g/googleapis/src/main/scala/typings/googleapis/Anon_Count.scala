package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Count extends js.Object {
  var count: js.UndefOr[String] = js.native
  var timeRange: js.UndefOr[String] = js.native
}

object Anon_Count {
  @scala.inline
  def apply(count: String = null, timeRange: String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

