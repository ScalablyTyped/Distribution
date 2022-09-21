package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Ekmconnections")
@js.native
open class ResourceProjectsLocationsEkmconnections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEkmConnection] = js.native
  def create(callback: BodyResponseCallback[SchemaEkmConnection]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def create(params: ParamsResourceProjectsLocationsEkmconnectionsCreate): GaxiosPromise[SchemaEkmConnection] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEkmconnectionsCreate,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEkmconnectionsCreate,
    options: BodyResponseCallback[Readable | SchemaEkmConnection],
    callback: BodyResponseCallback[Readable | SchemaEkmConnection]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEkmconnectionsCreate, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEkmconnectionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  /**
    * Creates a new EkmConnection in a given Project and Location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.create({
    *     // Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`.
    *     ekmConnectionId: 'placeholder-value',
    *     // Required. The resource name of the location associated with the EkmConnection, in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "serviceResolvers": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "serviceResolvers": []
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
  def create(params: ParamsResourceProjectsLocationsEkmconnectionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEkmconnectionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEkmConnection] = js.native
  def get(callback: BodyResponseCallback[SchemaEkmConnection]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def get(params: ParamsResourceProjectsLocationsEkmconnectionsGet): GaxiosPromise[SchemaEkmConnection] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEkmconnectionsGet,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsEkmconnectionsGet,
    options: BodyResponseCallback[Readable | SchemaEkmConnection],
    callback: BodyResponseCallback[Readable | SchemaEkmConnection]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsEkmconnectionsGet, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEkmconnectionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  /**
    * Returns metadata for a given EkmConnection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.get({
    *     // Required. The name of the EkmConnection to get.
    *     name: 'projects/my-project/locations/my-location/ekmConnections/my-ekmConnection',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "serviceResolvers": []
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
  def get(params: ParamsResourceProjectsLocationsEkmconnectionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEkmconnectionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/ekmConnections/my-ekmConnection',
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEkmConnectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEkmConnectionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEkmConnectionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEkmconnectionsList): GaxiosPromise[SchemaListEkmConnectionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEkmconnectionsList,
    callback: BodyResponseCallback[SchemaListEkmConnectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEkmconnectionsList,
    options: BodyResponseCallback[Readable | SchemaListEkmConnectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEkmConnectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEkmconnectionsList, options: MethodOptions): GaxiosPromise[SchemaListEkmConnectionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEkmconnectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEkmConnectionsResponse]
  ): Unit = js.native
  /**
    * Lists EkmConnections.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.list({
    *     // Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *     filter: 'placeholder-value',
    *     // Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *     orderBy: 'placeholder-value',
    *     // Optional. Optional limit on the number of EkmConnections to include in the response. Further EkmConnections can subsequently be obtained by including the ListEkmConnectionsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. Optional pagination token, returned earlier via ListEkmConnectionsResponse.next_page_token.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the location associated with the EkmConnections to list, in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ekmConnections": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceProjectsLocationsEkmconnectionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEkmconnectionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEkmConnection] = js.native
  def patch(callback: BodyResponseCallback[SchemaEkmConnection]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def patch(params: ParamsResourceProjectsLocationsEkmconnectionsPatch): GaxiosPromise[SchemaEkmConnection] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEkmconnectionsPatch,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEkmconnectionsPatch,
    options: BodyResponseCallback[Readable | SchemaEkmConnection],
    callback: BodyResponseCallback[Readable | SchemaEkmConnection]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEkmconnectionsPatch, options: MethodOptions): GaxiosPromise[SchemaEkmConnection] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEkmconnectionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEkmConnection]
  ): Unit = js.native
  /**
    * Updates an EkmConnection's metadata.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.patch({
    *     // Output only. The resource name for the EkmConnection in the format `projects/x/locations/x/ekmConnections/x`.
    *     name: 'projects/my-project/locations/my-location/ekmConnections/my-ekmConnection',
    *     // Required. List of fields to be updated in this request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "serviceResolvers": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "serviceResolvers": []
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
  def patch(params: ParamsResourceProjectsLocationsEkmconnectionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEkmconnectionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.ekmConnections.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/ekmConnections/my-ekmConnection',
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsEkmconnectionsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudkms.projects.locations.ekmConnections.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/ekmConnections/my-ekmConnection',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
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
    params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEkmconnectionsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
