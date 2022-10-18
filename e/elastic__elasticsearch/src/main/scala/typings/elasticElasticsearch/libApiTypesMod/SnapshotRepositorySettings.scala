package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRepositorySettings extends StObject {
  
  var chunk_size: js.UndefOr[String] = js.undefined
  
  var compress: js.UndefOr[String | Boolean] = js.undefined
  
  var concurrent_streams: js.UndefOr[String | integer] = js.undefined
  
  var location: String
  
  var read_only: js.UndefOr[String | Boolean] = js.undefined
  
  var readonly: js.UndefOr[String | Boolean] = js.undefined
}
object SnapshotRepositorySettings {
  
  inline def apply(location: String): SnapshotRepositorySettings = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRepositorySettings]
  }
  
  extension [Self <: SnapshotRepositorySettings](x: Self) {
    
    inline def setChunk_size(value: String): Self = StObject.set(x, "chunk_size", value.asInstanceOf[js.Any])
    
    inline def setChunk_sizeUndefined: Self = StObject.set(x, "chunk_size", js.undefined)
    
    inline def setCompress(value: String | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setConcurrent_streams(value: String | integer): Self = StObject.set(x, "concurrent_streams", value.asInstanceOf[js.Any])
    
    inline def setConcurrent_streamsUndefined: Self = StObject.set(x, "concurrent_streams", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRead_only(value: String | Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    inline def setRead_onlyUndefined: Self = StObject.set(x, "read_only", js.undefined)
    
    inline def setReadonly(value: String | Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
  }
}
