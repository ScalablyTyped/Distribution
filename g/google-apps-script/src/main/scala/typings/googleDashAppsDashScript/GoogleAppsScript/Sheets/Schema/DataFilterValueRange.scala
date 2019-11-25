package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilterValueRange extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  var majorDimension: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object DataFilterValueRange {
  @scala.inline
  def apply(dataFilter: DataFilter = null, majorDimension: String = null, values: js.Array[js.Array[_]] = null): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFilterValueRange]
  }
}

