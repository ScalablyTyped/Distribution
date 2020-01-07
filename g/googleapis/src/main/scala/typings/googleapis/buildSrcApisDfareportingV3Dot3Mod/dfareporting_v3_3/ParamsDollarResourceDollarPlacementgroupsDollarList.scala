package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPlacementgroupsDollarList extends StandardParameters {
  /**
    * Select only placement groups that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only archived placements. Don't set this field to select both
    * archived and non-archived placements.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only placement groups that belong to these campaigns.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placement groups that are associated with these content
    * categories.
    */
  var contentCategoryIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placement groups that are associated with these directory
    * sites.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placement groups with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements or placement groups whose end date is on or before
    * the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var maxEndDate: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only placements or placement groups whose start date is on or
    * before the specified maxStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var maxStartDate: js.UndefOr[String] = js.native
  /**
    * Select only placements or placement groups whose end date is on or after
    * the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var minEndDate: js.UndefOr[String] = js.native
  /**
    * Select only placements or placement groups whose start date is on or
    * after the specified minStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var minStartDate: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Select only placement groups belonging with this group type. A package is
    * a simple group of placements that acts as a single pricing point for a
    * group of tags. A roadblock is a group of placements that not only acts as
    * a single pricing point but also assumes that all the tags in it will be
    * served at the same time. A roadblock requires one of its assigned
    * placements to be marked as primary for reporting.
    */
  var placementGroupType: js.UndefOr[String] = js.native
  /**
    * Select only placement groups that are associated with these placement
    * strategies.
    */
  var placementStrategyIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placement groups with these pricing types.
    */
  var pricingTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for placement groups by name or ID. Wildcards (*) are
    * allowed. For example, "placement*2015" will return placement groups with
    * names like "placement group June 2015", "placement group May 2015", or
    * simply "placements 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "placementgroup" will match placement groups with name
    * "my placementgroup", "placementgroup 2015", or simply "placementgroup".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only placement groups that are associated with these sites.
    */
  var siteIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarPlacementgroupsDollarList {
  @scala.inline
  def apply(
    advertiserIds: js.Array[String] = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    campaignIds: js.Array[String] = null,
    contentCategoryIds: js.Array[String] = null,
    directorySiteIds: js.Array[String] = null,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxEndDate: String = null,
    maxResults: Int | Double = null,
    maxStartDate: String = null,
    minEndDate: String = null,
    minStartDate: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    placementGroupType: String = null,
    placementStrategyIds: js.Array[String] = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    pricingTypes: js.Array[String] = null,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    siteIds: js.Array[String] = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarPlacementgroupsDollarList = {
    val __obj = js.Dynamic.literal()
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds.asInstanceOf[js.Any])
    if (contentCategoryIds != null) __obj.updateDynamic("contentCategoryIds")(contentCategoryIds.asInstanceOf[js.Any])
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxEndDate != null) __obj.updateDynamic("maxEndDate")(maxEndDate.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxStartDate != null) __obj.updateDynamic("maxStartDate")(maxStartDate.asInstanceOf[js.Any])
    if (minEndDate != null) __obj.updateDynamic("minEndDate")(minEndDate.asInstanceOf[js.Any])
    if (minStartDate != null) __obj.updateDynamic("minStartDate")(minStartDate.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (placementGroupType != null) __obj.updateDynamic("placementGroupType")(placementGroupType.asInstanceOf[js.Any])
    if (placementStrategyIds != null) __obj.updateDynamic("placementStrategyIds")(placementStrategyIds.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (pricingTypes != null) __obj.updateDynamic("pricingTypes")(pricingTypes.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPlacementgroupsDollarList]
  }
}

