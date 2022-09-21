package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsdata/v1beta", "analyticsdata_v1beta.Resource$Properties")
@js.native
open class ResourceProperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchRunPivotReports(): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]): Unit = js.native
  def batchRunPivotReports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(params: ParamsResourcePropertiesBatchrunpivotreports): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(
    params: ParamsResourcePropertiesBatchrunpivotreports,
    callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  def batchRunPivotReports(
    params: ParamsResourcePropertiesBatchrunpivotreports,
    options: BodyResponseCallback[Readable | SchemaBatchRunPivotReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  def batchRunPivotReports(params: ParamsResourcePropertiesBatchrunpivotreports, options: MethodOptions): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(
    params: ParamsResourcePropertiesBatchrunpivotreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  /**
    * Returns multiple pivot reports in a batch. All reports must be for the same GA4 Property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.batchRunPivotReports({
    *     // A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). This property must be specified for the batch. The property within RunPivotReportRequest may either be unspecified or consistent with this property. Example: properties/1234
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "pivotReports": []
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
  def batchRunPivotReports(params: ParamsResourcePropertiesBatchrunpivotreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRunPivotReports(
    params: ParamsResourcePropertiesBatchrunpivotreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchRunReports(): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(callback: BodyResponseCallback[SchemaBatchRunReportsResponse]): Unit = js.native
  def batchRunReports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(params: ParamsResourcePropertiesBatchrunreports): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(
    params: ParamsResourcePropertiesBatchrunreports,
    callback: BodyResponseCallback[SchemaBatchRunReportsResponse]
  ): Unit = js.native
  def batchRunReports(
    params: ParamsResourcePropertiesBatchrunreports,
    options: BodyResponseCallback[Readable | SchemaBatchRunReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchRunReportsResponse]
  ): Unit = js.native
  def batchRunReports(params: ParamsResourcePropertiesBatchrunreports, options: MethodOptions): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(
    params: ParamsResourcePropertiesBatchrunreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchRunReportsResponse]
  ): Unit = js.native
  /**
    * Returns multiple reports in a batch. All reports must be for the same GA4 Property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.batchRunReports({
    *     // A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). This property must be specified for the batch. The property within RunReportRequest may either be unspecified or consistent with this property. Example: properties/1234
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "reports": []
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
  def batchRunReports(params: ParamsResourcePropertiesBatchrunreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRunReports(
    params: ParamsResourcePropertiesBatchrunreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def checkCompatibility(): GaxiosPromise[SchemaCheckCompatibilityResponse] = js.native
  def checkCompatibility(callback: BodyResponseCallback[SchemaCheckCompatibilityResponse]): Unit = js.native
  def checkCompatibility(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckCompatibilityResponse] = js.native
  def checkCompatibility(params: ParamsResourcePropertiesCheckcompatibility): GaxiosPromise[SchemaCheckCompatibilityResponse] = js.native
  def checkCompatibility(
    params: ParamsResourcePropertiesCheckcompatibility,
    callback: BodyResponseCallback[SchemaCheckCompatibilityResponse]
  ): Unit = js.native
  def checkCompatibility(
    params: ParamsResourcePropertiesCheckcompatibility,
    options: BodyResponseCallback[Readable | SchemaCheckCompatibilityResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckCompatibilityResponse]
  ): Unit = js.native
  def checkCompatibility(params: ParamsResourcePropertiesCheckcompatibility, options: MethodOptions): GaxiosPromise[SchemaCheckCompatibilityResponse] = js.native
  def checkCompatibility(
    params: ParamsResourcePropertiesCheckcompatibility,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckCompatibilityResponse]
  ): Unit = js.native
  /**
    * This compatibility method lists dimensions and metrics that can be added to a report request and maintain compatibility. This method fails if the request's dimensions and metrics are incompatible. In Google Analytics, reports fail if they request incompatible dimensions and/or metrics; in that case, you will need to remove dimensions and/or metrics from the incompatible report until the report is compatible. The Realtime and Core reports have different compatibility rules. This method checks compatibility for Core reports.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.checkCompatibility({
    *     // A Google Analytics GA4 property identifier whose events are tracked. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). `property` should be the same value as in your `runReport` request. Example: properties/1234 Set the Property ID to 0 for compatibility checking on dimensions and metrics common to all properties. In this special mode, this method will not return custom dimensions and metrics.
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "compatibilityFilter": "my_compatibilityFilter",
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "metricFilter": {},
    *       //   "metrics": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dimensionCompatibilities": [],
    *   //   "metricCompatibilities": []
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
  def checkCompatibility(params: ParamsResourcePropertiesCheckcompatibility, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkCompatibility(
    params: ParamsResourcePropertiesCheckcompatibility,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def getMetadata(): GaxiosPromise[SchemaMetadata] = js.native
  def getMetadata(callback: BodyResponseCallback[SchemaMetadata]): Unit = js.native
  def getMetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def getMetadata(params: ParamsResourcePropertiesGetmetadata): GaxiosPromise[SchemaMetadata] = js.native
  def getMetadata(params: ParamsResourcePropertiesGetmetadata, callback: BodyResponseCallback[SchemaMetadata]): Unit = js.native
  def getMetadata(
    params: ParamsResourcePropertiesGetmetadata,
    options: BodyResponseCallback[Readable | SchemaMetadata],
    callback: BodyResponseCallback[Readable | SchemaMetadata]
  ): Unit = js.native
  def getMetadata(params: ParamsResourcePropertiesGetmetadata, options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def getMetadata(
    params: ParamsResourcePropertiesGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
  /**
    * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the dimensions and metrics. In this method, a Google Analytics GA4 Property Identifier is specified in the request, and the metadata response includes Custom dimensions and metrics as well as Universal metadata. For example if a custom metric with parameter name `levels_unlocked` is registered to a property, the Metadata response will contain `customEvent:levels_unlocked`. Universal metadata are dimensions and metrics applicable to any property such as `country` and `totalUsers`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.getMetadata({
    *     // Required. The resource name of the metadata to retrieve. This name field is specified in the URL path and not URL parameters. Property is a numeric Google Analytics GA4 Property identifier. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Example: properties/1234/metadata Set the Property ID to 0 for dimensions and metrics common to all properties. In this special mode, this method will not return custom dimensions and metrics.
    *     name: 'properties/my-propertie/metadata',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dimensions": [],
    *   //   "metrics": [],
    *   //   "name": "my_name"
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
  def getMetadata(params: ParamsResourcePropertiesGetmetadata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetadata(
    params: ParamsResourcePropertiesGetmetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runPivotReport(): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(callback: BodyResponseCallback[SchemaRunPivotReportResponse]): Unit = js.native
  def runPivotReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(params: ParamsResourcePropertiesRunpivotreport): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(
    params: ParamsResourcePropertiesRunpivotreport,
    callback: BodyResponseCallback[SchemaRunPivotReportResponse]
  ): Unit = js.native
  def runPivotReport(
    params: ParamsResourcePropertiesRunpivotreport,
    options: BodyResponseCallback[Readable | SchemaRunPivotReportResponse],
    callback: BodyResponseCallback[Readable | SchemaRunPivotReportResponse]
  ): Unit = js.native
  def runPivotReport(params: ParamsResourcePropertiesRunpivotreport, options: MethodOptions): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(
    params: ParamsResourcePropertiesRunpivotreport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunPivotReportResponse]
  ): Unit = js.native
  /**
    * Returns a customized pivot report of your Google Analytics event data. Pivot reports are more advanced and expressive formats than regular reports. In a pivot report, dimensions are only visible if they are included in a pivot. Multiple pivots can be specified to further dissect your data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.runPivotReport({
    *     // A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a batch request, this property should either be unspecified or consistent with the batch-level property. Example: properties/1234
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cohortSpec": {},
    *       //   "currencyCode": "my_currencyCode",
    *       //   "dateRanges": [],
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "keepEmptyRows": false,
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "pivots": [],
    *       //   "property": "my_property",
    *       //   "returnPropertyQuota": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "aggregates": [],
    *   //   "dimensionHeaders": [],
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "metricHeaders": [],
    *   //   "pivotHeaders": [],
    *   //   "propertyQuota": {},
    *   //   "rows": []
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
  def runPivotReport(params: ParamsResourcePropertiesRunpivotreport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runPivotReport(
    params: ParamsResourcePropertiesRunpivotreport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runRealtimeReport(): GaxiosPromise[SchemaRunRealtimeReportResponse] = js.native
  def runRealtimeReport(callback: BodyResponseCallback[SchemaRunRealtimeReportResponse]): Unit = js.native
  def runRealtimeReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunRealtimeReportResponse] = js.native
  def runRealtimeReport(params: ParamsResourcePropertiesRunrealtimereport): GaxiosPromise[SchemaRunRealtimeReportResponse] = js.native
  def runRealtimeReport(
    params: ParamsResourcePropertiesRunrealtimereport,
    callback: BodyResponseCallback[SchemaRunRealtimeReportResponse]
  ): Unit = js.native
  def runRealtimeReport(
    params: ParamsResourcePropertiesRunrealtimereport,
    options: BodyResponseCallback[Readable | SchemaRunRealtimeReportResponse],
    callback: BodyResponseCallback[Readable | SchemaRunRealtimeReportResponse]
  ): Unit = js.native
  def runRealtimeReport(params: ParamsResourcePropertiesRunrealtimereport, options: MethodOptions): GaxiosPromise[SchemaRunRealtimeReportResponse] = js.native
  def runRealtimeReport(
    params: ParamsResourcePropertiesRunrealtimereport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunRealtimeReportResponse]
  ): Unit = js.native
  /**
    * Returns a customized report of realtime event data for your property. Events appear in realtime reports seconds after they have been sent to the Google Analytics. Realtime reports show events and usage data for the periods of time ranging from the present moment to 30 minutes ago (up to 60 minutes for Google Analytics 360 properties). For a guide to constructing realtime requests & understanding responses, see [Creating a Realtime Report](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-basics).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.runRealtimeReport({
    *     // A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Example: properties/1234
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "limit": "my_limit",
    *       //   "metricAggregations": [],
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "minuteRanges": [],
    *       //   "orderBys": [],
    *       //   "returnPropertyQuota": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dimensionHeaders": [],
    *   //   "kind": "my_kind",
    *   //   "maximums": [],
    *   //   "metricHeaders": [],
    *   //   "minimums": [],
    *   //   "propertyQuota": {},
    *   //   "rowCount": 0,
    *   //   "rows": [],
    *   //   "totals": []
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
  def runRealtimeReport(params: ParamsResourcePropertiesRunrealtimereport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runRealtimeReport(
    params: ParamsResourcePropertiesRunrealtimereport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runReport(): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(callback: BodyResponseCallback[SchemaRunReportResponse]): Unit = js.native
  def runReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(params: ParamsResourcePropertiesRunreport): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(params: ParamsResourcePropertiesRunreport, callback: BodyResponseCallback[SchemaRunReportResponse]): Unit = js.native
  def runReport(
    params: ParamsResourcePropertiesRunreport,
    options: BodyResponseCallback[Readable | SchemaRunReportResponse],
    callback: BodyResponseCallback[Readable | SchemaRunReportResponse]
  ): Unit = js.native
  def runReport(params: ParamsResourcePropertiesRunreport, options: MethodOptions): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(
    params: ParamsResourcePropertiesRunreport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunReportResponse]
  ): Unit = js.native
  /**
    * Returns a customized report of your Google Analytics event data. Reports contain statistics derived from data collected by the Google Analytics tracking code. The data returned from the API is as a table with columns for the requested dimensions and metrics. Metrics are individual measurements of user activity on your property, such as active users or event count. Dimensions break down metrics across some common criteria, such as country or event name. For a guide to constructing requests & understanding responses, see [Creating a Report](https://developers.google.com/analytics/devguides/reporting/data/v1/basics).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsdata.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsdata = google.analyticsdata('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsdata.properties.runReport({
    *     // A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a batch request, this property should either be unspecified or consistent with the batch-level property. Example: properties/1234
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cohortSpec": {},
    *       //   "currencyCode": "my_currencyCode",
    *       //   "dateRanges": [],
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "keepEmptyRows": false,
    *       //   "limit": "my_limit",
    *       //   "metricAggregations": [],
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "offset": "my_offset",
    *       //   "orderBys": [],
    *       //   "property": "my_property",
    *       //   "returnPropertyQuota": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dimensionHeaders": [],
    *   //   "kind": "my_kind",
    *   //   "maximums": [],
    *   //   "metadata": {},
    *   //   "metricHeaders": [],
    *   //   "minimums": [],
    *   //   "propertyQuota": {},
    *   //   "rowCount": 0,
    *   //   "rows": [],
    *   //   "totals": []
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
  def runReport(params: ParamsResourcePropertiesRunreport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runReport(
    params: ParamsResourcePropertiesRunreport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
