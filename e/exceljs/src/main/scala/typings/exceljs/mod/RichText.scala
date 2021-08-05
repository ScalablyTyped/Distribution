package typings.exceljs.mod

import typings.exceljs.anon.PartialFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichText extends StObject {
  
  var font: js.UndefOr[PartialFont] = js.undefined
  
  var text: String
}
object RichText {
  
  inline def apply(text: String): RichText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichText]
  }
  
  extension [Self <: RichText](x: Self) {
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
