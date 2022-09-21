package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsdata/v1alpha", "analyticsdata_v1alpha.Resource$V1alpha")
@js.native
open class ResourceV1alpha protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchRunPivotReports(): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]): Unit = js.native
  def batchRunPivotReports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(params: ParamsResourceV1alphaBatchrunpivotreports): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(
    params: ParamsResourceV1alphaBatchrunpivotreports,
    callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  def batchRunPivotReports(
    params: ParamsResourceV1alphaBatchrunpivotreports,
    options: BodyResponseCallback[Readable | SchemaBatchRunPivotReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  def batchRunPivotReports(params: ParamsResourceV1alphaBatchrunpivotreports, options: MethodOptions): GaxiosPromise[SchemaBatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(
    params: ParamsResourceV1alphaBatchrunpivotreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchRunPivotReportsResponse]
  ): Unit = js.native
  /**
    * Returns multiple pivot reports in a batch. All reports must be for the same Entity.
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
    * const analyticsdata = google.analyticsdata('v1alpha');
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
    *   const res = await analyticsdata.batchRunPivotReports({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entity": {},
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def batchRunPivotReports(params: ParamsResourceV1alphaBatchrunpivotreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRunPivotReports(
    params: ParamsResourceV1alphaBatchrunpivotreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchRunReports(): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(callback: BodyResponseCallback[SchemaBatchRunReportsResponse]): Unit = js.native
  def batchRunReports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(params: ParamsResourceV1alphaBatchrunreports): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(
    params: ParamsResourceV1alphaBatchrunreports,
    callback: BodyResponseCallback[SchemaBatchRunReportsResponse]
  ): Unit = js.native
  def batchRunReports(
    params: ParamsResourceV1alphaBatchrunreports,
    options: BodyResponseCallback[Readable | SchemaBatchRunReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchRunReportsResponse]
  ): Unit = js.native
  def batchRunReports(params: ParamsResourceV1alphaBatchrunreports, options: MethodOptions): GaxiosPromise[SchemaBatchRunReportsResponse] = js.native
  def batchRunReports(
    params: ParamsResourceV1alphaBatchrunreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchRunReportsResponse]
  ): Unit = js.native
  /**
    * Returns multiple reports in a batch. All reports must be for the same Entity.
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
    * const analyticsdata = google.analyticsdata('v1alpha');
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
    *   const res = await analyticsdata.batchRunReports({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entity": {},
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def batchRunReports(params: ParamsResourceV1alphaBatchrunreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchRunReports(
    params: ParamsResourceV1alphaBatchrunreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def runPivotReport(): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(callback: BodyResponseCallback[SchemaRunPivotReportResponse]): Unit = js.native
  def runPivotReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(params: ParamsResourceV1alphaRunpivotreport): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(
    params: ParamsResourceV1alphaRunpivotreport,
    callback: BodyResponseCallback[SchemaRunPivotReportResponse]
  ): Unit = js.native
  def runPivotReport(
    params: ParamsResourceV1alphaRunpivotreport,
    options: BodyResponseCallback[Readable | SchemaRunPivotReportResponse],
    callback: BodyResponseCallback[Readable | SchemaRunPivotReportResponse]
  ): Unit = js.native
  def runPivotReport(params: ParamsResourceV1alphaRunpivotreport, options: MethodOptions): GaxiosPromise[SchemaRunPivotReportResponse] = js.native
  def runPivotReport(
    params: ParamsResourceV1alphaRunpivotreport,
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
    * const analyticsdata = google.analyticsdata('v1alpha');
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
    *   const res = await analyticsdata.runPivotReport({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cohortSpec": {},
    *       //   "currencyCode": "my_currencyCode",
    *       //   "dateRanges": [],
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "entity": {},
    *       //   "keepEmptyRows": false,
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "pivots": [],
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
  def runPivotReport(params: ParamsResourceV1alphaRunpivotreport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runPivotReport(
    params: ParamsResourceV1alphaRunpivotreport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runReport(): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(callback: BodyResponseCallback[SchemaRunReportResponse]): Unit = js.native
  def runReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(params: ParamsResourceV1alphaRunreport): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(params: ParamsResourceV1alphaRunreport, callback: BodyResponseCallback[SchemaRunReportResponse]): Unit = js.native
  def runReport(
    params: ParamsResourceV1alphaRunreport,
    options: BodyResponseCallback[Readable | SchemaRunReportResponse],
    callback: BodyResponseCallback[Readable | SchemaRunReportResponse]
  ): Unit = js.native
  def runReport(params: ParamsResourceV1alphaRunreport, options: MethodOptions): GaxiosPromise[SchemaRunReportResponse] = js.native
  def runReport(
    params: ParamsResourceV1alphaRunreport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunReportResponse]
  ): Unit = js.native
  /**
    * Returns a customized report of your Google Analytics event data. Reports contain statistics derived from data collected by the Google Analytics tracking code. The data returned from the API is as a table with columns for the requested dimensions and metrics. Metrics are individual measurements of user activity on your property, such as active users or event count. Dimensions break down metrics across some common criteria, such as country or event name.
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
    * const analyticsdata = google.analyticsdata('v1alpha');
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
    *   const res = await analyticsdata.runReport({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cohortSpec": {},
    *       //   "currencyCode": "my_currencyCode",
    *       //   "dateRanges": [],
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "entity": {},
    *       //   "keepEmptyRows": false,
    *       //   "limit": "my_limit",
    *       //   "metricAggregations": [],
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "offset": "my_offset",
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
  def runReport(params: ParamsResourceV1alphaRunreport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runReport(
    params: ParamsResourceV1alphaRunreport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
