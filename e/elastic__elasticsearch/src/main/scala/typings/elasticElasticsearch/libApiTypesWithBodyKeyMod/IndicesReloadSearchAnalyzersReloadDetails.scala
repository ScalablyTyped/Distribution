package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesReloadSearchAnalyzersReloadDetails extends StObject {
  
  var index: String
  
  var reloaded_analyzers: js.Array[String]
  
  var reloaded_node_ids: js.Array[String]
}
object IndicesReloadSearchAnalyzersReloadDetails {
  
  inline def apply(index: String, reloaded_analyzers: js.Array[String], reloaded_node_ids: js.Array[String]): IndicesReloadSearchAnalyzersReloadDetails = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], reloaded_analyzers = reloaded_analyzers.asInstanceOf[js.Any], reloaded_node_ids = reloaded_node_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesReloadSearchAnalyzersReloadDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesReloadSearchAnalyzersReloadDetails] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setReloaded_analyzers(value: js.Array[String]): Self = StObject.set(x, "reloaded_analyzers", value.asInstanceOf[js.Any])
    
    inline def setReloaded_analyzersVarargs(value: String*): Self = StObject.set(x, "reloaded_analyzers", js.Array(value*))
    
    inline def setReloaded_node_ids(value: js.Array[String]): Self = StObject.set(x, "reloaded_node_ids", value.asInstanceOf[js.Any])
    
    inline def setReloaded_node_idsVarargs(value: String*): Self = StObject.set(x, "reloaded_node_ids", js.Array(value*))
  }
}
