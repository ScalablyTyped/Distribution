package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillPattern
  extends StObject
     with Fill {
  
  var bgColor: js.UndefOr[PartialColor] = js.undefined
  
  var fgColor: js.UndefOr[PartialColor] = js.undefined
  
  var pattern: FillPatterns
  
  var `type`: pattern
}
object FillPattern {
  
  inline def apply(pattern: FillPatterns): FillPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[FillPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillPattern] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: PartialColor): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setFgColor(value: PartialColor): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
    
    inline def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
    
    inline def setPattern(value: FillPatterns): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
