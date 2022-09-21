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

@JSImport("googleapis/build/src/apis/chromepolicy/v1", "chromepolicy_v1.Resource$Customers$Policies$Orgunits")
@js.native
open class ResourceCustomersPoliciesOrgunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchInherit(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchInherit(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchInherit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchInherit(params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchInherit(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchInherit(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchInherit(params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchInherit(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Modify multiple policy values that are applied to a specific org unit so that they now inherit the value from a parent (if applicable). All targets must have the same target format. That is to say that they must point to the same target resource and must have the same keys specified in `additionalTargetKeyNames`, though the values for those keys may be different. On failure the request will return the error details as part of the google.rpc.Status.
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
    *   const res = await chromepolicy.customers.policies.orgunits.batchInherit({
    *     // ID of the G Suite account or literal "my_customer" for the customer associated to the request.
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
  def batchInherit(params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchInherit(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchinherit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchModify(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchModify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchModify(params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Modify multiple policy values that are applied to a specific org unit. All targets must have the same target format. That is to say that they must point to the same target resource and must have the same keys specified in `additionalTargetKeyNames`, though the values for those keys may be different. On failure the request will return the error details as part of the google.rpc.Status.
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
    *   const res = await chromepolicy.customers.policies.orgunits.batchModify({
    *     // ID of the G Suite account or literal "my_customer" for the customer associated to the request.
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
  def batchModify(params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchModify(
    params: ParamsResourceCustomersPoliciesOrgunitsBatchmodify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
