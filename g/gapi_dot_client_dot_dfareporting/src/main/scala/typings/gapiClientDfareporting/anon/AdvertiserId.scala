package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserId extends js.Object {
  /** Select only active ads. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Select only ads with this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Select only archived ads. */
  var archived: js.UndefOr[Boolean] = js.undefined
  /** Select only ads with these audience segment IDs. */
  var audienceSegmentIds: js.UndefOr[String] = js.undefined
  /** Select only ads with these campaign IDs. */
  var campaignIds: js.UndefOr[String] = js.undefined
  /**
    * Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering
    * either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  /** Select only ads with these creative IDs assigned. */
  var creativeIds: js.UndefOr[String] = js.undefined
  /** Select only ads with these creative optimization configuration IDs. */
  var creativeOptimizationConfigurationIds: js.UndefOr[String] = js.undefined
  /**
    * Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static
    * click trackers. Leave unset to select both.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only ads with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Select only ads with these landing page IDs. */
  var landingPageIds: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Select only ads with this event tag override ID. */
  var overriddenEventTagId: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Select only ads with these placement IDs assigned. */
  var placementIds: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Select only ads whose list targeting expression use these remarketing list IDs. */
  var remarketingListIds: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "ad&#42;2015" will return objects with names like "ad June 2015", "ad
    * April 2015", or simply "ad 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a
    * search string of "ad" will match objects with name "my ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Select only ads with these size IDs. */
  var sizeIds: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** Select only ads that are SSL-compliant. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Select only ads that require SSL. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  /** Select only ads with these types. */
  var `type`: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AdvertiserId {
  @scala.inline
  def apply(
    profileId: String,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentIds: String = null,
    campaignIds: String = null,
    compatibility: String = null,
    creativeIds: String = null,
    creativeOptimizationConfigurationIds: String = null,
    dynamicClickTracker: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    ids: String = null,
    key: String = null,
    landingPageIds: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    overriddenEventTagId: String = null,
    pageToken: String = null,
    placementIds: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    remarketingListIds: String = null,
    searchString: String = null,
    sizeIds: String = null,
    sortField: String = null,
    sortOrder: String = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslRequired: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    userIp: String = null
  ): AdvertiserId = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (audienceSegmentIds != null) __obj.updateDynamic("audienceSegmentIds")(audienceSegmentIds.asInstanceOf[js.Any])
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (creativeIds != null) __obj.updateDynamic("creativeIds")(creativeIds.asInstanceOf[js.Any])
    if (creativeOptimizationConfigurationIds != null) __obj.updateDynamic("creativeOptimizationConfigurationIds")(creativeOptimizationConfigurationIds.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (landingPageIds != null) __obj.updateDynamic("landingPageIds")(landingPageIds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (overriddenEventTagId != null) __obj.updateDynamic("overriddenEventTagId")(overriddenEventTagId.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (placementIds != null) __obj.updateDynamic("placementIds")(placementIds.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserId]
  }
}

