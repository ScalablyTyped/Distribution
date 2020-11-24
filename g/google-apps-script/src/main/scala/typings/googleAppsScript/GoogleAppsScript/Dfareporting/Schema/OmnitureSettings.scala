package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmnitureSettings extends js.Object {
  
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.native
  
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.native
}
object OmnitureSettings {
  
  @scala.inline
  def apply(): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmnitureSettings]
  }
  
  @scala.inline
  implicit class OmnitureSettingsOps[Self <: OmnitureSettings] (val x: Self) extends AnyVal {
    
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
    def setOmnitureCostDataEnabled(value: Boolean): Self = this.set("omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnitureCostDataEnabled: Self = this.set("omnitureCostDataEnabled", js.undefined)
    
    @scala.inline
    def setOmnitureIntegrationEnabled(value: Boolean): Self = this.set("omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnitureIntegrationEnabled: Self = this.set("omnitureIntegrationEnabled", js.undefined)
  }
}
