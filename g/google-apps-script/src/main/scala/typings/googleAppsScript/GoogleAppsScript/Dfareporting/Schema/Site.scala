package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Site extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var approved: js.UndefOr[Boolean] = js.native
  
  var directorySiteId: js.UndefOr[String] = js.native
  
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var keyName: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.native
  
  var siteSettings: js.UndefOr[SiteSettings] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var videoSettings: js.UndefOr[SiteVideoSettings] = js.native
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    
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
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdDimensionValue(value: DimensionValue): Self = this.set("directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIdDimensionValue: Self = this.set("directorySiteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSiteContactsVarargs(value: SiteContact*): Self = this.set("siteContacts", js.Array(value :_*))
    
    @scala.inline
    def setSiteContacts(value: js.Array[SiteContact]): Self = this.set("siteContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteContacts: Self = this.set("siteContacts", js.undefined)
    
    @scala.inline
    def setSiteSettings(value: SiteSettings): Self = this.set("siteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSettings: Self = this.set("siteSettings", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setVideoSettings(value: SiteVideoSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSettings: Self = this.set("videoSettings", js.undefined)
  }
}
