package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Datasets")
@js.native
open class ResourceDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDatasetsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDatasetsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.delete({
    *     // Dataset ID of dataset being deleted
    *     datasetId: 'placeholder-value',
    *     // If True, delete all the tables in the dataset. If False and the dataset contains tables, the request will fail. Default is False
    *     deleteContents: 'placeholder-value',
    *     // Project ID of the dataset being deleted
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceDatasetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDatasetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceDatasetsGet): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceDatasetsGet, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(
    params: ParamsResourceDatasetsGet,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def get(params: ParamsResourceDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(
    params: ParamsResourceDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Returns the dataset specified by datasetID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.get({
    *     // Dataset ID of the requested dataset
    *     datasetId: 'placeholder-value',
    *     // Project ID of the requested dataset
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "datasetReference": {},
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "defaultEncryptionConfiguration": {},
    *   //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *   //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "isCaseInsensitive": false,
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *   //   "satisfiesPzs": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "tags": []
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
  def get(params: ParamsResourceDatasetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDatasetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDataset] = js.native
  def insert(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def insert(params: ParamsResourceDatasetsInsert): GaxiosPromise[SchemaDataset] = js.native
  def insert(params: ParamsResourceDatasetsInsert, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def insert(
    params: ParamsResourceDatasetsInsert,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def insert(params: ParamsResourceDatasetsInsert, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def insert(
    params: ParamsResourceDatasetsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Creates a new empty dataset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.insert({
    *     // Project ID of the new dataset
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access": [],
    *       //   "creationTime": "my_creationTime",
    *       //   "datasetReference": {},
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "defaultEncryptionConfiguration": {},
    *       //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *       //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "isCaseInsensitive": false,
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *       //   "satisfiesPzs": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "tags": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "datasetReference": {},
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "defaultEncryptionConfiguration": {},
    *   //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *   //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "isCaseInsensitive": false,
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *   //   "satisfiesPzs": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "tags": []
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
  def insert(params: ParamsResourceDatasetsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDatasetsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDatasetList] = js.native
  def list(callback: BodyResponseCallback[SchemaDatasetList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatasetList] = js.native
  def list(params: ParamsResourceDatasetsList): GaxiosPromise[SchemaDatasetList] = js.native
  def list(params: ParamsResourceDatasetsList, callback: BodyResponseCallback[SchemaDatasetList]): Unit = js.native
  def list(
    params: ParamsResourceDatasetsList,
    options: BodyResponseCallback[Readable | SchemaDatasetList],
    callback: BodyResponseCallback[Readable | SchemaDatasetList]
  ): Unit = js.native
  def list(params: ParamsResourceDatasetsList, options: MethodOptions): GaxiosPromise[SchemaDatasetList] = js.native
  def list(
    params: ParamsResourceDatasetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatasetList]
  ): Unit = js.native
  /**
    * Lists all datasets in the specified project to which you have been granted the READER dataset role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.list({
    *     // Whether to list all datasets, including hidden ones
    *     all: 'placeholder-value',
    *     // An expression for filtering the results of the request by label. The syntax is "labels.<name\>[:<value\>]". Multiple filters can be ANDed together by connecting with a space. Example: "labels.department:receiving labels.active". See Filtering datasets using labels for details.
    *     filter: 'placeholder-value',
    *     // The maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // Project ID of the datasets to be listed
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "datasets": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceDatasetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDatasetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDataset] = js.native
  def patch(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceDatasetsPatch): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceDatasetsPatch, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(
    params: ParamsResourceDatasetsPatch,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def patch(params: ParamsResourceDatasetsPatch, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceDatasetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.patch({
    *     // Dataset ID of the dataset being updated
    *     datasetId: 'placeholder-value',
    *     // Project ID of the dataset being updated
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access": [],
    *       //   "creationTime": "my_creationTime",
    *       //   "datasetReference": {},
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "defaultEncryptionConfiguration": {},
    *       //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *       //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "isCaseInsensitive": false,
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *       //   "satisfiesPzs": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "tags": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "datasetReference": {},
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "defaultEncryptionConfiguration": {},
    *   //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *   //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "isCaseInsensitive": false,
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *   //   "satisfiesPzs": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "tags": []
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
  def patch(params: ParamsResourceDatasetsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceDatasetsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDataset] = js.native
  def update(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def update(params: ParamsResourceDatasetsUpdate): GaxiosPromise[SchemaDataset] = js.native
  def update(params: ParamsResourceDatasetsUpdate, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def update(
    params: ParamsResourceDatasetsUpdate,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def update(params: ParamsResourceDatasetsUpdate, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def update(
    params: ParamsResourceDatasetsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.datasets.update({
    *     // Dataset ID of the dataset being updated
    *     datasetId: 'placeholder-value',
    *     // Project ID of the dataset being updated
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access": [],
    *       //   "creationTime": "my_creationTime",
    *       //   "datasetReference": {},
    *       //   "defaultCollation": "my_defaultCollation",
    *       //   "defaultEncryptionConfiguration": {},
    *       //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *       //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "friendlyName": "my_friendlyName",
    *       //   "id": "my_id",
    *       //   "isCaseInsensitive": false,
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *       //   "satisfiesPzs": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "tags": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": [],
    *   //   "creationTime": "my_creationTime",
    *   //   "datasetReference": {},
    *   //   "defaultCollation": "my_defaultCollation",
    *   //   "defaultEncryptionConfiguration": {},
    *   //   "defaultPartitionExpirationMs": "my_defaultPartitionExpirationMs",
    *   //   "defaultTableExpirationMs": "my_defaultTableExpirationMs",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "friendlyName": "my_friendlyName",
    *   //   "id": "my_id",
    *   //   "isCaseInsensitive": false,
    *   //   "kind": "my_kind",
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "maxTimeTravelHours": "my_maxTimeTravelHours",
    *   //   "satisfiesPzs": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "tags": []
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
  def update(params: ParamsResourceDatasetsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceDatasetsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
