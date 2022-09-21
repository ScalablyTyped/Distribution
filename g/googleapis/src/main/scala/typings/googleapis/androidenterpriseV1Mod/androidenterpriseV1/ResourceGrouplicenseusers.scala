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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenseusers")
@js.native
open class ResourceGrouplicenseusers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(params: ParamsResourceGrouplicenseusersList): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    options: BodyResponseCallback[Readable | SchemaGroupLicenseUsersListResponse],
    callback: BodyResponseCallback[Readable | SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGrouplicenseusersList, options: MethodOptions): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
  /**
    * Retrieves the IDs of the users who have been granted entitlements under the license.
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
    *   const res = await androidenterprise.grouplicenseusers.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product the group license is for, e.g. "app:com.google.android.gm".
    *     groupLicenseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "user": []
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
  def list(params: ParamsResourceGrouplicenseusersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
