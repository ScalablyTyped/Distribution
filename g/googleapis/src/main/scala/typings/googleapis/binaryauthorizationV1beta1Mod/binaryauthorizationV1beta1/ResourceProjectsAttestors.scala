package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects$Attestors")
@js.native
open class ResourceProjectsAttestors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAttestor] = js.native
  def create(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate): GaxiosPromise[SchemaAttestor] = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def create(
    params: ParamsResourceProjectsAttestorsCreate,
    options: BodyResponseCallback[Readable | SchemaAttestor],
    callback: BodyResponseCallback[Readable | SchemaAttestor]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def create(
    params: ParamsResourceProjectsAttestorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  /**
    * Creates an attestor, and returns a copy of the new attestor. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed, ALREADY_EXISTS if the attestor already exists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.create({
    *     // Required. The attestors ID.
    *     attestorId: 'placeholder-value',
    *     // Required. The parent of this attestor.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "userOwnedDrydockNote": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "userOwnedDrydockNote": {}
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
  def create(params: ParamsResourceProjectsAttestorsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAttestorsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAttestorsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAttestorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an attestor. Returns NOT_FOUND if the attestor does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.delete({
    *     // Required. The name of the attestors to delete, in the format `projects/x/attestors/x`.
    *     name: 'projects/my-project/attestors/my-attestor',
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
  def delete(params: ParamsResourceProjectsAttestorsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAttestorsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAttestor] = js.native
  def get(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def get(params: ParamsResourceProjectsAttestorsGet): GaxiosPromise[SchemaAttestor] = js.native
  def get(params: ParamsResourceProjectsAttestorsGet, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAttestorsGet,
    options: BodyResponseCallback[Readable | SchemaAttestor],
    callback: BodyResponseCallback[Readable | SchemaAttestor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAttestorsGet, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def get(
    params: ParamsResourceProjectsAttestorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  /**
    * Gets an attestor. Returns NOT_FOUND if the attestor does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.get({
    *     // Required. The name of the attestor to retrieve, in the format `projects/x/attestors/x`.
    *     name: 'projects/my-project/attestors/my-attestor',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "userOwnedDrydockNote": {}
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
  def get(params: ParamsResourceProjectsAttestorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAttestorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsAttestorsGetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaIamPolicy],
    callback: BodyResponseCallback[Readable | SchemaIamPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsAttestorsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/attestors/my-attestor',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def getIamPolicy(params: ParamsResourceProjectsAttestorsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAttestorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(params: ParamsResourceProjectsAttestorsList): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    callback: BodyResponseCallback[SchemaListAttestorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    options: BodyResponseCallback[Readable | SchemaListAttestorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAttestorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAttestorsList, options: MethodOptions): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAttestorsResponse]
  ): Unit = js.native
  /**
    * Lists attestors. Returns INVALID_ARGUMENT if the project does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.list({
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListAttestorsResponse.next_page_token returned from the previous call to the `ListAttestors` method.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the project associated with the attestors, in the format `projects/x`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attestors": [],
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
  def list(params: ParamsResourceProjectsAttestorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsAttestorsSetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaIamPolicy],
    callback: BodyResponseCallback[Readable | SchemaIamPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsAttestorsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/attestors/my-attestor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def setIamPolicy(params: ParamsResourceProjectsAttestorsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsAttestorsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsAttestorsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/attestors/my-attestor',
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
  def testIamPermissions(params: ParamsResourceProjectsAttestorsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAttestor] = js.native
  def update(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate): GaxiosPromise[SchemaAttestor] = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def update(
    params: ParamsResourceProjectsAttestorsUpdate,
    options: BodyResponseCallback[Readable | SchemaAttestor],
    callback: BodyResponseCallback[Readable | SchemaAttestor]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def update(
    params: ParamsResourceProjectsAttestorsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  /**
    * Updates an attestor. Returns NOT_FOUND if the attestor does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.attestors.update({
    *     // Required. The resource name, in the format: `projects/x/attestors/x`. This field may not be updated.
    *     name: 'projects/my-project/attestors/my-attestor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "userOwnedDrydockNote": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "userOwnedDrydockNote": {}
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
  def update(params: ParamsResourceProjectsAttestorsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsAttestorsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def validateAttestationOccurrence(): GaxiosPromise[SchemaValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(callback: BodyResponseCallback[SchemaValidateAttestationOccurrenceResponse]): Unit = js.native
  def validateAttestationOccurrence(params: Unit, options: MethodOptions): GaxiosPromise[SchemaValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(params: ParamsResourceProjectsAttestorsValidateattestationoccurrence): GaxiosPromise[SchemaValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(
    params: ParamsResourceProjectsAttestorsValidateattestationoccurrence,
    callback: BodyResponseCallback[SchemaValidateAttestationOccurrenceResponse]
  ): Unit = js.native
  def validateAttestationOccurrence(
    params: ParamsResourceProjectsAttestorsValidateattestationoccurrence,
    options: BodyResponseCallback[Readable | SchemaValidateAttestationOccurrenceResponse],
    callback: BodyResponseCallback[Readable | SchemaValidateAttestationOccurrenceResponse]
  ): Unit = js.native
  def validateAttestationOccurrence(params: ParamsResourceProjectsAttestorsValidateattestationoccurrence, options: MethodOptions): GaxiosPromise[SchemaValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(
    params: ParamsResourceProjectsAttestorsValidateattestationoccurrence,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaValidateAttestationOccurrenceResponse]
  ): Unit = js.native
  /**
    * Returns whether the given Attestation for the given image URI was signed by the given Attestor
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *     await binaryauthorization.projects.attestors.validateAttestationOccurrence({
    *       // Required. The resource name of the Attestor of the occurrence, in the format `projects/x/attestors/x`.
    *       attestor: 'projects/my-project/attestors/my-attestor',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "attestation": {},
    *         //   "occurrenceNote": "my_occurrenceNote",
    *         //   "occurrenceResourceUri": "my_occurrenceResourceUri"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "denialReason": "my_denialReason",
    *   //   "result": "my_result"
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
  def validateAttestationOccurrence(params: ParamsResourceProjectsAttestorsValidateattestationoccurrence, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validateAttestationOccurrence(
    params: ParamsResourceProjectsAttestorsValidateattestationoccurrence,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
