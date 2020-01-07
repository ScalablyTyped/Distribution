package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCreativegroupsDollarList extends StandardParameters {
  /**
    * Select only creative groups that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only creative groups that belong to this subgroup.
    */
  var groupNumber: js.UndefOr[Double] = js.native
  /**
    * Select only creative groups with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for creative groups by name or ID. Wildcards (*) are
    * allowed. For example, "creativegroup*2015" will return creative groups
    * with names like "creativegroup June 2015", "creativegroup April 2015", or
    * simply "creativegroup 2015". Most of the searches also add wild-cards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "creativegroup" will match creative groups with the name
    * "my creativegroup", "creativegroup 2015", or simply "creativegroup".
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
}

object ParamsDollarResourceDollarCreativegroupsDollarList {
  @scala.inline
  def apply(
    advertiserIds: js.Array[String] = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    groupNumber: Int | Double = null,
    ids: js.Array[String] = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    profileId: String = null,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarCreativegroupsDollarList = {
    val __obj = js.Dynamic.literal()
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupNumber != null) __obj.updateDynamic("groupNumber")(groupNumber.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarCreativegroupsDollarList]
  }
}

