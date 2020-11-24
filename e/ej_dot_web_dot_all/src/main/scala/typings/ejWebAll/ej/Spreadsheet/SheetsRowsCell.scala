package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRowsCell extends js.Object {
  
  /** Specifies the comment for a cell in Spreadsheet.
    * @Default {null}
    */
  var comment: js.UndefOr[SheetsRowsCellsComment] = js.native
  
  /** Specifies the format of a cell in Spreadsheet.
    * @Default {null}
    */
  var format: js.UndefOr[SheetsRowsCellsFormat] = js.native
  
  /** Specifies the hyperlink for a cell in Spreadsheet.
    * @Default {null}
    */
  var hyperlink: js.UndefOr[SheetsRowsCellsHyperlink] = js.native
  
  /** Specifies the index of a cell in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.native
  
  /** Specifies whether to lock or unlock a particular cell.
    * @Default {false}
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  
  /** Specifies the styles of a cell in Spreadsheet.
    * @Default {null}
    */
  var style: js.UndefOr[SheetsRowsCellsStyle] = js.native
  
  /** Specifies the value for a cell in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.native
}
object SheetsRowsCell {
  
  @scala.inline
  def apply(): SheetsRowsCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCell]
  }
  
  @scala.inline
  implicit class SheetsRowsCellOps[Self <: SheetsRowsCell] (val x: Self) extends AnyVal {
    
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
    def setComment(value: SheetsRowsCellsComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setFormat(value: SheetsRowsCellsFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHyperlink(value: SheetsRowsCellsHyperlink): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setStyle(value: SheetsRowsCellsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
