package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltApproved extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only order documents that have been approved by at least one user. */
  var approved: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only order documents with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only order documents for specified orders. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /** Project ID for order documents. */
  var projectId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for order documents by name or ID. Wildcards (&#42;) are allowed. For example, "orderdocument&#42;2015" will return order documents with names
    * like "orderdocument June 2015", "orderdocument April 2015", or simply "orderdocument 2015". Most of the searches also add wildcards implicitly at the
    * start and the end of the search string. For example, a search string of "orderdocument" will match order documents with name "my orderdocument",
    * "orderdocument 2015", or simply "orderdocument".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only order documents that are associated with these sites. */
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltApproved {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    projectId: java.lang.String,
    alt: java.lang.String = null,
    approved: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    orderId: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    siteId: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltApproved = {
    val __obj = js.Dynamic.literal(profileId = profileId, projectId = projectId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltApproved]
  }
}

