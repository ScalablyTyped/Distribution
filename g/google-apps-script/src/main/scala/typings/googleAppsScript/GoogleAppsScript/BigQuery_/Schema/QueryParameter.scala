package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameter extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var parameterType: js.UndefOr[QueryParameterType] = js.native
  
  var parameterValue: js.UndefOr[QueryParameterValue] = js.native
}
object QueryParameter {
  
  @scala.inline
  def apply(): QueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameter]
  }
  
  @scala.inline
  implicit class QueryParameterMutableBuilder[Self <: QueryParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameterType(value: QueryParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
    
    @scala.inline
    def setParameterValue(value: QueryParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
