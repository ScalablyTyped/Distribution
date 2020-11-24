package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Datasources$Items")
@js.native
class ResourceDebugDatasourcesItems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
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
  def checkAccess(): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(callback: BodyResponseCallback[SchemaCheckAccessResponse]): Unit = js.native
  def checkAccess(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(params: ParamsResourceDebugDatasourcesItemsCheckaccess): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    callback: BodyResponseCallback[SchemaCheckAccessResponse]
  ): Unit = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    options: BodyResponseCallback[SchemaCheckAccessResponse],
    callback: BodyResponseCallback[SchemaCheckAccessResponse]
  ): Unit = js.native
  def checkAccess(params: ParamsResourceDebugDatasourcesItemsCheckaccess, options: MethodOptions): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckAccessResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def searchByViewUrl(): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]): Unit = js.native
  def searchByViewUrl(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    options: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse],
    callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl, options: MethodOptions): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  
  var unmappedids: ResourceDebugDatasourcesItemsUnmappedids = js.native
}
