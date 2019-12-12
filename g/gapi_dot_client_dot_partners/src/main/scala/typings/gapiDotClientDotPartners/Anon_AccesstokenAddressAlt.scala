package typings.gapiDotClientDotPartners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAddressAlt extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /**
    * The address to use when searching for companies.
    * If not given, the geo-located address of the request is used.
    */
  var address: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Company name to search for. */
  var companyName: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** List of reasons for using Google Partner Search to get companies. */
  var gpsMotivations: js.UndefOr[String] = js.native
  /** List of industries the company can help with. */
  var industries: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * List of language codes that company can support. Only primary language
    * subtags are accepted as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCodes: js.UndefOr[String] = js.native
  /** The 3-letter currency code defined in ISO 4217. */
  var `maxMonthlyBudget.currencyCode`: js.UndefOr[String] = js.native
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var `maxMonthlyBudget.nanos`: js.UndefOr[Double] = js.native
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var `maxMonthlyBudget.units`: js.UndefOr[String] = js.native
  /** The 3-letter currency code defined in ISO 4217. */
  var `minMonthlyBudget.currencyCode`: js.UndefOr[String] = js.native
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var `minMonthlyBudget.nanos`: js.UndefOr[Double] = js.native
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var `minMonthlyBudget.units`: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * How to order addresses within the returned companies. Currently, only
    * `address` and `address desc` is supported which will sorted by closest to
    * farthest in distance from given address and farthest to closest distance
    * from given address respectively.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Requested page size. Server may return fewer companies than requested.
    * If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results that the server returns.
    * Typically, this is the value of `ListCompaniesResponse.next_page_token`
    * returned from the previous call to
    * ListCompanies.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Experiment IDs the current request belongs to. */
  var `requestMetadata.experimentIds`: js.UndefOr[String] = js.native
  /** Locale to use for the current request. */
  var `requestMetadata.locale`: js.UndefOr[String] = js.native
  /** Google Partners session ID. */
  var `requestMetadata.partnersSessionId`: js.UndefOr[String] = js.native
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSourceId`: js.UndefOr[String] = js.native
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSubId`: js.UndefOr[String] = js.native
  /** IP address to use instead of the user's geo-located IP address. */
  var `requestMetadata.userOverrides.ipAddress`: js.UndefOr[String] = js.native
  /** Logged-in user ID to impersonate instead of the user's ID. */
  var `requestMetadata.userOverrides.userId`: js.UndefOr[String] = js.native
  /**
    * List of services that the returned agencies should provide. If this is
    * not empty, any returned agency must have at least one of these services,
    * or one of the specializations in the "specializations" field.
    */
  var services: js.UndefOr[String] = js.native
  /**
    * List of specializations that the returned agencies should provide. If this
    * is not empty, any returned agency must have at least one of these
    * specializations, or one of the services in the "services" field.
    */
  var specializations: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /**
    * The view of the `Company` resource to be returned. This must not be
    * `COMPANY_VIEW_UNSPECIFIED`.
    */
  var view: js.UndefOr[String] = js.native
  /**
    * Website URL that will help to find a better matched company.
    * .
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

