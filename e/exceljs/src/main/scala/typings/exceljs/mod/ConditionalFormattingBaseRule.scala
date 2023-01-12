package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingBaseRule extends StObject {
  
  var priority: Double
  
  var style: js.UndefOr[PartialStyle] = js.undefined
}
object ConditionalFormattingBaseRule {
  
  inline def apply(priority: Double): ConditionalFormattingBaseRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingBaseRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingBaseRule] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: PartialStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
