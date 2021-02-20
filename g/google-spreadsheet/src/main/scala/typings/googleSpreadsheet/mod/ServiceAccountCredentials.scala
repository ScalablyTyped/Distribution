package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountCredentials extends StObject {
  
  /**
    * @description
    * service account email address
    */
  var client_email: String = js.native
  
  /**
    * @description
    * service account private key
    */
  var private_key: String = js.native
}
object ServiceAccountCredentials {
  
  @scala.inline
  def apply(client_email: String, private_key: String): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
  
  @scala.inline
  implicit class ServiceAccountCredentialsMutableBuilder[Self <: ServiceAccountCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
  }
}
