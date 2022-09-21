package typings.googleapis.apikeysV2Mod.apikeysV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/apikeys/v2", "apikeys_v2.Resource$Keys")
@js.native
open class ResourceKeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lookupKey(): GaxiosPromise[SchemaV2LookupKeyResponse] = js.native
  def lookupKey(callback: BodyResponseCallback[SchemaV2LookupKeyResponse]): Unit = js.native
  def lookupKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV2LookupKeyResponse] = js.native
  def lookupKey(params: ParamsResourceKeysLookupkey): GaxiosPromise[SchemaV2LookupKeyResponse] = js.native
  def lookupKey(params: ParamsResourceKeysLookupkey, callback: BodyResponseCallback[SchemaV2LookupKeyResponse]): Unit = js.native
  def lookupKey(
    params: ParamsResourceKeysLookupkey,
    options: BodyResponseCallback[Readable | SchemaV2LookupKeyResponse],
    callback: BodyResponseCallback[Readable | SchemaV2LookupKeyResponse]
  ): Unit = js.native
  def lookupKey(params: ParamsResourceKeysLookupkey, options: MethodOptions): GaxiosPromise[SchemaV2LookupKeyResponse] = js.native
  def lookupKey(
    params: ParamsResourceKeysLookupkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV2LookupKeyResponse]
  ): Unit = js.native
  /**
    * Find the parent project and resource name of the API key that matches the key string in the request. If the API key has been purged, resource name will not be set. The service account must have the `apikeys.keys.lookup` permission on the parent project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apikeys.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apikeys = google.apikeys('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await apikeys.keys.lookupKey({
    *     // Required. Finds the project that owns the key string value.
    *     keyString: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "parent": "my_parent"
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
  def lookupKey(params: ParamsResourceKeysLookupkey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookupKey(
    params: ParamsResourceKeysLookupkey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
