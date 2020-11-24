package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Goal extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var eventDetails: js.UndefOr[GoalEventDetails] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentLink: js.UndefOr[GoalParentLink] = js.native
  
  var profileId: js.UndefOr[String] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var urlDestinationDetails: js.UndefOr[GoalUrlDestinationDetails] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var visitNumPagesDetails: js.UndefOr[GoalVisitNumPagesDetails] = js.native
  
  var visitTimeOnSiteDetails: js.UndefOr[GoalVisitTimeOnSiteDetails] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
}
object Goal {
  
  @scala.inline
  def apply(): Goal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Goal]
  }
  
  @scala.inline
  implicit class GoalOps[Self <: Goal] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEventDetails(value: GoalEventDetails): Self = this.set("eventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDetails: Self = this.set("eventDetails", js.undefined)
    
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
    def setParentLink(value: GoalParentLink): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setUrlDestinationDetails(value: GoalUrlDestinationDetails): Self = this.set("urlDestinationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlDestinationDetails: Self = this.set("urlDestinationDetails", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisitNumPagesDetails(value: GoalVisitNumPagesDetails): Self = this.set("visitNumPagesDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNumPagesDetails: Self = this.set("visitNumPagesDetails", js.undefined)
    
    @scala.inline
    def setVisitTimeOnSiteDetails(value: GoalVisitTimeOnSiteDetails): Self = this.set("visitTimeOnSiteDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTimeOnSiteDetails: Self = this.set("visitTimeOnSiteDetails", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
