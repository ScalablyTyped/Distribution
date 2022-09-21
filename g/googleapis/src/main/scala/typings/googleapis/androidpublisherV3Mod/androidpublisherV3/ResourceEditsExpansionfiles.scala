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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Expansionfiles")
@js.native
open class ResourceEditsExpansionfiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet, callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def get(
    params: ParamsResourceEditsExpansionfilesGet,
    options: BodyResponseCallback[Readable | SchemaExpansionFile],
    callback: BodyResponseCallback[Readable | SchemaExpansionFile]
  ): Unit = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(
    params: ParamsResourceEditsExpansionfilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  /**
    * Fetches the expansion file configuration for the specified APK.
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
    *   const res = await androidpublisher.edits.expansionfiles.get({
    *     // The version code of the APK whose expansion file configuration is being read or modified.
    *     apkVersionCode: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // The file type of the file configuration which is being read or modified.
    *     expansionFileType: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fileSize": "my_fileSize",
    *   //   "referencesVersion": 0
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
  def get(params: ParamsResourceEditsExpansionfilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsExpansionfilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaExpansionFile] = js.native
  def patch(callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def patch(params: ParamsResourceEditsExpansionfilesPatch): GaxiosPromise[SchemaExpansionFile] = js.native
  def patch(
    params: ParamsResourceEditsExpansionfilesPatch,
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  def patch(
    params: ParamsResourceEditsExpansionfilesPatch,
    options: BodyResponseCallback[Readable | SchemaExpansionFile],
    callback: BodyResponseCallback[Readable | SchemaExpansionFile]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsExpansionfilesPatch, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def patch(
    params: ParamsResourceEditsExpansionfilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  /**
    * Patches the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method.
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
    *   const res = await androidpublisher.edits.expansionfiles.patch({
    *     // The version code of the APK whose expansion file configuration is being read or modified.
    *     apkVersionCode: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // The file type of the expansion file configuration which is being updated.
    *     expansionFileType: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fileSize": "my_fileSize",
    *       //   "referencesVersion": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fileSize": "my_fileSize",
    *   //   "referencesVersion": 0
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
  def patch(params: ParamsResourceEditsExpansionfilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEditsExpansionfilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaExpansionFile] = js.native
  def update(callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def update(params: ParamsResourceEditsExpansionfilesUpdate): GaxiosPromise[SchemaExpansionFile] = js.native
  def update(
    params: ParamsResourceEditsExpansionfilesUpdate,
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  def update(
    params: ParamsResourceEditsExpansionfilesUpdate,
    options: BodyResponseCallback[Readable | SchemaExpansionFile],
    callback: BodyResponseCallback[Readable | SchemaExpansionFile]
  ): Unit = js.native
  def update(params: ParamsResourceEditsExpansionfilesUpdate, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def update(
    params: ParamsResourceEditsExpansionfilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  /**
    * Updates the APK's expansion file configuration to reference another APK's expansion file. To add a new expansion file use the Upload method.
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
    *   const res = await androidpublisher.edits.expansionfiles.update({
    *     // The version code of the APK whose expansion file configuration is being read or modified.
    *     apkVersionCode: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // The file type of the file configuration which is being read or modified.
    *     expansionFileType: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fileSize": "my_fileSize",
    *       //   "referencesVersion": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fileSize": "my_fileSize",
    *   //   "referencesVersion": 0
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
  def update(params: ParamsResourceEditsExpansionfilesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEditsExpansionfilesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaExpansionFilesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaExpansionFilesUploadResponse]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExpansionFilesUploadResponse] = js.native
  def upload(params: ParamsResourceEditsExpansionfilesUpload): GaxiosPromise[SchemaExpansionFilesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsExpansionfilesUpload,
    callback: BodyResponseCallback[SchemaExpansionFilesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceEditsExpansionfilesUpload,
    options: BodyResponseCallback[Readable | SchemaExpansionFilesUploadResponse],
    callback: BodyResponseCallback[Readable | SchemaExpansionFilesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsExpansionfilesUpload, options: MethodOptions): GaxiosPromise[SchemaExpansionFilesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsExpansionfilesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFilesUploadResponse]
  ): Unit = js.native
  /**
    * Uploads a new expansion file and attaches to the specified APK.
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
    *   const res = await androidpublisher.edits.expansionfiles.upload({
    *     // The version code of the APK whose expansion file configuration is being read or modified.
    *     apkVersionCode: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // The file type of the expansion file configuration which is being updated.
    *     expansionFileType: 'placeholder-value',
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
    *   //   "expansionFile": {}
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
  def upload(params: ParamsResourceEditsExpansionfilesUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceEditsExpansionfilesUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
