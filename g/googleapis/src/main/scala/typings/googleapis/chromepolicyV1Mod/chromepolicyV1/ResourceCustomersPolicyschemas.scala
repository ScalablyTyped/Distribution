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

@JSImport("googleapis/build/src/apis/chromepolicy/v1", "chromepolicy_v1.Resource$Customers$Policyschemas")
@js.native
open class ResourceCustomersPolicyschemas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleChromePolicyV1PolicySchema] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleChromePolicyV1PolicySchema]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1PolicySchema] = js.native
  def get(params: ParamsResourceCustomersPolicyschemasGet): GaxiosPromise[SchemaGoogleChromePolicyV1PolicySchema] = js.native
  def get(
    params: ParamsResourceCustomersPolicyschemasGet,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1PolicySchema]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersPolicyschemasGet,
    options: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1PolicySchema],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1PolicySchema]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersPolicyschemasGet, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1PolicySchema] = js.native
  def get(
    params: ParamsResourceCustomersPolicyschemasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1PolicySchema]
  ): Unit = js.native
  /**
    * Get a specific policy schema for a customer by its resource name.
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
    *   const res = await chromepolicy.customers.policySchemas.get({
    *     // Required. The policy schema resource name to query.
    *     name: 'customers/my-customer/policySchemas/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRestrictions": [],
    *   //   "additionalTargetKeyNames": [],
    *   //   "definition": {},
    *   //   "fieldDescriptions": [],
    *   //   "name": "my_name",
    *   //   "notices": [],
    *   //   "policyApiLifecycle": {},
    *   //   "policyApiLifeycle": {},
    *   //   "policyDescription": "my_policyDescription",
    *   //   "schemaName": "my_schemaName",
    *   //   "supportUri": "my_supportUri",
    *   //   "validTargetResources": []
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
  def get(params: ParamsResourceCustomersPolicyschemasGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersPolicyschemasGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleChromePolicyV1ListPolicySchemasResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListPolicySchemasResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ListPolicySchemasResponse] = js.native
  def list(params: ParamsResourceCustomersPolicyschemasList): GaxiosPromise[SchemaGoogleChromePolicyV1ListPolicySchemasResponse] = js.native
  def list(
    params: ParamsResourceCustomersPolicyschemasList,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListPolicySchemasResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersPolicyschemasList,
    options: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ListPolicySchemasResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleChromePolicyV1ListPolicySchemasResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersPolicyschemasList, options: MethodOptions): GaxiosPromise[SchemaGoogleChromePolicyV1ListPolicySchemasResponse] = js.native
  def list(
    params: ParamsResourceCustomersPolicyschemasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChromePolicyV1ListPolicySchemasResponse]
  ): Unit = js.native
  /**
    * Gets a list of policy schemas that match a specified filter value for a given customer.
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
    *   const res = await chromepolicy.customers.policySchemas.list({
    *     // The schema filter used to find a particular schema based on fields like its resource name, description and `additionalTargetKeyNames`.
    *     filter: 'placeholder-value',
    *     // The maximum number of policy schemas to return.
    *     pageSize: 'placeholder-value',
    *     // The page token used to retrieve a specific page of the listing request.
    *     pageToken: 'placeholder-value',
    *     // Required. The customer for which the listing request will apply.
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policySchemas": []
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
  def list(params: ParamsResourceCustomersPolicyschemasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersPolicyschemasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
