package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDebugInstanceRequest extends StObject {
  
  /**
    * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME] [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"\}For more information, see Adding and Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
    */
  var sshKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaDebugInstanceRequest {
  
  inline def apply(): SchemaDebugInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugInstanceRequest]
  }
  
  extension [Self <: SchemaDebugInstanceRequest](x: Self) {
    
    inline def setSshKey(value: String): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    inline def setSshKeyNull: Self = StObject.set(x, "sshKey", null)
    
    inline def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
  }
}
