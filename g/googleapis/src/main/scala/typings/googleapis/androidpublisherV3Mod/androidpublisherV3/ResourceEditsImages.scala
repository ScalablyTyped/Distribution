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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Images")
@js.native
open class ResourceEditsImages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsImagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsImagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsImagesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsImagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEditsImagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the image (specified by id) from the edit.
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
    *   const res = await androidpublisher.edits.images.delete({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Unique identifier an image within the set of images attached to this edit.
    *     imageId: 'placeholder-value',
    *     // Type of the Image.
    *     imageType: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
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
  def delete(params: ParamsResourceEditsImagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEditsImagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteall(): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]): Unit = js.native
  def deleteall(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(params: ParamsResourceEditsImagesDeleteall): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    options: BodyResponseCallback[Readable | SchemaImagesDeleteAllResponse],
    callback: BodyResponseCallback[Readable | SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(params: ParamsResourceEditsImagesDeleteall, options: MethodOptions): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  /**
    * Deletes all images for the specified language and image type. Returns an empty response if no images are found.
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
    *   const res = await androidpublisher.edits.images.deleteall({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Type of the Image. Providing an image type that refers to no images is a no-op.
    *     imageType: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). Providing a language that is not supported by the App is a no-op.
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": []
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
  def deleteall(params: ParamsResourceEditsImagesDeleteall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaImagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(params: ParamsResourceEditsImagesList): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(params: ParamsResourceEditsImagesList, callback: BodyResponseCallback[SchemaImagesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsImagesList,
    options: BodyResponseCallback[Readable | SchemaImagesListResponse],
    callback: BodyResponseCallback[Readable | SchemaImagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsImagesList, options: MethodOptions): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(
    params: ParamsResourceEditsImagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesListResponse]
  ): Unit = js.native
  /**
    * Lists all images. The response may be empty.
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
    *   const res = await androidpublisher.edits.images.list({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Type of the Image. Providing an image type that refers to no images will return an empty response.
    *     imageType: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). There must be a store listing for the specified language.
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "images": []
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
  def list(params: ParamsResourceEditsImagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEditsImagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaImagesUploadResponse]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(params: ParamsResourceEditsImagesUpload): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    callback: BodyResponseCallback[SchemaImagesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    options: BodyResponseCallback[Readable | SchemaImagesUploadResponse],
    callback: BodyResponseCallback[Readable | SchemaImagesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsImagesUpload, options: MethodOptions): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesUploadResponse]
  ): Unit = js.native
  /**
    * Uploads an image of the specified language and image type, and adds to the edit.
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
    *   const res = await androidpublisher.edits.images.upload({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Type of the Image.
    *     imageType: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). Providing a language that is not supported by the App is a no-op.
    *     language: 'placeholder-value',
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
    *   //   "image": {}
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
  def upload(params: ParamsResourceEditsImagesUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
