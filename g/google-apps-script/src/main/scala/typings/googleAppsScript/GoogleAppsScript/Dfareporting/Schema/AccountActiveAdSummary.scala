package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountActiveAdSummary extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var activeAds: js.UndefOr[String] = js.native
  
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  
  var availableAds: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object AccountActiveAdSummary {
  
  @scala.inline
  def apply(): AccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountActiveAdSummary]
  }
  
  @scala.inline
  implicit class AccountActiveAdSummaryOps[Self <: AccountActiveAdSummary] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setActiveAds(value: String): Self = this.set("activeAds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveAds: Self = this.set("activeAds", js.undefined)
    
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = this.set("activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveAdsLimitTier: Self = this.set("activeAdsLimitTier", js.undefined)
    
    @scala.inline
    def setAvailableAds(value: String): Self = this.set("availableAds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableAds: Self = this.set("availableAds", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
