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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoDiscover] (val x: Self) extends AnyVal {
    
    inline def setSeed_hosts(value: String): Self = StObject.set(x, "seed_hosts", value.asInstanceOf[js.Any])
  }
}
