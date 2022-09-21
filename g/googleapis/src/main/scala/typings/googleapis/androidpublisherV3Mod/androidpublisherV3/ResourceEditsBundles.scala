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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Bundles")
@js.native
open class ResourceEditsBundles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBundlesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(params: ParamsResourceEditsBundlesList): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(params: ParamsResourceEditsBundlesList, callback: BodyResponseCallback[SchemaBundlesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsBundlesList,
    options: BodyResponseCallback[Readable | SchemaBundlesListResponse],
    callback: BodyResponseCallback[Readable | SchemaBundlesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsBundlesList, options: MethodOptions): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(
    params: ParamsResourceEditsBundlesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBundlesListResponse]
  ): Unit = js.native
  /**
    * Lists all current Android App Bundles of the app and edit.
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
    *   const res = await androidpublisher.edits.bundles.list({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bundles": [],
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
  def list(params: ParamsResourceEditsBundlesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEditsBundlesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaBundle] = js.native
  def upload(callback: BodyResponseCallback[SchemaBundle]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBundle] = js.native
  def upload(params: ParamsResourceEditsBundlesUpload): GaxiosPromise[SchemaBundle] = js.native
  def upload(params: ParamsResourceEditsBundlesUpload, callback: BodyResponseCallback[SchemaBundle]): Unit = js.native
  def upload(
    params: ParamsResourceEditsBundlesUpload,
    options: BodyResponseCallback[Readable | SchemaBundle],
    callback: BodyResponseCallback[Readable | SchemaBundle]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsBundlesUpload, options: MethodOptions): GaxiosPromise[SchemaBundle] = js.native
  def upload(
    params: ParamsResourceEditsBundlesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBundle]
  ): Unit = js.native
  /**
    * Uploads a new Android App Bundle to this edit. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
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
    *   const res = await androidpublisher.edits.bundles.upload({
    *     // Must be set to true if the app bundle installation may trigger a warning on user devices (for example, if installation size may be over a threshold, typically 100 MB).
    *     ackBundleInstallationWarning: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     requestBody: {
    *       // request body parameters
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sha1": "my_sha1",
    *   //   "sha256": "my_sha256",
    *   //   "versionCode": 0
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
  def upload(params: ParamsResourceEditsBundlesUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceEditsBundlesUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
