package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/baremetalsolution/v1alpha1", "baremetalsolution_v1alpha1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def submitProvisioningConfig(): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def submitProvisioningConfig(callback: BodyResponseCallback[SchemaProvisioningConfig]): Unit = js.native
  def submitProvisioningConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def submitProvisioningConfig(params: ParamsResourceProjectsLocationsSubmitprovisioningconfig): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def submitProvisioningConfig(
    params: ParamsResourceProjectsLocationsSubmitprovisioningconfig,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  def submitProvisioningConfig(
    params: ParamsResourceProjectsLocationsSubmitprovisioningconfig,
    options: BodyResponseCallback[Readable | SchemaProvisioningConfig],
    callback: BodyResponseCallback[Readable | SchemaProvisioningConfig]
  ): Unit = js.native
  def submitProvisioningConfig(params: ParamsResourceProjectsLocationsSubmitprovisioningconfig, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def submitProvisioningConfig(
    params: ParamsResourceProjectsLocationsSubmitprovisioningconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  /**
    * Submit a provisiong configuration for a given project.
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
    * const baremetalsolution = google.baremetalsolution('v1alpha1');
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
    *     await baremetalsolution.projects.locations.submitProvisioningConfig({
    *       // Required. The target location of the provisioning request.
    *       location: 'locations/my-location',
    *       // Required. The target project of the provisioning request.
    *       project: 'projects/my-project',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "email": "my_email",
    *         //   "provisioningConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instances": [],
    *   //   "networks": [],
    *   //   "ticketId": "my_ticketId",
    *   //   "volumes": []
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
  def submitProvisioningConfig(params: ParamsResourceProjectsLocationsSubmitprovisioningconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submitProvisioningConfig(
    params: ParamsResourceProjectsLocationsSubmitprovisioningconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
