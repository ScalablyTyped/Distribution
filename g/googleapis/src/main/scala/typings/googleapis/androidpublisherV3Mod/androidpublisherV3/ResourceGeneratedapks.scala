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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Generatedapks")
@js.native
open class ResourceGeneratedapks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def download(): GaxiosPromise[Any] = js.native
  def download(callback: BodyResponseCallback[Any]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceGeneratedapksDownload): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceGeneratedapksDownload, callback: BodyResponseCallback[Any]): Unit = js.native
  def download(
    params: ParamsResourceGeneratedapksDownload,
    options: BodyResponseCallback[Any | Readable],
    callback: BodyResponseCallback[Any | Readable]
  ): Unit = js.native
  def download(params: ParamsResourceGeneratedapksDownload, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(
    params: ParamsResourceGeneratedapksDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Any]
  ): Unit = js.native
  /**
    * Downloads a single signed APK generated from an app bundle.
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
    *   const res = await androidpublisher.generatedapks.download({
    *     // Download ID, which uniquely identifies the APK to download. Can be obtained from the response of `generatedapks.list` method.
    *     downloadId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Version code of the app bundle.
    *     versionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def download(params: ParamsResourceGeneratedapksDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceGeneratedapksDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGeneratedApksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGeneratedApksListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGeneratedApksListResponse] = js.native
  def list(params: ParamsResourceGeneratedapksList): GaxiosPromise[SchemaGeneratedApksListResponse] = js.native
  def list(
    params: ParamsResourceGeneratedapksList,
    callback: BodyResponseCallback[SchemaGeneratedApksListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGeneratedapksList,
    options: BodyResponseCallback[Readable | SchemaGeneratedApksListResponse],
    callback: BodyResponseCallback[Readable | SchemaGeneratedApksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGeneratedapksList, options: MethodOptions): GaxiosPromise[SchemaGeneratedApksListResponse] = js.native
  def list(
    params: ParamsResourceGeneratedapksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGeneratedApksListResponse]
  ): Unit = js.native
  /**
    * Returns download metadata for all APKs that were generated from a given app bundle.
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
    *   const res = await androidpublisher.generatedapks.list({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Version code of the app bundle.
    *     versionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "generatedApks": []
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
  def list(params: ParamsResourceGeneratedapksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGeneratedapksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
