package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAvroOptions extends StObject {
  
  /**
    * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
    */
  var useAvroLogicalTypes: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAvroOptions {
  
  inline def apply(): SchemaAvroOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvroOptions]
  }
  
  extension [Self <: SchemaAvroOptions](x: Self) {
    
    inline def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    inline def setUseAvroLogicalTypesNull: Self = StObject.set(x, "useAvroLogicalTypes", null)
    
    inline def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
  }
}
