package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRowsCellsHyperlink extends js.Object {
  
  /** Specifies the cell address for the hyperlink of a cell.
    */
  var cellAddr: js.UndefOr[String] = js.native
  
  /** Specifies the sheet index to which the cell is referred.
    * @Default {1}
    */
  var sheetIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the web address for the hyperlink of a cell.
    */
  var webAddr: js.UndefOr[String] = js.native
}
object SheetsRowsCellsHyperlink {
  
  @scala.inline
  def apply(): SheetsRowsCellsHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsHyperlink]
  }
  
  @scala.inline
  implicit class SheetsRowsCellsHyperlinkOps[Self <: SheetsRowsCellsHyperlink] (val x: Self) extends AnyVal {
    
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
    def setCellAddr(value: String): Self = this.set("cellAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAddr: Self = this.set("cellAddr", js.undefined)
    
    @scala.inline
    def setSheetIndex(value: Double): Self = this.set("sheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIndex: Self = this.set("sheetIndex", js.undefined)
    
    @scala.inline
    def setWebAddr(value: String): Self = this.set("webAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAddr: Self = this.set("webAddr", js.undefined)
  }
}
