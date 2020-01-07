package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Lineitems")
@js.native
class Resource$Lineitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.lineitems.downloadlineitems
    * @desc Retrieves line items in CSV format. TrueView line items are not
    * supported.
    * @alias doubleclickbidmanager.lineitems.downloadlineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DownloadLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def downloadlineitems(): GaxiosPromise[Schema$DownloadLineItemsResponse] = js.native
  def downloadlineitems(callback: BodyResponseCallback[Schema$DownloadLineItemsResponse]): Unit = js.native
  def downloadlineitems(params: ParamsDollarResourceDollarLineitemsDollarDownloadlineitems): GaxiosPromise[Schema$DownloadLineItemsResponse] = js.native
  def downloadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarDownloadlineitems,
    callback: BodyResponseCallback[Schema$DownloadLineItemsResponse]
  ): Unit = js.native
  def downloadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarDownloadlineitems,
    options: BodyResponseCallback[Schema$DownloadLineItemsResponse],
    callback: BodyResponseCallback[Schema$DownloadLineItemsResponse]
  ): Unit = js.native
  def downloadlineitems(params: ParamsDollarResourceDollarLineitemsDollarDownloadlineitems, options: MethodOptions): GaxiosPromise[Schema$DownloadLineItemsResponse] = js.native
  def downloadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarDownloadlineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DownloadLineItemsResponse]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.lineitems.uploadlineitems
    * @desc Uploads line items in CSV format. TrueView line items are not
    * supported.
    * @alias doubleclickbidmanager.lineitems.uploadlineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UploadLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadlineitems(): GaxiosPromise[Schema$UploadLineItemsResponse] = js.native
  def uploadlineitems(callback: BodyResponseCallback[Schema$UploadLineItemsResponse]): Unit = js.native
  def uploadlineitems(params: ParamsDollarResourceDollarLineitemsDollarUploadlineitems): GaxiosPromise[Schema$UploadLineItemsResponse] = js.native
  def uploadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarUploadlineitems,
    callback: BodyResponseCallback[Schema$UploadLineItemsResponse]
  ): Unit = js.native
  def uploadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarUploadlineitems,
    options: BodyResponseCallback[Schema$UploadLineItemsResponse],
    callback: BodyResponseCallback[Schema$UploadLineItemsResponse]
  ): Unit = js.native
  def uploadlineitems(params: ParamsDollarResourceDollarLineitemsDollarUploadlineitems, options: MethodOptions): GaxiosPromise[Schema$UploadLineItemsResponse] = js.native
  def uploadlineitems(
    params: ParamsDollarResourceDollarLineitemsDollarUploadlineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UploadLineItemsResponse]
  ): Unit = js.native
}

