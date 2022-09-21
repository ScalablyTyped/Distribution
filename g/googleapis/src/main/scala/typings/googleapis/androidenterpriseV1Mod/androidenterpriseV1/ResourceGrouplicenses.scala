package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenses")
@js.native
open class ResourceGrouplicenses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(callback: BodyResponseCallback[SchemaGroupLicense]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(params: ParamsResourceGrouplicensesGet): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(params: ParamsResourceGrouplicensesGet, callback: BodyResponseCallback[SchemaGroupLicense]): Unit = js.native
  def get(
    params: ParamsResourceGrouplicensesGet,
    options: BodyResponseCallback[Readable | SchemaGroupLicense],
    callback: BodyResponseCallback[Readable | SchemaGroupLicense]
  ): Unit = js.native
  def get(params: ParamsResourceGrouplicensesGet, options: MethodOptions): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(
    params: ParamsResourceGrouplicensesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicense]
  ): Unit = js.native
  /**
    * Retrieves details of an enterprise's group license for a product.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.grouplicenses.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product the group license is for, e.g. "app:com.google.android.gm".
    *     groupLicenseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acquisitionKind": "my_acquisitionKind",
    *   //   "approval": "my_approval",
    *   //   "numProvisioned": 0,
    *   //   "numPurchased": 0,
    *   //   "permissions": "my_permissions",
    *   //   "productId": "my_productId"
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
  def get(params: ParamsResourceGrouplicensesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceGrouplicensesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupLicensesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(params: ParamsResourceGrouplicensesList): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    callback: BodyResponseCallback[SchemaGroupLicensesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    options: BodyResponseCallback[Readable | SchemaGroupLicensesListResponse],
    callback: BodyResponseCallback[Readable | SchemaGroupLicensesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGrouplicensesList, options: MethodOptions): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicensesListResponse]
  ): Unit = js.native
  /**
    * Retrieves IDs of all products for which the enterprise has a group license.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.grouplicenses.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "groupLicense": []
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
  def list(params: ParamsResourceGrouplicensesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
