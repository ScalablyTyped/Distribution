package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services$Rollouts")
@js.native
class ResourceDollarServicesDollarRollouts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicemanagement.services.rollouts.create
    * @desc Creates a new service configuration rollout. Based on rollout, the
    * Google Service Management will roll out the service configurations to
    * different backend services. For example, the logging configuration will
    * be pushed to Google Cloud Logging.  Please note that any previous pending
    * and running Rollouts and associated Operations will be automatically
    * cancelled so that the latest Rollout will not be blocked by previous
    * Rollouts.  Only the 100 most recent (in any state) and the last 10
    * successful (if not already part of the set of 100 most recent) rollouts
    * are kept for each service. The rest will be deleted eventually.
    * Operation<response: Rollout>
    * @alias servicemanagement.services.rollouts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {().Rollout} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * servicemanagement.services.rollouts.get
    * @desc Gets a service configuration rollout.
    * @alias servicemanagement.services.rollouts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.rolloutId The id of the rollout resource.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Rollout] = js.native
  def get(callback: BodyResponseCallback[Schema$Rollout]): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarGet): GaxiosPromise[Schema$Rollout] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarGet,
    callback: BodyResponseCallback[Schema$Rollout]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarGet,
    options: BodyResponseCallback[Schema$Rollout],
    callback: BodyResponseCallback[Schema$Rollout]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Rollout] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Rollout]
  ): Unit = js.native
  /**
    * servicemanagement.services.rollouts.list
    * @desc Lists the history of the service configuration rollouts for a
    * managed service, from the newest to the oldest.
    * @alias servicemanagement.services.rollouts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Use `filter` to return subset of rollouts. The following filters are supported:   -- To limit the results to only those in      [status](google.api.servicemanagement.v1.RolloutStatus) 'SUCCESS',      use filter='status=SUCCESS'   -- To limit the results to those in      [status](google.api.servicemanagement.v1.RolloutStatus) 'CANCELLED'      or 'FAILED', use filter='status=CANCELLED OR status=FAILED'
    * @param {integer=} params.pageSize The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    * @param {string=} params.pageToken The token of the page to retrieve.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServiceRolloutsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServiceRolloutsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarList): GaxiosPromise[Schema$ListServiceRolloutsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarList,
    callback: BodyResponseCallback[Schema$ListServiceRolloutsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarList,
    options: BodyResponseCallback[Schema$ListServiceRolloutsResponse],
    callback: BodyResponseCallback[Schema$ListServiceRolloutsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarRolloutsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServiceRolloutsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarRolloutsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServiceRolloutsResponse]
  ): Unit = js.native
}

