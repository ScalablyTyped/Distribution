package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends StObject {
  
  var Network: String = js.native
}
object Network {
  
  @scala.inline
  def apply(Network: String): Network = {
    val __obj = js.Dynamic.literal(Network = Network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
  }
}
