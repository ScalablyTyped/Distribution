package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_MaxresultsStartindexSamplingLevelPrettyPrintQuotaUser extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** A comma-separated list of Multi-Channel Funnels dimensions. E.g., 'mcf:source,mcf:medium'. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * End date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or
                   * 7daysAgo). The default value is 7daysAgo.
                   */
  var `end-date`: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** A comma-separated list of dimension or metric filters to be applied to the Analytics data. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. */
  var ids: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of entries to include in this feed. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /** A comma-separated list of Multi-Channel Funnels metrics. E.g., 'mcf:totalConversions,mcf:totalConversionValue'. At least one metric must be specified. */
  var metrics: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The desired sampling level. */
  var samplingLevel: js.UndefOr[java.lang.String] = js.undefined
  /** A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data. */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or
                   * 7daysAgo). The default value is 7daysAgo.
                   */
  var `start-date`: java.lang.String
  /** An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. */
  var `start-index`: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

