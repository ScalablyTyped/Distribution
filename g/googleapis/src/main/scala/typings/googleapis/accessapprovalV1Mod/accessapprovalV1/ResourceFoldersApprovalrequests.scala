package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accessapproval/v1", "accessapproval_v1.Resource$Folders$Approvalrequests")
@js.native
open class ResourceFoldersApprovalrequests protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(params: ParamsResourceFoldersApprovalrequestsApprove): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(
    params: ParamsResourceFoldersApprovalrequestsApprove,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def approve(
    params: ParamsResourceFoldersApprovalrequestsApprove,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def approve(params: ParamsResourceFoldersApprovalrequestsApprove, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(
    params: ParamsResourceFoldersApprovalrequestsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
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
    *   const res = await accessapproval.folders.approvalRequests.approve({
    *     // Name of the approval request to approve.
    *     name: 'folders/my-folder/approvalRequests/my-approvalRequest',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expireTime": "my_expireTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
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
  def approve(params: ParamsResourceFoldersApprovalrequestsApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceFoldersApprovalrequestsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def dismiss(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def dismiss(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(params: ParamsResourceFoldersApprovalrequestsDismiss): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(
    params: ParamsResourceFoldersApprovalrequestsDismiss,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def dismiss(
    params: ParamsResourceFoldersApprovalrequestsDismiss,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def dismiss(params: ParamsResourceFoldersApprovalrequestsDismiss, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(
    params: ParamsResourceFoldersApprovalrequestsDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
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
    *   const res = await accessapproval.folders.approvalRequests.dismiss({
    *     // Name of the ApprovalRequest to dismiss.
    *     name: 'folders/my-folder/approvalRequests/my-approvalRequest',
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
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
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
  def dismiss(params: ParamsResourceFoldersApprovalrequestsDismiss, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def dismiss(
    params: ParamsResourceFoldersApprovalrequestsDismiss,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(params: ParamsResourceFoldersApprovalrequestsGet): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(
    params: ParamsResourceFoldersApprovalrequestsGet,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def get(
    params: ParamsResourceFoldersApprovalrequestsGet,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersApprovalrequestsGet, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(
    params: ParamsResourceFoldersApprovalrequestsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * Gets an approval request. Returns NOT_FOUND if the request does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
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
    *   const res = await accessapproval.folders.approvalRequests.get({
    *     // The name of the approval request to retrieve. Format: "{projects|folders|organizations\}/{id\}/approvalRequests/{approval_request\}"
    *     name: 'folders/my-folder/approvalRequests/my-approvalRequest',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
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
  def get(params: ParamsResourceFoldersApprovalrequestsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFoldersApprovalrequestsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def invalidate(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def invalidate(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def invalidate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def invalidate(params: ParamsResourceFoldersApprovalrequestsInvalidate): GaxiosPromise[SchemaApprovalRequest] = js.native
  def invalidate(
    params: ParamsResourceFoldersApprovalrequestsInvalidate,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def invalidate(
    params: ParamsResourceFoldersApprovalrequestsInvalidate,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def invalidate(params: ParamsResourceFoldersApprovalrequestsInvalidate, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def invalidate(
    params: ParamsResourceFoldersApprovalrequestsInvalidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * Invalidates an existing ApprovalRequest. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It only invalidates a single approval. Returns FAILED_PRECONDITION if the request exists but is not in an approved state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
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
    *   const res = await accessapproval.folders.approvalRequests.invalidate({
    *     // Name of the ApprovalRequest to invalidate.
    *     name: 'folders/my-folder/approvalRequests/my-approvalRequest',
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
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
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
  def invalidate(params: ParamsResourceFoldersApprovalrequestsInvalidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def invalidate(
    params: ParamsResourceFoldersApprovalrequestsInvalidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(params: ParamsResourceFoldersApprovalrequestsList): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(
    params: ParamsResourceFoldersApprovalrequestsList,
    callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFoldersApprovalrequestsList,
    options: BodyResponseCallback[Readable | SchemaListApprovalRequestsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersApprovalrequestsList, options: MethodOptions): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(
    params: ParamsResourceFoldersApprovalrequestsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  /**
    * Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse chronological.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
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
    *   const res = await accessapproval.folders.approvalRequests.list({
    *     // A filter on the type of approval requests to retrieve. Must be one of the following values: * [not set]: Requests that are pending or have active approvals. * ALL: All requests. * PENDING: Only pending requests. * ACTIVE: Only active (i.e. currently approved) requests. * DISMISSED: Only requests that have been dismissed, or requests that are not approved and past expiration. * EXPIRED: Only requests that have been approved, and the approval has expired. * HISTORY: Active, dismissed and expired requests.
    *     filter: 'placeholder-value',
    *     // Requested page size.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return.
    *     pageToken: 'placeholder-value',
    *     // The parent resource. This may be "projects/{project\}", "folders/{folder\}", or "organizations/{organization\}".
    *     parent: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approvalRequests": [],
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
  def list(params: ParamsResourceFoldersApprovalrequestsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersApprovalrequestsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
