package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compatibilities extends js.Object {
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[Boolean] = js.native
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[String] = js.native
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to
    * rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[String] = js.native
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[String] = js.native
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Allows searching for placements by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placements with names like
    * "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end
    * of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply
    * "placement".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Compatibilities {
  @scala.inline
  def apply(profileId: String): Compatibilities = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compatibilities]
  }
  @scala.inline
  implicit class CompatibilitiesOps[Self <: Compatibilities] (val x: Self) extends AnyVal {
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
    def setAdvertiserIds(value: String): Self = this.set("advertiserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIds: Self = this.set("advertiserIds", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setCampaignIds(value: String): Self = this.set("campaignIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignIds: Self = this.set("campaignIds", js.undefined)
    @scala.inline
    def setCompatibilities(value: String): Self = this.set("compatibilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibilities: Self = this.set("compatibilities", js.undefined)
    @scala.inline
    def setContentCategoryIds(value: String): Self = this.set("contentCategoryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentCategoryIds: Self = this.set("contentCategoryIds", js.undefined)
    @scala.inline
    def setDirectorySiteIds(value: String): Self = this.set("directorySiteIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteIds: Self = this.set("directorySiteIds", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGroupIds(value: String): Self = this.set("groupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIds: Self = this.set("groupIds", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxEndDate(value: String): Self = this.set("maxEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEndDate: Self = this.set("maxEndDate", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxStartDate(value: String): Self = this.set("maxStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStartDate: Self = this.set("maxStartDate", js.undefined)
    @scala.inline
    def setMinEndDate(value: String): Self = this.set("minEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinEndDate: Self = this.set("minEndDate", js.undefined)
    @scala.inline
    def setMinStartDate(value: String): Self = this.set("minStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinStartDate: Self = this.set("minStartDate", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPaymentSource(value: String): Self = this.set("paymentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentSource: Self = this.set("paymentSource", js.undefined)
    @scala.inline
    def setPlacementStrategyIds(value: String): Self = this.set("placementStrategyIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategyIds: Self = this.set("placementStrategyIds", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setPricingTypes(value: String): Self = this.set("pricingTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingTypes: Self = this.set("pricingTypes", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSiteIds(value: String): Self = this.set("siteIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteIds: Self = this.set("siteIds", js.undefined)
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
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

