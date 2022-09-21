package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getServiceAccount(): GaxiosPromise[SchemaGetServiceAccountResponse] = js.native
  def getServiceAccount(callback: BodyResponseCallback[SchemaGetServiceAccountResponse]): Unit = js.native
  def getServiceAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetServiceAccountResponse] = js.native
  def getServiceAccount(params: ParamsResourceProjectsGetserviceaccount): GaxiosPromise[SchemaGetServiceAccountResponse] = js.native
  def getServiceAccount(
    params: ParamsResourceProjectsGetserviceaccount,
    callback: BodyResponseCallback[SchemaGetServiceAccountResponse]
  ): Unit = js.native
  def getServiceAccount(
    params: ParamsResourceProjectsGetserviceaccount,
    options: BodyResponseCallback[Readable | SchemaGetServiceAccountResponse],
    callback: BodyResponseCallback[Readable | SchemaGetServiceAccountResponse]
  ): Unit = js.native
  def getServiceAccount(params: ParamsResourceProjectsGetserviceaccount, options: MethodOptions): GaxiosPromise[SchemaGetServiceAccountResponse] = js.native
  def getServiceAccount(
    params: ParamsResourceProjectsGetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetServiceAccountResponse]
  ): Unit = js.native
  /**
    * Returns the email address of the service account for your project used for interactions with Google Cloud KMS.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.projects.getServiceAccount({
    *     // Project ID for which the service account is requested.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "kind": "my_kind"
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
  def getServiceAccount(params: ParamsResourceProjectsGetserviceaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getServiceAccount(
    params: ParamsResourceProjectsGetserviceaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProjectList] = js.native
  def list(callback: BodyResponseCallback[SchemaProjectList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectList] = js.native
  def list(params: ParamsResourceProjectsList): GaxiosPromise[SchemaProjectList] = js.native
  def list(params: ParamsResourceProjectsList, callback: BodyResponseCallback[SchemaProjectList]): Unit = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: BodyResponseCallback[Readable | SchemaProjectList],
    callback: BodyResponseCallback[Readable | SchemaProjectList]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsList, options: MethodOptions): GaxiosPromise[SchemaProjectList] = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectList]
  ): Unit = js.native
  /**
    * Lists all projects to which you have been granted any project role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.projects.list({
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "projects": [],
    *   //   "totalItems": 0
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
  def list(params: ParamsResourceProjectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
