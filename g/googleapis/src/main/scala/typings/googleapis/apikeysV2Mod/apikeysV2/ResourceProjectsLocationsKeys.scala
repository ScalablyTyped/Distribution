package typings.googleapis.apikeysV2Mod.apikeysV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/apikeys/v2", "apikeys_v2.Resource$Projects$Locations$Keys")
@js.native
open class ResourceProjectsLocationsKeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsKeysCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsKeysCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeysCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsKeysCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new API key. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
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
    *   const res = await apikeys.projects.locations.keys.create({
    *     // User specified key id (optional). If specified, it will become the final component of the key resource name. The id must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. In another word, the id must match the regular expression: `[a-z]([a-z0-9-]{0,61\}[a-z0-9])?`. The id must NOT be a UUID-like string.
    *     keyId: 'placeholder-value',
    *     // Required. The project in which the API key is created.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "keyString": "my_keyString",
    *       //   "name": "my_name",
    *       //   "restrictions": {},
    *       //   "uid": "my_uid",
    *       //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsLocationsKeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsKeysDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsKeysDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsKeysDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsKeysDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsKeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes an API key. Deleted key can be retrieved within 30 days of deletion. Afterward, key will be purged from the project. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
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
    *   const res = await apikeys.projects.locations.keys.delete({
    *     // Optional. The etag known to the client for the expected state of the key. This is to be used for optimistic concurrency.
    *     etag: 'placeholder-value',
    *     // Required. The resource name of the API key to be deleted.
    *     name: 'projects/my-project/locations/my-location/keys/my-key',
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
  def delete(params: ParamsResourceProjectsLocationsKeysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsKeysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaV2Key] = js.native
  def get(callback: BodyResponseCallback[SchemaV2Key]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV2Key] = js.native
  def get(params: ParamsResourceProjectsLocationsKeysGet): GaxiosPromise[SchemaV2Key] = js.native
  def get(params: ParamsResourceProjectsLocationsKeysGet, callback: BodyResponseCallback[SchemaV2Key]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeysGet,
    options: BodyResponseCallback[Readable | SchemaV2Key],
    callback: BodyResponseCallback[Readable | SchemaV2Key]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsKeysGet, options: MethodOptions): GaxiosPromise[SchemaV2Key] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV2Key]
  ): Unit = js.native
  /**
    * Gets the metadata for an API key. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await apikeys.projects.locations.keys.get({
    *     // Required. The resource name of the API key to get.
    *     name: 'projects/my-project/locations/my-location/keys/my-key',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "keyString": "my_keyString",
    *   //   "name": "my_name",
    *   //   "restrictions": {},
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsKeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getKeyString(): GaxiosPromise[SchemaV2GetKeyStringResponse] = js.native
  def getKeyString(callback: BodyResponseCallback[SchemaV2GetKeyStringResponse]): Unit = js.native
  def getKeyString(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV2GetKeyStringResponse] = js.native
  def getKeyString(params: ParamsResourceProjectsLocationsKeysGetkeystring): GaxiosPromise[SchemaV2GetKeyStringResponse] = js.native
  def getKeyString(
    params: ParamsResourceProjectsLocationsKeysGetkeystring,
    callback: BodyResponseCallback[SchemaV2GetKeyStringResponse]
  ): Unit = js.native
  def getKeyString(
    params: ParamsResourceProjectsLocationsKeysGetkeystring,
    options: BodyResponseCallback[Readable | SchemaV2GetKeyStringResponse],
    callback: BodyResponseCallback[Readable | SchemaV2GetKeyStringResponse]
  ): Unit = js.native
  def getKeyString(params: ParamsResourceProjectsLocationsKeysGetkeystring, options: MethodOptions): GaxiosPromise[SchemaV2GetKeyStringResponse] = js.native
  def getKeyString(
    params: ParamsResourceProjectsLocationsKeysGetkeystring,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV2GetKeyStringResponse]
  ): Unit = js.native
  /**
    * Get the key string for an API key. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await apikeys.projects.locations.keys.getKeyString({
    *     // Required. The resource name of the API key to be retrieved.
    *     name: 'projects/my-project/locations/my-location/keys/my-key',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keyString": "my_keyString"
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
  def getKeyString(params: ParamsResourceProjectsLocationsKeysGetkeystring, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getKeyString(
    params: ParamsResourceProjectsLocationsKeysGetkeystring,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaV2ListKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaV2ListKeysResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV2ListKeysResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsKeysList): GaxiosPromise[SchemaV2ListKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeysList,
    callback: BodyResponseCallback[SchemaV2ListKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeysList,
    options: BodyResponseCallback[Readable | SchemaV2ListKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaV2ListKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsKeysList, options: MethodOptions): GaxiosPromise[SchemaV2ListKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV2ListKeysResponse]
  ): Unit = js.native
  /**
    * Lists the API keys owned by a project. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await apikeys.projects.locations.keys.list({
    *     // Optional. Specifies the maximum number of results to be returned at a time.
    *     pageSize: 'placeholder-value',
    *     // Optional. Requests a specific page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. Lists all API keys associated with this project.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Optional. Indicate that keys deleted in the past 30 days should also be returned.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keys": [],
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
  def list(params: ParamsResourceProjectsLocationsKeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsKeysPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsKeysPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeysPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsKeysPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Patches the modifiable fields of an API key. The key string of the API key isn't included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
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
    *   const res = await apikeys.projects.locations.keys.patch({
    *     // Output only. The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
    *     name: 'projects/my-project/locations/my-location/keys/my-key',
    *     // The field mask specifies which fields to be updated as part of this request. All other fields are ignored. Mutable fields are: `display_name`, `restrictions`, and `annotations`. If an update mask is not provided, the service treats it as an implied mask equivalent to all allowed fields that are set on the wire. If the field mask has a special value "*", the service treats it equivalent to replace all allowed mutable fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": {},
    *       //   "createTime": "my_createTime",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "keyString": "my_keyString",
    *       //   "name": "my_name",
    *       //   "restrictions": {},
    *       //   "uid": "my_uid",
    *       //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsLocationsKeysPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeysPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaOperation] = js.native
  def undelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceProjectsLocationsKeysUndelete): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsKeysUndelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsKeysUndelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def undelete(params: ParamsResourceProjectsLocationsKeysUndelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsKeysUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Undeletes an API key which was deleted within 30 days. NOTE: Key is a global resource; hence the only supported value for location is `global`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
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
    *   const res = await apikeys.projects.locations.keys.undelete({
    *     // Required. The resource name of the API key to be undeleted.
    *     name: 'projects/my-project/locations/my-location/keys/my-key',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def undelete(params: ParamsResourceProjectsLocationsKeysUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceProjectsLocationsKeysUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
