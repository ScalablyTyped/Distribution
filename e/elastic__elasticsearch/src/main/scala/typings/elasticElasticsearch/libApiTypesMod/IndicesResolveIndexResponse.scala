package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndexResponse extends StObject {
  
  var aliases: js.Array[IndicesResolveIndexResolveIndexAliasItem]
  
  var data_streams: js.Array[IndicesResolveIndexResolveIndexDataStreamsItem]
  
  var indices: js.Array[IndicesResolveIndexResolveIndexItem]
}
object IndicesResolveIndexResponse {
  
  inline def apply(
    aliases: js.Array[IndicesResolveIndexResolveIndexAliasItem],
    data_streams: js.Array[IndicesResolveIndexResolveIndexDataStreamsItem],
    indices: js.Array[IndicesResolveIndexResolveIndexItem]
  ): IndicesResolveIndexResponse = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], data_streams = data_streams.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndexResponse]
  }
  
  extension [Self <: IndicesResolveIndexResponse](x: Self) {
    
    inline def setAliases(value: js.Array[IndicesResolveIndexResolveIndexAliasItem]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: IndicesResolveIndexResolveIndexAliasItem*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setData_streams(value: js.Array[IndicesResolveIndexResolveIndexDataStreamsItem]): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_streamsVarargs(value: IndicesResolveIndexResolveIndexDataStreamsItem*): Self = StObject.set(x, "data_streams", js.Array(value*))
    
    inline def setIndices(value: js.Array[IndicesResolveIndexResolveIndexItem]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndicesResolveIndexResolveIndexItem*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
