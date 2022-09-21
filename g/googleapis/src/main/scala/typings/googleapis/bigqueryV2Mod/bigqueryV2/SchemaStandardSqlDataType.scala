package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardSqlDataType extends StObject {
  
  /**
    * The type of the array's elements, if type_kind = "ARRAY".
    */
  var arrayElementType: js.UndefOr[SchemaStandardSqlDataType] = js.undefined
  
  /**
    * The fields of this struct, in order, if type_kind = "STRUCT".
    */
  var structType: js.UndefOr[SchemaStandardSqlStructType] = js.undefined
  
  /**
    * Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64", "DATE", "ARRAY").
    */
  var typeKind: js.UndefOr[String | Null] = js.undefined
}
object SchemaStandardSqlDataType {
  
  inline def apply(): SchemaStandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlDataType]
  }
  
  extension [Self <: SchemaStandardSqlDataType](x: Self) {
    
    inline def setArrayElementType(value: SchemaStandardSqlDataType): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    inline def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    inline def setStructType(value: SchemaStandardSqlStructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    inline def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
    
    inline def setTypeKind(value: String): Self = StObject.set(x, "typeKind", value.asInstanceOf[js.Any])
    
    inline def setTypeKindNull: Self = StObject.set(x, "typeKind", null)
    
    inline def setTypeKindUndefined: Self = StObject.set(x, "typeKind", js.undefined)
  }
}
