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
    val __obj = js.Dynamic.literal(autoFilter = autoFilter, deleteColumns = deleteColumns, deleteRows = deleteRows, formatCells = formatCells, formatColumns = formatColumns, formatRows = formatRows, insertColumns = insertColumns, insertHyperlinks = insertHyperlinks, insertRows = insertRows, objects = objects, pivotTables = pivotTables, scenarios = scenarios, selectLockedCells = selectLockedCells, selectUnlockedCells = selectUnlockedCells, sort = sort)
  
    __obj.asInstanceOf[WorksheetProtection]
  }
}

