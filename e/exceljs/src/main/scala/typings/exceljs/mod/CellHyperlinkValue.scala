package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellHyperlinkValue extends _CellValue {
  
  var hyperlink: String = js.native
  
  var text: String = js.native
}
object CellHyperlinkValue {
  
  @scala.inline
  def apply(hyperlink: String, text: String): CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHyperlinkValue]
  }
  
  @scala.inline
  implicit class CellHyperlinkValueMutableBuilder[Self <: CellHyperlinkValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
