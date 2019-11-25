package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridParamNames extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var groupBy: js.UndefOr[String] = js.undefined
  var groupByDirection: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
}

object GridParamNames {
  @scala.inline
  def apply(
    direction: String = null,
    groupBy: String = null,
    groupByDirection: String = null,
    limit: String = null,
    page: String = null,
    sortBy: String = null
  ): GridParamNames = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupByDirection != null) __obj.updateDynamic("groupByDirection")(groupByDirection.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridParamNames]
  }
}

