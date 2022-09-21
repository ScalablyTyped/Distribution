package typings.googleapis.cloudassetV1Mod.cloudassetV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Resource$Savedqueries")
@js.native
open class ResourceSavedqueries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(params: ParamsResourceSavedqueriesCreate): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(params: ParamsResourceSavedqueriesCreate, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(
    params: ParamsResourceSavedqueriesCreate,
    options: BodyResponseCallback[Readable | SchemaSavedQuery],
    callback: BodyResponseCallback[Readable | SchemaSavedQuery]
  ): Unit = js.native
  def create(params: ParamsResourceSavedqueriesCreate, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(
    params: ParamsResourceSavedqueriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * Creates a saved query in a parent project/folder/organization.
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
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.savedQueries.create({
    *     // Required. The name of the project/folder/organization where this saved_query should be created in. It can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    *     parent: '[^/]+/[^/]+',
    *     // Required. The ID to use for the saved query, which must be unique in the specified parent. It will become the final component of the saved query's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Notice that this field is required in the saved query creation, and the `name` field of the `saved_query` will be ignored.
    *     savedQueryId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "content": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": "my_creator",
    *       //   "description": "my_description",
    *       //   "labels": {},
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "lastUpdater": "my_lastUpdater",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "content": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "labels": {},
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "lastUpdater": "my_lastUpdater",
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
  def create(params: ParamsResourceSavedqueriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSavedqueriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSavedqueriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSavedqueriesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSavedqueriesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSavedqueriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSavedqueriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a saved query.
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
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.savedQueries.delete({
    *     // Required. The name of the saved query to delete. It must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
    *     name: '[^/]+/[^/]+/savedQueries/my-savedQuerie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceSavedqueriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSavedqueriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(params: ParamsResourceSavedqueriesGet): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(params: ParamsResourceSavedqueriesGet, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(
    params: ParamsResourceSavedqueriesGet,
    options: BodyResponseCallback[Readable | SchemaSavedQuery],
    callback: BodyResponseCallback[Readable | SchemaSavedQuery]
  ): Unit = js.native
  def get(params: ParamsResourceSavedqueriesGet, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(
    params: ParamsResourceSavedqueriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * Gets details about a saved query.
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
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.savedQueries.get({
    *     // Required. The name of the saved query and it must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
    *     name: '[^/]+/[^/]+/savedQueries/my-savedQuerie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "content": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "labels": {},
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "lastUpdater": "my_lastUpdater",
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
  def get(params: ParamsResourceSavedqueriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSavedqueriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSavedQueriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(params: ParamsResourceSavedqueriesList): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceSavedqueriesList,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSavedqueriesList,
    options: BodyResponseCallback[Readable | SchemaListSavedQueriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSavedqueriesList, options: MethodOptions): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceSavedqueriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  /**
    * Lists all saved queries in a parent project/folder/organization.
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
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.savedQueries.list({
    *     // Optional. The expression to filter resources. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. When `AND` and `OR` are both used in the expression, parentheses must be appropriately used to group the combinations. The expression may also contain regular expressions. See https://google.aip.dev/160 for more information on the grammar.
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of saved queries to return per page. The service may return fewer than this value. If unspecified, at most 50 will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListSavedQueries` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListSavedQueries` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent project/folder/organization whose savedQueries are to be listed. It can only be using project/folder/organization number (such as "folders/12345")", or a project ID (such as "projects/my-project-id").
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "savedQueries": []
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
  def list(params: ParamsResourceSavedqueriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSavedqueriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSavedQuery] = js.native
  def patch(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def patch(params: ParamsResourceSavedqueriesPatch): GaxiosPromise[SchemaSavedQuery] = js.native
  def patch(params: ParamsResourceSavedqueriesPatch, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def patch(
    params: ParamsResourceSavedqueriesPatch,
    options: BodyResponseCallback[Readable | SchemaSavedQuery],
    callback: BodyResponseCallback[Readable | SchemaSavedQuery]
  ): Unit = js.native
  def patch(params: ParamsResourceSavedqueriesPatch, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def patch(
    params: ParamsResourceSavedqueriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * Updates a saved query.
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
    * const cloudasset = google.cloudasset('v1');
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
    *   const res = await cloudasset.savedQueries.patch({
    *     // The resource name of the saved query. The format must be: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
    *     name: '[^/]+/[^/]+/savedQueries/my-savedQuerie',
    *     // Required. The list of fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "content": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": "my_creator",
    *       //   "description": "my_description",
    *       //   "labels": {},
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "lastUpdater": "my_lastUpdater",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "content": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "description": "my_description",
    *   //   "labels": {},
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "lastUpdater": "my_lastUpdater",
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
  def patch(params: ParamsResourceSavedqueriesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSavedqueriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
