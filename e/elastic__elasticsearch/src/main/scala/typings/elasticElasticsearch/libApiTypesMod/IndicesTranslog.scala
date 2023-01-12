package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesTranslog extends StObject {
  
  var durability: js.UndefOr[IndicesTranslogDurability] = js.undefined
  
  var flush_threshold_size: js.UndefOr[ByteSize] = js.undefined
  
  var retention: js.UndefOr[IndicesTranslogRetention] = js.undefined
  
  var sync_interval: js.UndefOr[Duration] = js.undefined
}
object IndicesTranslog {
  
  inline def apply(): IndicesTranslog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesTranslog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesTranslog] (val x: Self) extends AnyVal {
    
    inline def setDurability(value: IndicesTranslogDurability): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    inline def setFlush_threshold_size(value: ByteSize): Self = StObject.set(x, "flush_threshold_size", value.asInstanceOf[js.Any])
    
    inline def setFlush_threshold_sizeUndefined: Self = StObject.set(x, "flush_threshold_size", js.undefined)
    
    inline def setRetention(value: IndicesTranslogRetention): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setSync_interval(value: Duration): Self = StObject.set(x, "sync_interval", value.asInstanceOf[js.Any])
    
    inline def setSync_intervalUndefined: Self = StObject.set(x, "sync_interval", js.undefined)
  }
}
