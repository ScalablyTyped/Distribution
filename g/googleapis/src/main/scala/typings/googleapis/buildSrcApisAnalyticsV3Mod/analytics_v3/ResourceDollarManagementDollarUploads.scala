package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Uploads")
@js.native
class ResourceDollarManagementDollarUploads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.uploads.deleteUploadData
    * @desc Delete data associated with a previous upload.
    * @alias analytics.management.uploads.deleteUploadData
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the uploads to be deleted.
    * @param {string} params.customDataSourceId Custom data source Id for the uploads to be deleted.
    * @param {string} params.webPropertyId Web property Id for the uploads to be deleted.
    * @param {().AnalyticsDataimportDeleteUploadDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteUploadData(): GaxiosPromise[Unit] = js.native
  def deleteUploadData(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteUploadData(params: ParamsDollarResourceDollarManagementDollarUploadsDollarDeleteuploaddata): GaxiosPromise[Unit] = js.native
  def deleteUploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarDeleteuploaddata,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteUploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarDeleteuploaddata,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteUploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarDeleteuploaddata,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def deleteUploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarDeleteuploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.uploads.get
    * @desc List uploads to which the user has access.
    * @alias analytics.management.uploads.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the upload to retrieve.
    * @param {string} params.customDataSourceId Custom data source Id for upload to retrieve.
    * @param {string} params.uploadId Upload Id to retrieve.
    * @param {string} params.webPropertyId Web property Id for the upload to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Upload] = js.native
  def get(callback: BodyResponseCallback[Schema$Upload]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarUploadsDollarGet): GaxiosPromise[Schema$Upload] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarGet,
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarGet,
    options: BodyResponseCallback[Schema$Upload],
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarUploadsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Upload] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
  /**
    * analytics.management.uploads.list
    * @desc List uploads to which the user has access.
    * @alias analytics.management.uploads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the uploads to retrieve.
    * @param {string} params.customDataSourceId Custom data source Id for uploads to retrieve.
    * @param {integer=} params.max-results The maximum number of uploads to include in this response.
    * @param {integer=} params.start-index A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property Id for the uploads to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Uploads] = js.native
  def list(callback: BodyResponseCallback[Schema$Uploads]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarUploadsDollarList): GaxiosPromise[Schema$Uploads] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarList,
    callback: BodyResponseCallback[Schema$Uploads]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarList,
    options: BodyResponseCallback[Schema$Uploads],
    callback: BodyResponseCallback[Schema$Uploads]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarUploadsDollarList, options: MethodOptions): GaxiosPromise[Schema$Uploads] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Uploads]
  ): Unit = js.native
  /**
    * analytics.management.uploads.uploadData
    * @desc Upload data for a custom data source.
    * @alias analytics.management.uploads.uploadData
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id associated with the upload.
    * @param {string} params.customDataSourceId Custom data source Id to which the data being uploaded belongs.
    * @param {string} params.webPropertyId Web property UA-string associated with the upload.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadData(): GaxiosPromise[Schema$Upload] = js.native
  def uploadData(callback: BodyResponseCallback[Schema$Upload]): Unit = js.native
  def uploadData(params: ParamsDollarResourceDollarManagementDollarUploadsDollarUploaddata): GaxiosPromise[Schema$Upload] = js.native
  def uploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarUploaddata,
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
  def uploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarUploaddata,
    options: BodyResponseCallback[Schema$Upload],
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
  def uploadData(params: ParamsDollarResourceDollarManagementDollarUploadsDollarUploaddata, options: MethodOptions): GaxiosPromise[Schema$Upload] = js.native
  def uploadData(
    params: ParamsDollarResourceDollarManagementDollarUploadsDollarUploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Upload]
  ): Unit = js.native
}

