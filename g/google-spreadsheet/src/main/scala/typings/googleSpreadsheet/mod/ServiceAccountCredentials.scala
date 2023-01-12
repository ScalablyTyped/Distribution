package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountCredentials extends StObject {
  
  /**
    * @description
    * service account email address
    */
  var client_email: String
  
  /**
    * @description
    * service account private key
    */
  var private_key: String
}
object ServiceAccountCredentials {
  
  inline def apply(client_email: String, private_key: String): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAccountCredentials] (val x: Self) extends AnyVal {
    
    inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
    
    inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
  }
}
