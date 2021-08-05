package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hosts extends StObject {
  
  var hosts: js.Array[js.Any]
  
  var reason: String
}
object Hosts {
  
  inline def apply(hosts: js.Array[js.Any], reason: String): Hosts = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosts]
  }
  
  extension [Self <: Hosts](x: Self) {
    
    inline def setHosts(value: js.Array[js.Any]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: js.Any*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
