package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archived extends js.Object {
  /** Select only active creatives. Leave blank to select active and inactive creatives. */
  var active: js.UndefOr[Boolean] = js.native
  /** Select only creatives with this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Select only archived creatives. Leave blank to select archived and unarchived creatives. */
  var archived: js.UndefOr[Boolean] = js.native
  /** Select only creatives with this campaign ID. */
  var campaignId: js.UndefOr[String] = js.native
  /** Select only in-stream video creatives with these companion IDs. */
  var companionCreativeIds: js.UndefOr[String] = js.native
  /** Select only creatives with these creative field IDs. */
  var creativeFieldIds: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only creatives with these IDs. */
  var ids: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** Select only creatives with these rendering IDs. */
  var renderingIds: js.UndefOr[String] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "creative&#42;2015" will return objects with names like "creative June
    * 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search
    * string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Select only creatives with these size IDs. */
  var sizeIds: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** Select only creatives corresponding to this Studio creative ID. */
  var studioCreativeId: js.UndefOr[String] = js.native
  /** Select only creatives with these creative types. */
  var types: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Archived {
  @scala.inline
  def apply(profileId: String): Archived = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archived]
  }
  @scala.inline
  implicit class ArchivedOps[Self <: Archived] (val x: Self) extends AnyVal {
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
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    @scala.inline
    def setCompanionCreativeIds(value: String): Self = this.set("companionCreativeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionCreativeIds: Self = this.set("companionCreativeIds", js.undefined)
    @scala.inline
    def setCreativeFieldIds(value: String): Self = this.set("creativeFieldIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeFieldIds: Self = this.set("creativeFieldIds", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setRenderingIds(value: String): Self = this.set("renderingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingIds: Self = this.set("renderingIds", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSizeIds(value: String): Self = this.set("sizeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeIds: Self = this.set("sizeIds", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setStudioCreativeId(value: String): Self = this.set("studioCreativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudioCreativeId: Self = this.set("studioCreativeId", js.undefined)
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

