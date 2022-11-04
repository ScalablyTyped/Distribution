package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRolloverRolloverConditions extends StObject {
  
  var max_age: js.UndefOr[Duration] = js.undefined
  
  var max_age_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var max_docs: js.UndefOr[long] = js.undefined
  
  var max_primary_shard_docs: js.UndefOr[long] = js.undefined
  
  var max_primary_shard_size: js.UndefOr[ByteSize] = js.undefined
  
  var max_size: js.UndefOr[ByteSize] = js.undefined
  
  var max_size_bytes: js.UndefOr[ByteSize] = js.undefined
  
  var min_age: js.UndefOr[Duration] = js.undefined
  
  var min_docs: js.UndefOr[long] = js.undefined
  
  var min_primary_shard_docs: js.UndefOr[long] = js.undefined
  
  var min_primary_shard_size: js.UndefOr[ByteSize] = js.undefined
  
  var min_size: js.UndefOr[ByteSize] = js.undefined
}
object IndicesRolloverRolloverConditions {
  
  inline def apply(): IndicesRolloverRolloverConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRolloverRolloverConditions]
  }
  
  extension [Self <: IndicesRolloverRolloverConditions](x: Self) {
    
    inline def setMax_age(value: Duration): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    inline def setMax_age_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "max_age_millis", value.asInstanceOf[js.Any])
    
    inline def setMax_age_millisUndefined: Self = StObject.set(x, "max_age_millis", js.undefined)
    
    inline def setMax_docs(value: long): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    inline def setMax_primary_shard_docs(value: long): Self = StObject.set(x, "max_primary_shard_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_primary_shard_docsUndefined: Self = StObject.set(x, "max_primary_shard_docs", js.undefined)
    
    inline def setMax_primary_shard_size(value: ByteSize): Self = StObject.set(x, "max_primary_shard_size", value.asInstanceOf[js.Any])
    
    inline def setMax_primary_shard_sizeUndefined: Self = StObject.set(x, "max_primary_shard_size", js.undefined)
    
    inline def setMax_size(value: ByteSize): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
    
    inline def setMax_sizeUndefined: Self = StObject.set(x, "max_size", js.undefined)
    
    inline def setMax_size_bytes(value: ByteSize): Self = StObject.set(x, "max_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_size_bytesUndefined: Self = StObject.set(x, "max_size_bytes", js.undefined)
    
    inline def setMin_age(value: Duration): Self = StObject.set(x, "min_age", value.asInstanceOf[js.Any])
    
    inline def setMin_ageUndefined: Self = StObject.set(x, "min_age", js.undefined)
    
    inline def setMin_docs(value: long): Self = StObject.set(x, "min_docs", value.asInstanceOf[js.Any])
    
    inline def setMin_docsUndefined: Self = StObject.set(x, "min_docs", js.undefined)
    
    inline def setMin_primary_shard_docs(value: long): Self = StObject.set(x, "min_primary_shard_docs", value.asInstanceOf[js.Any])
    
    inline def setMin_primary_shard_docsUndefined: Self = StObject.set(x, "min_primary_shard_docs", js.undefined)
    
    inline def setMin_primary_shard_size(value: ByteSize): Self = StObject.set(x, "min_primary_shard_size", value.asInstanceOf[js.Any])
    
    inline def setMin_primary_shard_sizeUndefined: Self = StObject.set(x, "min_primary_shard_size", js.undefined)
    
    inline def setMin_size(value: ByteSize): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
    
    inline def setMin_sizeUndefined: Self = StObject.set(x, "min_size", js.undefined)
  }
}
