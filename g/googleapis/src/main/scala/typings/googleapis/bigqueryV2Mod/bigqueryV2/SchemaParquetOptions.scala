package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParquetOptions extends StObject {
  
  /**
    * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
    */
  var enableListInference: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
    */
  var enumAsString: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaParquetOptions {
  
  inline def apply(): SchemaParquetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParquetOptions]
  }
  
  extension [Self <: SchemaParquetOptions](x: Self) {
    
    inline def setEnableListInference(value: Boolean): Self = StObject.set(x, "enableListInference", value.asInstanceOf[js.Any])
    
    inline def setEnableListInferenceNull: Self = StObject.set(x, "enableListInference", null)
    
    inline def setEnableListInferenceUndefined: Self = StObject.set(x, "enableListInference", js.undefined)
    
    inline def setEnumAsString(value: Boolean): Self = StObject.set(x, "enumAsString", value.asInstanceOf[js.Any])
    
    inline def setEnumAsStringNull: Self = StObject.set(x, "enumAsString", null)
    
    inline def setEnumAsStringUndefined: Self = StObject.set(x, "enumAsString", js.undefined)
  }
}
