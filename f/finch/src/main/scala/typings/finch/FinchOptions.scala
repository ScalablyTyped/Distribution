package typings.finch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinchOptions extends StObject {
  
  var CoerceParameterTypes: js.UndefOr[Boolean] = js.undefined
}
object FinchOptions {
  
  inline def apply(): FinchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinchOptions]
  }
  
  extension [Self <: FinchOptions](x: Self) {
    
    inline def setCoerceParameterTypes(value: Boolean): Self = StObject.set(x, "CoerceParameterTypes", value.asInstanceOf[js.Any])
    
    inline def setCoerceParameterTypesUndefined: Self = StObject.set(x, "CoerceParameterTypes", js.undefined)
  }
}
