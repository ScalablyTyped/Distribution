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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationssettings")
@js.native
open class ResourceManagedconfigurationssettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationssettingsList): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    options: BodyResponseCallback[Readable | SchemaManagedConfigurationsSettingsListResponse],
    callback: BodyResponseCallback[Readable | SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationssettingsList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  /**
    * Lists all the managed configurations settings for the specified app.
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
    *   const res = await androidenterprise.managedconfigurationssettings.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product for which the managed configurations settings applies to.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "managedConfigurationsSettings": []
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
  def list(params: ParamsResourceManagedconfigurationssettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
