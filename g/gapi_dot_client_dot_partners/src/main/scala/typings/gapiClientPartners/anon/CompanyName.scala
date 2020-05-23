package typings.gapiClientPartners.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyName extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /**
    * The address to use when searching for companies.
    * If not given, the geo-located address of the request is used.
    */
  var address: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Company name to search for. */
  var companyName: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** List of reasons for using Google Partner Search to get companies. */
  var gpsMotivations: js.UndefOr[String] = js.undefined
  /** List of industries the company can help with. */
  var industries: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * List of language codes that company can support. Only primary language
    * subtags are accepted as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCodes: js.UndefOr[String] = js.undefined
  /** The 3-letter currency code defined in ISO 4217. */
  @JSName("maxMonthlyBudget.currencyCode")
  var maxMonthlyBudgetDotcurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  @JSName("maxMonthlyBudget.nanos")
  var maxMonthlyBudgetDotnanos: js.UndefOr[Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  @JSName("maxMonthlyBudget.units")
  var maxMonthlyBudgetDotunits: js.UndefOr[String] = js.undefined
  /** The 3-letter currency code defined in ISO 4217. */
  @JSName("minMonthlyBudget.currencyCode")
  var minMonthlyBudgetDotcurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  @JSName("minMonthlyBudget.nanos")
  var minMonthlyBudgetDotnanos: js.UndefOr[Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  @JSName("minMonthlyBudget.units")
  var minMonthlyBudgetDotunits: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * How to order addresses within the returned companies. Currently, only
    * `address` and `address desc` is supported which will sorted by closest to
    * farthest in distance from given address and farthest to closest distance
    * from given address respectively.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /**
    * Requested page size. Server may return fewer companies than requested.
    * If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * A token identifying a page of results that the server returns.
    * Typically, this is the value of `ListCompaniesResponse.next_page_token`
    * returned from the previous call to
    * ListCompanies.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Experiment IDs the current request belongs to. */
  @JSName("requestMetadata.experimentIds")
  var requestMetadataDotexperimentIds: js.UndefOr[String] = js.undefined
  /** Locale to use for the current request. */
  @JSName("requestMetadata.locale")
  var requestMetadataDotlocale: js.UndefOr[String] = js.undefined
  /** Google Partners session ID. */
  @JSName("requestMetadata.partnersSessionId")
  var requestMetadataDotpartnersSessionId: js.UndefOr[String] = js.undefined
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSourceId")
  var requestMetadataDottrafficSourceDottrafficSourceId: js.UndefOr[String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSubId")
  var requestMetadataDottrafficSourceDottrafficSubId: js.UndefOr[String] = js.undefined
  /** IP address to use instead of the user's geo-located IP address. */
  @JSName("requestMetadata.userOverrides.ipAddress")
  var requestMetadataDotuserOverridesDotipAddress: js.UndefOr[String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  @JSName("requestMetadata.userOverrides.userId")
  var requestMetadataDotuserOverridesDotuserId: js.UndefOr[String] = js.undefined
  /**
    * List of services that the returned agencies should provide. If this is
    * not empty, any returned agency must have at least one of these services,
    * or one of the specializations in the "specializations" field.
    */
  var services: js.UndefOr[String] = js.undefined
  /**
    * List of specializations that the returned agencies should provide. If this
    * is not empty, any returned agency must have at least one of these
    * specializations, or one of the services in the "services" field.
    */
  var specializations: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * The view of the `Company` resource to be returned. This must not be
    * `COMPANY_VIEW_UNSPECIFIED`.
    */
  var view: js.UndefOr[String] = js.undefined
  /**
    * Website URL that will help to find a better matched company.
    * .
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object CompanyName {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    address: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    companyName: String = null,
    fields: String = null,
    gpsMotivations: String = null,
    industries: String = null,
    key: String = null,
    languageCodes: String = null,
    maxMonthlyBudgetDotcurrencyCode: String = null,
    maxMonthlyBudgetDotnanos: js.UndefOr[Double] = js.undefined,
    maxMonthlyBudgetDotunits: String = null,
    minMonthlyBudgetDotcurrencyCode: String = null,
    minMonthlyBudgetDotnanos: js.UndefOr[Double] = js.undefined,
    minMonthlyBudgetDotunits: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestMetadataDotexperimentIds: String = null,
    requestMetadataDotlocale: String = null,
    requestMetadataDotpartnersSessionId: String = null,
    requestMetadataDottrafficSourceDottrafficSourceId: String = null,
    requestMetadataDottrafficSourceDottrafficSubId: String = null,
    requestMetadataDotuserOverridesDotipAddress: String = null,
    requestMetadataDotuserOverridesDotuserId: String = null,
    services: String = null,
    specializations: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    view: String = null,
    websiteUrl: String = null
  ): CompanyName = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (gpsMotivations != null) __obj.updateDynamic("gpsMotivations")(gpsMotivations.asInstanceOf[js.Any])
    if (industries != null) __obj.updateDynamic("industries")(industries.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (languageCodes != null) __obj.updateDynamic("languageCodes")(languageCodes.asInstanceOf[js.Any])
    if (maxMonthlyBudgetDotcurrencyCode != null) __obj.updateDynamic("maxMonthlyBudget.currencyCode")(maxMonthlyBudgetDotcurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMonthlyBudgetDotnanos)) __obj.updateDynamic("maxMonthlyBudget.nanos")(maxMonthlyBudgetDotnanos.get.asInstanceOf[js.Any])
    if (maxMonthlyBudgetDotunits != null) __obj.updateDynamic("maxMonthlyBudget.units")(maxMonthlyBudgetDotunits.asInstanceOf[js.Any])
    if (minMonthlyBudgetDotcurrencyCode != null) __obj.updateDynamic("minMonthlyBudget.currencyCode")(minMonthlyBudgetDotcurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(minMonthlyBudgetDotnanos)) __obj.updateDynamic("minMonthlyBudget.nanos")(minMonthlyBudgetDotnanos.get.asInstanceOf[js.Any])
    if (minMonthlyBudgetDotunits != null) __obj.updateDynamic("minMonthlyBudget.units")(minMonthlyBudgetDotunits.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestMetadataDotexperimentIds != null) __obj.updateDynamic("requestMetadata.experimentIds")(requestMetadataDotexperimentIds.asInstanceOf[js.Any])
    if (requestMetadataDotlocale != null) __obj.updateDynamic("requestMetadata.locale")(requestMetadataDotlocale.asInstanceOf[js.Any])
    if (requestMetadataDotpartnersSessionId != null) __obj.updateDynamic("requestMetadata.partnersSessionId")(requestMetadataDotpartnersSessionId.asInstanceOf[js.Any])
    if (requestMetadataDottrafficSourceDottrafficSourceId != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSourceId")(requestMetadataDottrafficSourceDottrafficSourceId.asInstanceOf[js.Any])
    if (requestMetadataDottrafficSourceDottrafficSubId != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSubId")(requestMetadataDottrafficSourceDottrafficSubId.asInstanceOf[js.Any])
    if (requestMetadataDotuserOverridesDotipAddress != null) __obj.updateDynamic("requestMetadata.userOverrides.ipAddress")(requestMetadataDotuserOverridesDotipAddress.asInstanceOf[js.Any])
    if (requestMetadataDotuserOverridesDotuserId != null) __obj.updateDynamic("requestMetadata.userOverrides.userId")(requestMetadataDotuserOverridesDotuserId.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (specializations != null) __obj.updateDynamic("specializations")(specializations.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanyName]
  }
}

