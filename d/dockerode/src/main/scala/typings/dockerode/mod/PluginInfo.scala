package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInfo extends js.Object {
  
  var Config: PluginConfig = js.native
  
  var Enabled: Boolean = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var Name: String = js.native
  
  var PluginReference: js.UndefOr[String] = js.native
  
  var Settings: PluginSettings = js.native
}
object PluginInfo {
  
  @scala.inline
  def apply(Config: PluginConfig, Enabled: Boolean, Name: String, Settings: PluginSettings): PluginInfo = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
  
  @scala.inline
  implicit class PluginInfoOps[Self <: PluginInfo] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: PluginConfig): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: PluginSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setPluginReference(value: String): Self = this.set("PluginReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginReference: Self = this.set("PluginReference", js.undefined)
  }
}
