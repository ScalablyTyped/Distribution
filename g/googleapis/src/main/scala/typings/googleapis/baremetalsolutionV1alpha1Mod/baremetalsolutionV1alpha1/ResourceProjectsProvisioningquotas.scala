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

@JSImport("googleapis/build/src/apis/baremetalsolution/v1alpha1", "baremetalsolution_v1alpha1.Resource$Projects$Provisioningquotas")
@js.native
open class ResourceProjectsProvisioningquotas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProvisioningQuotasResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(params: ParamsResourceProjectsProvisioningquotasList): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(
    params: ParamsResourceProjectsProvisioningquotasList,
    callback: BodyResponseCallback[SchemaListProvisioningQuotasResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsProvisioningquotasList,
    options: BodyResponseCallback[Readable | SchemaListProvisioningQuotasResponse],
    callback: BodyResponseCallback[Readable | SchemaListProvisioningQuotasResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsProvisioningquotasList, options: MethodOptions): GaxiosPromise[SchemaListProvisioningQuotasResponse] = js.native
  def list(
    params: ParamsResourceProjectsProvisioningquotasList,
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
    *   const res = await baremetalsolution.projects.provisioningQuotas.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent project containing the provisioning quotas.
    *     parent: 'projects/my-project',
    *   });
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
  def list(params: ParamsResourceProjectsProvisioningquotasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsProvisioningquotasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
