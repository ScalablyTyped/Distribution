package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Expansionfiles")
@js.native
class ResourceEditsExpansionfiles protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet, callback: BodyResponseCallback[SchemaExpansionFile]): Unit = js.native
  def get(
    params: ParamsResourceEditsExpansionfilesGet,
    options: BodyResponseCallback[SchemaExpansionFile],
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  def get(params: ParamsResourceEditsExpansionfilesGet, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def get(
    params: ParamsResourceEditsExpansionfilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
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
    options: BodyResponseCallback[SchemaExpansionFile],
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsExpansionfilesPatch, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def patch(
    params: ParamsResourceEditsExpansionfilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
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
    options: BodyResponseCallback[SchemaExpansionFile],
    callback: BodyResponseCallback[SchemaExpansionFile]
  ): Unit = js.native
  def update(params: ParamsResourceEditsExpansionfilesUpdate, options: MethodOptions): GaxiosPromise[SchemaExpansionFile] = js.native
  def update(
    params: ParamsResourceEditsExpansionfilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFile]
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
    options: BodyResponseCallback[SchemaExpansionFilesUploadResponse],
    callback: BodyResponseCallback[SchemaExpansionFilesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsExpansionfilesUpload, options: MethodOptions): GaxiosPromise[SchemaExpansionFilesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsExpansionfilesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExpansionFilesUploadResponse]
  ): Unit = js.native
}
