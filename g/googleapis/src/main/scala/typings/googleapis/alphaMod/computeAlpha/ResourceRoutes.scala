package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Routes")
@js.native
open class ResourceRoutes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRoutesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRoutesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceRoutesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRoutesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRoutesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified Route resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.routes.delete({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *     // Name of the Route resource to delete.
    *     route: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def delete(params: ParamsResourceRoutesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRoutesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRoute] = js.native
  def get(callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoute] = js.native
  def get(params: ParamsResourceRoutesGet): GaxiosPromise[SchemaRoute] = js.native
  def get(params: ParamsResourceRoutesGet, callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(
    params: ParamsResourceRoutesGet,
    options: BodyResponseCallback[Readable | SchemaRoute],
    callback: BodyResponseCallback[Readable | SchemaRoute]
  ): Unit = js.native
  def get(params: ParamsResourceRoutesGet, options: MethodOptions): GaxiosPromise[SchemaRoute] = js.native
  def get(
    params: ParamsResourceRoutesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoute]
  ): Unit = js.native
  /**
    * Returns the specified Route resource. Gets a list of available routes by making a list() request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.routes.get({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name of the Route resource to return.
    *     route: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowConflictingSubnetworks": false,
    *   //   "asPaths": [],
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "destRange": "my_destRange",
    *   //   "id": "my_id",
    *   //   "ilbRouteBehaviorOnUnhealthy": "my_ilbRouteBehaviorOnUnhealthy",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "nextHopGateway": "my_nextHopGateway",
    *   //   "nextHopIlb": "my_nextHopIlb",
    *   //   "nextHopInstance": "my_nextHopInstance",
    *   //   "nextHopInterconnectAttachment": "my_nextHopInterconnectAttachment",
    *   //   "nextHopIp": "my_nextHopIp",
    *   //   "nextHopNetwork": "my_nextHopNetwork",
    *   //   "nextHopPeering": "my_nextHopPeering",
    *   //   "nextHopVpnTunnel": "my_nextHopVpnTunnel",
    *   //   "priority": 0,
    *   //   "routeStatus": "my_routeStatus",
    *   //   "routeType": "my_routeType",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "tags": [],
    *   //   "warnings": []
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
  def get(params: ParamsResourceRoutesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRoutesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRoutesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRoutesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRoutesInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRoutesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRoutesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a Route resource in the specified project using the data included in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.routes.insert({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowConflictingSubnetworks": false,
    *       //   "asPaths": [],
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "description": "my_description",
    *       //   "destRange": "my_destRange",
    *       //   "id": "my_id",
    *       //   "ilbRouteBehaviorOnUnhealthy": "my_ilbRouteBehaviorOnUnhealthy",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "nextHopGateway": "my_nextHopGateway",
    *       //   "nextHopIlb": "my_nextHopIlb",
    *       //   "nextHopInstance": "my_nextHopInstance",
    *       //   "nextHopInterconnectAttachment": "my_nextHopInterconnectAttachment",
    *       //   "nextHopIp": "my_nextHopIp",
    *       //   "nextHopNetwork": "my_nextHopNetwork",
    *       //   "nextHopPeering": "my_nextHopPeering",
    *       //   "nextHopVpnTunnel": "my_nextHopVpnTunnel",
    *       //   "priority": 0,
    *       //   "routeStatus": "my_routeStatus",
    *       //   "routeType": "my_routeType",
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "tags": [],
    *       //   "warnings": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def insert(params: ParamsResourceRoutesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRoutesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRouteList] = js.native
  def list(callback: BodyResponseCallback[SchemaRouteList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRouteList] = js.native
  def list(params: ParamsResourceRoutesList): GaxiosPromise[SchemaRouteList] = js.native
  def list(params: ParamsResourceRoutesList, callback: BodyResponseCallback[SchemaRouteList]): Unit = js.native
  def list(
    params: ParamsResourceRoutesList,
    options: BodyResponseCallback[Readable | SchemaRouteList],
    callback: BodyResponseCallback[Readable | SchemaRouteList]
  ): Unit = js.native
  def list(params: ParamsResourceRoutesList, options: MethodOptions): GaxiosPromise[SchemaRouteList] = js.native
  def list(
    params: ParamsResourceRoutesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRouteList]
  ): Unit = js.native
  /**
    * Retrieves the list of Route resources available to the specified project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.routes.list({
    *     // A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    *     filter: 'placeholder-value',
    *     // The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    *     maxResults: 'placeholder-value',
    *     // Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
    *     orderBy: 'placeholder-value',
    *     // Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    *     returnPartialSuccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "warning": {}
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
  def list(params: ParamsResourceRoutesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRoutesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceRoutesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRoutesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRoutesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRoutesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRoutesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.routes.testIamPermissions({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name or id of the resource for this request.
    *     resource: '[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
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
  def testIamPermissions(params: ParamsResourceRoutesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceRoutesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
