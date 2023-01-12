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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAccountEmail] (val x: Self) extends AnyVal {
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
  }
}
