package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountEmail extends StObject {
  
  var serviceAccountEmail: String
}
object ServiceAccountEmail {
  
  inline def apply(serviceAccountEmail: String): ServiceAccountEmail = {
    val __obj = js.Dynamic.literal(serviceAccountEmail = serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountEmail]
  }
  
  extension [Self <: ServiceAccountEmail](x: Self) {
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
  }
}
