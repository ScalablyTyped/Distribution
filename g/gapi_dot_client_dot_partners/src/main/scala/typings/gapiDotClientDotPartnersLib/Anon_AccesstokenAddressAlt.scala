package typings
package gapiDotClientDotPartnersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAddressAlt extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The address to use when searching for companies.
    * If not given, the geo-located address of the request is used.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Company name to search for. */
  var companyName: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** List of reasons for using Google Partner Search to get companies. */
  var gpsMotivations: js.UndefOr[java.lang.String] = js.undefined
  /** List of industries the company can help with. */
  var industries: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of language codes that company can support. Only primary language
    * subtags are accepted as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCodes: js.UndefOr[java.lang.String] = js.undefined
  /** The 3-letter currency code defined in ISO 4217. */
  var `maxMonthlyBudget.currencyCode`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var `maxMonthlyBudget.nanos`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var `maxMonthlyBudget.units`: js.UndefOr[java.lang.String] = js.undefined
  /** The 3-letter currency code defined in ISO 4217. */
  var `minMonthlyBudget.currencyCode`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var `minMonthlyBudget.nanos`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var `minMonthlyBudget.units`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How to order addresses within the returned companies. Currently, only
    * `address` and `address desc` is supported which will sorted by closest to
    * farthest in distance from given address and farthest to closest distance
    * from given address respectively.
    */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Requested page size. Server may return fewer companies than requested.
    * If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A token identifying a page of results that the server returns.
    * Typically, this is the value of `ListCompaniesResponse.next_page_token`
    * returned from the previous call to
    * ListCompanies.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Experiment IDs the current request belongs to. */
  var `requestMetadata.experimentIds`: js.UndefOr[java.lang.String] = js.undefined
  /** Locale to use for the current request. */
  var `requestMetadata.locale`: js.UndefOr[java.lang.String] = js.undefined
  /** Google Partners session ID. */
  var `requestMetadata.partnersSessionId`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSourceId`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSubId`: js.UndefOr[java.lang.String] = js.undefined
  /** IP address to use instead of the user's geo-located IP address. */
  var `requestMetadata.userOverrides.ipAddress`: js.UndefOr[java.lang.String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  var `requestMetadata.userOverrides.userId`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of services that the returned agencies should provide. If this is
    * not empty, any returned agency must have at least one of these services,
    * or one of the specializations in the "specializations" field.
    */
  var services: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of specializations that the returned agencies should provide. If this
    * is not empty, any returned agency must have at least one of these
    * specializations, or one of the services in the "services" field.
    */
  var specializations: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The view of the `Company` resource to be returned. This must not be
    * `COMPANY_VIEW_UNSPECIFIED`.
    */
  var view: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Website URL that will help to find a better matched company.
    * .
    */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAddressAlt {
  @scala.inline
  def apply(
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    address: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    companyName: java.lang.String = null,
    fields: java.lang.String = null,
    gpsMotivations: java.lang.String = null,
    industries: java.lang.String = null,
    key: java.lang.String = null,
    languageCodes: java.lang.String = null,
    `maxMonthlyBudget.currencyCode`: java.lang.String = null,
    `maxMonthlyBudget.nanos`: scala.Int | scala.Double = null,
    `maxMonthlyBudget.units`: java.lang.String = null,
    `minMonthlyBudget.currencyCode`: java.lang.String = null,
    `minMonthlyBudget.nanos`: scala.Int | scala.Double = null,
    `minMonthlyBudget.units`: java.lang.String = null,
    oauth_token: java.lang.String = null,
    orderBy: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    `requestMetadata.experimentIds`: java.lang.String = null,
    `requestMetadata.locale`: java.lang.String = null,
    `requestMetadata.partnersSessionId`: java.lang.String = null,
    `requestMetadata.trafficSource.trafficSourceId`: java.lang.String = null,
    `requestMetadata.trafficSource.trafficSubId`: java.lang.String = null,
    `requestMetadata.userOverrides.ipAddress`: java.lang.String = null,
    `requestMetadata.userOverrides.userId`: java.lang.String = null,
    services: java.lang.String = null,
    specializations: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null,
    view: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): Anon_AccesstokenAddressAlt = {
    val __obj = js.Dynamic.literal()
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (address != null) __obj.updateDynamic("address")(address)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (companyName != null) __obj.updateDynamic("companyName")(companyName)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (gpsMotivations != null) __obj.updateDynamic("gpsMotivations")(gpsMotivations)
    if (industries != null) __obj.updateDynamic("industries")(industries)
    if (key != null) __obj.updateDynamic("key")(key)
    if (languageCodes != null) __obj.updateDynamic("languageCodes")(languageCodes)
    if (`maxMonthlyBudget.currencyCode` != null) __obj.updateDynamic("maxMonthlyBudget.currencyCode")(`maxMonthlyBudget.currencyCode`)
    if (`maxMonthlyBudget.nanos` != null) __obj.updateDynamic("maxMonthlyBudget.nanos")(`maxMonthlyBudget.nanos`.asInstanceOf[js.Any])
    if (`maxMonthlyBudget.units` != null) __obj.updateDynamic("maxMonthlyBudget.units")(`maxMonthlyBudget.units`)
    if (`minMonthlyBudget.currencyCode` != null) __obj.updateDynamic("minMonthlyBudget.currencyCode")(`minMonthlyBudget.currencyCode`)
    if (`minMonthlyBudget.nanos` != null) __obj.updateDynamic("minMonthlyBudget.nanos")(`minMonthlyBudget.nanos`.asInstanceOf[js.Any])
    if (`minMonthlyBudget.units` != null) __obj.updateDynamic("minMonthlyBudget.units")(`minMonthlyBudget.units`)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (`requestMetadata.experimentIds` != null) __obj.updateDynamic("requestMetadata.experimentIds")(`requestMetadata.experimentIds`)
    if (`requestMetadata.locale` != null) __obj.updateDynamic("requestMetadata.locale")(`requestMetadata.locale`)
    if (`requestMetadata.partnersSessionId` != null) __obj.updateDynamic("requestMetadata.partnersSessionId")(`requestMetadata.partnersSessionId`)
    if (`requestMetadata.trafficSource.trafficSourceId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSourceId")(`requestMetadata.trafficSource.trafficSourceId`)
    if (`requestMetadata.trafficSource.trafficSubId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSubId")(`requestMetadata.trafficSource.trafficSubId`)
    if (`requestMetadata.userOverrides.ipAddress` != null) __obj.updateDynamic("requestMetadata.userOverrides.ipAddress")(`requestMetadata.userOverrides.ipAddress`)
    if (`requestMetadata.userOverrides.userId` != null) __obj.updateDynamic("requestMetadata.userOverrides.userId")(`requestMetadata.userOverrides.userId`)
    if (services != null) __obj.updateDynamic("services")(services)
    if (specializations != null) __obj.updateDynamic("specializations")(specializations)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (view != null) __obj.updateDynamic("view")(view)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[Anon_AccesstokenAddressAlt]
  }
}

