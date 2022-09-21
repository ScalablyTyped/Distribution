package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Divisions")
@js.native
open class ResourceDivisions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaDivisionSearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(params: ParamsResourceDivisionsSearch): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    callback: BodyResponseCallback[SchemaDivisionSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    options: BodyResponseCallback[Readable | SchemaDivisionSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaDivisionSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceDivisionsSearch, options: MethodOptions): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDivisionSearchResponse]
  ): Unit = js.native
  /**
    * Searches for political divisions by their natural name or OCD ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/civicinfo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await civicinfo.divisions.search({
    *     // The search query. Queries can cover any parts of a OCD ID or a human readable division name. All words given in the query are treated as required patterns. In addition to that, most query operators of the Apache Lucene library are supported. See http://lucene.apache.org/core/2_9_4/queryparsersyntax.html
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "results": []
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
  def search(params: ParamsResourceDivisionsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
