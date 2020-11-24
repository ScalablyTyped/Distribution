package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.native
  
  var accountProfile: js.UndefOr[String] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  
  var countryId: js.UndefOr[String] = js.native
  
  var currencyId: js.UndefOr[String] = js.native
  
  var defaultCreativeSizeId: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maximumImageSize: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.native
  
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.native
  
  var teaserSizeLimit: js.UndefOr[String] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setAccountPermissionIdsVarargs(value: String*): Self = this.set("accountPermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountPermissionIds(value: js.Array[String]): Self = this.set("accountPermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPermissionIds: Self = this.set("accountPermissionIds", js.undefined)
    
    @scala.inline
    def setAccountProfile(value: String): Self = this.set("accountProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountProfile: Self = this.set("accountProfile", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = this.set("activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveAdsLimitTier: Self = this.set("activeAdsLimitTier", js.undefined)
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = this.set("activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveViewOptOut: Self = this.set("activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAvailablePermissionIdsVarargs(value: String*): Self = this.set("availablePermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setAvailablePermissionIds(value: js.Array[String]): Self = this.set("availablePermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailablePermissionIds: Self = this.set("availablePermissionIds", js.undefined)
    
    @scala.inline
    def setCountryId(value: String): Self = this.set("countryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    
    @scala.inline
    def setCurrencyId(value: String): Self = this.set("currencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyId: Self = this.set("currencyId", js.undefined)
    
    @scala.inline
    def setDefaultCreativeSizeId(value: String): Self = this.set("defaultCreativeSizeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCreativeSizeId: Self = this.set("defaultCreativeSizeId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaximumImageSize(value: String): Self = this.set("maximumImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumImageSize: Self = this.set("maximumImageSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNielsenOcrEnabled(value: Boolean): Self = this.set("nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenOcrEnabled: Self = this.set("nielsenOcrEnabled", js.undefined)
    
    @scala.inline
    def setReportsConfiguration(value: ReportsConfiguration): Self = this.set("reportsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportsConfiguration: Self = this.set("reportsConfiguration", js.undefined)
    
    @scala.inline
    def setShareReportsWithTwitter(value: Boolean): Self = this.set("shareReportsWithTwitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareReportsWithTwitter: Self = this.set("shareReportsWithTwitter", js.undefined)
    
    @scala.inline
    def setTeaserSizeLimit(value: String): Self = this.set("teaserSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeaserSizeLimit: Self = this.set("teaserSizeLimit", js.undefined)
  }
}
