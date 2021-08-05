package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterType extends StObject {
  
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  
  var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryParameterType {
  
  inline def apply(): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterType]
  }
  
  extension [Self <: QueryParameterType](x: Self) {
    
    inline def setArrayType(value: QueryParameterType): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
    
    inline def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
    
    inline def setStructTypes(value: js.Array[QueryParameterTypeStructTypes]): Self = StObject.set(x, "structTypes", value.asInstanceOf[js.Any])
    
    inline def setStructTypesUndefined: Self = StObject.set(x, "structTypes", js.undefined)
    
    inline def setStructTypesVarargs(value: QueryParameterTypeStructTypes*): Self = StObject.set(x, "structTypes", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
