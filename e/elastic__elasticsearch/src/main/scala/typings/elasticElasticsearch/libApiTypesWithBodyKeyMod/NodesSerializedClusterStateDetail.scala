package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesSerializedClusterStateDetail extends StObject {
  
  var compressed_size: js.UndefOr[String] = js.undefined
  
  var compressed_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var count: js.UndefOr[long] = js.undefined
  
  var uncompressed_size: js.UndefOr[String] = js.undefined
  
  var uncompressed_size_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesSerializedClusterStateDetail {
  
  inline def apply(): NodesSerializedClusterStateDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesSerializedClusterStateDetail]
  }
  
  extension [Self <: NodesSerializedClusterStateDetail](x: Self) {
    
    inline def setCompressed_size(value: String): Self = StObject.set(x, "compressed_size", value.asInstanceOf[js.Any])
    
    inline def setCompressed_sizeUndefined: Self = StObject.set(x, "compressed_size", js.undefined)
    
    inline def setCompressed_size_in_bytes(value: long): Self = StObject.set(x, "compressed_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCompressed_size_in_bytesUndefined: Self = StObject.set(x, "compressed_size_in_bytes", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setUncompressed_size(value: String): Self = StObject.set(x, "uncompressed_size", value.asInstanceOf[js.Any])
    
    inline def setUncompressed_sizeUndefined: Self = StObject.set(x, "uncompressed_size", js.undefined)
    
    inline def setUncompressed_size_in_bytes(value: long): Self = StObject.set(x, "uncompressed_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUncompressed_size_in_bytesUndefined: Self = StObject.set(x, "uncompressed_size_in_bytes", js.undefined)
  }
}
