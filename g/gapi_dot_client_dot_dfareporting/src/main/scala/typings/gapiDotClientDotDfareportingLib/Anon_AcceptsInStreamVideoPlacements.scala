package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptsInStreamVideoPlacements extends js.Object {
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only directory sites that accept publisher paid placements. This field can be left blank. */
  var acceptsPublisherPaidPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only active directory sites. Leave blank to retrieve both active and inactive directory sites. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this country ID. */
  var countryId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this DFP network code. */
  var dfpNetworkCode: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this parent ID. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
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
    * Allows searching for objects by name, ID or URL. Wildcards (&#42;) are allowed. For example, "directory site&#42;2015" will return objects with names like
    * "directory site June 2015", "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the
    * start and the end of the search string. For example, a search string of "directory site" will match objects with name "my directory site", "directory
    * site 2015" or simply, "directory site".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AcceptsInStreamVideoPlacements {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    acceptsInStreamVideoPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    acceptsInterstitialPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    acceptsPublisherPaidPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alt: java.lang.String = null,
    countryId: java.lang.String = null,
    dfpNetworkCode: java.lang.String = null,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    parentId: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AcceptsInStreamVideoPlacements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profileId")(profileId)
    if (!js.isUndefined(acceptsInStreamVideoPlacements)) __obj.updateDynamic("acceptsInStreamVideoPlacements")(acceptsInStreamVideoPlacements)
    if (!js.isUndefined(acceptsInterstitialPlacements)) __obj.updateDynamic("acceptsInterstitialPlacements")(acceptsInterstitialPlacements)
    if (!js.isUndefined(acceptsPublisherPaidPlacements)) __obj.updateDynamic("acceptsPublisherPaidPlacements")(acceptsPublisherPaidPlacements)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (countryId != null) __obj.updateDynamic("countryId")(countryId)
    if (dfpNetworkCode != null) __obj.updateDynamic("dfpNetworkCode")(dfpNetworkCode)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AcceptsInStreamVideoPlacements]
  }
}

