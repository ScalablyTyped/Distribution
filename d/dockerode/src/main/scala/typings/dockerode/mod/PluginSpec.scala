package typings.dockerode.mod

import typings.dockerode.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginSpec extends js.Object {
  
  var Disabled: js.UndefOr[Boolean] = js.native
  
  var Env: js.UndefOr[js.Array[String]] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var Privileges: js.UndefOr[Description] = js.native
  
  var Remote: js.UndefOr[String] = js.native
}
object PluginSpec {
  
  @scala.inline
  def apply(): PluginSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpec]
  }
  
  @scala.inline
  implicit class PluginSpecOps[Self <: PluginSpec] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("Env", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPrivileges(value: Description): Self = this.set("Privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileges: Self = this.set("Privileges", js.undefined)
    
    @scala.inline
    def setRemote(value: String): Self = this.set("Remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("Remote", js.undefined)
  }
}
