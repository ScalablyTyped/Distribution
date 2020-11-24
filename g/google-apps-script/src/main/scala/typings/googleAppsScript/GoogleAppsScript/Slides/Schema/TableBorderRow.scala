package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderRow extends js.Object {
  
  var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.native
}
object TableBorderRow {
  
  @scala.inline
  def apply(): TableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderRow]
  }
  
  @scala.inline
  implicit class TableBorderRowOps[Self <: TableBorderRow] (val x: Self) extends AnyVal {
    
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
    def setTableBorderCellsVarargs(value: TableBorderCell*): Self = this.set("tableBorderCells", js.Array(value :_*))
    
    @scala.inline
    def setTableBorderCells(value: js.Array[TableBorderCell]): Self = this.set("tableBorderCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderCells: Self = this.set("tableBorderCells", js.undefined)
  }
}
