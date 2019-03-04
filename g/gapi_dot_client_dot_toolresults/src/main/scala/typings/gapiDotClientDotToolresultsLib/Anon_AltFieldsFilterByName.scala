package typings
package gapiDotClientDotToolresultsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsFilterByName extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, only return histories with the given name.
    *
    * Optional.
    */
  var filterByName: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of Histories to fetch.
    *
    * Default value: 20. The server will use this default if the field is not set or has a value of 0. Any value greater than 100 will be treated as 100.
    *
    * Optional.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A continuation token to resume the query at the next item.
    *
    * Optional.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A Project id.
    *
    * Required.
    */
  var projectId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsFilterByName {
  @scala.inline
  def apply(
    projectId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    filterByName: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsFilterByName = {
    val __obj = js.Dynamic.literal(projectId = projectId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filterByName != null) __obj.updateDynamic("filterByName")(filterByName)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsFilterByName]
  }
}

