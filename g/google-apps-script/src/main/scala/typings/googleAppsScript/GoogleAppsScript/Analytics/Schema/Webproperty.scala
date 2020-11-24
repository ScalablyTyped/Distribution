package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webproperty extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var childLink: js.UndefOr[WebpropertyChildLink] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.native
  
  var dataRetentionTtl: js.UndefOr[String] = js.native
  
  var defaultProfileId: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var industryVertical: js.UndefOr[String] = js.native
  
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentLink: js.UndefOr[WebpropertyParentLink] = js.native
  
  var permissions: js.UndefOr[WebpropertyPermissions] = js.native
  
  var profileCount: js.UndefOr[Double] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
  
  var starred: js.UndefOr[Boolean] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var websiteUrl: js.UndefOr[String] = js.native
}
object Webproperty {
  
  @scala.inline
  def apply(): Webproperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webproperty]
  }
  
  @scala.inline
  implicit class WebpropertyOps[Self <: Webproperty] (val x: Self) extends AnyVal {
    
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
    def setChildLink(value: WebpropertyChildLink): Self = this.set("childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLink: Self = this.set("childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDataRetentionResetOnNewActivity(value: Boolean): Self = this.set("dataRetentionResetOnNewActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRetentionResetOnNewActivity: Self = this.set("dataRetentionResetOnNewActivity", js.undefined)
    
    @scala.inline
    def setDataRetentionTtl(value: String): Self = this.set("dataRetentionTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRetentionTtl: Self = this.set("dataRetentionTtl", js.undefined)
    
    @scala.inline
    def setDefaultProfileId(value: String): Self = this.set("defaultProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProfileId: Self = this.set("defaultProfileId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndustryVertical(value: String): Self = this.set("industryVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustryVertical: Self = this.set("industryVertical", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentLink(value: WebpropertyParentLink): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setPermissions(value: WebpropertyPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProfileCount(value: Double): Self = this.set("profileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileCount: Self = this.set("profileCount", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
