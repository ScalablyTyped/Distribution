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

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Resource$Accesspolicies$Serviceperimeters")
@js.native
open class ResourceAccesspoliciesServiceperimeters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def commit(): GaxiosPromise[SchemaOperation] = js.native
  def commit(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def commit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def commit(params: ParamsResourceAccesspoliciesServiceperimetersCommit): GaxiosPromise[SchemaOperation] = js.native
  def commit(
    params: ParamsResourceAccesspoliciesServiceperimetersCommit,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def commit(
    params: ParamsResourceAccesspoliciesServiceperimetersCommit,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def commit(params: ParamsResourceAccesspoliciesServiceperimetersCommit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def commit(
    params: ParamsResourceAccesspoliciesServiceperimetersCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Commits the dry-run specification for all the service perimeters in an access policy. A commit operation on a service perimeter involves copying its `spec` field to the `status` field of the service perimeter. Only service perimeters with `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The long-running operation from this RPC has a successful status after the dry-run specifications for all the service perimeters have been committed. If a commit fails, it causes the long-running operation to return an error response and the entire commit operation is cancelled. When successful, the Operation.response field contains CommitServicePerimetersResponse. The `dry_run` and the `spec` fields are cleared after a successful commit operation.
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
    *     await accesscontextmanager.accessPolicies.servicePerimeters.commit({
    *       // Required. Resource name for the parent Access Policy which owns all Service Perimeters in scope for the commit operation. Format: `accessPolicies/{policy_id\}`
    *       parent: 'accessPolicies/my-accessPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "etag": "my_etag"
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
  def commit(params: ParamsResourceAccesspoliciesServiceperimetersCommit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def commit(
    params: ParamsResourceAccesspoliciesServiceperimetersCommit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAccesspoliciesServiceperimetersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAccesspoliciesServiceperimetersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter contains errors, an error response is returned for the first error encountered.
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
    *     await accesscontextmanager.accessPolicies.servicePerimeters.create({
    *       // Required. Resource name for the access policy which owns this Service Perimeter. Format: `accessPolicies/{policy_id\}`
    *       parent: 'accessPolicies/my-accessPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "description": "my_description",
    *         //   "name": "my_name",
    *         //   "perimeterType": "my_perimeterType",
    *         //   "spec": {},
    *         //   "status": {},
    *         //   "title": "my_title",
    *         //   "useExplicitDryRunSpec": false
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
  def create(params: ParamsResourceAccesspoliciesServiceperimetersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAccesspoliciesServiceperimetersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAccesspoliciesServiceperimetersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a service perimeter based on the resource name. The long-running operation from this RPC has a successful status after the service perimeter is removed from long-lasting storage.
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
    *     await accesscontextmanager.accessPolicies.servicePerimeters.delete({
    *       // Required. Resource name for the Service Perimeter. Format: `accessPolicies/{policy_id\}/servicePerimeters/{service_perimeter_id\}`
    *       name: 'accessPolicies/my-accessPolicie/servicePerimeters/my-servicePerimeter',
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
  def delete(params: ParamsResourceAccesspoliciesServiceperimetersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(callback: BodyResponseCallback[SchemaServicePerimeter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(params: ParamsResourceAccesspoliciesServiceperimetersGet): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    callback: BodyResponseCallback[SchemaServicePerimeter]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    options: BodyResponseCallback[Readable | SchemaServicePerimeter],
    callback: BodyResponseCallback[Readable | SchemaServicePerimeter]
  ): Unit = js.native
  def get(params: ParamsResourceAccesspoliciesServiceperimetersGet, options: MethodOptions): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServicePerimeter]
  ): Unit = js.native
  /**
    * Gets a service perimeter based on the resource name.
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
    *   const res = await accesscontextmanager.accessPolicies.servicePerimeters.get({
    *     // Required. Resource name for the Service Perimeter. Format: `accessPolicies/{policy_id\}/servicePerimeters/{service_perimeters_id\}`
    *     name: 'accessPolicies/my-accessPolicie/servicePerimeters/my-servicePerimeter',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "perimeterType": "my_perimeterType",
    *   //   "spec": {},
    *   //   "status": {},
    *   //   "title": "my_title",
    *   //   "useExplicitDryRunSpec": false
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
  def get(params: ParamsResourceAccesspoliciesServiceperimetersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicePerimetersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(params: ParamsResourceAccesspoliciesServiceperimetersList): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    callback: BodyResponseCallback[SchemaListServicePerimetersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    options: BodyResponseCallback[Readable | SchemaListServicePerimetersResponse],
    callback: BodyResponseCallback[Readable | SchemaListServicePerimetersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccesspoliciesServiceperimetersList, options: MethodOptions): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicePerimetersResponse]
  ): Unit = js.native
  /**
    * Lists all service perimeters for an access policy.
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
    *   const res = await accesscontextmanager.accessPolicies.servicePerimeters.list({
    *     // Number of Service Perimeters to include in the list. Default 100.
    *     pageSize: 'placeholder-value',
    *     // Next page token for the next batch of Service Perimeter instances. Defaults to the first page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name for the access policy to list Service Perimeters from. Format: `accessPolicies/{policy_id\}`
    *     parent: 'accessPolicies/my-accessPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "servicePerimeters": []
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
  def list(params: ParamsResourceAccesspoliciesServiceperimetersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAccesspoliciesServiceperimetersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAccesspoliciesServiceperimetersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter contains errors, an error response is returned for the first error encountered.
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
    *   const res = await accesscontextmanager.accessPolicies.servicePerimeters.patch(
    *     {
    *       // Required. Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy\}/servicePerimeters/{service_perimeter\}`
    *       name: 'accessPolicies/my-accessPolicie/servicePerimeters/my-servicePerimeter',
    *       // Required. Mask to control which fields get updated. Must be non-empty.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "description": "my_description",
    *         //   "name": "my_name",
    *         //   "perimeterType": "my_perimeterType",
    *         //   "spec": {},
    *         //   "status": {},
    *         //   "title": "my_title",
    *         //   "useExplicitDryRunSpec": false
    *         // }
    *       },
    *     }
    *   );
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
  def patch(params: ParamsResourceAccesspoliciesServiceperimetersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replaceAll(): GaxiosPromise[SchemaOperation] = js.native
  def replaceAll(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def replaceAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def replaceAll(params: ParamsResourceAccesspoliciesServiceperimetersReplaceall): GaxiosPromise[SchemaOperation] = js.native
  def replaceAll(
    params: ParamsResourceAccesspoliciesServiceperimetersReplaceall,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def replaceAll(
    params: ParamsResourceAccesspoliciesServiceperimetersReplaceall,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def replaceAll(params: ParamsResourceAccesspoliciesServiceperimetersReplaceall, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def replaceAll(
    params: ParamsResourceAccesspoliciesServiceperimetersReplaceall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Replace all existing service perimeters in an access policy with the service perimeters provided. This is done atomically. The long-running operation from this RPC has a successful status after all replacements propagate to long-lasting storage. Replacements containing errors result in an error response for the first error encountered. Upon an error, replacement are cancelled and existing service perimeters are not affected. The Operation.response field contains ReplaceServicePerimetersResponse.
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
    *     await accesscontextmanager.accessPolicies.servicePerimeters.replaceAll({
    *       // Required. Resource name for the access policy which owns these Service Perimeters. Format: `accessPolicies/{policy_id\}`
    *       parent: 'accessPolicies/my-accessPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "etag": "my_etag",
    *         //   "servicePerimeters": []
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
  def replaceAll(params: ParamsResourceAccesspoliciesServiceperimetersReplaceall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def replaceAll(
    params: ParamsResourceAccesspoliciesServiceperimetersReplaceall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method does not support other resources.
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
    *     await accesscontextmanager.accessPolicies.servicePerimeters.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'accessPolicies/my-accessPolicie/servicePerimeters/my-servicePerimeter',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceAccesspoliciesServiceperimetersTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
