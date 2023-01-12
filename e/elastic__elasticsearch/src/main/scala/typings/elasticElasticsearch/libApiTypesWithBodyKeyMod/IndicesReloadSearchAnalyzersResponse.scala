package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesReloadSearchAnalyzersResponse extends StObject {
  
  var _shards: ShardStatistics
  
  var reload_details: js.Array[IndicesReloadSearchAnalyzersReloadDetails]
}
object IndicesReloadSearchAnalyzersResponse {
  
  inline def apply(_shards: ShardStatistics, reload_details: js.Array[IndicesReloadSearchAnalyzersReloadDetails]): IndicesReloadSearchAnalyzersResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], reload_details = reload_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesReloadSearchAnalyzersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesReloadSearchAnalyzersResponse] (val x: Self) extends AnyVal {
    
    inline def setReload_details(value: js.Array[IndicesReloadSearchAnalyzersReloadDetails]): Self = StObject.set(x, "reload_details", value.asInstanceOf[js.Any])
    
    inline def setReload_detailsVarargs(value: IndicesReloadSearchAnalyzersReloadDetails*): Self = StObject.set(x, "reload_details", js.Array(value*))
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
