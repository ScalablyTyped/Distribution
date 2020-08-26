package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptsInStreamVideoPlacements extends js.Object {
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.native
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.native
  /** Select only directory sites that accept publisher paid placements. This field can be left blank. */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.native
  /** Select only active directory sites. Leave blank to retrieve both active and inactive directory sites. */
  var active: js.UndefOr[Boolean] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Select only directory sites with this country ID. */
  var countryId: js.UndefOr[String] = js.native
  /** Select only directory sites with this DFP network code. */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only directory sites with these IDs. */
  var ids: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Select only directory sites with this parent ID. */
  var parentId: js.UndefOr[String] = js.native
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
    * Allows searching for objects by name, ID or URL. Wildcards (&#42;) are allowed. For example, "directory site&#42;2015" will return objects with names like
    * "directory site June 2015", "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the
    * start and the end of the search string. For example, a search string of "directory site" will match objects with name "my directory site", "directory
    * site 2015" or simply, "directory site".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object AcceptsInStreamVideoPlacements {
  @scala.inline
  def apply(profileId: String): AcceptsInStreamVideoPlacements = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptsInStreamVideoPlacements]
  }
  @scala.inline
  implicit class AcceptsInStreamVideoPlacementsOps[Self <: AcceptsInStreamVideoPlacements] (val x: Self) extends AnyVal {
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
    def setAcceptsInStreamVideoPlacements(value: Boolean): Self = this.set("acceptsInStreamVideoPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptsInStreamVideoPlacements: Self = this.set("acceptsInStreamVideoPlacements", js.undefined)
    @scala.inline
    def setAcceptsInterstitialPlacements(value: Boolean): Self = this.set("acceptsInterstitialPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptsInterstitialPlacements: Self = this.set("acceptsInterstitialPlacements", js.undefined)
    @scala.inline
    def setAcceptsPublisherPaidPlacements(value: Boolean): Self = this.set("acceptsPublisherPaidPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptsPublisherPaidPlacements: Self = this.set("acceptsPublisherPaidPlacements", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setCountryId(value: String): Self = this.set("countryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    @scala.inline
    def setDfpNetworkCode(value: String): Self = this.set("dfpNetworkCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDfpNetworkCode: Self = this.set("dfpNetworkCode", js.undefined)
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
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
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
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

