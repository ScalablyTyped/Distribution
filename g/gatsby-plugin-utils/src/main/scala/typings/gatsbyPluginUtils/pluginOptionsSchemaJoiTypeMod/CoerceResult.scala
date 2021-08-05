package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceResult extends StObject {
  
  var errors: js.UndefOr[js.Array[ErrorReport]] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object CoerceResult {
  
  inline def apply(): CoerceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoerceResult]
  }
  
  extension [Self <: CoerceResult](x: Self) {
    
    inline def setErrors(value: js.Array[ErrorReport]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorReport*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
