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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings$Searchapplications")
@js.native
open class ResourceSettingsSearchapplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceSettingsSearchapplicationsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceSettingsSearchapplicationsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a search application. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceRestrictions": [],
    *       //   "defaultFacetOptions": [],
    *       //   "defaultSortOptions": {},
    *       //   "displayName": "my_displayName",
    *       //   "enableAuditLog": false,
    *       //   "name": "my_name",
    *       //   "operationIds": [],
    *       //   "queryInterpretationConfig": {},
    *       //   "returnResultThumbnailUrls": false,
    *       //   "scoringConfig": {},
    *       //   "sourceConfig": []
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
  def create(params: ParamsResourceSettingsSearchapplicationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSettingsSearchapplicationsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSettingsSearchapplicationsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a search application. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.delete({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the search application to be deleted. Format: applications/{application_id\}.
    *     name: 'searchapplications/my-searchapplication',
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
  def delete(params: ParamsResourceSettingsSearchapplicationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaSearchApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(params: ParamsResourceSettingsSearchapplicationsGet): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    callback: BodyResponseCallback[SchemaSearchApplication]
  ): Unit = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    options: BodyResponseCallback[Readable | SchemaSearchApplication],
    callback: BodyResponseCallback[Readable | SchemaSearchApplication]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsSearchapplicationsGet, options: MethodOptions): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchApplication]
  ): Unit = js.native
  /**
    * Gets the specified search application. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.get({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the search application. Format: searchapplications/{application_id\}.
    *     name: 'searchapplications/my-searchapplication',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceRestrictions": [],
    *   //   "defaultFacetOptions": [],
    *   //   "defaultSortOptions": {},
    *   //   "displayName": "my_displayName",
    *   //   "enableAuditLog": false,
    *   //   "name": "my_name",
    *   //   "operationIds": [],
    *   //   "queryInterpretationConfig": {},
    *   //   "returnResultThumbnailUrls": false,
    *   //   "scoringConfig": {},
    *   //   "sourceConfig": []
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
  def get(params: ParamsResourceSettingsSearchapplicationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(params: ParamsResourceSettingsSearchapplicationsList): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    options: BodyResponseCallback[Readable | SchemaListSearchApplicationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSettingsSearchapplicationsList, options: MethodOptions): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  /**
    * Lists all search applications. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.list({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any. The default value is 10
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "searchApplications": []
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
  def list(params: ParamsResourceSettingsSearchapplicationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceSettingsSearchapplicationsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceSettingsSearchapplicationsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceSettingsSearchapplicationsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceSettingsSearchapplicationsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceSettingsSearchapplicationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a search application. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.patch({
    *     // The name of the Search Application. Format: searchapplications/{application_id\}.
    *     name: 'searchapplications/my-searchapplication',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceRestrictions": [],
    *       //   "defaultFacetOptions": [],
    *       //   "defaultSortOptions": {},
    *       //   "displayName": "my_displayName",
    *       //   "enableAuditLog": false,
    *       //   "name": "my_name",
    *       //   "operationIds": [],
    *       //   "queryInterpretationConfig": {},
    *       //   "returnResultThumbnailUrls": false,
    *       //   "scoringConfig": {},
    *       //   "sourceConfig": []
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
  def patch(params: ParamsResourceSettingsSearchapplicationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSettingsSearchapplicationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reset(): GaxiosPromise[SchemaOperation] = js.native
  def reset(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(params: ParamsResourceSettingsSearchapplicationsReset): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def reset(params: ParamsResourceSettingsSearchapplicationsReset, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Resets a search application to default settings. This will return an empty response. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.reset({
    *     // The name of the search application to be reset. Format: applications/{application_id\}.
    *     name: 'searchapplications/my-searchapplication',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "debugOptions": {}
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
  def reset(params: ParamsResourceSettingsSearchapplicationsReset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceSettingsSearchapplicationsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceSettingsSearchapplicationsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a search application. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.searchapplications.update({
    *     // The name of the Search Application. Format: searchapplications/{application_id\}.
    *     name: 'searchapplications/my-searchapplication',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceRestrictions": [],
    *       //   "defaultFacetOptions": [],
    *       //   "defaultSortOptions": {},
    *       //   "displayName": "my_displayName",
    *       //   "enableAuditLog": false,
    *       //   "name": "my_name",
    *       //   "operationIds": [],
    *       //   "queryInterpretationConfig": {},
    *       //   "returnResultThumbnailUrls": false,
    *       //   "scoringConfig": {},
    *       //   "sourceConfig": []
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
  def update(params: ParamsResourceSettingsSearchapplicationsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
