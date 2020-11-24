package typings.dockerode.mod

import typings.dockerode.anon.GID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretReference extends js.Object {
  
  var File: js.UndefOr[GID] = js.native
  
  var SecretID: js.UndefOr[String] = js.native
  
  var SecretName: js.UndefOr[String] = js.native
}
object SecretReference {
  
  @scala.inline
  def apply(): SecretReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretReference]
  }
  
  @scala.inline
  implicit class SecretReferenceOps[Self <: SecretReference] (val x: Self) extends AnyVal {
    
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
    def setFile(value: GID): Self = this.set("File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    
    @scala.inline
    def setSecretID(value: String): Self = this.set("SecretID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretID: Self = this.set("SecretID", js.undefined)
    
    @scala.inline
    def setSecretName(value: String): Self = this.set("SecretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretName: Self = this.set("SecretName", js.undefined)
  }
}
