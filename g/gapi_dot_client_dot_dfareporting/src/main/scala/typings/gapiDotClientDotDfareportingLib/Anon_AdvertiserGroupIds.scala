package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdvertiserGroupIds extends js.Object {
  /** Select only advertisers with these advertiser group IDs. */
  var advertiserGroupIds: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these floodlight configuration IDs. */
  var floodlightConfigurationIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers which do not belong to any advertiser group. */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers which use another advertiser's floodlight configuration. */
  var onlyParent: js.UndefOr[scala.Boolean] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "advertiser&#42;2015" will return objects with names like "advertiser
    * June 2015", "advertiser April 2015", or simply "advertiser 2015". Most of the searches also add wildcards implicitly at the start and the end of the
    * search string. For example, a search string of "advertiser" will match objects with name "my advertiser", "advertiser 2015", or simply "advertiser".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with the specified status. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these subaccount IDs. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AdvertiserGroupIds {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    advertiserGroupIds: java.lang.String = null,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    floodlightConfigurationIds: java.lang.String = null,
    ids: java.lang.String = null,
    includeAdvertisersWithoutGroupsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    onlyParent: js.UndefOr[scala.Boolean] = js.undefined,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    status: java.lang.String = null,
    subaccountId: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AdvertiserGroupIds = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (advertiserGroupIds != null) __obj.updateDynamic("advertiserGroupIds")(advertiserGroupIds)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (floodlightConfigurationIds != null) __obj.updateDynamic("floodlightConfigurationIds")(floodlightConfigurationIds)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (!js.isUndefined(includeAdvertisersWithoutGroupsOnly)) __obj.updateDynamic("includeAdvertisersWithoutGroupsOnly")(includeAdvertisersWithoutGroupsOnly)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(onlyParent)) __obj.updateDynamic("onlyParent")(onlyParent)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AdvertiserGroupIds]
  }
}

