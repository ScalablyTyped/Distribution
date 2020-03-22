package typings.gapiClientDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortOrder extends js.Object {
  /** Select only active or only inactive remarketing lists. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Select only remarketing lists owned by this advertiser. */
  var advertiserId: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only remarketing lists that have this floodlight activity ID. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "remarketing list&#42;2015" will return objects with names like
    * "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at
    * the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list",
    * "remarketing list 2015", or simply "remarketing list".
    */
  var name: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonSortOrder {
  @scala.inline
  def apply(
    advertiserId: String,
    profileId: String,
    active: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    fields: String = null,
    floodlightActivityId: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    name: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): AnonSortOrder = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortOrder]
  }
}

