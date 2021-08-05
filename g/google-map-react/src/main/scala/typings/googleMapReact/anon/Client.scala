package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: String
  
  var v: String
}
object Client {
  
  inline def apply(client: String, v: String): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
