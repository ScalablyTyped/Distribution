package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends js.Object {
  
  var Disable: js.UndefOr[Boolean] = js.native
  
  var Level: js.UndefOr[String] = js.native
  
  var Role: js.UndefOr[String] = js.native
  
  var Type: js.UndefOr[String] = js.native
  
  var User: js.UndefOr[String] = js.native
}
object Disable {
  
  @scala.inline
  def apply(): Disable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit class DisableOps[Self <: Disable] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: Boolean): Self = this.set("Disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("Disable", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("Level", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
