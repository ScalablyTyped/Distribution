package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources$Items")
@js.native
open class ResourceIndexingDatasourcesItems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceIndexingDatasourcesItemsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceIndexingDatasourcesItemsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes Item resource for the specified resource name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.delete({
    *     // The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    *     connectorName: 'placeholder-value',
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // Required. The RequestMode for this request.
    *     mode: 'placeholder-value',
    *     // Required. The name of the item to delete. Format: datasources/{source_id\}/items/{item_id\}
    *     name: 'datasources/my-datasource/items/my-item',
    *     // Required. The incremented version of the item to delete from the index. The indexing system stores the version from the datasource as a byte string and compares the Item version in the index to the version of the queued Item using lexical ordering. Cloud Search Indexing won't delete any queued item with a version value that is less than or equal to the version of the currently indexed item. The maximum length for this field is 1024 bytes. For information on how item version affects the deletion process, refer to [Handle revisions after manual deletes](https://developers.google.com/cloud-search/docs/guides/operations).
    *     version: 'placeholder-value',
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
  def delete(params: ParamsResourceIndexingDatasourcesItemsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteQueueItems(): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteQueueItems(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def deleteQueueItems(params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes all items in a queue. This method is useful for deleting stale items. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.deleteQueueItems({
    *     // The name of the Data Source to delete items in a queue. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {},
    *       //   "queue": "my_queue"
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
  def deleteQueueItems(params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaItem] = js.native
  def get(callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet): GaxiosPromise[SchemaItem] = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet, callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def get(
    params: ParamsResourceIndexingDatasourcesItemsGet,
    options: BodyResponseCallback[Readable | SchemaItem],
    callback: BodyResponseCallback[Readable | SchemaItem]
  ): Unit = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def get(
    params: ParamsResourceIndexingDatasourcesItemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  /**
    * Gets Item resource by item name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.get({
    *     // The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    *     connectorName: 'placeholder-value',
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the item to get info. Format: datasources/{source_id\}/items/{item_id\}
    *     name: 'datasources/my-datasource/items/my-item',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": {},
    *   //   "content": {},
    *   //   "itemType": "my_itemType",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "payload": "my_payload",
    *   //   "queue": "my_queue",
    *   //   "status": {},
    *   //   "structuredData": {},
    *   //   "version": "my_version"
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
  def get(params: ParamsResourceIndexingDatasourcesItemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceIndexingDatasourcesItemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def index(): GaxiosPromise[SchemaOperation] = js.native
  def index(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def index(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def index(params: ParamsResourceIndexingDatasourcesItemsIndex): GaxiosPromise[SchemaOperation] = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def index(params: ParamsResourceIndexingDatasourcesItemsIndex, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates Item ACL, metadata, and content. It will insert the Item if it does not exist. This method does not support partial updates. Fields with no provided values are cleared out in the Cloud Search index. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.index({
    *     // The name of the Item. Format: datasources/{source_id\}/items/{item_id\} This is a required field. The maximum length is 1536 characters.
    *     name: 'datasources/my-datasource/items/my-item',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {},
    *       //   "indexItemOptions": {},
    *       //   "item": {},
    *       //   "mode": "my_mode"
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
  def index(params: ParamsResourceIndexingDatasourcesItemsIndex, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListItemsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(params: ParamsResourceIndexingDatasourcesItemsList): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    callback: BodyResponseCallback[SchemaListItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    options: BodyResponseCallback[Readable | SchemaListItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaListItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceIndexingDatasourcesItemsList, options: MethodOptions): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListItemsResponse]
  ): Unit = js.native
  /**
    * Lists all or a subset of Item resources. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.list({
    *     // When set to true, the indexing system only populates the following fields: name, version, queue. metadata.hash, metadata.title, metadata.sourceRepositoryURL, metadata.objectType, metadata.createTime, metadata.updateTime, metadata.contentLanguage, metadata.mimeType, structured_data.hash, content.hash, itemType, itemStatus.code, itemStatus.processingError.code, itemStatus.repositoryError.type, If this value is false, then all the fields are populated in Item.
    *     brief: 'placeholder-value',
    *     // The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    *     connectorName: 'placeholder-value',
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the Data Source to list Items. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *     // Maximum number of items to fetch in a request. The max value is 1000 when brief is true. The max value is 10 if brief is false. The default value is 10
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
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
  def list(params: ParamsResourceIndexingDatasourcesItemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def poll(): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(callback: BodyResponseCallback[SchemaPollItemsResponse]): Unit = js.native
  def poll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(params: ParamsResourceIndexingDatasourcesItemsPoll): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    callback: BodyResponseCallback[SchemaPollItemsResponse]
  ): Unit = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    options: BodyResponseCallback[Readable | SchemaPollItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaPollItemsResponse]
  ): Unit = js.native
  def poll(params: ParamsResourceIndexingDatasourcesItemsPoll, options: MethodOptions): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPollItemsResponse]
  ): Unit = js.native
  /**
    * Polls for unreserved items from the indexing queue and marks a set as reserved, starting with items that have the oldest timestamp from the highest priority ItemStatus. The priority order is as follows: ERROR MODIFIED NEW_ITEM ACCEPTED Reserving items ensures that polling from other threads cannot create overlapping sets. After handling the reserved items, the client should put items back into the unreserved state, either by calling index, or by calling push with the type REQUEUE. Items automatically become available (unreserved) after 4 hours even if no update or push method is called. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.poll({
    *     // The name of the Data Source to poll items. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {},
    *       //   "limit": 0,
    *       //   "queue": "my_queue",
    *       //   "statusCodes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": []
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
  def poll(params: ParamsResourceIndexingDatasourcesItemsPoll, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def push(): GaxiosPromise[SchemaItem] = js.native
  def push(callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def push(params: Unit, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush): GaxiosPromise[SchemaItem] = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush, callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def push(
    params: ParamsResourceIndexingDatasourcesItemsPush,
    options: BodyResponseCallback[Readable | SchemaItem],
    callback: BodyResponseCallback[Readable | SchemaItem]
  ): Unit = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def push(
    params: ParamsResourceIndexingDatasourcesItemsPush,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  /**
    * Pushes an item onto a queue for later polling and updating. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.push({
    *     // The name of the item to push into the indexing queue. Format: datasources/{source_id\}/items/{ID\} This is a required field. The maximum length is 1536 characters.
    *     name: 'datasources/my-datasource/items/my-item',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {},
    *       //   "item": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acl": {},
    *   //   "content": {},
    *   //   "itemType": "my_itemType",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "payload": "my_payload",
    *   //   "queue": "my_queue",
    *   //   "status": {},
    *   //   "structuredData": {},
    *   //   "version": "my_version"
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
  def push(params: ParamsResourceIndexingDatasourcesItemsPush, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def push(
    params: ParamsResourceIndexingDatasourcesItemsPush,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unreserve(): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unreserve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(params: ParamsResourceIndexingDatasourcesItemsUnreserve): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def unreserve(params: ParamsResourceIndexingDatasourcesItemsUnreserve, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Unreserves all items from a queue, making them all eligible to be polled. This method is useful for resetting the indexing queue after a connector has been restarted. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.unreserve({
    *     // The name of the Data Source to unreserve all items. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {},
    *       //   "queue": "my_queue"
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
  def unreserve(params: ParamsResourceIndexingDatasourcesItemsUnreserve, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(callback: BodyResponseCallback[SchemaUploadItemRef]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(params: ParamsResourceIndexingDatasourcesItemsUpload): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    callback: BodyResponseCallback[SchemaUploadItemRef]
  ): Unit = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    options: BodyResponseCallback[Readable | SchemaUploadItemRef],
    callback: BodyResponseCallback[Readable | SchemaUploadItemRef]
  ): Unit = js.native
  def upload(params: ParamsResourceIndexingDatasourcesItemsUpload, options: MethodOptions): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadItemRef]
  ): Unit = js.native
  /**
    * Creates an upload session for uploading item content. For items smaller than 100 KB, it's easier to embed the content inline within an index request. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.items.upload({
    *     // The name of the Item to start a resumable upload. Format: datasources/{source_id\}/items/{item_id\}. The maximum length is 1536 bytes.
    *     name: 'datasources/my-datasource/items/my-item',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectorName": "my_connectorName",
    *       //   "debugOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def upload(params: ParamsResourceIndexingDatasourcesItemsUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
