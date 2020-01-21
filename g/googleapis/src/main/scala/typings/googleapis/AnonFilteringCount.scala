package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilteringCount extends js.Object {
  var filteringCount: js.UndefOr[String] = js.native
  var filteringStatus: js.UndefOr[Double] = js.native
}

object AnonFilteringCount {
  @scala.inline
  def apply(filteringCount: String = null, filteringStatus: Int | Double = null): AnonFilteringCount = {
    val __obj = js.Dynamic.literal()
    if (filteringCount != null) __obj.updateDynamic("filteringCount")(filteringCount.asInstanceOf[js.Any])
    if (filteringStatus != null) __obj.updateDynamic("filteringStatus")(filteringStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilteringCount]
  }
}

