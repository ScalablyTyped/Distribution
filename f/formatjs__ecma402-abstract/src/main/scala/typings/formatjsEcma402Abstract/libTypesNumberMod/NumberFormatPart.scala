package typings.formatjsEcma402Abstract.libTypesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatPart extends StObject {
  
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: NumberFormatPartTypes
  
  var value: String
}
object NumberFormatPart {
  
  inline def apply(`type`: NumberFormatPartTypes, value: String): NumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatPart]
  }
  
  extension [Self <: NumberFormatPart](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: NumberFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
