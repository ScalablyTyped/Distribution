package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTable extends js.Object {
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  var criteria: js.UndefOr[js.Object] = js.undefined
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
  var valueLayout: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[PivotValue]] = js.undefined
}

object PivotTable {
  @scala.inline
  def apply(
    columns: js.Array[PivotGroup] = null,
    criteria: js.Object = null,
    rows: js.Array[PivotGroup] = null,
    source: GridRange = null,
    valueLayout: String = null,
    values: js.Array[PivotValue] = null
  ): PivotTable = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (valueLayout != null) __obj.updateDynamic("valueLayout")(valueLayout.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTable]
  }
}

