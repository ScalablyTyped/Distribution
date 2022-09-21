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

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Provisioningquotas")
@js.native
open class ResourceProjectsLocationsProvisioningquotas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProvisioningQuotasResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProvisioningquotasList): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvisioningquotasList,
    callback: BodyResponseCallback[SchemaListProvisioningQuotasResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvisioningquotasList,
    options: BodyResponseCallback[Readable | SchemaListProvisioningQuotasResponse],
    callback: BodyResponseCallback[Readable | SchemaListProvisioningQuotasResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProvisioningquotasList, options: MethodOptions): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvisioningquotasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProvisioningQuotasResponse]
  ): Unit = js.native
  /**
    * List the budget details to provision resources on a given project.
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
    *     await baremetalsolution.projects.locations.provisioningQuotas.list({
    *       // Requested page size. The server might return fewer items than requested. If unspecified, server will pick an appropriate default. Notice that page_size field is not supported and won't be respected in the API request for now, will be updated when pagination is supported.
    *       pageSize: 'placeholder-value',
    *       // A token identifying a page of results from the server.
    *       pageToken: 'placeholder-value',
    *       // Required. Parent value for ListProvisioningQuotasRequest.
    *       parent: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "provisioningQuotas": []
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
  def list(params: ParamsResourceProjectsLocationsProvisioningquotasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvisioningquotasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
