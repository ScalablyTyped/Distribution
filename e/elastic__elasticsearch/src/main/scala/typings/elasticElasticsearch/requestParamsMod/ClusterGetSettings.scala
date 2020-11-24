package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterGetSettings extends Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.native
  
  var include_defaults: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object ClusterGetSettings {
  
  @scala.inline
  def apply(): ClusterGetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettings]
  }
  
  @scala.inline
  implicit class ClusterGetSettingsOps[Self <: ClusterGetSettings] (val x: Self) extends AnyVal {
    
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
    def setFlat_settings(value: Boolean): Self = this.set("flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat_settings: Self = this.set("flat_settings", js.undefined)
    
    @scala.inline
    def setInclude_defaults(value: Boolean): Self = this.set("include_defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_defaults: Self = this.set("include_defaults", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
