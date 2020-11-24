package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdUnitContentAdsSettings extends js.Object {
  
  var backupOption: js.UndefOr[AdUnitContentAdsSettingsBackupOption] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AdUnitContentAdsSettings {
  
  @scala.inline
  def apply(): AdUnitContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnitContentAdsSettings]
  }
  
  @scala.inline
  implicit class AdUnitContentAdsSettingsOps[Self <: AdUnitContentAdsSettings] (val x: Self) extends AnyVal {
    
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
    def setBackupOption(value: AdUnitContentAdsSettingsBackupOption): Self = this.set("backupOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupOption: Self = this.set("backupOption", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
