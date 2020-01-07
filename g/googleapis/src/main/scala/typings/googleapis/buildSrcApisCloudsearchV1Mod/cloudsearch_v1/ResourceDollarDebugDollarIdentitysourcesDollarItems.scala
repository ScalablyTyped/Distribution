package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Identitysources$Items")
@js.native
class ResourceDollarDebugDollarIdentitysourcesDollarItems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudsearch.debug.identitysources.items.listForunmappedidentity
    * @desc Lists names of items associated with an unmapped identity.
    * @alias cloudsearch.debug.identitysources.items.listForunmappedidentity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string=} params.groupResourceName
    * @param {integer=} params.pageSize Maximum number of items to fetch in a request. Defaults to 100.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The name of the identity source, in the following format: identitysources/{source_id}}
    * @param {string=} params.userResourceName
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listForunmappedidentity(): GaxiosPromise[Schema$ListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(callback: BodyResponseCallback[Schema$ListItemNamesForUnmappedIdentityResponse]): Unit = js.native
  def listForunmappedidentity(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarItemsDollarListforunmappedidentity
  ): GaxiosPromise[Schema$ListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarItemsDollarListforunmappedidentity,
    callback: BodyResponseCallback[Schema$ListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
  def listForunmappedidentity(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarItemsDollarListforunmappedidentity,
    options: BodyResponseCallback[Schema$ListItemNamesForUnmappedIdentityResponse],
    callback: BodyResponseCallback[Schema$ListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
  def listForunmappedidentity(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarItemsDollarListforunmappedidentity,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(
    params: ParamsDollarResourceDollarDebugDollarIdentitysourcesDollarItemsDollarListforunmappedidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
}

