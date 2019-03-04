package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltDatasetIdFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Dataset ID of the table to read */
  var datasetId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Page token, returned by a previous call, identifying the result set */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Project ID of the table to read */
  var projectId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** List of fields to return (comma-separated). If unspecified, all fields are returned */
  var selectedFields: js.UndefOr[java.lang.String] = js.undefined
  /** Zero-based index of the starting row to read */
  var startIndex: js.UndefOr[java.lang.String] = js.undefined
  /** Table ID of the table to read */
  var tableId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltDatasetIdFieldsKey {
  @scala.inline
  def apply(
    datasetId: java.lang.String,
    projectId: java.lang.String,
    tableId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    selectedFields: java.lang.String = null,
    startIndex: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltDatasetIdFieldsKey = {
    val __obj = js.Dynamic.literal(datasetId = datasetId, projectId = projectId, tableId = tableId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (selectedFields != null) __obj.updateDynamic("selectedFields")(selectedFields)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltDatasetIdFieldsKey]
  }
}

