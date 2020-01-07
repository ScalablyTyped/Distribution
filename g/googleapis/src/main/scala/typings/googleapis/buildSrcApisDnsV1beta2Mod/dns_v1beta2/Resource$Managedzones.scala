package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Managedzones")
@js.native
class Resource$Managedzones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.managedZones.create
    * @alias dns.managedZones.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ManagedZone] = js.native
  def create(callback: BodyResponseCallback[Schema$ManagedZone]): Unit = js.native
  def create(params: ParamsDollarResourceDollarManagedzonesDollarCreate): GaxiosPromise[Schema$ManagedZone] = js.native
  def create(
    params: ParamsDollarResourceDollarManagedzonesDollarCreate,
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarManagedzonesDollarCreate,
    options: BodyResponseCallback[Schema$ManagedZone],
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarManagedzonesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$ManagedZone] = js.native
  def create(
    params: ParamsDollarResourceDollarManagedzonesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  /**
    * dns.managedZones.delete
    * @alias dns.managedZones.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagedzonesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarManagedzonesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedzonesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagedzonesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedzonesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dns.managedZones.get
    * @alias dns.managedZones.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ManagedZone] = js.native
  def get(callback: BodyResponseCallback[Schema$ManagedZone]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzonesDollarGet): GaxiosPromise[Schema$ManagedZone] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzonesDollarGet,
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzonesDollarGet,
    options: BodyResponseCallback[Schema$ManagedZone],
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzonesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ManagedZone] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzonesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedZone]
  ): Unit = js.native
  /**
    * dns.managedZones.list
    * @alias dns.managedZones.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dnsName
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ManagedZonesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedZonesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzonesDollarList): GaxiosPromise[Schema$ManagedZonesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzonesDollarList,
    callback: BodyResponseCallback[Schema$ManagedZonesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzonesDollarList,
    options: BodyResponseCallback[Schema$ManagedZonesListResponse],
    callback: BodyResponseCallback[Schema$ManagedZonesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzonesDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedZonesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzonesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedZonesListResponse]
  ): Unit = js.native
  /**
    * dns.managedZones.patch
    * @alias dns.managedZones.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagedzonesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedzonesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedzonesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagedzonesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedzonesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dns.managedZones.update
    * @alias dns.managedZones.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagedzonesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedzonesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagedzonesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagedzonesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedzonesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

