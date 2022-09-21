package typings.googleapis.anon

import typings.googleapis.reportsV1Mod.adminReportsV1.SchemaNestedParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  var parameter: js.UndefOr[js.Array[SchemaNestedParameter]] = js.undefined
}
object Parameter {
  
  inline def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setParameter(value: js.Array[SchemaNestedParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SchemaNestedParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
  }
}
