package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRowsCellsStyle extends js.Object {
  
  /** Specifies the background color of a cell in the Spreadsheet.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the font color of a cell in the Spreadsheet.
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the font weight of a cell in the Spreadsheet.
    */
  var fontWeight: js.UndefOr[String] = js.native
}
object SheetsRowsCellsStyle {
  
  @scala.inline
  def apply(): SheetsRowsCellsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsStyle]
  }
  
  @scala.inline
  implicit class SheetsRowsCellsStyleOps[Self <: SheetsRowsCellsStyle] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
  }
}
