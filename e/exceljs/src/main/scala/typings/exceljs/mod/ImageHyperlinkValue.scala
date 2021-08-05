package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHyperlinkValue extends StObject {
  
  var hyperlink: String
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object ImageHyperlinkValue {
  
  inline def apply(hyperlink: String): ImageHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageHyperlinkValue]
  }
  
  extension [Self <: ImageHyperlinkValue](x: Self) {
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
