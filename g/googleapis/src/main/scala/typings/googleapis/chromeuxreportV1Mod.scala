package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeuxreportV1Mod {
  
  object chromeuxreportV1 {
    
    @JSImport("googleapis/build/src/apis/chromeuxreport/v1", "chromeuxreport_v1.Chromeuxreport")
    @js.native
    open class Chromeuxreport protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var records: ResourceRecords = js.native
    }
    
    @JSImport("googleapis/build/src/apis/chromeuxreport/v1", "chromeuxreport_v1.Resource$Records")
    @js.native
    open class ResourceRecords protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def queryRecord(): GaxiosPromise[SchemaQueryResponse] = js.native
      def queryRecord(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
      def queryRecord(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
      def queryRecord(params: ParamsResourceRecordsQueryrecord): GaxiosPromise[SchemaQueryResponse] = js.native
      def queryRecord(params: ParamsResourceRecordsQueryrecord, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
      def queryRecord(
        params: ParamsResourceRecordsQueryrecord,
        options: BodyResponseCallback[Readable | SchemaQueryResponse],
        callback: BodyResponseCallback[Readable | SchemaQueryResponse]
      ): Unit = js.native
      def queryRecord(params: ParamsResourceRecordsQueryrecord, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
      def queryRecord(
        params: ParamsResourceRecordsQueryrecord,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaQueryResponse]
      ): Unit = js.native
      /**
        * Queries the Chrome User Experience for a single `record` for a given site. Returns a `record` that contains one or more `metrics` corresponding to performance data about the requested site.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/chromeuxreport.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const chromeuxreport = google.chromeuxreport('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await chromeuxreport.records.queryRecord({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "effectiveConnectionType": "my_effectiveConnectionType",
        *       //   "formFactor": "my_formFactor",
        *       //   "metrics": [],
        *       //   "origin": "my_origin",
        *       //   "url": "my_url"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "record": {},
        *   //   "urlNormalizationDetails": {}
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def queryRecord(params: ParamsResourceRecordsQueryrecord, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def queryRecord(
        params: ParamsResourceRecordsQueryrecord,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceRecordsQueryrecord
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaQueryRequest] = js.undefined
    }
    object ParamsResourceRecordsQueryrecord {
      
      inline def apply(): ParamsResourceRecordsQueryrecord = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceRecordsQueryrecord]
      }
      
      extension [Self <: ParamsResourceRecordsQueryrecord](x: Self) {
        
        inline def setRequestBody(value: SchemaQueryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaBin extends StObject {
      
      /**
        * The proportion of users that experienced this bin's value for the given metric.
        */
      var density: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * End is the end of the data bin. If end is not populated, then the bin has no end and is valid from start to +inf.
        */
      var end: js.UndefOr[Any | Null] = js.undefined
      
      /**
        * Start is the beginning of the data bin.
        */
      var start: js.UndefOr[Any | Null] = js.undefined
    }
    object SchemaBin {
      
      inline def apply(): SchemaBin = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBin]
      }
      
      extension [Self <: SchemaBin](x: Self) {
        
        inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
        
        inline def setDensityNull: Self = StObject.set(x, "density", null)
        
        inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
        
        inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndNull: Self = StObject.set(x, "end", null)
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartNull: Self = StObject.set(x, "start", null)
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait SchemaKey extends StObject {
      
      /**
        * The effective connection type is the general connection class that all users experienced for this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as specified in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type is unspecified, then aggregated data over all effective connection types will be returned.
        */
      var effectiveConnectionType: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The form factor is the device class that all users used to access the site for this record. If the form factor is unspecified, then aggregated data over all form factors will be returned.
        */
      var formFactor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Origin specifies the origin that this record is for. Note: When specifying an origin, data for loads under this origin over all pages are aggregated into origin level user experience data.
        */
      var origin: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Url specifies a specific url that this record is for. Note: When specifying a "url" only data for that specific url will be aggregated.
        */
      var url: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaKey {
      
      inline def apply(): SchemaKey = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaKey]
      }
      
      extension [Self <: SchemaKey](x: Self) {
        
        inline def setEffectiveConnectionType(value: String): Self = StObject.set(x, "effectiveConnectionType", value.asInstanceOf[js.Any])
        
        inline def setEffectiveConnectionTypeNull: Self = StObject.set(x, "effectiveConnectionType", null)
        
        inline def setEffectiveConnectionTypeUndefined: Self = StObject.set(x, "effectiveConnectionType", js.undefined)
        
        inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
        
        inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
        
        inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
        
        inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        inline def setOriginNull: Self = StObject.set(x, "origin", null)
        
        inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlNull: Self = StObject.set(x, "url", null)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait SchemaMetric extends StObject {
      
      /**
        * The histogram of user experiences for a metric. The histogram will have at least one bin and the densities of all bins will add up to ~1.
        */
      var histogram: js.UndefOr[js.Array[SchemaBin]] = js.undefined
      
      /**
        * Common useful percentiles of the Metric. The value type for the percentiles will be the same as the value types given for the Histogram bins.
        */
      var percentiles: js.UndefOr[SchemaPercentiles] = js.undefined
    }
    object SchemaMetric {
      
      inline def apply(): SchemaMetric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaMetric]
      }
      
      extension [Self <: SchemaMetric](x: Self) {
        
        inline def setHistogram(value: js.Array[SchemaBin]): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
        
        inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
        
        inline def setHistogramVarargs(value: SchemaBin*): Self = StObject.set(x, "histogram", js.Array(value*))
        
        inline def setPercentiles(value: SchemaPercentiles): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
        
        inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
      }
    }
    
    trait SchemaPercentiles extends StObject {
      
      /**
        * 75% of users experienced the given metric at or below this value.
        */
      var p75: js.UndefOr[Any | Null] = js.undefined
    }
    object SchemaPercentiles {
      
      inline def apply(): SchemaPercentiles = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPercentiles]
      }
      
      extension [Self <: SchemaPercentiles](x: Self) {
        
        inline def setP75(value: Any): Self = StObject.set(x, "p75", value.asInstanceOf[js.Any])
        
        inline def setP75Null: Self = StObject.set(x, "p75", null)
        
        inline def setP75Undefined: Self = StObject.set(x, "p75", js.undefined)
      }
    }
    
    trait SchemaQueryRequest extends StObject {
      
      /**
        * The effective connection type is a query dimension that specifies the effective network class that the record's data should belong to. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as specified in: https://wicg.github.io/netinfo/#effective-connection-types Note: If no effective connection type is specified, then a special record with aggregated data over all effective connection types will be returned.
        */
      var effectiveConnectionType: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The form factor is a query dimension that specifies the device class that the record's data should belong to. Note: If no form factor is specified, then a special record with aggregated data over all form factors will be returned.
        */
      var formFactor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The metrics that should be included in the response. If none are specified then any metrics found will be returned. Allowed values: ["first_contentful_paint", "first_input_delay", "largest_contentful_paint", "cumulative_layout_shift", "experimental_time_to_first_byte", "experimental_interaction_to_next_paint"]
        */
      var metrics: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The url pattern "origin" refers to a url pattern that is the origin of a website. Examples: "https://example.com", "https://cloud.google.com"
        */
      var origin: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The url pattern "url" refers to a url pattern that is any arbitrary url. Examples: "https://example.com/", "https://cloud.google.com/why-google-cloud/"
        */
      var url: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaQueryRequest {
      
      inline def apply(): SchemaQueryRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaQueryRequest]
      }
      
      extension [Self <: SchemaQueryRequest](x: Self) {
        
        inline def setEffectiveConnectionType(value: String): Self = StObject.set(x, "effectiveConnectionType", value.asInstanceOf[js.Any])
        
        inline def setEffectiveConnectionTypeNull: Self = StObject.set(x, "effectiveConnectionType", null)
        
        inline def setEffectiveConnectionTypeUndefined: Self = StObject.set(x, "effectiveConnectionType", js.undefined)
        
        inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
        
        inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
        
        inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
        
        inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
        
        inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        inline def setOriginNull: Self = StObject.set(x, "origin", null)
        
        inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlNull: Self = StObject.set(x, "url", null)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait SchemaQueryResponse extends StObject {
      
      /**
        * The record that was found.
        */
      var record: js.UndefOr[SchemaRecord] = js.undefined
      
      /**
        * These are details about automated normalization actions that were taken in order to make the requested `url_pattern` valid.
        */
      var urlNormalizationDetails: js.UndefOr[SchemaUrlNormalization] = js.undefined
    }
    object SchemaQueryResponse {
      
      inline def apply(): SchemaQueryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaQueryResponse]
      }
      
      extension [Self <: SchemaQueryResponse](x: Self) {
        
        inline def setRecord(value: SchemaRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
        
        inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
        
        inline def setUrlNormalizationDetails(value: SchemaUrlNormalization): Self = StObject.set(x, "urlNormalizationDetails", value.asInstanceOf[js.Any])
        
        inline def setUrlNormalizationDetailsUndefined: Self = StObject.set(x, "urlNormalizationDetails", js.undefined)
      }
    }
    
    trait SchemaRecord extends StObject {
      
      /**
        * Key defines all of the unique querying parameters needed to look up a user experience record.
        */
      var key: js.UndefOr[SchemaKey] = js.undefined
      
      /**
        * Metrics is the map of user experience data available for the record defined in the key field. Metrics are keyed on the metric name. Allowed key values: ["first_contentful_paint", "first_input_delay", "largest_contentful_paint", "cumulative_layout_shift"]
        */
      var metrics: js.UndefOr[StringDictionary[SchemaMetric] | Null] = js.undefined
    }
    object SchemaRecord {
      
      inline def apply(): SchemaRecord = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRecord]
      }
      
      extension [Self <: SchemaRecord](x: Self) {
        
        inline def setKey(value: SchemaKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setMetrics(value: StringDictionary[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      }
    }
    
    trait SchemaUrlNormalization extends StObject {
      
      /**
        * The URL after any normalization actions. This is a valid user experience URL that could reasonably be looked up.
        */
      var normalizedUrl: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The original requested URL prior to any normalization actions.
        */
      var originalUrl: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaUrlNormalization {
      
      inline def apply(): SchemaUrlNormalization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlNormalization]
      }
      
      extension [Self <: SchemaUrlNormalization](x: Self) {
        
        inline def setNormalizedUrl(value: String): Self = StObject.set(x, "normalizedUrl", value.asInstanceOf[js.Any])
        
        inline def setNormalizedUrlNull: Self = StObject.set(x, "normalizedUrl", null)
        
        inline def setNormalizedUrlUndefined: Self = StObject.set(x, "normalizedUrl", js.undefined)
        
        inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
        
        inline def setOriginalUrlNull: Self = StObject.set(x, "originalUrl", null)
        
        inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
