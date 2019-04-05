package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTable extends js.Object {
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  var criteria: js.UndefOr[js.Object] = js.undefined
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
  var valueLayout: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[PivotValue]] = js.undefined
}

object PivotTable {
  @scala.inline
  def apply(
    columns: js.Array[PivotGroup] = null,
    criteria: js.Object = null,
    rows: js.Array[PivotGroup] = null,
    source: GridRange = null,
    valueLayout: java.lang.String = null,
    values: js.Array[PivotValue] = null
  ): PivotTable = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (source != null) __obj.updateDynamic("source")(source)
    if (valueLayout != null) __obj.updateDynamic("valueLayout")(valueLayout)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PivotTable]
  }
}

