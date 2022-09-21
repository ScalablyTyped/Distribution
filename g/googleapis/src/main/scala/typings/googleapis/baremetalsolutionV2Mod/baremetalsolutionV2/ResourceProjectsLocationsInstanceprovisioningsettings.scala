package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Instanceprovisioningsettings")
@js.native
open class ResourceProjectsLocationsInstanceprovisioningsettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def fetch(): GaxiosPromise[SchemaFetchInstanceProvisioningSettingsResponse] = js.native
  def fetch(callback: BodyResponseCallback[SchemaFetchInstanceProvisioningSettingsResponse]): Unit = js.native
  def fetch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFetchInstanceProvisioningSettingsResponse] = js.native
  def fetch(params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch): GaxiosPromise[SchemaFetchInstanceProvisioningSettingsResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch,
    callback: BodyResponseCallback[SchemaFetchInstanceProvisioningSettingsResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch,
    options: BodyResponseCallback[Readable | SchemaFetchInstanceProvisioningSettingsResponse],
    callback: BodyResponseCallback[Readable | SchemaFetchInstanceProvisioningSettingsResponse]
  ): Unit = js.native
  def fetch(params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch, options: MethodOptions): GaxiosPromise[SchemaFetchInstanceProvisioningSettingsResponse] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchInstanceProvisioningSettingsResponse]
  ): Unit = js.native
  /**
    * Get instance provisioning settings for a given project. This is hidden method used by UI only.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
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
    *     await baremetalsolution.projects.locations.instanceProvisioningSettings.fetch(
    *       {
    *         // Required. The parent project and location containing the ProvisioningSettings.
    *         location: 'projects/my-project/locations/my-location',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "images": []
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
  def fetch(
    params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def fetch(
    params: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
