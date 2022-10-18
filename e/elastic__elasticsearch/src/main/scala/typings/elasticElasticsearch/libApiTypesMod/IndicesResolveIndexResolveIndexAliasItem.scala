package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndexResolveIndexAliasItem extends StObject {
  
  var indices: Indices
  
  var name: Name
}
object IndicesResolveIndexResolveIndexAliasItem {
  
  inline def apply(indices: Indices, name: Name): IndicesResolveIndexResolveIndexAliasItem = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndexResolveIndexAliasItem]
  }
  
  extension [Self <: IndicesResolveIndexResolveIndexAliasItem](x: Self) {
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
