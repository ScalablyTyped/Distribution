package typings.firebase.firebaseMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLAuthProvider
  extends StObject
     with AuthProvider
object SAMLAuthProvider {
  
  inline def apply(providerId: String): SAMLAuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLAuthProvider]
  }
}
