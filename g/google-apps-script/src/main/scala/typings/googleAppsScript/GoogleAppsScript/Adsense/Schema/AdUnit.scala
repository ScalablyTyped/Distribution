package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdUnit extends js.Object {
  
  var code: js.UndefOr[String] = js.native
  
  var contentAdsSettings: js.UndefOr[AdUnitContentAdsSettings] = js.native
  
  var customStyle: js.UndefOr[AdStyle] = js.native
  
  var feedAdsSettings: js.UndefOr[AdUnitFeedAdsSettings] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var mobileContentAdsSettings: js.UndefOr[AdUnitMobileContentAdsSettings] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var savedStyleId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object AdUnit {
  
  @scala.inline
  def apply(): AdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnit]
  }
  
  @scala.inline
  implicit class AdUnitOps[Self <: AdUnit] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContentAdsSettings(value: AdUnitContentAdsSettings): Self = this.set("contentAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAdsSettings: Self = this.set("contentAdsSettings", js.undefined)
    
    @scala.inline
    def setCustomStyle(value: AdStyle): Self = this.set("customStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyle: Self = this.set("customStyle", js.undefined)
    
    @scala.inline
    def setFeedAdsSettings(value: AdUnitFeedAdsSettings): Self = this.set("feedAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedAdsSettings: Self = this.set("feedAdsSettings", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobileContentAdsSettings(value: AdUnitMobileContentAdsSettings): Self = this.set("mobileContentAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileContentAdsSettings: Self = this.set("mobileContentAdsSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSavedStyleId(value: String): Self = this.set("savedStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedStyleId: Self = this.set("savedStyleId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
