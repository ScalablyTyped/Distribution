package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Identitysources$Unmappedids")
@js.native
class ResourceDollarDebugDollarIdentitysourcesDollarUnmappedids protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudsearch.debug.identitysources.unmappedids.list
    * @desc Lists unmapped user identities for an identity source.
    * @alias cloudsearch.debug.identitysources.unmappedids.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {integer=} params.pageSize Maximum number of items to fetch in a request. Defaults to 100.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The name of the identity source, in the following format: identitysources/{source_id}
    * @param {string=} params.resolutionStatusCode Limit users selection to this status.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListUnmappedIdentitiesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListUnmappedIdentitiesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarUnmappedidsDollarList): GaxiosPromise[Schema$ListUnmappedIdentitiesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarUnmappedidsDollarList,
    callback: BodyResponseCallback[Schema$ListUnmappedIdentitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarUnmappedidsDollarList,
    options: BodyResponseCallback[Schema$ListUnmappedIdentitiesResponse],
    callback: BodyResponseCallback[Schema$ListUnmappedIdentitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarUnmappedidsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListUnmappedIdentitiesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarUnmappedidsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListUnmappedIdentitiesResponse]
  ): Unit = js.native
}

