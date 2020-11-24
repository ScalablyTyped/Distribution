package typings.dockerode.mod

import typings.dockerode.anon.Disable
import typings.dockerode.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privileges extends js.Object {
  
  var CredentialSpec: js.UndefOr[File] = js.native
  
  var SELinuxContext: js.UndefOr[Disable] = js.native
}
object Privileges {
  
  @scala.inline
  def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  
  @scala.inline
  implicit class PrivilegesOps[Self <: Privileges] (val x: Self) extends AnyVal {
    
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
    def setCredentialSpec(value: File): Self = this.set("CredentialSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialSpec: Self = this.set("CredentialSpec", js.undefined)
    
    @scala.inline
    def setSELinuxContext(value: Disable): Self = this.set("SELinuxContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSELinuxContext: Self = this.set("SELinuxContext", js.undefined)
  }
}
