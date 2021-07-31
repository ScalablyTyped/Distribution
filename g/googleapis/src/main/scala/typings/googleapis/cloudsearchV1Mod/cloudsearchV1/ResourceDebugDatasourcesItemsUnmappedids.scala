package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Datasources$Items$Unmappedids")
@js.native
class ResourceDebugDatasourcesItemsUnmappedids protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudsearch.debug.datasources.items.unmappedids.list
    * @desc List all unmapped identities for a specific item.
    * @alias cloudsearch.debug.datasources.items.unmappedids.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {integer=} params.pageSize Maximum number of items to fetch in a request. Defaults to 100.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The name of the item, in the following format: datasources/{source_id}/items/{ID}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUnmappedIdentitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUnmappedIdentitiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUnmappedIdentitiesResponse] = js.native
  def list(params: ParamsResourceDebugDatasourcesItemsUnmappedidsList): GaxiosPromise[SchemaListUnmappedIdentitiesResponse] = js.native
  def list(
    params: ParamsResourceDebugDatasourcesItemsUnmappedidsList,
    callback: BodyResponseCallback[SchemaListUnmappedIdentitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDebugDatasourcesItemsUnmappedidsList,
    options: BodyResponseCallback[SchemaListUnmappedIdentitiesResponse],
    callback: BodyResponseCallback[SchemaListUnmappedIdentitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDebugDatasourcesItemsUnmappedidsList, options: MethodOptions): GaxiosPromise[SchemaListUnmappedIdentitiesResponse] = js.native
  def list(
    params: ParamsResourceDebugDatasourcesItemsUnmappedidsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUnmappedIdentitiesResponse]
  ): Unit = js.native
}
