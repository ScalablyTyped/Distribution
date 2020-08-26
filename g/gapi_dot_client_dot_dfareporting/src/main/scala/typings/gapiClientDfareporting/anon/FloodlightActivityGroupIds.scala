package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityGroupIds extends js.Object {
  /**
    * Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty
    * result.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group IDs. */
  var floodlightActivityGroupIds: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group name. */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group tag string. */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group type. */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId
    * for a non-empty result.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result. */
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
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "floodlightactivity&#42;2015" will return objects with names like
    * "floodlightactivity June 2015", "floodlightactivity April 2015", or simply "floodlightactivity 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a search string of "floodlightactivity" will match objects with name "my
    * floodlightactivity activity", "floodlightactivity 2015", or simply "floodlightactivity".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified tag string. */
  var tagString: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object FloodlightActivityGroupIds {
  @scala.inline
  def apply(profileId: String): FloodlightActivityGroupIds = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivityGroupIds]
  }
  @scala.inline
  implicit class FloodlightActivityGroupIdsOps[Self <: FloodlightActivityGroupIds] (val x: Self) extends AnyVal {
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupIds(value: String): Self = this.set("floodlightActivityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupIds: Self = this.set("floodlightActivityGroupIds", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupName(value: String): Self = this.set("floodlightActivityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupName: Self = this.set("floodlightActivityGroupName", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupTagString(value: String): Self = this.set("floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupTagString: Self = this.set("floodlightActivityGroupTagString", js.undefined)
    @scala.inline
    def setFloodlightActivityGroupType(value: String): Self = this.set("floodlightActivityGroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityGroupType: Self = this.set("floodlightActivityGroupType", js.undefined)
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
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
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setTagString(value: String): Self = this.set("tagString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagString: Self = this.set("tagString", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

