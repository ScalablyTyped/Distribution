package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Expansionfiles")
@js.native
class ResourceDollarEditsDollarExpansionfiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.expansionfiles.get
    * @desc Fetches the Expansion File configuration for the APK specified.
    * @alias androidpublisher.edits.expansionfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The version code of the APK whose Expansion File configuration is being read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.expansionFileType
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ExpansionFile] = js.native
  def get(callback: BodyResponseCallback[Schema$ExpansionFile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarGet): GaxiosPromise[Schema$ExpansionFile] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarGet,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarGet,
    options: BodyResponseCallback[Schema$ExpansionFile],
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ExpansionFile] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  /**
    * androidpublisher.edits.expansionfiles.patch
    * @desc Updates the APK's Expansion File configuration to reference another
    * APK's Expansion Files. To add a new Expansion File use the Upload method.
    * This method supports patch semantics.
    * @alias androidpublisher.edits.expansionfiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The version code of the APK whose Expansion File configuration is being read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.expansionFileType
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ExpansionFile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ExpansionFile] = js.native
  def patch(callback: BodyResponseCallback[Schema$ExpansionFile]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarPatch): GaxiosPromise[Schema$ExpansionFile] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarPatch,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarPatch,
    options: BodyResponseCallback[Schema$ExpansionFile],
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ExpansionFile] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  /**
    * androidpublisher.edits.expansionfiles.update
    * @desc Updates the APK's Expansion File configuration to reference another
    * APK's Expansion Files. To add a new Expansion File use the Upload method.
    * @alias androidpublisher.edits.expansionfiles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The version code of the APK whose Expansion File configuration is being read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.expansionFileType
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ExpansionFile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ExpansionFile] = js.native
  def update(callback: BodyResponseCallback[Schema$ExpansionFile]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpdate): GaxiosPromise[Schema$ExpansionFile] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpdate,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpdate,
    options: BodyResponseCallback[Schema$ExpansionFile],
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ExpansionFile] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExpansionFile]
  ): Unit = js.native
  /**
    * androidpublisher.edits.expansionfiles.upload
    * @desc Uploads and attaches a new Expansion File to the APK specified.
    * @alias androidpublisher.edits.expansionfiles.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The version code of the APK whose Expansion File configuration is being read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.expansionFileType
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$ExpansionFilesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[Schema$ExpansionFilesUploadResponse]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpload): GaxiosPromise[Schema$ExpansionFilesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpload,
    callback: BodyResponseCallback[Schema$ExpansionFilesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpload,
    options: BodyResponseCallback[Schema$ExpansionFilesUploadResponse],
    callback: BodyResponseCallback[Schema$ExpansionFilesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpload, options: MethodOptions): GaxiosPromise[Schema$ExpansionFilesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarExpansionfilesDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExpansionFilesUploadResponse]
  ): Unit = js.native
}

