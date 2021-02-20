package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetProtection extends StObject {
  
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
  implicit class WorksheetProtectionMutableBuilder[Self <: WorksheetProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteColumns(value: Boolean): Self = StObject.set(x, "deleteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRows(value: Boolean): Self = StObject.set(x, "deleteRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatColumns(value: Boolean): Self = StObject.set(x, "formatColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatRows(value: Boolean): Self = StObject.set(x, "formatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertColumns(value: Boolean): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHyperlinks(value: Boolean): Self = StObject.set(x, "insertHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRows(value: Boolean): Self = StObject.set(x, "insertRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTables(value: Boolean): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarios(value: Boolean): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectLockedCells(value: Boolean): Self = StObject.set(x, "selectLockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUnlockedCells(value: Boolean): Self = StObject.set(x, "selectUnlockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
  }
}
