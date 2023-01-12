package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteCommandAllocatePrimaryAction extends StObject {
  
  var accept_data_loss: Boolean
  
  var index: IndexName
  
  var node: String
  
  var shard: integer
}
object ClusterRerouteCommandAllocatePrimaryAction {
  
  inline def apply(accept_data_loss: Boolean, index: IndexName, node: String, shard: integer): ClusterRerouteCommandAllocatePrimaryAction = {
    val __obj = js.Dynamic.literal(accept_data_loss = accept_data_loss.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteCommandAllocatePrimaryAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteCommandAllocatePrimaryAction] (val x: Self) extends AnyVal {
    
    inline def setAccept_data_loss(value: Boolean): Self = StObject.set(x, "accept_data_loss", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
  }
}
