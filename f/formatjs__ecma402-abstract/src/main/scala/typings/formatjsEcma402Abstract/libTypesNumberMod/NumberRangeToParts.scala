package typings.formatjsEcma402Abstract.libTypesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberRangeToParts
  extends StObject
     with NumberFormatPart {
  
  var result: String
}
object NumberRangeToParts {
  
  inline def apply(result: String, `type`: NumberFormatPartTypes, value: String): NumberRangeToParts = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberRangeToParts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberRangeToParts] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
