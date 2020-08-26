package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetProtection extends js.Object {
  var autoFilter: Boolean = js.native
  var deleteColumns: Boolean = js.native
  var deleteRows: Boolean = js.native
  var formatCells: Boolean = js.native
  var formatColumns: Boolean = js.native
  var formatRows: Boolean = js.native
  var insertColumns: Boolean = js.native
  var insertHyperlinks: Boolean = js.native
  var insertRows: Boolean = js.native
  var objects: Boolean = js.native
  var pivotTables: Boolean = js.native
  var scenarios: Boolean = js.native
  var selectLockedCells: Boolean = js.native
  var selectUnlockedCells: Boolean = js.native
  var sort: Boolean = js.native
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
  @scala.inline
  implicit class WorksheetProtectionOps[Self <: WorksheetProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFilter(value: Boolean): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteColumns(value: Boolean): Self = this.set("deleteColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteRows(value: Boolean): Self = this.set("deleteRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatCells(value: Boolean): Self = this.set("formatCells", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatColumns(value: Boolean): Self = this.set("formatColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatRows(value: Boolean): Self = this.set("formatRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertColumns(value: Boolean): Self = this.set("insertColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertHyperlinks(value: Boolean): Self = this.set("insertHyperlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertRows(value: Boolean): Self = this.set("insertRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotTables(value: Boolean): Self = this.set("pivotTables", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenarios(value: Boolean): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectLockedCells(value: Boolean): Self = this.set("selectLockedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectUnlockedCells(value: Boolean): Self = this.set("selectUnlockedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
  }
  
}

