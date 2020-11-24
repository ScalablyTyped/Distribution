package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  sheetName :string,   row :number,   col :number}> */
@js.native
trait PartialsheetNamestringrow extends js.Object {
  
  var col: js.UndefOr[Double] = js.native
  
  var row: js.UndefOr[Double] = js.native
  
  var sheetName: js.UndefOr[String] = js.native
}
object PartialsheetNamestringrow {
  
  @scala.inline
  def apply(): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
  
  @scala.inline
  implicit class PartialsheetNamestringrowOps[Self <: PartialsheetNamestringrow] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
  }
}
