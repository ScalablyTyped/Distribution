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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Internalappsharingartifacts")
@js.native
open class ResourceInternalappsharingartifacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def uploadapk(): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadapk(callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]): Unit = js.native
  def uploadapk(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadapk(params: ParamsResourceInternalappsharingartifactsUploadapk): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadapk(
    params: ParamsResourceInternalappsharingartifactsUploadapk,
    callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  def uploadapk(
    params: ParamsResourceInternalappsharingartifactsUploadapk,
    options: BodyResponseCallback[Readable | SchemaInternalAppSharingArtifact],
    callback: BodyResponseCallback[Readable | SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  def uploadapk(params: ParamsResourceInternalappsharingartifactsUploadapk, options: MethodOptions): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadapk(
    params: ParamsResourceInternalappsharingartifactsUploadapk,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  /**
    * Uploads an APK to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
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
    *   const res = await androidpublisher.internalappsharingartifacts.uploadapk({
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
    *   //   "certificateFingerprint": "my_certificateFingerprint",
    *   //   "downloadUrl": "my_downloadUrl",
    *   //   "sha256": "my_sha256"
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
  def uploadapk(params: ParamsResourceInternalappsharingartifactsUploadapk, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def uploadapk(
    params: ParamsResourceInternalappsharingartifactsUploadapk,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def uploadbundle(): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadbundle(callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]): Unit = js.native
  def uploadbundle(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadbundle(params: ParamsResourceInternalappsharingartifactsUploadbundle): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadbundle(
    params: ParamsResourceInternalappsharingartifactsUploadbundle,
    callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  def uploadbundle(
    params: ParamsResourceInternalappsharingartifactsUploadbundle,
    options: BodyResponseCallback[Readable | SchemaInternalAppSharingArtifact],
    callback: BodyResponseCallback[Readable | SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  def uploadbundle(params: ParamsResourceInternalappsharingartifactsUploadbundle, options: MethodOptions): GaxiosPromise[SchemaInternalAppSharingArtifact] = js.native
  def uploadbundle(
    params: ParamsResourceInternalappsharingartifactsUploadbundle,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInternalAppSharingArtifact]
  ): Unit = js.native
  /**
    * Uploads an app bundle to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
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
    *   const res = await androidpublisher.internalappsharingartifacts.uploadbundle({
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
    *   //   "certificateFingerprint": "my_certificateFingerprint",
    *   //   "downloadUrl": "my_downloadUrl",
    *   //   "sha256": "my_sha256"
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
  def uploadbundle(params: ParamsResourceInternalappsharingartifactsUploadbundle, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def uploadbundle(
    params: ParamsResourceInternalappsharingartifactsUploadbundle,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
