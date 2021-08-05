package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents an auth provider.
  */
trait AuthProvider extends StObject {
  
  var providerId: String
}
object AuthProvider {
  
  inline def apply(providerId: String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProvider]
  }
  
  extension [Self <: AuthProvider](x: Self) {
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
