package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGetAssetsHistory(): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]): Unit = js.native
  def batchGetAssetsHistory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(params: ParamsResourceOrganizationsBatchgetassetshistory): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    options: BodyResponseCallback[Readable | SchemaBatchGetAssetsHistoryResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(params: ParamsResourceOrganizationsBatchgetassetshistory, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  /**
    * Batch gets the update history of assets that overlap a time window. For IAM_POLICY content, this API outputs history when the asset and its attached IAM POLICY both exist. This can create gaps in the output history. Otherwise, this API outputs history with asset in both non-delete or deleted status. If a specified asset does not exist, this API returns an INVALID_ARGUMENT error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1beta1');
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
    *   const res = await cloudasset.organizations.batchGetAssetsHistory({
    *     // A list of the full names of the assets. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more info. The request becomes a no-op if the asset name list is empty, and the max size of the asset name list is 100 in one request.
    *     assetNames: 'placeholder-value',
    *     // Optional. The content type.
    *     contentType: 'placeholder-value',
    *     // Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    *     parent: 'organizations/my-organization',
    *     // End time of the time window (inclusive). If not specified, the current timestamp is used instead.
    *     'readTimeWindow.endTime': 'placeholder-value',
    *     // Start time of the time window (exclusive).
    *     'readTimeWindow.startTime': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assets": []
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
  def batchGetAssetsHistory(params: ParamsResourceOrganizationsBatchgetassetshistory, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def exportAssets(): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(
    params: ParamsResourceOrganizationsExportassets,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(
    params: ParamsResourceOrganizationsExportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports assets with time and resource types to a given Cloud Storage location. The output format is newline-delimited JSON. This API implements the google.longrunning.Operation API allowing you to keep track of the export. We recommend intervals of at least 2 seconds with exponential retry to poll the export operation result. For regular-size resource parent, the export operation usually finishes within 5 minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1beta1');
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
    *   const res = await cloudasset.organizations.exportAssets({
    *     // Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), a project number (such as "projects/12345"), or a folder number (such as "folders/123").
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assetTypes": [],
    *       //   "contentType": "my_contentType",
    *       //   "outputConfig": {},
    *       //   "readTime": "my_readTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def exportAssets(params: ParamsResourceOrganizationsExportassets, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exportAssets(
    params: ParamsResourceOrganizationsExportassets,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceOrganizationsOperations = js.native
}
