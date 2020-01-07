package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Apks")
@js.native
class ResourceDollarEditsDollarApks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.apks.addexternallyhosted
    * @desc Creates a new APK without uploading the APK itself to Google Play,
    * instead hosting the APK at a specified URL. This function is only
    * available to enterprises using Google Play for Work whose application is
    * configured to restrict distribution to the enterprise domain.
    * @alias androidpublisher.edits.apks.addexternallyhosted
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ApksAddExternallyHostedRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addexternallyhosted(): GaxiosPromise[Schema$ApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(callback: BodyResponseCallback[Schema$ApksAddExternallyHostedResponse]): Unit = js.native
  def addexternallyhosted(params: ParamsDollarResourceDollarEditsDollarApksDollarAddexternallyhosted): GaxiosPromise[Schema$ApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(
    params: ParamsDollarResourceDollarEditsDollarApksDollarAddexternallyhosted,
    callback: BodyResponseCallback[Schema$ApksAddExternallyHostedResponse]
  ): Unit = js.native
  def addexternallyhosted(
    params: ParamsDollarResourceDollarEditsDollarApksDollarAddexternallyhosted,
    options: BodyResponseCallback[Schema$ApksAddExternallyHostedResponse],
    callback: BodyResponseCallback[Schema$ApksAddExternallyHostedResponse]
  ): Unit = js.native
  def addexternallyhosted(params: ParamsDollarResourceDollarEditsDollarApksDollarAddexternallyhosted, options: MethodOptions): GaxiosPromise[Schema$ApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(
    params: ParamsDollarResourceDollarEditsDollarApksDollarAddexternallyhosted,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApksAddExternallyHostedResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apks.list
    * @alias androidpublisher.edits.apks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ApksListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ApksListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarApksDollarList): GaxiosPromise[Schema$ApksListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApksDollarList,
    callback: BodyResponseCallback[Schema$ApksListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApksDollarList,
    options: BodyResponseCallback[Schema$ApksListResponse],
    callback: BodyResponseCallback[Schema$ApksListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarApksDollarList, options: MethodOptions): GaxiosPromise[Schema$ApksListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApksListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apks.upload
    * @alias androidpublisher.edits.apks.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$Apk] = js.native
  def upload(callback: BodyResponseCallback[Schema$Apk]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarApksDollarUpload): GaxiosPromise[Schema$Apk] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarApksDollarUpload,
    callback: BodyResponseCallback[Schema$Apk]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarApksDollarUpload,
    options: BodyResponseCallback[Schema$Apk],
    callback: BodyResponseCallback[Schema$Apk]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarApksDollarUpload, options: MethodOptions): GaxiosPromise[Schema$Apk] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarApksDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Apk]
  ): Unit = js.native
}

