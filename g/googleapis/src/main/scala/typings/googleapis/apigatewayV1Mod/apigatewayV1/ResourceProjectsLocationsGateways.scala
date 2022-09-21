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

@JSImport("googleapis/build/src/apis/apigateway/v1", "apigateway_v1.Resource$Projects$Locations$Gateways")
@js.native
open class ResourceProjectsLocationsGateways protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsGatewaysCreate): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGatewaysCreate,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsGatewaysCreate,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsGatewaysCreate, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGatewaysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Creates a new Gateway in a given project and location.
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
    *   const res = await apigateway.projects.locations.gateways.create({
    *     // Required. Identifier to assign to the Gateway. Must be unique within scope of the parent resource.
    *     gatewayId: 'placeholder-value',
    *     // Required. Parent resource of the Gateway, of the form: `projects/x/locations/x`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiConfig": "my_apiConfig",
    *       //   "createTime": "my_createTime",
    *       //   "defaultHostname": "my_defaultHostname",
    *       //   "displayName": "my_displayName",
    *       //   "labels": {},
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
  def create(params: ParamsResourceProjectsLocationsGatewaysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGatewaysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsGatewaysDelete): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGatewaysDelete,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGatewaysDelete,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsGatewaysDelete, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGatewaysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Deletes a single Gateway.
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
    *   const res = await apigateway.projects.locations.gateways.delete({
    *     // Required. Resource name of the form: `projects/x/locations/x/gateways/x`
    *     name: 'projects/my-project/locations/my-location/gateways/my-gateway',
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
  def delete(params: ParamsResourceProjectsLocationsGatewaysDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGatewaysDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApigatewayGateway] = js.native
  def get(callback: BodyResponseCallback[SchemaApigatewayGateway]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayGateway] = js.native
  def get(params: ParamsResourceProjectsLocationsGatewaysGet): GaxiosPromise[SchemaApigatewayGateway] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGatewaysGet,
    callback: BodyResponseCallback[SchemaApigatewayGateway]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGatewaysGet,
    options: BodyResponseCallback[Readable | SchemaApigatewayGateway],
    callback: BodyResponseCallback[Readable | SchemaApigatewayGateway]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGatewaysGet, options: MethodOptions): GaxiosPromise[SchemaApigatewayGateway] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGatewaysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayGateway]
  ): Unit = js.native
  /**
    * Gets details of a single Gateway.
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
    *   const res = await apigateway.projects.locations.gateways.get({
    *     // Required. Resource name of the form: `projects/x/locations/x/gateways/x`
    *     name: 'projects/my-project/locations/my-location/gateways/my-gateway',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiConfig": "my_apiConfig",
    *   //   "createTime": "my_createTime",
    *   //   "defaultHostname": "my_defaultHostname",
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
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
  def get(params: ParamsResourceProjectsLocationsGatewaysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGatewaysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaApigatewayPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGatewaysGetiampolicy): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysGetiampolicy,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaApigatewayPolicy],
    callback: BodyResponseCallback[Readable | SchemaApigatewayPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGatewaysGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysGetiampolicy,
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
    *   const res = await apigateway.projects.locations.gateways.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/gateways/my-gateway',
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsGatewaysGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaApigatewayListGatewaysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApigatewayListGatewaysResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayListGatewaysResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGatewaysList): GaxiosPromise[SchemaApigatewayListGatewaysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGatewaysList,
    callback: BodyResponseCallback[SchemaApigatewayListGatewaysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGatewaysList,
    options: BodyResponseCallback[Readable | SchemaApigatewayListGatewaysResponse],
    callback: BodyResponseCallback[Readable | SchemaApigatewayListGatewaysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGatewaysList, options: MethodOptions): GaxiosPromise[SchemaApigatewayListGatewaysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGatewaysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayListGatewaysResponse]
  ): Unit = js.native
  /**
    * Lists Gateways in a given project and location.
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
    *   const res = await apigateway.projects.locations.gateways.list({
    *     // Filter.
    *     filter: 'placeholder-value',
    *     // Order by parameters.
    *     orderBy: 'placeholder-value',
    *     // Page size.
    *     pageSize: 'placeholder-value',
    *     // Page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource of the Gateway, of the form: `projects/x/locations/x`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "gateways": [],
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
  def list(params: ParamsResourceProjectsLocationsGatewaysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGatewaysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaApigatewayOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsGatewaysPatch): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGatewaysPatch,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGatewaysPatch,
    options: BodyResponseCallback[Readable | SchemaApigatewayOperation],
    callback: BodyResponseCallback[Readable | SchemaApigatewayOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsGatewaysPatch, options: MethodOptions): GaxiosPromise[SchemaApigatewayOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGatewaysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApigatewayOperation]
  ): Unit = js.native
  /**
    * Updates the parameters of a single Gateway.
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
    *   const res = await apigateway.projects.locations.gateways.patch({
    *     // Output only. Resource name of the Gateway. Format: projects/{project\}/locations/{location\}/gateways/{gateway\}
    *     name: 'projects/my-project/locations/my-location/gateways/my-gateway',
    *     // Field mask is used to specify the fields to be overwritten in the Gateway resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiConfig": "my_apiConfig",
    *       //   "createTime": "my_createTime",
    *       //   "defaultHostname": "my_defaultHostname",
    *       //   "displayName": "my_displayName",
    *       //   "labels": {},
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
  def patch(params: ParamsResourceProjectsLocationsGatewaysPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGatewaysPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaApigatewayPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGatewaysSetiampolicy): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysSetiampolicy,
    callback: BodyResponseCallback[SchemaApigatewayPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaApigatewayPolicy],
    callback: BodyResponseCallback[Readable | SchemaApigatewayPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGatewaysSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaApigatewayPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysSetiampolicy,
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
    *   const res = await apigateway.projects.locations.gateways.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/gateways/my-gateway',
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsGatewaysSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGatewaysSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaApigatewayTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGatewaysTestiampermissions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGatewaysTestiampermissions,
    callback: BodyResponseCallback[SchemaApigatewayTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGatewaysTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaApigatewayTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaApigatewayTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGatewaysTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaApigatewayTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGatewaysTestiampermissions,
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
    *   const res = await apigateway.projects.locations.gateways.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/gateways/my-gateway',
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsGatewaysTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGatewaysTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
