package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchResource extends StObject {
  
  var address: String
  
  var expiration: Double
  
  var id: String
  
  var token: String
  
  var `type`: String
}
object WatchResource {
  
  inline def apply(address: String, expiration: Double, id: String, token: String, `type`: String): WatchResource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchResource]
  }
  
  extension [Self <: WatchResource](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
