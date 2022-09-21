package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/beyondcorp/v1alpha", "beyondcorp_v1alpha.Resource$Projects$Locations$Insights")
@js.native
open class ResourceProjectsLocationsInsights protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def configuredInsight(): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse] = js.native
  def configuredInsight(
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse]
  ): Unit = js.native
  def configuredInsight(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse] = js.native
  def configuredInsight(params: ParamsResourceProjectsLocationsInsightsConfiguredinsight): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse] = js.native
  def configuredInsight(
    params: ParamsResourceProjectsLocationsInsightsConfiguredinsight,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse]
  ): Unit = js.native
  def configuredInsight(
    params: ParamsResourceProjectsLocationsInsightsConfiguredinsight,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse
    ]
  ): Unit = js.native
  def configuredInsight(params: ParamsResourceProjectsLocationsInsightsConfiguredinsight, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse] = js.native
  def configuredInsight(
    params: ParamsResourceProjectsLocationsInsightsConfiguredinsight,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse]
  ): Unit = js.native
  /**
    * Gets the value for a selected particular insight based on the provided filters. Use the organization level path for fetching at org level and project level path for fetching the insight value specific to a particular project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/beyondcorp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const beyondcorp = google.beyondcorp('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await beyondcorp.projects.locations.insights.configuredInsight({
    *     // Required. Aggregation type. Available aggregation could be fetched by calling insight list and get APIs in `BASIC` view.
    *     aggregation: 'placeholder-value',
    *     // Optional. Filterable parameters to be added to the grouping clause. Available fields could be fetched by calling insight list and get APIs in `BASIC` view. `=` is the only comparison operator supported. `AND` is the only logical operator supported. Usage: field_filter="fieldName1=fieldVal1 AND fieldName2=fieldVal2". NOTE: Only `AND` conditions are allowed. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for the filtering the corresponding fields in this filter field. (These expressions are based on the filter language described at https://google.aip.dev/160).
    *     'customGrouping.fieldFilter': 'placeholder-value',
    *     // Required. Fields to be used for grouping. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for declaring the fields to be grouped-by here.
    *     'customGrouping.groupFields': 'placeholder-value',
    *     // Required. Ending time for the duration for which insight is to be pulled.
    *     endTime: 'placeholder-value',
    *     // Optional. Other filterable/configurable parameters as applicable to the selected insight. Available fields could be fetched by calling insight list and get APIs in `BASIC` view. `=` is the only comparison operator supported. `AND` is the only logical operator supported. Usage: field_filter="fieldName1=fieldVal1 AND fieldName2=fieldVal2". NOTE: Only `AND` conditions are allowed. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for the filtering the corresponding fields in this filter field. (These expressions are based on the filter language described at https://google.aip.dev/160).
    *     fieldFilter: 'placeholder-value',
    *     // Optional. Group id of the available groupings for the insight. Available groupings could be fetched by calling insight list and get APIs in `BASIC` view.
    *     group: 'placeholder-value',
    *     // Required. The resource name of the insight using the form: `organizations/{organization_id\}/locations/{location_id\}/insights/{insight_id\}` `projects/{project_id\}/locations/{location_id\}/insights/{insight_id\}`.
    *     insight: 'projects/my-project/locations/my-location/insights/my-insight',
    *     // Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. Used to fetch the page represented by the token. Fetches the first page when not set.
    *     pageToken: 'placeholder-value',
    *     // Required. Starting time for the duration for which insight is to be pulled.
    *     startTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedConfig": {},
    *   //   "nextPageToken": "my_nextPageToken",
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
  def configuredInsight(params: ParamsResourceProjectsLocationsInsightsConfiguredinsight, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def configuredInsight(
    params: ParamsResourceProjectsLocationsInsightsConfiguredinsight,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight] = js.native
  def get(params: ParamsResourceProjectsLocationsInsightsGet): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInsightsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInsightsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInsightsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInsightsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]
  ): Unit = js.native
  /**
    * Gets the value for a selected particular insight with default configuration. The default aggregation level is 'DAILY' and no grouping will be applied or default grouping if applicable. The data will be returned for recent 7 days starting the day before. The insight data size will be limited to 50 rows. Use the organization level path for fetching at org level and project level path for fetching the insight value specific to a particular project. Setting the `view` to `BASIC` will only return the metadata for the insight.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/beyondcorp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const beyondcorp = google.beyondcorp('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await beyondcorp.projects.locations.insights.get({
    *     // Required. The resource name of the insight using the form: `organizations/{organization_id\}/locations/{location_id\}/insights/{insight_id\}` `projects/{project_id\}/locations/{location_id\}/insights/{insight_id\}`
    *     name: 'projects/my-project/locations/my-location/insights/my-insight',
    *     // Required. Metadata only or full data view.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedConfig": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsLocationsInsightsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInsightsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInsightsList): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInsightsList,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInsightsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInsightsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInsightsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse]
  ): Unit = js.native
  /**
    * Lists for all the available insights that could be fetched from the system. Allows to filter using category. Setting the `view` to `BASIC` will let you iterate over the list of insight metadatas.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/beyondcorp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const beyondcorp = google.beyondcorp('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await beyondcorp.projects.locations.insights.list({
    *     // Optional. Filter expression to restrict the insights returned. Supported filter fields: * `type` * `category` * `subCategory` Examples: * "category = application AND type = count" * "category = application AND subCategory = iap" * "type = status" Allowed values: * type: [count, latency, status, list] * category: [application, device, request, security] * subCategory: [iap, webprotect] NOTE: Only equality based comparison is allowed. Only `AND` conjunction is allowed. NOTE: The 'AND' in the filter field needs to be in capital letters only. NOTE: Just filtering on `subCategory` is not allowed. It should be passed in with the parent `category` too. (These expressions are based on the filter language described at https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // Optional. Hint for how to order the results. This is currently ignored.
    *     orderBy: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer items than requested. If unspecified, server will pick an appropriate default. NOTE: Default page size is 50.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results the server should return.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of InsightMetadata using the form: `organizations/{organization_id\}/locations/{location\}` `projects/{project_id\}/locations/{location_id\}`
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. List only metadata or full data.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "insights": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsLocationsInsightsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInsightsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
