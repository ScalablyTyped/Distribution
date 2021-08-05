package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Network extends StObject {
  
  var Network: String
}
object Network {
  
  inline def apply(Network: String): Network = {
    val __obj = js.Dynamic.literal(Network = Network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  extension [Self <: Network](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
  }
}
