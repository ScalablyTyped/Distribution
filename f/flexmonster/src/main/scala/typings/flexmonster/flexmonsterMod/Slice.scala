package typings.flexmonster.flexmonsterMod

import typings.flexmonster.Anon_Column
import typings.flexmonster.Anon_ColumnsDrillAll
import typings.flexmonster.Anon_ColumnsExpandAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slice extends js.Object {
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var drillThrough: js.UndefOr[js.Array[String]] = js.undefined
  var drills: js.UndefOr[Anon_ColumnsDrillAll] = js.undefined
  var expands: js.UndefOr[Anon_ColumnsExpandAll] = js.undefined
  var measures: js.UndefOr[js.Array[Measure]] = js.undefined
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var sorting: js.UndefOr[Anon_Column] = js.undefined
}

object Slice {
  @scala.inline
  def apply(
    columns: js.Array[Hierarchy] = null,
    drillThrough: js.Array[String] = null,
    drills: Anon_ColumnsDrillAll = null,
    expands: Anon_ColumnsExpandAll = null,
    measures: js.Array[Measure] = null,
    reportFilters: js.Array[Hierarchy] = null,
    rows: js.Array[Hierarchy] = null,
    sorting: Anon_Column = null
  ): Slice = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(drillThrough.asInstanceOf[js.Any])
    if (drills != null) __obj.updateDynamic("drills")(drills.asInstanceOf[js.Any])
    if (expands != null) __obj.updateDynamic("expands")(expands.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (reportFilters != null) __obj.updateDynamic("reportFilters")(reportFilters.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
}

