package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltDimensionsFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'. */
  var dimensions: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** A comma-separated list of dimension or metric filters to be applied to real time data. */
  var filters: js.UndefOr[String] = js.undefined
  /** Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. */
  var ids: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The maximum number of entries to include in this feed. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  /** A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At least one metric must be specified. */
  var metrics: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** A comma-separated list of dimensions or metrics that determine the sort order for real time data. */
  var sort: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltDimensionsFields {
  @scala.inline
  def apply(
    ids: String,
    metrics: String,
    alt: String = null,
    dimensions: String = null,
    fields: String = null,
    filters: String = null,
    key: String = null,
    `max-results`: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sort: String = null,
    userIp: String = null
  ): Anon_AltDimensionsFields = {
    val __obj = js.Dynamic.literal(ids = ids, metrics = metrics)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (key != null) __obj.updateDynamic("key")(key)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltDimensionsFields]
  }
}

