package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.WorksheetProtection> */
trait PartialWorksheetProtectio extends js.Object {
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  var deleteColumns: js.UndefOr[Boolean] = js.undefined
  var deleteRows: js.UndefOr[Boolean] = js.undefined
  var formatCells: js.UndefOr[Boolean] = js.undefined
  var formatColumns: js.UndefOr[Boolean] = js.undefined
  var formatRows: js.UndefOr[Boolean] = js.undefined
  var insertColumns: js.UndefOr[Boolean] = js.undefined
  var insertHyperlinks: js.UndefOr[Boolean] = js.undefined
  var insertRows: js.UndefOr[Boolean] = js.undefined
  var objects: js.UndefOr[Boolean] = js.undefined
  var pivotTables: js.UndefOr[Boolean] = js.undefined
  var scenarios: js.UndefOr[Boolean] = js.undefined
  var selectLockedCells: js.UndefOr[Boolean] = js.undefined
  var selectUnlockedCells: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object PartialWorksheetProtectio {
  @scala.inline
  def apply(
    autoFilter: js.UndefOr[Boolean] = js.undefined,
    deleteColumns: js.UndefOr[Boolean] = js.undefined,
    deleteRows: js.UndefOr[Boolean] = js.undefined,
    formatCells: js.UndefOr[Boolean] = js.undefined,
    formatColumns: js.UndefOr[Boolean] = js.undefined,
    formatRows: js.UndefOr[Boolean] = js.undefined,
    insertColumns: js.UndefOr[Boolean] = js.undefined,
    insertHyperlinks: js.UndefOr[Boolean] = js.undefined,
    insertRows: js.UndefOr[Boolean] = js.undefined,
    objects: js.UndefOr[Boolean] = js.undefined,
    pivotTables: js.UndefOr[Boolean] = js.undefined,
    scenarios: js.UndefOr[Boolean] = js.undefined,
    selectLockedCells: js.UndefOr[Boolean] = js.undefined,
    selectUnlockedCells: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): PartialWorksheetProtectio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFilter)) __obj.updateDynamic("autoFilter")(autoFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteColumns)) __obj.updateDynamic("deleteColumns")(deleteColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRows)) __obj.updateDynamic("deleteRows")(deleteRows.asInstanceOf[js.Any])
    if (!js.isUndefined(formatCells)) __obj.updateDynamic("formatCells")(formatCells.asInstanceOf[js.Any])
    if (!js.isUndefined(formatColumns)) __obj.updateDynamic("formatColumns")(formatColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(formatRows)) __obj.updateDynamic("formatRows")(formatRows.asInstanceOf[js.Any])
    if (!js.isUndefined(insertColumns)) __obj.updateDynamic("insertColumns")(insertColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(insertHyperlinks)) __obj.updateDynamic("insertHyperlinks")(insertHyperlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRows)) __obj.updateDynamic("insertRows")(insertRows.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotTables)) __obj.updateDynamic("pivotTables")(pivotTables.asInstanceOf[js.Any])
    if (!js.isUndefined(scenarios)) __obj.updateDynamic("scenarios")(scenarios.asInstanceOf[js.Any])
    if (!js.isUndefined(selectLockedCells)) __obj.updateDynamic("selectLockedCells")(selectLockedCells.asInstanceOf[js.Any])
    if (!js.isUndefined(selectUnlockedCells)) __obj.updateDynamic("selectUnlockedCells")(selectUnlockedCells.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWorksheetProtectio]
  }
}

