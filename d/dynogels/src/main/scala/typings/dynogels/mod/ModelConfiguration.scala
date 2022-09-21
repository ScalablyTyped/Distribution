package typings.dynogels.mod

import typings.joi.mod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelConfiguration extends StObject {
  
  var createdAt: js.UndefOr[Boolean | String] = js.undefined
  
  var hashKey: String
  
  var indexes: js.UndefOr[js.Array[Any]] = js.undefined
  
  var log: js.UndefOr[Log_] = js.undefined
  
  var rangeKey: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var tableName: js.UndefOr[String | tableResolve] = js.undefined
  
  var timestamps: js.UndefOr[Boolean] = js.undefined
  
  var updatedAt: js.UndefOr[Boolean | String] = js.undefined
  
  var validation: js.UndefOr[ValidationOptions] = js.undefined
}
object ModelConfiguration {
  
  inline def apply(hashKey: String): ModelConfiguration = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelConfiguration]
  }
  
  extension [Self <: ModelConfiguration](x: Self) {
    
    inline def setCreatedAt(value: Boolean | String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: js.Array[Any]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: Any*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setLog(value: Log_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTableName(value: String | tableResolve): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameFunction0(value: () => String): Self = StObject.set(x, "tableName", js.Any.fromFunction0(value))
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setUpdatedAt(value: Boolean | String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setValidation(value: ValidationOptions): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
