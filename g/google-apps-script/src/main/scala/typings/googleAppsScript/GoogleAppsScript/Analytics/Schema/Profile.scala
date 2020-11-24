package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var botFilteringEnabled: js.UndefOr[Boolean] = js.native
  
  var childLink: js.UndefOr[ProfileChildLink] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var defaultPage: js.UndefOr[String] = js.native
  
  var eCommerceTracking: js.UndefOr[Boolean] = js.native
  
  var enhancedECommerceTracking: js.UndefOr[Boolean] = js.native
  
  var excludeQueryParameters: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentLink: js.UndefOr[ProfileParentLink] = js.native
  
  var permissions: js.UndefOr[ProfilePermissions] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
  
  var siteSearchCategoryParameters: js.UndefOr[String] = js.native
  
  var siteSearchQueryParameters: js.UndefOr[String] = js.native
  
  var starred: js.UndefOr[Boolean] = js.native
  
  var stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.native
  
  var stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
  
  var websiteUrl: js.UndefOr[String] = js.native
}
object Profile {
  
  @scala.inline
  def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    
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
    def setBotFilteringEnabled(value: Boolean): Self = this.set("botFilteringEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotFilteringEnabled: Self = this.set("botFilteringEnabled", js.undefined)
    
    @scala.inline
    def setChildLink(value: ProfileChildLink): Self = this.set("childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLink: Self = this.set("childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: String): Self = this.set("defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPage: Self = this.set("defaultPage", js.undefined)
    
    @scala.inline
    def setECommerceTracking(value: Boolean): Self = this.set("eCommerceTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECommerceTracking: Self = this.set("eCommerceTracking", js.undefined)
    
    @scala.inline
    def setEnhancedECommerceTracking(value: Boolean): Self = this.set("enhancedECommerceTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedECommerceTracking: Self = this.set("enhancedECommerceTracking", js.undefined)
    
    @scala.inline
    def setExcludeQueryParameters(value: String): Self = this.set("excludeQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeQueryParameters: Self = this.set("excludeQueryParameters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentLink(value: ProfileParentLink): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setPermissions(value: ProfilePermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSiteSearchCategoryParameters(value: String): Self = this.set("siteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearchCategoryParameters: Self = this.set("siteSearchCategoryParameters", js.undefined)
    
    @scala.inline
    def setSiteSearchQueryParameters(value: String): Self = this.set("siteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearchQueryParameters: Self = this.set("siteSearchQueryParameters", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setStripSiteSearchCategoryParameters(value: Boolean): Self = this.set("stripSiteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripSiteSearchCategoryParameters: Self = this.set("stripSiteSearchCategoryParameters", js.undefined)
    
    @scala.inline
    def setStripSiteSearchQueryParameters(value: Boolean): Self = this.set("stripSiteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripSiteSearchQueryParameters: Self = this.set("stripSiteSearchQueryParameters", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
