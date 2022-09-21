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

@JSImport("googleapis/build/src/apis/analyticsdata/v1alpha", "analyticsdata_v1alpha.Resource$Properties")
@js.native
open class ResourceProperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
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
    * The Google Analytics Realtime API returns a customized report of realtime event data for your property. These reports show events and usage from the last 30 minutes.
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
}
