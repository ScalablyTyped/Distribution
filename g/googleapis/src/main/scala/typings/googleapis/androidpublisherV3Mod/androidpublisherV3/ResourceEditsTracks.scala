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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Tracks")
@js.native
open class ResourceEditsTracks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTrack] = js.native
  def get(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def get(params: ParamsResourceEditsTracksGet): GaxiosPromise[SchemaTrack] = js.native
  def get(params: ParamsResourceEditsTracksGet, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def get(
    params: ParamsResourceEditsTracksGet,
    options: BodyResponseCallback[Readable | SchemaTrack],
    callback: BodyResponseCallback[Readable | SchemaTrack]
  ): Unit = js.native
  def get(params: ParamsResourceEditsTracksGet, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def get(
    params: ParamsResourceEditsTracksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  /**
    * Gets a track.
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
    *   const res = await androidpublisher.edits.tracks.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Identifier of the track.
    *     track: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "releases": [],
    *   //   "track": "my_track"
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
  def get(params: ParamsResourceEditsTracksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsTracksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTracksListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(params: ParamsResourceEditsTracksList): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(params: ParamsResourceEditsTracksList, callback: BodyResponseCallback[SchemaTracksListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsTracksList,
    options: BodyResponseCallback[Readable | SchemaTracksListResponse],
    callback: BodyResponseCallback[Readable | SchemaTracksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsTracksList, options: MethodOptions): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(
    params: ParamsResourceEditsTracksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTracksListResponse]
  ): Unit = js.native
  /**
    * Lists all tracks.
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
    *   const res = await androidpublisher.edits.tracks.list({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "tracks": []
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
  def list(params: ParamsResourceEditsTracksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEditsTracksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTrack] = js.native
  def patch(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def patch(params: ParamsResourceEditsTracksPatch): GaxiosPromise[SchemaTrack] = js.native
  def patch(params: ParamsResourceEditsTracksPatch, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def patch(
    params: ParamsResourceEditsTracksPatch,
    options: BodyResponseCallback[Readable | SchemaTrack],
    callback: BodyResponseCallback[Readable | SchemaTrack]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsTracksPatch, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def patch(
    params: ParamsResourceEditsTracksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  /**
    * Patches a track.
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
    *   const res = await androidpublisher.edits.tracks.patch({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Identifier of the track.
    *     track: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "releases": [],
    *       //   "track": "my_track"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "releases": [],
    *   //   "track": "my_track"
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
  def patch(params: ParamsResourceEditsTracksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEditsTracksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTrack] = js.native
  def update(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def update(params: ParamsResourceEditsTracksUpdate): GaxiosPromise[SchemaTrack] = js.native
  def update(params: ParamsResourceEditsTracksUpdate, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def update(
    params: ParamsResourceEditsTracksUpdate,
    options: BodyResponseCallback[Readable | SchemaTrack],
    callback: BodyResponseCallback[Readable | SchemaTrack]
  ): Unit = js.native
  def update(params: ParamsResourceEditsTracksUpdate, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def update(
    params: ParamsResourceEditsTracksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  /**
    * Updates a track.
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
    *   const res = await androidpublisher.edits.tracks.update({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Identifier of the track.
    *     track: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "releases": [],
    *       //   "track": "my_track"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "releases": [],
    *   //   "track": "my_track"
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
  def update(params: ParamsResourceEditsTracksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEditsTracksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
