package typings
package gapiDotClientDotCloudmonitoringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCount extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of metric descriptors per page. Used for pagination. If not specified, count = 100. */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pagination token, which is used to page through large result sets. Set this value to the value of the nextPageToken to retrieve the next page of
    * results.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The project id. The value can be the numeric project ID or string-based project name. */
  var project: java.lang.String
  /**
    * The query used to search against existing metrics. Separate keywords with a space; the service joins all keywords with AND, meaning that all keywords
    * must match for a metric to be returned. If this field is omitted, all metrics are returned. If an empty string is passed with this field, no metrics
    * are returned.
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCount {
  @scala.inline
  def apply(
    project: java.lang.String,
    alt: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String = null,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCount = {
    val __obj = js.Dynamic.literal(project = project)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (query != null) __obj.updateDynamic("query")(query)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCount]
  }
}

