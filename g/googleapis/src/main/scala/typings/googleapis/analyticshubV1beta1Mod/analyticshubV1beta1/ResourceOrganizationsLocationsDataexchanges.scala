package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticshub/v1beta1", "analyticshub_v1beta1.Resource$Organizations$Locations$Dataexchanges")
@js.native
open class ResourceOrganizationsLocationsDataexchanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListOrgDataExchangesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOrgDataExchangesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOrgDataExchangesResponse] = js.native
  def list(params: ParamsResourceOrganizationsLocationsDataexchangesList): GaxiosPromise[SchemaListOrgDataExchangesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsDataexchangesList,
    callback: BodyResponseCallback[SchemaListOrgDataExchangesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsDataexchangesList,
    options: BodyResponseCallback[Readable | SchemaListOrgDataExchangesResponse],
    callback: BodyResponseCallback[Readable | SchemaListOrgDataExchangesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLocationsDataexchangesList, options: MethodOptions): GaxiosPromise[SchemaListOrgDataExchangesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsDataexchangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOrgDataExchangesResponse]
  ): Unit = js.native
  /**
    * Lists all data exchanges from projects in a given organization and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticshub.organizations.locations.dataExchanges.list({
    *     // Required. The organization resource path of the projects containing DataExchanges. e.g. `organizations/myorg/locations/US`.
    *     organization: 'organizations/my-organization/locations/my-location',
    *     // The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    *     pageSize: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataExchanges": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceOrganizationsLocationsDataexchangesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsDataexchangesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
