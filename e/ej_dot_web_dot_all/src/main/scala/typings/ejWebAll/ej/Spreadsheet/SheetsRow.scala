package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRow extends js.Object {
  
  /** Specifies the cells of a row in Spreadsheet.
    * @Default {[]}
    */
  var cells: js.UndefOr[js.Array[SheetsRowsCell]] = js.native
  
  /** Gets or sets the height of a row in Spreadsheet.
    * @Default {20}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Gets or sets the index of a row in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.native
}
object SheetsRow {
  
  @scala.inline
  def apply(): SheetsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRow]
  }
  
  @scala.inline
  implicit class SheetsRowOps[Self <: SheetsRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: SheetsRowsCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[SheetsRowsCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
