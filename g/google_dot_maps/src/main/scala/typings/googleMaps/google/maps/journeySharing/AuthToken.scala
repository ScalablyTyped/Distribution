package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthToken extends StObject {
  
  /**
    * The expiration time in seconds. A token expires in this amount of time
    * after fetching.
    */
  var expiresInSeconds: Double
  
  /**
    * The token.
    */
  var token: String
}
object AuthToken {
  
  inline def apply(expiresInSeconds: Double, token: String): AuthToken = {
    val __obj = js.Dynamic.literal(expiresInSeconds = expiresInSeconds.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthToken] (val x: Self) extends AnyVal {
    
    inline def setExpiresInSeconds(value: Double): Self = StObject.set(x, "expiresInSeconds", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
