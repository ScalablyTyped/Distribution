package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryParameterType extends StObject {
  
  /**
    * [Optional] The type of the array's elements, if this is an array.
    */
  var arrayType: js.UndefOr[SchemaQueryParameterType] = js.undefined
  
  /**
    * [Optional] The types of the fields of this struct, in order, if this is a struct.
    */
  var structTypes: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * [Required] The top level type of this field.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryParameterType {
  
  inline def apply(): SchemaQueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameterType]
  }
  
  extension [Self <: SchemaQueryParameterType](x: Self) {
    
    inline def setArrayType(value: SchemaQueryParameterType): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
    
    inline def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
    
    inline def setStructTypes(value: js.Array[Description]): Self = StObject.set(x, "structTypes", value.asInstanceOf[js.Any])
    
    inline def setStructTypesNull: Self = StObject.set(x, "structTypes", null)
    
    inline def setStructTypesUndefined: Self = StObject.set(x, "structTypes", js.undefined)
    
    inline def setStructTypesVarargs(value: Description*): Self = StObject.set(x, "structTypes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
