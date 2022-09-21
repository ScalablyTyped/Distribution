package typings.googleapis.apigatewayV1Mod.apigatewayV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/apigateway/v1", "apigateway_v1.Resource$Projects$Locations$Apis")
@js.native
open class ResourceProjectsLocationsApis protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var configs: ResourceProjectsLocationsApisConfigs = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsApisCreate): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisCreate,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisCreate,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsApisCreate, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Creates a new Api in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.create({
    *     // Required. Identifier to assign to the API. Must be unique within scope of the parent resource.
    *     apiId: 'placeholder-value',
    *     // Required. Parent resource of the API, of the form: `projects/x/locations/global`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "labels": {},
    *       //   "managedService": "my_managedService",
    *       //   "name": "my_name",
    *       //   "state": "my_state",
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
  def create(params: ParamsResourceProjectsLocationsApisCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDelete): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDelete,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDelete,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDelete, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Deletes a single Api.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.delete({
    *     // Required. Resource name of the form: `projects/x/locations/global/apis/x`
    *     name: 'projects/my-project/locations/my-location/apis/my-api',
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
  def delete(params: ParamsResourceProjectsLocationsApisDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApigatewayApi] = js.native
  def get(callback: BodyResponseCallback[SchemaApigatewayApi]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayApi] = js.native
  def get(params: ParamsResourceProjectsLocationsApisGet): GaxiosPromise[SchemaApigatewayApi] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisGet,
    callback: BodyResponseCallback[SchemaApigatewayApi]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisGet,
    options: BodyResponseCallback[Readable | SchemaApigatewayApi],
    callback: BodyResponseCallback[Readable | SchemaApigatewayApi]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsApisGet, options: MethodOptions): GaxiosPromise[SchemaApigatewayApi] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayApi]
  ): Unit = js.native
  /**
    * Gets details of a single Api.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.get({
    *     // Required. Resource name of the form: `projects/x/locations/global/apis/x`
    *     name: 'projects/my-project/locations/my-location/apis/my-api',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
    *   //   "managedService": "my_managedService",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
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
  def get(params: ParamsResourceProjectsLocationsApisGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaApigatewayPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisGetiampolicy): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisGetiampolicy,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaApigatewayPolicy],
    callback: BodyResponseCallback[Readable | SchemaApigatewayPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/apis/my-api',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsApisGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsApisGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaApigatewayListApisResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApigatewayListApisResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayListApisResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsApisList): GaxiosPromise[SchemaApigatewayListApisResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisList,
    callback: BodyResponseCallback[SchemaApigatewayListApisResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisList,
    options: BodyResponseCallback[Readable | SchemaApigatewayListApisResponse],
    callback: BodyResponseCallback[Readable | SchemaApigatewayListApisResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsApisList, options: MethodOptions): GaxiosPromise[SchemaApigatewayListApisResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayListApisResponse]
  ): Unit = js.native
  /**
    * Lists Apis in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.list({
    *     // Filter.
    *     filter: 'placeholder-value',
    *     // Order by parameters.
    *     orderBy: 'placeholder-value',
    *     // Page size.
    *     pageSize: 'placeholder-value',
    *     // Page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource of the API, of the form: `projects/x/locations/global`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apis": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachableLocations": []
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
  def list(params: ParamsResourceProjectsLocationsApisList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsApisPatch): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisPatch,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisPatch,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsApisPatch, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Updates the parameters of a single Api.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.patch({
    *     // Output only. Resource name of the API. Format: projects/{project\}/locations/global/apis/{api\}
    *     name: 'projects/my-project/locations/my-location/apis/my-api',
    *     // Field mask is used to specify the fields to be overwritten in the Api resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "labels": {},
    *       //   "managedService": "my_managedService",
    *       //   "name": "my_name",
    *       //   "state": "my_state",
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
  def patch(params: ParamsResourceProjectsLocationsApisPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsApisPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaApigatewayPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisSetiampolicy): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisSetiampolicy,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaApigatewayPolicy],
    callback: BodyResponseCallback[Readable | SchemaApigatewayPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/apis/my-api',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsApisSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsApisSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaApigatewayTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisTestiampermissions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisTestiampermissions,
    callback: BodyResponseCallback[SchemaApigatewayTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaApigatewayTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaApigatewayTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigateway.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigateway = google.apigateway('v1');
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
    *   const res = await apigateway.projects.locations.apis.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/apis/my-api',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsApisTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsApisTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
