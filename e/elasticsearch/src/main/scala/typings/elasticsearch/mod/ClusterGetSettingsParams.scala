package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterGetSettingsParams extends GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.native
  
  var includeDefaults: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object ClusterGetSettingsParams {
  
  @scala.inline
  def apply(): ClusterGetSettingsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettingsParams]
  }
  
  @scala.inline
  implicit class ClusterGetSettingsParamsOps[Self <: ClusterGetSettingsParams] (val x: Self) extends AnyVal {
    
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
    def setFlatSettings(value: Boolean): Self = this.set("flatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatSettings: Self = this.set("flatSettings", js.undefined)
    
    @scala.inline
    def setIncludeDefaults(value: Boolean): Self = this.set("includeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDefaults: Self = this.set("includeDefaults", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
