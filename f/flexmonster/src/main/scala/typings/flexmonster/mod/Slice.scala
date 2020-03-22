package typings.flexmonster.mod

import typings.flexmonster.AnonColumn
import typings.flexmonster.AnonDrillAll
import typings.flexmonster.AnonExpandAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slice extends js.Object {
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var drillThrough: js.UndefOr[js.Array[String]] = js.undefined
  var drills: js.UndefOr[AnonDrillAll] = js.undefined
  var expands: js.UndefOr[AnonExpandAll] = js.undefined
  var flatOrder: js.UndefOr[js.Array[String]] = js.undefined
  var measures: js.UndefOr[js.Array[Measure]] = js.undefined
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  var sorting: js.UndefOr[AnonColumn] = js.undefined
}

object Slice {
  @scala.inline
  def apply(
    columns: js.Array[Hierarchy] = null,
    drillThrough: js.Array[String] = null,
    drills: AnonDrillAll = null,
    expands: AnonExpandAll = null,
    flatOrder: js.Array[String] = null,
    measures: js.Array[Measure] = null,
    reportFilters: js.Array[Hierarchy] = null,
    rows: js.Array[Hierarchy] = null,
    sorting: AnonColumn = null
  ): Slice = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(drillThrough.asInstanceOf[js.Any])
    if (drills != null) __obj.updateDynamic("drills")(drills.asInstanceOf[js.Any])
    if (expands != null) __obj.updateDynamic("expands")(expands.asInstanceOf[js.Any])
    if (flatOrder != null) __obj.updateDynamic("flatOrder")(flatOrder.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (reportFilters != null) __obj.updateDynamic("reportFilters")(reportFilters.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
}

