package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaDataDataTable extends js.Object {
  
  var cols: js.UndefOr[js.Array[GaDataDataTableCols]] = js.native
  
  var rows: js.UndefOr[js.Array[GaDataDataTableRows]] = js.native
}
object GaDataDataTable {
  
  @scala.inline
  def apply(): GaDataDataTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaDataDataTable]
  }
  
  @scala.inline
  implicit class GaDataDataTableOps[Self <: GaDataDataTable] (val x: Self) extends AnyVal {
    
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
    def setColsVarargs(value: GaDataDataTableCols*): Self = this.set("cols", js.Array(value :_*))
    
    @scala.inline
    def setCols(value: js.Array[GaDataDataTableCols]): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GaDataDataTableRows*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[GaDataDataTableRows]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
