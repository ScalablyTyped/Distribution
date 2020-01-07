package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAdvertisersDollarList extends StandardParameters {
  /**
    * Select only advertisers with these advertiser group IDs.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only advertisers with these floodlight configuration IDs.
    */
  var floodlightConfigurationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only advertisers with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only advertisers which do not belong to any advertiser group.
    */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only advertisers which use another advertiser's floodlight
    * configuration.
    */
  var onlyParent: js.UndefOr[Boolean] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "advertiser*2015" will return objects with names like
    * "advertiser June 2015", "advertiser April 2015", or simply "advertiser
    * 2015". Most of the searches also add wildcards implicitly at the start
    * and the end of the search string. For example, a search string of
    * "advertiser" will match objects with name "my advertiser", "advertiser
    * 2015", or simply "advertiser".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only advertisers with the specified status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Select only advertisers with these subaccount IDs.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarAdvertisersDollarList {
  @scala.inline
  def apply(
    advertiserGroupIds: js.Array[String] = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    floodlightConfigurationIds: js.Array[String] = null,
    ids: js.Array[String] = null,
    includeAdvertisersWithoutGroupsOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    onlyParent: js.UndefOr[Boolean] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    status: String = null,
    subaccountId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarAdvertisersDollarList = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroupIds != null) __obj.updateDynamic("advertiserGroupIds")(advertiserGroupIds.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (floodlightConfigurationIds != null) __obj.updateDynamic("floodlightConfigurationIds")(floodlightConfigurationIds.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAdvertisersWithoutGroupsOnly)) __obj.updateDynamic("includeAdvertisersWithoutGroupsOnly")(includeAdvertisersWithoutGroupsOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyParent)) __obj.updateDynamic("onlyParent")(onlyParent.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarAdvertisersDollarList]
  }
}

