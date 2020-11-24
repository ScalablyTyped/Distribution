package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for Instances.DebugInstance.
  */
@js.native
trait SchemaDebugInstanceRequest extends js.Object {
  
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
  implicit class SchemaDebugInstanceRequestOps[Self <: SchemaDebugInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSshKey(value: String): Self = this.set("sshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshKey: Self = this.set("sshKey", js.undefined)
  }
}
