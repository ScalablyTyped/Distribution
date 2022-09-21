package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Testers")
@js.native
open class ResourceEditsTesters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTesters] = js.native
  def get(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def get(params: ParamsResourceEditsTestersGet): GaxiosPromise[SchemaTesters] = js.native
  def get(params: ParamsResourceEditsTestersGet, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def get(
    params: ParamsResourceEditsTestersGet,
    options: BodyResponseCallback[Readable | SchemaTesters],
    callback: BodyResponseCallback[Readable | SchemaTesters]
  ): Unit = js.native
  def get(params: ParamsResourceEditsTestersGet, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def get(
    params: ParamsResourceEditsTestersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  /**
    * Gets testers. Note: Testers resource does not support email lists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.testers.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The track to read from.
    *     track: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "googleGroups": []
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
  def get(params: ParamsResourceEditsTestersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsTestersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTesters] = js.native
  def patch(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def patch(params: ParamsResourceEditsTestersPatch): GaxiosPromise[SchemaTesters] = js.native
  def patch(params: ParamsResourceEditsTestersPatch, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def patch(
    params: ParamsResourceEditsTestersPatch,
    options: BodyResponseCallback[Readable | SchemaTesters],
    callback: BodyResponseCallback[Readable | SchemaTesters]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsTestersPatch, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def patch(
    params: ParamsResourceEditsTestersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  /**
    * Patches testers. Note: Testers resource does not support email lists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.testers.patch({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The track to update.
    *     track: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "googleGroups": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "googleGroups": []
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
  def patch(params: ParamsResourceEditsTestersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEditsTestersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTesters] = js.native
  def update(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def update(params: ParamsResourceEditsTestersUpdate): GaxiosPromise[SchemaTesters] = js.native
  def update(params: ParamsResourceEditsTestersUpdate, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def update(
    params: ParamsResourceEditsTestersUpdate,
    options: BodyResponseCallback[Readable | SchemaTesters],
    callback: BodyResponseCallback[Readable | SchemaTesters]
  ): Unit = js.native
  def update(params: ParamsResourceEditsTestersUpdate, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def update(
    params: ParamsResourceEditsTestersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  /**
    * Updates testers. Note: Testers resource does not support email lists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.testers.update({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The track to update.
    *     track: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "googleGroups": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "googleGroups": []
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
  def update(params: ParamsResourceEditsTestersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEditsTestersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
