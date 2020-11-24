package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellModel extends js.Object {
  
  var address: Address = js.native
  
  var comment: Comment = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var hyperlink: js.UndefOr[String] = js.native
  
  var master: String = js.native
  
  var result: js.UndefOr[String | Double | js.Any] = js.native
  
  var sharedFormula: js.UndefOr[String] = js.native
  
  var style: Style = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: ValueType = js.native
  
  var value: js.UndefOr[CellValue] = js.native
}
object CellModel {
  
  @scala.inline
  def apply(address: Address, comment: Comment, master: String, style: Style, `type`: ValueType): CellModel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellModel]
  }
  
  @scala.inline
  implicit class CellModelOps[Self <: CellModel] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster(value: String): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ValueType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setResult(value: String | Double | js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSharedFormula(value: String): Self = this.set("sharedFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedFormula: Self = this.set("sharedFormula", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: CellValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
