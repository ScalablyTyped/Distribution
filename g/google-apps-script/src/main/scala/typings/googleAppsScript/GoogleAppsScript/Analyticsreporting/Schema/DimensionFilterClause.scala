package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilterClause extends js.Object {
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object DimensionFilterClause {
  @scala.inline
  def apply(filters: js.Array[DimensionFilter] = null, operator: String = null): DimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilterClause]
  }
}

