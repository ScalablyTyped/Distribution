package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringCount extends js.Object {
  var filteringCount: js.UndefOr[String] = js.native
  var filteringStatus: js.UndefOr[Double] = js.native
}

object FilteringCount {
  @scala.inline
  def apply(filteringCount: String = null, filteringStatus: js.UndefOr[Double] = js.undefined): FilteringCount = {
    val __obj = js.Dynamic.literal()
    if (filteringCount != null) __obj.updateDynamic("filteringCount")(filteringCount.asInstanceOf[js.Any])
    if (!js.isUndefined(filteringStatus)) __obj.updateDynamic("filteringStatus")(filteringStatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteringCount]
  }
}

