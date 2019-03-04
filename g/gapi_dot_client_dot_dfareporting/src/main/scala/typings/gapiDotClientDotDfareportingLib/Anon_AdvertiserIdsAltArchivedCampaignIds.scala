package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdvertiserIdsAltArchivedCampaignIds extends js.Object {
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to
    * rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[java.lang.String] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for placements by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placements with names like
    * "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end
    * of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply
    * "placement".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AdvertiserIdsAltArchivedCampaignIds {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    advertiserIds: java.lang.String = null,
    alt: java.lang.String = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    campaignIds: java.lang.String = null,
    compatibilities: java.lang.String = null,
    contentCategoryIds: java.lang.String = null,
    directorySiteIds: java.lang.String = null,
    fields: java.lang.String = null,
    groupIds: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxEndDate: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    maxStartDate: java.lang.String = null,
    minEndDate: java.lang.String = null,
    minStartDate: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    paymentSource: java.lang.String = null,
    placementStrategyIds: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    pricingTypes: java.lang.String = null,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    siteIds: java.lang.String = null,
    sizeIds: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AdvertiserIdsAltArchivedCampaignIds = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds)
    if (compatibilities != null) __obj.updateDynamic("compatibilities")(compatibilities)
    if (contentCategoryIds != null) __obj.updateDynamic("contentCategoryIds")(contentCategoryIds)
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (groupIds != null) __obj.updateDynamic("groupIds")(groupIds)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxEndDate != null) __obj.updateDynamic("maxEndDate")(maxEndDate)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxStartDate != null) __obj.updateDynamic("maxStartDate")(maxStartDate)
    if (minEndDate != null) __obj.updateDynamic("minEndDate")(minEndDate)
    if (minStartDate != null) __obj.updateDynamic("minStartDate")(minStartDate)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (paymentSource != null) __obj.updateDynamic("paymentSource")(paymentSource)
    if (placementStrategyIds != null) __obj.updateDynamic("placementStrategyIds")(placementStrategyIds)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (pricingTypes != null) __obj.updateDynamic("pricingTypes")(pricingTypes)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds)
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AdvertiserIdsAltArchivedCampaignIds]
  }
}

