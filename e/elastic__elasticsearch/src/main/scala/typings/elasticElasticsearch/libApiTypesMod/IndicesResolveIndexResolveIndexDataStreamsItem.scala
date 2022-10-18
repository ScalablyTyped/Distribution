package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndexResolveIndexDataStreamsItem extends StObject {
  
  var backing_indices: Indices
  
  var name: DataStreamName
  
  var timestamp_field: Field
}
object IndicesResolveIndexResolveIndexDataStreamsItem {
  
  inline def apply(backing_indices: Indices, name: DataStreamName, timestamp_field: Field): IndicesResolveIndexResolveIndexDataStreamsItem = {
    val __obj = js.Dynamic.literal(backing_indices = backing_indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp_field = timestamp_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndexResolveIndexDataStreamsItem]
  }
  
  extension [Self <: IndicesResolveIndexResolveIndexDataStreamsItem](x: Self) {
    
    inline def setBacking_indices(value: Indices): Self = StObject.set(x, "backing_indices", value.asInstanceOf[js.Any])
    
    inline def setBacking_indicesVarargs(value: IndexName*): Self = StObject.set(x, "backing_indices", js.Array(value*))
    
    inline def setName(value: DataStreamName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_field(value: Field): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
  }
}
