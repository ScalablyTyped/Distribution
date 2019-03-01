package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAdvertiserId extends js.Object {
  /** Select only active ads. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with this advertiser ID. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived ads. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with these audience segment IDs. */
  var audienceSegmentIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these campaign IDs. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering
    * either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these creative IDs assigned. */
  var creativeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these creative optimization configuration IDs. */
  var creativeOptimizationConfigurationIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static
    * click trackers. Leave unset to select both.
    */
  var dynamicClickTracker: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these landing page IDs. */
  var landingPageIds: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with this event tag override ID. */
  var overriddenEventTagId: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these placement IDs assigned. */
  var placementIds: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads whose list targeting expression use these remarketing list IDs. */
  var remarketingListIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "ad&#42;2015" will return objects with names like "ad June 2015", "ad
    * April 2015", or simply "ad 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a
    * search string of "ad" will match objects with name "my ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these size IDs. */
  var sizeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads that are SSL-compliant. */
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads that require SSL. */
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with these types. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActiveAdvertiserId {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserId: java.lang.String = null,
    alt: java.lang.String = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    audienceSegmentIds: java.lang.String = null,
    campaignIds: java.lang.String = null,
    compatibility: java.lang.String = null,
    creativeIds: java.lang.String = null,
    creativeOptimizationConfigurationIds: java.lang.String = null,
    dynamicClickTracker: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    landingPageIds: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    overriddenEventTagId: java.lang.String = null,
    pageToken: java.lang.String = null,
    placementIds: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    remarketingListIds: java.lang.String = null,
    searchString: java.lang.String = null,
    sizeIds: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    sslCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    sslRequired: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_ActiveAdvertiserId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profileId")(profileId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (audienceSegmentIds != null) __obj.updateDynamic("audienceSegmentIds")(audienceSegmentIds)
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds)
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility)
    if (creativeIds != null) __obj.updateDynamic("creativeIds")(creativeIds)
    if (creativeOptimizationConfigurationIds != null) __obj.updateDynamic("creativeOptimizationConfigurationIds")(creativeOptimizationConfigurationIds)
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (landingPageIds != null) __obj.updateDynamic("landingPageIds")(landingPageIds)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (overriddenEventTagId != null) __obj.updateDynamic("overriddenEventTagId")(overriddenEventTagId)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (placementIds != null) __obj.updateDynamic("placementIds")(placementIds)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_ActiveAdvertiserId]
  }
}

