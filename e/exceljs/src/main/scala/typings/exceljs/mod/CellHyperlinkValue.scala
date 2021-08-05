package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellHyperlinkValue
  extends StObject
     with _CellValue {
  
  var hyperlink: String
  
  var text: String
}
object CellHyperlinkValue {
  
  inline def apply(hyperlink: String, text: String): CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHyperlinkValue]
  }
  
  extension [Self <: CellHyperlinkValue](x: Self) {
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
