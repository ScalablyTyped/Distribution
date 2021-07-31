package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Apks")
@js.native
class ResourceEditsApks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
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
    options: BodyResponseCallback[SchemaApksAddExternallyHostedResponse],
    callback: BodyResponseCallback[SchemaApksAddExternallyHostedResponse]
  ): Unit = js.native
  def addexternallyhosted(params: ParamsResourceEditsApksAddexternallyhosted, options: MethodOptions): GaxiosPromise[SchemaApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(
    params: ParamsResourceEditsApksAddexternallyhosted,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApksAddExternallyHostedResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def list(): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApksListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(params: ParamsResourceEditsApksList): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(params: ParamsResourceEditsApksList, callback: BodyResponseCallback[SchemaApksListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsApksList,
    options: BodyResponseCallback[SchemaApksListResponse],
    callback: BodyResponseCallback[SchemaApksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsApksList, options: MethodOptions): GaxiosPromise[SchemaApksListResponse] = js.native
  def list(
    params: ParamsResourceEditsApksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApksListResponse]
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
  def upload(): GaxiosPromise[SchemaApk] = js.native
  def upload(callback: BodyResponseCallback[SchemaApk]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApk] = js.native
  def upload(params: ParamsResourceEditsApksUpload): GaxiosPromise[SchemaApk] = js.native
  def upload(params: ParamsResourceEditsApksUpload, callback: BodyResponseCallback[SchemaApk]): Unit = js.native
  def upload(
    params: ParamsResourceEditsApksUpload,
    options: BodyResponseCallback[SchemaApk],
    callback: BodyResponseCallback[SchemaApk]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsApksUpload, options: MethodOptions): GaxiosPromise[SchemaApk] = js.native
  def upload(
    params: ParamsResourceEditsApksUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApk]
  ): Unit = js.native
}
