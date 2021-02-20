package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  var client: String = js.native
  
  var v: String = js.native
}
object Client {
  
  @scala.inline
  def apply(client: String, v: String): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
