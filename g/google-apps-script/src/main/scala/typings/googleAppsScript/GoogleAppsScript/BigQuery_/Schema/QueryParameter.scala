package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameter extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var parameterType: js.UndefOr[QueryParameterType] = js.undefined
  
  var parameterValue: js.UndefOr[QueryParameterValue] = js.undefined
}
object QueryParameter {
  
  inline def apply(): QueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameter]
  }
  
  extension [Self <: QueryParameter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterType(value: QueryParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
    
    inline def setParameterValue(value: QueryParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
