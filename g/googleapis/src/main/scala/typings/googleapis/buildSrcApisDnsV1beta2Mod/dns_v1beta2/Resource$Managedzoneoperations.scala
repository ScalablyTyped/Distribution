package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Managedzoneoperations")
@js.native
class Resource$Managedzoneoperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.managedZoneOperations.get
    * @alias dns.managedZoneOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.operation
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dns.managedZoneOperations.list
    * @alias dns.managedZoneOperations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzoneoperationsDollarList): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    options: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse],
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzoneoperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
}

