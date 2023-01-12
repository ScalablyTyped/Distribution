package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteCommandCancelAction extends StObject {
  
  var allow_primary: js.UndefOr[Boolean] = js.undefined
  
  var index: IndexName
  
  var node: String
  
  var shard: integer
}
object ClusterRerouteCommandCancelAction {
  
  inline def apply(index: IndexName, node: String, shard: integer): ClusterRerouteCommandCancelAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteCommandCancelAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteCommandCancelAction] (val x: Self) extends AnyVal {
    
    inline def setAllow_primary(value: Boolean): Self = StObject.set(x, "allow_primary", value.asInstanceOf[js.Any])
    
    inline def setAllow_primaryUndefined: Self = StObject.set(x, "allow_primary", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
  }
}
