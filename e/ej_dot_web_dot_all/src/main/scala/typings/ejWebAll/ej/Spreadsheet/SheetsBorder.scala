package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsBorder extends js.Object {
  
  /** Specifies border color for range of cells in Spreadsheet.
    */
  var color: js.UndefOr[String] = js.native
  
  /** To apply border for the specified range of cell.
    */
  var range: js.UndefOr[String] = js.native
  
  /** Specifies border type in the Spreadsheet.
    */
  var `type`: js.UndefOr[BorderType | String] = js.native
}
object SheetsBorder {
  
  @scala.inline
  def apply(): SheetsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsBorder]
  }
  
  @scala.inline
  implicit class SheetsBorderOps[Self <: SheetsBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setType(value: BorderType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
