package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.ExcludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudience extends js.Object {
  /** Account ID to which this remarketing audience belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** The simple audience definition that will cause a user to be added to an audience. */
  var audienceDefinition: js.UndefOr[typings.gapiClientAnalytics.anon.IncludeConditions] = js.native
  /** The type of audience, either SIMPLE or STATE_BASED. */
  var audienceType: js.UndefOr[String] = js.native
  /** Time this remarketing audience was created. */
  var created: js.UndefOr[String] = js.native
  /** The description of this remarketing audience. */
  var description: js.UndefOr[String] = js.native
  /** Remarketing Audience ID. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this remarketing audience belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Collection type. */
  var kind: js.UndefOr[String] = js.native
  /** The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. */
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.native
  /** The views (profiles) that this remarketing audience is linked to. */
  var linkedViews: js.UndefOr[js.Array[String]] = js.native
  /** The name of this remarketing audience. */
  var name: js.UndefOr[String] = js.native
  /** A state based audience definition that will cause a user to be added or removed from an audience. */
  var stateBasedAudienceDefinition: js.UndefOr[ExcludeConditions] = js.native
  /** Time this remarketing audience was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. */
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
    def setAudienceDefinition(value: typings.gapiClientAnalytics.anon.IncludeConditions): Self = this.set("audienceDefinition", value.asInstanceOf[js.Any])
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
    def setStateBasedAudienceDefinition(value: ExcludeConditions): Self = this.set("stateBasedAudienceDefinition", value.asInstanceOf[js.Any])
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

