package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardSqlStructType extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.undefined
}
object SchemaStandardSqlStructType {
  
  inline def apply(): SchemaStandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlStructType]
  }
  
  extension [Self <: SchemaStandardSqlStructType](x: Self) {
    
    inline def setFields(value: js.Array[SchemaStandardSqlField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaStandardSqlField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
