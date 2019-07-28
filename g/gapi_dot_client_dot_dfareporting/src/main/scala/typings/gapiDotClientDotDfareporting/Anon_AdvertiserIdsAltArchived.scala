package typings.gapiDotClientDotDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdvertiserIdsAltArchived extends js.Object {
  /** Select only placement groups that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[Boolean] = js.undefined
  /** Select only placement groups that belong to these campaigns. */
  var campaignIds: js.UndefOr[String] = js.undefined
  /** Select only placement groups that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String] = js.undefined
  /** Select only placement groups that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only placement groups with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[String] = js.undefined
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[String] = js.undefined
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group
    * of tags. A roadblock is a group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at
    * the same time. A roadblock requires one of its assigned placements to be marked as primary for reporting.
    */
  var placementGroupType: js.UndefOr[String] = js.undefined
  /** Select only placement groups that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Select only placement groups with these pricing types. */
  var pricingTypes: js.UndefOr[String] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for placement groups by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placement groups with names
    * like "placement group June 2015", "placement group May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the
    * start and the end of the search string. For example, a search string of "placementgroup" will match placement groups with name "my placementgroup",
    * "placementgroup 2015", or simply "placementgroup".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Select only placement groups that are associated with these sites. */
  var siteIds: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AdvertiserIdsAltArchived {
  @scala.inline
  def apply(
    profileId: String,
    advertiserIds: String = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    campaignIds: String = null,
    contentCategoryIds: String = null,
    directorySiteIds: String = null,
    fields: String = null,
    ids: String = null,
    key: String = null,
    maxEndDate: String = null,
    maxResults: Int | Double = null,
    maxStartDate: String = null,
    minEndDate: String = null,
    minStartDate: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    placementGroupType: String = null,
    placementStrategyIds: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    pricingTypes: String = null,
    quotaUser: String = null,
    searchString: String = null,
    siteIds: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): Anon_AdvertiserIdsAltArchived = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds)
    if (contentCategoryIds != null) __obj.updateDynamic("contentCategoryIds")(contentCategoryIds)
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxEndDate != null) __obj.updateDynamic("maxEndDate")(maxEndDate)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxStartDate != null) __obj.updateDynamic("maxStartDate")(maxStartDate)
    if (minEndDate != null) __obj.updateDynamic("minEndDate")(minEndDate)
    if (minStartDate != null) __obj.updateDynamic("minStartDate")(minStartDate)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (placementGroupType != null) __obj.updateDynamic("placementGroupType")(placementGroupType)
    if (placementStrategyIds != null) __obj.updateDynamic("placementStrategyIds")(placementStrategyIds)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (pricingTypes != null) __obj.updateDynamic("pricingTypes")(pricingTypes)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AdvertiserIdsAltArchived]
  }
}

