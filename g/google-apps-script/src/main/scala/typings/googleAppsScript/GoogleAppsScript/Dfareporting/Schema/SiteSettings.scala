package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteSettings extends js.Object {
  
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  
  var disableNewCookie: js.UndefOr[Boolean] = js.native
  
  var tagSetting: js.UndefOr[TagSetting] = js.native
  
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.native
  
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.native
}
object SiteSettings {
  
  @scala.inline
  def apply(): SiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSettings]
  }
  
  @scala.inline
  implicit class SiteSettingsOps[Self <: SiteSettings] (val x: Self) extends AnyVal {
    
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
    def setActiveViewOptOut(value: Boolean): Self = this.set("activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveViewOptOut: Self = this.set("activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAdBlockingOptOut(value: Boolean): Self = this.set("adBlockingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBlockingOptOut: Self = this.set("adBlockingOptOut", js.undefined)
    
    @scala.inline
    def setDisableNewCookie(value: Boolean): Self = this.set("disableNewCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNewCookie: Self = this.set("disableNewCookie", js.undefined)
    
    @scala.inline
    def setTagSetting(value: TagSetting): Self = this.set("tagSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSetting: Self = this.set("tagSetting", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOutTemplate(value: Boolean): Self = this.set("videoActiveViewOptOutTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoActiveViewOptOutTemplate: Self = this.set("videoActiveViewOptOutTemplate", js.undefined)
    
    @scala.inline
    def setVpaidAdapterChoiceTemplate(value: String): Self = this.set("vpaidAdapterChoiceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpaidAdapterChoiceTemplate: Self = this.set("vpaidAdapterChoiceTemplate", js.undefined)
  }
}
