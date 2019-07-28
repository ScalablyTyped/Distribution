package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'. */
  var dimensions: js.UndefOr[String] = js.undefined
  /**
    * End date for fetching Analytics data. Request can should specify an end date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or
    * 7daysAgo). The default value is yesterday.
    */
  var `end-date`: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** A comma-separated list of dimension or metric filters to be applied to Analytics data. */
  var filters: js.UndefOr[String] = js.undefined
  /** Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. */
  var ids: String
  /** The response will include empty rows if this parameter is set to true, the default is true */
  var `include-empty-rows`: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The maximum number of entries to include in this feed. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  /** A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified. */
  var metrics: String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The selected format for the response. Default format is JSON. */
  var output: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The desired sampling level. */
  var samplingLevel: js.UndefOr[String] = js.undefined
  /** An Analytics segment to be applied to data. */
  var segment: js.UndefOr[String] = js.undefined
  /** A comma-separated list of dimensions or metrics that determine the sort order for Analytics data. */
  var sort: js.UndefOr[String] = js.undefined
  /**
    * Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or
    * 7daysAgo). The default value is 7daysAgo.
    */
  var `start-date`: String
  /** An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. */
  var `start-index`: js.UndefOr[Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(
    `end-date`: String,
    ids: String,
    metrics: String,
    `start-date`: String,
    alt: String = null,
    dimensions: String = null,
    fields: String = null,
    filters: String = null,
    `include-empty-rows`: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    `max-results`: Int | Double = null,
    oauth_token: String = null,
    output: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    samplingLevel: String = null,
    segment: String = null,
    sort: String = null,
    `start-index`: Int | Double = null,
    userIp: String = null
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal(ids = ids, metrics = metrics)
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(`include-empty-rows`)) __obj.updateDynamic("include-empty-rows")(`include-empty-rows`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Alt]
  }
}

