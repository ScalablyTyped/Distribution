package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLink extends js.Object {
  
  var appUrl: js.UndefOr[String] = js.native
  
  var fallbackUrl: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var mobileApp: js.UndefOr[MobileApp] = js.native
  
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
}
object DeepLink {
  
  @scala.inline
  def apply(): DeepLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLink]
  }
  
  @scala.inline
  implicit class DeepLinkOps[Self <: DeepLink] (val x: Self) extends AnyVal {
    
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
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    
    @scala.inline
    def setFallbackUrl(value: String): Self = this.set("fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackUrl: Self = this.set("fallbackUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobileApp(value: MobileApp): Self = this.set("mobileApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileApp: Self = this.set("mobileApp", js.undefined)
    
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = this.set("remarketingListIds", js.Array(value :_*))
    
    @scala.inline
    def setRemarketingListIds(value: js.Array[String]): Self = this.set("remarketingListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListIds: Self = this.set("remarketingListIds", js.undefined)
  }
}
