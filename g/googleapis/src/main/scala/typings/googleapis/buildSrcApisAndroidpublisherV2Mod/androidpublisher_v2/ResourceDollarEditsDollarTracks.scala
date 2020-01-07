package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Tracks")
@js.native
class ResourceDollarEditsDollarTracks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.tracks.get
    * @desc Fetches the track configuration for the specified track type.
    * Includes the APK version codes that are in this track.
    * @alias androidpublisher.edits.tracks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Track] = js.native
  def get(callback: BodyResponseCallback[Schema$Track]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarTracksDollarGet): GaxiosPromise[Schema$Track] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarGet,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarGet,
    options: BodyResponseCallback[Schema$Track],
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarTracksDollarGet, options: MethodOptions): GaxiosPromise[Schema$Track] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  /**
    * androidpublisher.edits.tracks.list
    * @desc Lists all the track configurations for this edit.
    * @alias androidpublisher.edits.tracks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TracksListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$TracksListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarTracksDollarList): GaxiosPromise[Schema$TracksListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarList,
    callback: BodyResponseCallback[Schema$TracksListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarList,
    options: BodyResponseCallback[Schema$TracksListResponse],
    callback: BodyResponseCallback[Schema$TracksListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarTracksDollarList, options: MethodOptions): GaxiosPromise[Schema$TracksListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TracksListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.tracks.patch
    * @desc Updates the track configuration for the specified track type. When
    * halted, the rollout track cannot be updated without adding new APKs, and
    * adding new APKs will cause it to resume. This method supports patch
    * semantics.
    * @alias androidpublisher.edits.tracks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {().Track} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Track] = js.native
  def patch(callback: BodyResponseCallback[Schema$Track]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarTracksDollarPatch): GaxiosPromise[Schema$Track] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarPatch,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarPatch,
    options: BodyResponseCallback[Schema$Track],
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarTracksDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Track] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  /**
    * androidpublisher.edits.tracks.update
    * @desc Updates the track configuration for the specified track type. When
    * halted, the rollout track cannot be updated without adding new APKs, and
    * adding new APKs will cause it to resume.
    * @alias androidpublisher.edits.tracks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {().Track} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Track] = js.native
  def update(callback: BodyResponseCallback[Schema$Track]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarTracksDollarUpdate): GaxiosPromise[Schema$Track] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarUpdate,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarUpdate,
    options: BodyResponseCallback[Schema$Track],
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarTracksDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Track] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTracksDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Track]
  ): Unit = js.native
}

