package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClearRepositoriesMeteringArchiveRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var max_archive_version: long
  
  var node_id: NodeIds
}
object NodesClearRepositoriesMeteringArchiveRequest {
  
  inline def apply(max_archive_version: long, node_id: NodeIds): NodesClearRepositoriesMeteringArchiveRequest = {
    val __obj = js.Dynamic.literal(max_archive_version = max_archive_version.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClearRepositoriesMeteringArchiveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesClearRepositoriesMeteringArchiveRequest] (val x: Self) extends AnyVal {
    
    inline def setMax_archive_version(value: long): Self = StObject.set(x, "max_archive_version", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
  }
}
