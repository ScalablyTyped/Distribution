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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Apks")
@js.native
open class ResourceEditsApks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addexternallyhosted(): GaxiosPromise[SchemaApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(callback: BodyResponseCallback[SchemaApksAddExternallyHostedResponse]): Unit = js.native
  def addexternallyhosted(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(params: ParamsResourceEditsApksAddexternallyhosted): GaxiosPromise[SchemaApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(
    params: ParamsResourceEditsApksAddexternallyhosted,
    callback: BodyResponseCallback[SchemaApksAddExternallyHostedResponse]
  ): Unit = js.native
  def addexternallyhosted(
    params: ParamsResourceEditsApksAddexternallyhosted,
    options: BodyResponseCallback[Readable | SchemaApksAddExternallyHostedResponse],
    callback: BodyResponseCallback[Readable | SchemaApksAddExternallyHostedResponse]
  ): Unit = js.native
  def addexternallyhosted(params: ParamsResourceEditsApksAddexternallyhosted, options: MethodOptions): GaxiosPromise[SchemaApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(
    params: ParamsResourceEditsApksAddexternallyhosted,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApksAddExternallyHostedResponse]
  ): Unit = js.native
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to organizations using Managed Play whose application is configured to restrict distribution to the organizations.
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
    *   const res = await androidpublisher.edits.apks.addexternallyhosted({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externallyHostedApk": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "externallyHostedApk": {}
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
  def addexternallyhosted(params: ParamsResourceEditsApksAddexternallyhosted, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addexternallyhosted(
    params: ParamsResourceEditsApksAddexternallyhosted,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApksListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(params: ParamsResourceEditsApksList): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(params: ParamsResourceEditsApksList, callback: BodyResponseCallback[SchemaApksListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsApksList,
    options: BodyResponseCallback[Readable | SchemaApksListResponse],
    callback: BodyResponseCallback[Readable | SchemaApksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsApksList, options: MethodOptions): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(
    params: ParamsResourceEditsApksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApksListResponse]
  ): Unit = js.native
  /**
    * Lists all current APKs of the app and edit.
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
    *   const res = await androidpublisher.edits.apks.list({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apks": [],
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
  def list(params: ParamsResourceEditsApksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEditsApksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaApk] = js.native
  def upload(callback: BodyResponseCallback[SchemaApk]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApk] = js.native
  def upload(params: ParamsResourceEditsApksUpload): GaxiosPromise[SchemaApk] = js.native
  def upload(params: ParamsResourceEditsApksUpload, callback: BodyResponseCallback[SchemaApk]): Unit = js.native
  def upload(
    params: ParamsResourceEditsApksUpload,
    options: BodyResponseCallback[Readable | SchemaApk],
    callback: BodyResponseCallback[Readable | SchemaApk]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsApksUpload, options: MethodOptions): GaxiosPromise[SchemaApk] = js.native
  def upload(
    params: ParamsResourceEditsApksUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApk]
  ): Unit = js.native
  /**
    * Uploads an APK and adds to the current edit.
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
    *   const res = await androidpublisher.edits.apks.upload({
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
    *   //   "binary": {},
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
  def upload(params: ParamsResourceEditsApksUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceEditsApksUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
