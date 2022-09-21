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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Deobfuscationfiles")
@js.native
open class ResourceEditsDeobfuscationfiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def upload(): GaxiosPromise[SchemaDeobfuscationFilesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaDeobfuscationFilesUploadResponse]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeobfuscationFilesUploadResponse] = js.native
  def upload(params: ParamsResourceEditsDeobfuscationfilesUpload): GaxiosPromise[SchemaDeobfuscationFilesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsDeobfuscationfilesUpload,
    callback: BodyResponseCallback[SchemaDeobfuscationFilesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceEditsDeobfuscationfilesUpload,
    options: BodyResponseCallback[Readable | SchemaDeobfuscationFilesUploadResponse],
    callback: BodyResponseCallback[Readable | SchemaDeobfuscationFilesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsDeobfuscationfilesUpload, options: MethodOptions): GaxiosPromise[SchemaDeobfuscationFilesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsDeobfuscationfilesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeobfuscationFilesUploadResponse]
  ): Unit = js.native
  /**
    * Uploads a new deobfuscation file and attaches to the specified APK.
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
    *   const res = await androidpublisher.edits.deobfuscationfiles.upload({
    *     // The version code of the APK whose Deobfuscation File is being uploaded.
    *     apkVersionCode: 'placeholder-value',
    *     // The type of the deobfuscation file.
    *     deobfuscationFileType: 'placeholder-value',
    *     // Unique identifier for this edit.
    *     editId: 'placeholder-value',
    *     // Unique identifier for the Android app.
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
    *   //   "deobfuscationFile": {}
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
  def upload(params: ParamsResourceEditsDeobfuscationfilesUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceEditsDeobfuscationfilesUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
