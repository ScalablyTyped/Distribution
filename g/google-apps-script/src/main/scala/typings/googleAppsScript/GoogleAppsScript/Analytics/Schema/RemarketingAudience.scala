package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingAudience extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var audienceDefinition: js.UndefOr[RemarketingAudienceAudienceDefinition] = js.native
  
  var audienceType: js.UndefOr[String] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.native
  
  var linkedViews: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var stateBasedAudienceDefinition: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinition] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
}
object RemarketingAudience {
  
  @scala.inline
  def apply(): RemarketingAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudience]
  }
  
  @scala.inline
  implicit class RemarketingAudienceOps[Self <: RemarketingAudience] (val x: Self) extends AnyVal {
    
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
    def setAudienceDefinition(value: RemarketingAudienceAudienceDefinition): Self = this.set("audienceDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceDefinition: Self = this.set("audienceDefinition", js.undefined)
    
    @scala.inline
    def setAudienceType(value: String): Self = this.set("audienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceType: Self = this.set("audienceType", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
    def setLinkedAdAccountsVarargs(value: LinkedForeignAccount*): Self = this.set("linkedAdAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLinkedAdAccounts(value: js.Array[LinkedForeignAccount]): Self = this.set("linkedAdAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedAdAccounts: Self = this.set("linkedAdAccounts", js.undefined)
    
    @scala.inline
    def setLinkedViewsVarargs(value: String*): Self = this.set("linkedViews", js.Array(value :_*))
    
    @scala.inline
    def setLinkedViews(value: js.Array[String]): Self = this.set("linkedViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedViews: Self = this.set("linkedViews", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStateBasedAudienceDefinition(value: RemarketingAudienceStateBasedAudienceDefinition): Self = this.set("stateBasedAudienceDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateBasedAudienceDefinition: Self = this.set("stateBasedAudienceDefinition", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
