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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Systemapks$Variants")
@js.native
open class ResourceSystemapksVariants protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaVariant] = js.native
  def create(callback: BodyResponseCallback[SchemaVariant]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariant] = js.native
  def create(params: ParamsResourceSystemapksVariantsCreate): GaxiosPromise[SchemaVariant] = js.native
  def create(params: ParamsResourceSystemapksVariantsCreate, callback: BodyResponseCallback[SchemaVariant]): Unit = js.native
  def create(
    params: ParamsResourceSystemapksVariantsCreate,
    options: BodyResponseCallback[Readable | SchemaVariant],
    callback: BodyResponseCallback[Readable | SchemaVariant]
  ): Unit = js.native
  def create(params: ParamsResourceSystemapksVariantsCreate, options: MethodOptions): GaxiosPromise[SchemaVariant] = js.native
  def create(
    params: ParamsResourceSystemapksVariantsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariant]
  ): Unit = js.native
  /**
    * Creates an APK which is suitable for inclusion in a system image from an already uploaded Android App Bundle.
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
    *   const res = await androidpublisher.systemapks.variants.create({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The version code of the App Bundle.
    *     versionCode: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceSpec": {},
    *       //   "variantId": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceSpec": {},
    *   //   "variantId": 0
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
  def create(params: ParamsResourceSystemapksVariantsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSystemapksVariantsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def download(): GaxiosPromise[Any] = js.native
  def download(callback: BodyResponseCallback[Any]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceSystemapksVariantsDownload): GaxiosPromise[Any] = js.native
  def download(params: ParamsResourceSystemapksVariantsDownload, callback: BodyResponseCallback[Any]): Unit = js.native
  def download(
    params: ParamsResourceSystemapksVariantsDownload,
    options: BodyResponseCallback[Any | Readable],
    callback: BodyResponseCallback[Any | Readable]
  ): Unit = js.native
  def download(params: ParamsResourceSystemapksVariantsDownload, options: MethodOptions): GaxiosPromise[Any] = js.native
  def download(
    params: ParamsResourceSystemapksVariantsDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Any]
  ): Unit = js.native
  /**
    * Downloads a previously created system APK which is suitable for inclusion in a system image.
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
    *   const res = await androidpublisher.systemapks.variants.download({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The ID of a previously created system APK variant.
    *     variantId: 'placeholder-value',
    *     // The version code of the App Bundle.
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
  def download(params: ParamsResourceSystemapksVariantsDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceSystemapksVariantsDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVariant] = js.native
  def get(callback: BodyResponseCallback[SchemaVariant]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariant] = js.native
  def get(params: ParamsResourceSystemapksVariantsGet): GaxiosPromise[SchemaVariant] = js.native
  def get(params: ParamsResourceSystemapksVariantsGet, callback: BodyResponseCallback[SchemaVariant]): Unit = js.native
  def get(
    params: ParamsResourceSystemapksVariantsGet,
    options: BodyResponseCallback[Readable | SchemaVariant],
    callback: BodyResponseCallback[Readable | SchemaVariant]
  ): Unit = js.native
  def get(params: ParamsResourceSystemapksVariantsGet, options: MethodOptions): GaxiosPromise[SchemaVariant] = js.native
  def get(
    params: ParamsResourceSystemapksVariantsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariant]
  ): Unit = js.native
  /**
    * Returns a previously created system APK variant.
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
    *   const res = await androidpublisher.systemapks.variants.get({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The ID of a previously created system APK variant.
    *     variantId: 'placeholder-value',
    *     // The version code of the App Bundle.
    *     versionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceSpec": {},
    *   //   "variantId": 0
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
  def get(params: ParamsResourceSystemapksVariantsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSystemapksVariantsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSystemApksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSystemApksListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSystemApksListResponse] = js.native
  def list(params: ParamsResourceSystemapksVariantsList): GaxiosPromise[SchemaSystemApksListResponse] = js.native
  def list(
    params: ParamsResourceSystemapksVariantsList,
    callback: BodyResponseCallback[SchemaSystemApksListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSystemapksVariantsList,
    options: BodyResponseCallback[Readable | SchemaSystemApksListResponse],
    callback: BodyResponseCallback[Readable | SchemaSystemApksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSystemapksVariantsList, options: MethodOptions): GaxiosPromise[SchemaSystemApksListResponse] = js.native
  def list(
    params: ParamsResourceSystemapksVariantsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSystemApksListResponse]
  ): Unit = js.native
  /**
    * Returns the list of previously created system APK variants.
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
    *   const res = await androidpublisher.systemapks.variants.list({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The version code of the App Bundle.
    *     versionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "variants": []
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
  def list(params: ParamsResourceSystemapksVariantsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSystemapksVariantsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
