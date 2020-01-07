package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAdsDollarList extends StandardParameters {
  /**
    * Select only active ads.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Select only archived ads.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these audience segment IDs.
    */
  var audienceSegmentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only ads with these campaign IDs.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select default ads with the specified compatibility. Applicable when type
    * is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to
    * rendering either on desktop or on mobile devices for regular or
    * interstitial ads, respectively. APP and APP_INTERSTITIAL are for
    * rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an
    * in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  /**
    * Select only ads with these creative IDs assigned.
    */
  var creativeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only ads with these creative optimization configuration IDs.
    */
  var creativeOptimizationConfigurationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only dynamic click trackers. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If
    * false, select static click trackers. Leave unset to select both.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only ads with these landing page IDs.
    */
  var landingPageIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only ads with this event tag override ID.
    */
  var overriddenEventTagId: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Select only ads with these placement IDs assigned.
    */
  var placementIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only ads whose list targeting expression use these remarketing
    * list IDs.
    */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "ad*2015" will return objects with names like "ad June
    * 2015", "ad April 2015", or simply "ad 2015". Most of the searches also
    * add wildcards implicitly at the start and the end of the search string.
    * For example, a search string of "ad" will match objects with name "my
    * ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only ads with these size IDs.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only ads that are SSL-compliant.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads that require SSL.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  /**
    * Select only ads with these types.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.native
}

object ParamsDollarResourceDollarAdsDollarList {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentIds: js.Array[String] = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    campaignIds: js.Array[String] = null,
    compatibility: String = null,
    creativeIds: js.Array[String] = null,
    creativeOptimizationConfigurationIds: js.Array[String] = null,
    dynamicClickTracker: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    ids: js.Array[String] = null,
    key: String = null,
    landingPageIds: js.Array[String] = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    overriddenEventTagId: String = null,
    pageToken: String = null,
    placementIds: js.Array[String] = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    remarketingListIds: js.Array[String] = null,
    searchString: String = null,
    sizeIds: js.Array[String] = null,
    sortField: String = null,
    sortOrder: String = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslRequired: js.UndefOr[Boolean] = js.undefined,
    `type`: js.Array[String] = null,
    userIp: String = null
  ): ParamsDollarResourceDollarAdsDollarList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (audienceSegmentIds != null) __obj.updateDynamic("audienceSegmentIds")(audienceSegmentIds.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (creativeIds != null) __obj.updateDynamic("creativeIds")(creativeIds.asInstanceOf[js.Any])
    if (creativeOptimizationConfigurationIds != null) __obj.updateDynamic("creativeOptimizationConfigurationIds")(creativeOptimizationConfigurationIds.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (landingPageIds != null) __obj.updateDynamic("landingPageIds")(landingPageIds.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (overriddenEventTagId != null) __obj.updateDynamic("overriddenEventTagId")(overriddenEventTagId.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (placementIds != null) __obj.updateDynamic("placementIds")(placementIds.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarAdsDollarList]
  }
}

