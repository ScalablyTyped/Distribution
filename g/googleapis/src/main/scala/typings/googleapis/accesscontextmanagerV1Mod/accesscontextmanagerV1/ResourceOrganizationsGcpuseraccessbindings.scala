package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Resource$Organizations$Gcpuseraccessbindings")
@js.native
open class ResourceOrganizationsGcpuseraccessbindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a GcpUserAccessBinding. If the client specifies a name, the server ignores it. Fails if a resource already exists with the same group_key. Completion of this long-running operation does not necessarily signify that the new binding is deployed onto all affected users, which may take more time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accesscontextmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
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
    *   const res =
    *     await accesscontextmanager.organizations.gcpUserAccessBindings.create({
    *       // Required. Example: "organizations/256"
    *       parent: 'organizations/my-organization',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "accessLevels": [],
    *         //   "groupKey": "my_groupKey",
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
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
  def create(params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the binding deletion is deployed onto all affected users, which may take more time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accesscontextmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
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
    *   const res =
    *     await accesscontextmanager.organizations.gcpUserAccessBindings.delete({
    *       // Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
    *       name: 'organizations/my-organization/gcpUserAccessBindings/my-gcpUserAccessBinding',
    *     });
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
  def delete(params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGcpUserAccessBinding] = js.native
  def get(callback: BodyResponseCallback[SchemaGcpUserAccessBinding]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGcpUserAccessBinding] = js.native
  def get(params: ParamsResourceOrganizationsGcpuseraccessbindingsGet): GaxiosPromise[SchemaGcpUserAccessBinding] = js.native
  def get(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsGet,
    callback: BodyResponseCallback[SchemaGcpUserAccessBinding]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsGet,
    options: BodyResponseCallback[Readable | SchemaGcpUserAccessBinding],
    callback: BodyResponseCallback[Readable | SchemaGcpUserAccessBinding]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsGcpuseraccessbindingsGet, options: MethodOptions): GaxiosPromise[SchemaGcpUserAccessBinding] = js.native
  def get(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGcpUserAccessBinding]
  ): Unit = js.native
  /**
    * Gets the GcpUserAccessBinding with the given name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accesscontextmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
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
    *   const res =
    *     await accesscontextmanager.organizations.gcpUserAccessBindings.get({
    *       // Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
    *       name: 'organizations/my-organization/gcpUserAccessBindings/my-gcpUserAccessBinding',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessLevels": [],
    *   //   "groupKey": "my_groupKey",
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
  def get(params: ParamsResourceOrganizationsGcpuseraccessbindingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGcpUserAccessBindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGcpUserAccessBindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGcpUserAccessBindingsResponse] = js.native
  def list(params: ParamsResourceOrganizationsGcpuseraccessbindingsList): GaxiosPromise[SchemaListGcpUserAccessBindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsList,
    callback: BodyResponseCallback[SchemaListGcpUserAccessBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsList,
    options: BodyResponseCallback[Readable | SchemaListGcpUserAccessBindingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGcpUserAccessBindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsGcpuseraccessbindingsList, options: MethodOptions): GaxiosPromise[SchemaListGcpUserAccessBindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGcpUserAccessBindingsResponse]
  ): Unit = js.native
  /**
    * Lists all GcpUserAccessBindings for a Google Cloud organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accesscontextmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
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
    *   const res =
    *     await accesscontextmanager.organizations.gcpUserAccessBindings.list({
    *       // Optional. Maximum number of items to return. The server may return fewer items. If left blank, the server may return any number of items.
    *       pageSize: 'placeholder-value',
    *       // Optional. If left blank, returns the first page. To enumerate all items, use the next_page_token from your previous list operation.
    *       pageToken: 'placeholder-value',
    *       // Required. Example: "organizations/256"
    *       parent: 'organizations/my-organization',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "gcpUserAccessBindings": [],
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
  def list(params: ParamsResourceOrganizationsGcpuseraccessbindingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a GcpUserAccessBinding. Completion of this long-running operation does not necessarily signify that the changed binding is deployed onto all affected users, which may take more time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accesscontextmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
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
    *   const res =
    *     await accesscontextmanager.organizations.gcpUserAccessBindings.patch({
    *       // Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
    *       name: 'organizations/my-organization/gcpUserAccessBindings/my-gcpUserAccessBinding',
    *       // Required. Only the fields specified in this mask are updated. Because name and group_key cannot be changed, update_mask is required and must always be: update_mask { paths: "access_levels" \}
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "accessLevels": [],
    *         //   "groupKey": "my_groupKey",
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
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
  def patch(params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsGcpuseraccessbindingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
