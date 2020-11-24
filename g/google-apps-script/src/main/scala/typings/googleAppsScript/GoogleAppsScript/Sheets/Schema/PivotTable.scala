package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTable extends js.Object {
  
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.native
  
  var criteria: js.UndefOr[js.Object] = js.native
  
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.native
  
  var source: js.UndefOr[GridRange] = js.native
  
  var valueLayout: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Array[PivotValue]] = js.native
}
object PivotTable {
  
  @scala.inline
  def apply(): PivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTable]
  }
  
  @scala.inline
  implicit class PivotTableOps[Self <: PivotTable] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: PivotGroup*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[PivotGroup]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCriteria(value: js.Object): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: PivotGroup*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[PivotGroup]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSource(value: GridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setValueLayout(value: String): Self = this.set("valueLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLayout: Self = this.set("valueLayout", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PivotValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[PivotValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
