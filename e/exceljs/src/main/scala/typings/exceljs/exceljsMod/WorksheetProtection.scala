package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetProtection extends js.Object {
  var autoFilter: Boolean
  var deleteColumns: Boolean
  var deleteRows: Boolean
  var formatCells: Boolean
  var formatColumns: Boolean
  var formatRows: Boolean
  var insertColumns: Boolean
  var insertHyperlinks: Boolean
  var insertRows: Boolean
  var objects: Boolean
  var pivotTables: Boolean
  var scenarios: Boolean
  var selectLockedCells: Boolean
  var selectUnlockedCells: Boolean
  var sort: Boolean
}

object WorksheetProtection {
  @scala.inline
  def apply(
    autoFilter: Boolean,
    deleteColumns: Boolean,
    deleteRows: Boolean,
    formatCells: Boolean,
    formatColumns: Boolean,
    formatRows: Boolean,
    insertColumns: Boolean,
    insertHyperlinks: Boolean,
    insertRows: Boolean,
    objects: Boolean,
    pivotTables: Boolean,
    scenarios: Boolean,
    selectLockedCells: Boolean,
    selectUnlockedCells: Boolean,
    sort: Boolean
  ): WorksheetProtection = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], deleteColumns = deleteColumns.asInstanceOf[js.Any], deleteRows = deleteRows.asInstanceOf[js.Any], formatCells = formatCells.asInstanceOf[js.Any], formatColumns = formatColumns.asInstanceOf[js.Any], formatRows = formatRows.asInstanceOf[js.Any], insertColumns = insertColumns.asInstanceOf[js.Any], insertHyperlinks = insertHyperlinks.asInstanceOf[js.Any], insertRows = insertRows.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], pivotTables = pivotTables.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], selectLockedCells = selectLockedCells.asInstanceOf[js.Any], selectUnlockedCells = selectUnlockedCells.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorksheetProtection]
  }
}

