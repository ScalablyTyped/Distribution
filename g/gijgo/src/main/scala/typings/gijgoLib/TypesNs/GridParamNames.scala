package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridParamNames extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var groupBy: js.UndefOr[java.lang.String] = js.undefined
  var groupByDirection: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[java.lang.String] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
}

object GridParamNames {
  @scala.inline
  def apply(
    direction: java.lang.String = null,
    groupBy: java.lang.String = null,
    groupByDirection: java.lang.String = null,
    limit: java.lang.String = null,
    page: java.lang.String = null,
    sortBy: java.lang.String = null
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

