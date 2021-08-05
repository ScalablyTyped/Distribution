package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionPathValue extends StObject {
  
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.undefined
  
  var primitiveValue: js.UndefOr[String] = js.undefined
}
object ConversionPathValue {
  
  inline def apply(): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionPathValue]
  }
  
  extension [Self <: ConversionPathValue](x: Self) {
    
    inline def setConversionPathValue(value: js.Array[InteractionType]): Self = StObject.set(x, "conversionPathValue", value.asInstanceOf[js.Any])
    
    inline def setConversionPathValueUndefined: Self = StObject.set(x, "conversionPathValue", js.undefined)
    
    inline def setConversionPathValueVarargs(value: InteractionType*): Self = StObject.set(x, "conversionPathValue", js.Array(value :_*))
    
    inline def setPrimitiveValue(value: String): Self = StObject.set(x, "primitiveValue", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveValueUndefined: Self = StObject.set(x, "primitiveValue", js.undefined)
  }
}
