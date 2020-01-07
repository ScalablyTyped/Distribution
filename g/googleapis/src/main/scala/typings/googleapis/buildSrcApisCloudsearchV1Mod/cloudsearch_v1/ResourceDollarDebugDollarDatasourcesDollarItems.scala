package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Datasources$Items")
@js.native
class ResourceDollarDebugDollarDatasourcesDollarItems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var unmappedids: ResourceDollarDebugDollarDatasourcesDollarItemsDollarUnmappedids = js.native
  /**
    * cloudsearch.debug.datasources.items.checkAccess
    * @desc Checks whether an item is accessible by specified principal.
    * @alias cloudsearch.debug.datasources.items.checkAccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Item name, format: datasources/{source_id}/items/{item_id}
    * @param {().Principal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkAccess(): GaxiosPromise[Schema$CheckAccessResponse] = js.native
  def checkAccess(callback: BodyResponseCallback[Schema$CheckAccessResponse]): Unit = js.native
  def checkAccess(params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarCheckaccess): GaxiosPromise[Schema$CheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarCheckaccess,
    callback: BodyResponseCallback[Schema$CheckAccessResponse]
  ): Unit = js.native
  def checkAccess(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarCheckaccess,
    options: BodyResponseCallback[Schema$CheckAccessResponse],
    callback: BodyResponseCallback[Schema$CheckAccessResponse]
  ): Unit = js.native
  def checkAccess(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarCheckaccess,
    options: MethodOptions
  ): GaxiosPromise[Schema$CheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarCheckaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CheckAccessResponse]
  ): Unit = js.native
  /**
    * cloudsearch.debug.datasources.items.searchByViewUrl
    * @desc Fetches the item whose viewUrl exactly matches that of the URL
    * provided in the request.
    * @alias cloudsearch.debug.datasources.items.searchByViewUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Source name, format: datasources/{source_id}
    * @param {().SearchItemsByViewUrlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchByViewUrl(): GaxiosPromise[Schema$SearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(callback: BodyResponseCallback[Schema$SearchItemsByViewUrlResponse]): Unit = js.native
  def searchByViewUrl(params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarSearchbyviewurl): GaxiosPromise[Schema$SearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarSearchbyviewurl,
    callback: BodyResponseCallback[Schema$SearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarSearchbyviewurl,
    options: BodyResponseCallback[Schema$SearchItemsByViewUrlResponse],
    callback: BodyResponseCallback[Schema$SearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarSearchbyviewurl,
    options: MethodOptions
  ): GaxiosPromise[Schema$SearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsDollarResourceDollarDebugDollarDatasourcesDollarItemsDollarSearchbyviewurl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchItemsByViewUrlResponse]
  ): Unit = js.native
}

