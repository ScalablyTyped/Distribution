package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellRichTextValue
  extends StObject
     with _CellValue {
  
  var richText: js.Array[RichText]
}
object CellRichTextValue {
  
  inline def apply(richText: js.Array[RichText]): CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRichTextValue]
  }
  
  extension [Self <: CellRichTextValue](x: Self) {
    
    inline def setRichText(value: js.Array[RichText]): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    inline def setRichTextVarargs(value: RichText*): Self = StObject.set(x, "richText", js.Array(value*))
  }
}
