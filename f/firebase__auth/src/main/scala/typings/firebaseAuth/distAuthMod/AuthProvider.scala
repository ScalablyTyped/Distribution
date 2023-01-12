package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthProvider extends StObject {
  
  /**
    * Provider for which credentials can be constructed.
    */
  val providerId: String
}
object AuthProvider {
  
  inline def apply(providerId: String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
