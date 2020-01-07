package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Deobfuscationfiles")
@js.native
class ResourceDollarEditsDollarDeobfuscationfiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.deobfuscationfiles.upload
    * @desc Uploads the deobfuscation file of the specified APK. If a
    * deobfuscation file already exists, it will be replaced.
    * @alias androidpublisher.edits.deobfuscationfiles.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The version code of the APK whose deobfuscation file is being uploaded.
    * @param {string} params.deobfuscationFileType
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier of the Android app for which the deobfuscatiuon files are being uploaded; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$DeobfuscationFilesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[Schema$DeobfuscationFilesUploadResponse]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarDeobfuscationfilesDollarUpload): GaxiosPromise[Schema$DeobfuscationFilesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarDeobfuscationfilesDollarUpload,
    callback: BodyResponseCallback[Schema$DeobfuscationFilesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarDeobfuscationfilesDollarUpload,
    options: BodyResponseCallback[Schema$DeobfuscationFilesUploadResponse],
    callback: BodyResponseCallback[Schema$DeobfuscationFilesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarDeobfuscationfilesDollarUpload,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeobfuscationFilesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarDeobfuscationfilesDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeobfuscationFilesUploadResponse]
  ): Unit = js.native
}

