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
  
  @scala.inline
  def apply(): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterType]
  }
  
  @scala.inline
  implicit class QueryParameterTypeMutableBuilder[Self <: QueryParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayType(value: QueryParameterType): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
    
    @scala.inline
    def setStructTypes(value: js.Array[QueryParameterTypeStructTypes]): Self = StObject.set(x, "structTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructTypesUndefined: Self = StObject.set(x, "structTypes", js.undefined)
    
    @scala.inline
    def setStructTypesVarargs(value: QueryParameterTypeStructTypes*): Self = StObject.set(x, "structTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
