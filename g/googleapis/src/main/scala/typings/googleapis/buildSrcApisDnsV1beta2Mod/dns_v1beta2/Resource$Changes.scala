package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Changes")
@js.native
class Resource$Changes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.changes.create
    * @alias dns.changes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().Change} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Change] = js.native
  def create(callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def create(params: ParamsDollarResourceDollarChangesDollarCreate): GaxiosPromise[Schema$Change] = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    options: BodyResponseCallback[Schema$Change],
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarChangesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Change] = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  /**
    * dns.changes.get
    * @alias dns.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Change] = js.native
  def get(callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet): GaxiosPromise[Schema$Change] = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: BodyResponseCallback[Schema$Change],
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Change] = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  /**
    * dns.changes.list
    * @alias dns.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {string=} params.sortOrder
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ChangesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: BodyResponseCallback[Schema$ChangesListResponse],
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList, options: MethodOptions): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
}

