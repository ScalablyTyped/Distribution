package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoDiscover extends StObject {
  
  var seed_hosts: String
}
object NodesInfoNodeInfoDiscover {
  
  inline def apply(seed_hosts: String): NodesInfoNodeInfoDiscover = {
    val __obj = js.Dynamic.literal(seed_hosts = seed_hosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoDiscover]
  }
  
  extension [Self <: NodesInfoNodeInfoDiscover](x: Self) {
    
    inline def setSeed_hosts(value: String): Self = StObject.set(x, "seed_hosts", value.asInstanceOf[js.Any])
  }
}
