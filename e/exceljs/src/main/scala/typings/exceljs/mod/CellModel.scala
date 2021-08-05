package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellModel extends StObject {
  
  var address: Address
  
  var comment: Comment
  
  var formula: js.UndefOr[String] = js.undefined
  
  var hyperlink: js.UndefOr[String] = js.undefined
  
  var master: String
  
  var result: js.UndefOr[String | Double | js.Any] = js.undefined
  
  var sharedFormula: js.UndefOr[String] = js.undefined
  
  var style: Style
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: ValueType
  
  var value: js.UndefOr[CellValue] = js.undefined
}
object CellModel {
  
  inline def apply(address: Address, comment: Comment, master: String, style: Style, `type`: ValueType): CellModel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellModel]
  }
  
  extension [Self <: CellModel](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setMaster(value: String): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String | Double | js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSharedFormula(value: String): Self = StObject.set(x, "sharedFormula", value.asInstanceOf[js.Any])
    
    inline def setSharedFormulaUndefined: Self = StObject.set(x, "sharedFormula", js.undefined)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: ValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CellValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
