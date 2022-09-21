package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chromepolicy/v1", "chromepolicy_v1.Resource$Customers$Policies$Groups")
@js.native
open class ResourceCustomersPoliciesGroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(params: ParamsResourceCustomersPoliciesGroupsBatchdelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceCustomersPoliciesGroupsBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceCustomersPoliciesGroupsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceCustomersPoliciesGroupsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceCustomersPoliciesGroupsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete multiple policy values that are applied to a specific group. All targets must have the same target format. That is to say that they must point to the same target resource and must have the same keys specified in `additionalTargetKeyNames`, though the values for those keys may be different. On failure the request will return the error details as part of the google.rpc.Status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromepolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromepolicy = google.chromepolicy('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/chrome.management.policy'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromepolicy.customers.policies.groups.batchDelete({
    *     // ID of the Google Workspace account or literal "my_customer" for the customer associated to the request.
    *     customer: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
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
  def batchDelete(params: ParamsResourceCustomersPoliciesGroupsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceCustomersPoliciesGroupsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchModify(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchModify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(params: ParamsResourceCustomersPoliciesGroupsBatchmodify): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesGroupsBatchmodify,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesGroupsBatchmodify,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchModify(params: ParamsResourceCustomersPoliciesGroupsBatchmodify, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesGroupsBatchmodify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Modify multiple policy values that are applied to a specific group. All targets must have the same target format. That is to say that they must point to the same target resource and must have the same keys specified in `additionalTargetKeyNames`, though the values for those keys may be different. On failure the request will return the error details as part of the google.rpc.Status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromepolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromepolicy = google.chromepolicy('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/chrome.management.policy'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chromepolicy.customers.policies.groups.batchModify({
    *     // ID of the Google Workspace account or literal "my_customer" for the customer associated to the request.
    *     customer: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
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
  def batchModify(params: ParamsResourceCustomersPoliciesGroupsBatchmodify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesGroupsBatchmodify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def listGroupPriorityOrdering(): GaxiosPromise[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse] = js.native
  def listGroupPriorityOrdering(callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse]): Unit = js.native
  def listGroupPriorityOrdering(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse] = js.native
  def listGroupPriorityOrdering(params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering): GaxiosPromise[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse] = js.native
  def listGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse]
  ): Unit = js.native
  def listGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering,
    options: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse]
  ): Unit = js.native
  def listGroupPriorityOrdering(params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse] = js.native
  def listGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse]
  ): Unit = js.native
  /**
    * Retrieve a group priority ordering for an app. The target app must be supplied in `additionalTargetKeyNames` in the PolicyTargetKey. On failure the request will return the error details as part of the google.rpc.Status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromepolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromepolicy = google.chromepolicy('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/chrome.management.policy',
    *       'https://www.googleapis.com/auth/chrome.management.policy.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await chromepolicy.customers.policies.groups.listGroupPriorityOrdering({
    *       // Required. ID of the Google Workspace account or literal "my_customer" for the customer associated to the request.
    *       customer: 'customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policyNamespace": "my_policyNamespace",
    *         //   "policyTargetKey": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "groupIds": [],
    *   //   "policyNamespace": "my_policyNamespace",
    *   //   "policyTargetKey": {}
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
  def listGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsListgrouppriorityordering,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateGroupPriorityOrdering(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def updateGroupPriorityOrdering(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def updateGroupPriorityOrdering(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def updateGroupPriorityOrdering(params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def updateGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def updateGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def updateGroupPriorityOrdering(params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def updateGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Update a group priority ordering for an app. The target app must be supplied in `additionalTargetKeyNames` in the PolicyTargetKey. On failure the request will return the error details as part of the google.rpc.Status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chromepolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chromepolicy = google.chromepolicy('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/chrome.management.policy'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await chromepolicy.customers.policies.groups.updateGroupPriorityOrdering({
    *       // Required. ID of the Google Workspace account or literal "my_customer" for the customer associated to the request.
    *       customer: 'customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "groupIds": [],
    *         //   "policyNamespace": "my_policyNamespace",
    *         //   "policyTargetKey": {}
    *         // }
    *       },
    *     });
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
  def updateGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateGroupPriorityOrdering(
    params: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
