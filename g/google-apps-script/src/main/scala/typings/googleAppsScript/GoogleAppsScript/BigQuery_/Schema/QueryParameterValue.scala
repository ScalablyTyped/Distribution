package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterValue extends StObject {
  
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
  
  var structValues: js.UndefOr[js.Object] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object QueryParameterValue {
  
  @scala.inline
  def apply(): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterValue]
  }
  
  @scala.inline
  implicit class QueryParameterValueMutableBuilder[Self <: QueryParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValues(value: js.Array[QueryParameterValue]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    @scala.inline
    def setArrayValuesVarargs(value: QueryParameterValue*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setStructValues(value: js.Object): Self = StObject.set(x, "structValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructValuesUndefined: Self = StObject.set(x, "structValues", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
