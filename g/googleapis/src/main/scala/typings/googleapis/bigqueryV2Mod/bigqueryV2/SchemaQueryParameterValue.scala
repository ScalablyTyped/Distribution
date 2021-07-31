package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryParameterValue extends StObject {
  
  /**
    * [Optional] The array values, if this is an array type.
    */
  var arrayValues: js.UndefOr[js.Array[SchemaQueryParameterValue]] = js.undefined
  
  /**
    * [Optional] The struct field values, in order of the struct type&#39;s
    * declaration.
    */
  var structValues: js.UndefOr[StringDictionary[SchemaQueryParameterValue]] = js.undefined
  
  /**
    * [Optional] The value of this value, if a simple scalar type.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaQueryParameterValue {
  
  @scala.inline
  def apply(): SchemaQueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameterValue]
  }
  
  @scala.inline
  implicit class SchemaQueryParameterValueMutableBuilder[Self <: SchemaQueryParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValues(value: js.Array[SchemaQueryParameterValue]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    @scala.inline
    def setArrayValuesVarargs(value: SchemaQueryParameterValue*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setStructValues(value: StringDictionary[SchemaQueryParameterValue]): Self = StObject.set(x, "structValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructValuesUndefined: Self = StObject.set(x, "structValues", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
