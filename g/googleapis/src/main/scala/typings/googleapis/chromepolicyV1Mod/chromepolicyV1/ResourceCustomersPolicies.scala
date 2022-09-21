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

@JSImport("googleapis/build/src/apis/chromepolicy/v1", "chromepolicy_v1.Resource$Customers$Policies")
@js.native
open class ResourceCustomersPolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var groups: ResourceCustomersPoliciesGroups = js.native
  
  var orgunits: ResourceCustomersPoliciesOrgunits = js.native
  
  def resolve(): GaxiosPromise[SchemaGoogleChromePolicyV1ResolveResponse] = js.native
  def resolve(callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ResolveResponse]): Unit = js.native
  def resolve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ResolveResponse] = js.native
  def resolve(params: ParamsResourceCustomersPoliciesResolve): GaxiosPromise[SchemaGoogleChromePolicyV1ResolveResponse] = js.native
  def resolve(
    params: ParamsResourceCustomersPoliciesResolve,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ResolveResponse]
  ): Unit = js.native
  def resolve(
    params: ParamsResourceCustomersPoliciesResolve,
    options: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ResolveResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ResolveResponse]
  ): Unit = js.native
  def resolve(params: ParamsResourceCustomersPoliciesResolve, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ResolveResponse] = js.native
  def resolve(
    params: ParamsResourceCustomersPoliciesResolve,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ResolveResponse]
  ): Unit = js.native
  /**
    * Gets the resolved policy values for a list of policies that match a search query.
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
    *   const res = await chromepolicy.customers.policies.resolve({
    *     // ID of the G Suite account or literal "my_customer" for the customer associated to the request.
    *     customer: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "policySchemaFilter": "my_policySchemaFilter",
    *       //   "policyTargetKey": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resolvedPolicies": []
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
  def resolve(params: ParamsResourceCustomersPoliciesResolve, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resolve(
    params: ParamsResourceCustomersPoliciesResolve,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
