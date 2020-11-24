package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends js.Object {
  
  var columns: js.UndefOr[Double] = js.native
  
  var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.native
  
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.native
  
  var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setHorizontalBorderRowsVarargs(value: TableBorderRow*): Self = this.set("horizontalBorderRows", js.Array(value :_*))
    
    @scala.inline
    def setHorizontalBorderRows(value: js.Array[TableBorderRow]): Self = this.set("horizontalBorderRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalBorderRows: Self = this.set("horizontalBorderRows", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTableColumnsVarargs(value: TableColumnProperties*): Self = this.set("tableColumns", js.Array(value :_*))
    
    @scala.inline
    def setTableColumns(value: js.Array[TableColumnProperties]): Self = this.set("tableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableColumns: Self = this.set("tableColumns", js.undefined)
    
    @scala.inline
    def setTableRowsVarargs(value: TableRow*): Self = this.set("tableRows", js.Array(value :_*))
    
    @scala.inline
    def setTableRows(value: js.Array[TableRow]): Self = this.set("tableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRows: Self = this.set("tableRows", js.undefined)
    
    @scala.inline
    def setVerticalBorderRowsVarargs(value: TableBorderRow*): Self = this.set("verticalBorderRows", js.Array(value :_*))
    
    @scala.inline
    def setVerticalBorderRows(value: js.Array[TableBorderRow]): Self = this.set("verticalBorderRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalBorderRows: Self = this.set("verticalBorderRows", js.undefined)
  }
}
