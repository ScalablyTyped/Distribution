package typings.gijgo.TypesNs

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
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (groupByDirection != null) __obj.updateDynamic("groupByDirection")(groupByDirection)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (page != null) __obj.updateDynamic("page")(page)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    __obj.asInstanceOf[GridParamNames]
  }
}

