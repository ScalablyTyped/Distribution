package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for Instances.DebugInstance.
  */
@js.native
trait SchemaDebugInstanceRequest extends StObject {
  
  /**
    * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa
    * [KEY_VALUE] [USERNAME] [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
    * {&quot;userName&quot;:&quot;[USERNAME]&quot;,&quot;expireOn&quot;:&quot;[EXPIRE_TIME]&quot;}For
    * more information, see Adding and Removing SSH Keys
    * (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
    */
  var sshKey: js.UndefOr[String] = js.native
}
object SchemaDebugInstanceRequest {
  
  @scala.inline
  def apply(): SchemaDebugInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaDebugInstanceRequestMutableBuilder[Self <: SchemaDebugInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSshKey(value: String): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
  }
}
