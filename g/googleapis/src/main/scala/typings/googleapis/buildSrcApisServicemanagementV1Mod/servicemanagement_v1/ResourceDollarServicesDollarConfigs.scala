package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services$Configs")
@js.native
class ResourceDollarServicesDollarConfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicemanagement.services.configs.create
    * @desc Creates a new service configuration (version) for a managed
    * service. This method only stores the service configuration. To roll out
    * the service configuration to backend systems please call
    * CreateServiceRollout.  Only the 100 most recent service configurations
    * and ones referenced by existing rollouts are kept for each service. The
    * rest will be deleted eventually.
    * @alias servicemanagement.services.configs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Service] = js.native
  def create(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarConfigsDollarCreate): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarCreate,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarCreate,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarConfigsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.get
    * @desc Gets a service configuration (version) for a managed service.
    * @alias servicemanagement.services.configs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.configId The id of the service configuration resource.  This field must be specified for the server to return all fields, including `SourceInfo`.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {string=} params.view Specifies which parts of the Service Config should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Service] = js.native
  def get(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarConfigsDollarGet): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarGet,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarGet,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarConfigsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.list
    * @desc Lists the history of the service configuration for a managed
    * service, from the newest to the oldest.
    * @alias servicemanagement.services.configs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    * @param {string=} params.pageToken The token of the page to retrieve.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServiceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServiceConfigsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarConfigsDollarList): GaxiosPromise[Schema$ListServiceConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarList,
    callback: BodyResponseCallback[Schema$ListServiceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarList,
    options: BodyResponseCallback[Schema$ListServiceConfigsResponse],
    callback: BodyResponseCallback[Schema$ListServiceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarConfigsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServiceConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServiceConfigsResponse]
  ): Unit = js.native
  /**
    * servicemanagement.services.configs.submit
    * @desc Creates a new service configuration (version) for a managed service
    * based on user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as
    * the generated service configuration. To rollout the service configuration
    * to other services, please call CreateServiceRollout.  Only the 100 most
    * recent configuration sources and ones referenced by existing service
    * configurtions are kept for each service. The rest will be deleted
    * eventually.  Operation<response: SubmitConfigSourceResponse>
    * @alias servicemanagement.services.configs.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {().SubmitConfigSourceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[Schema$Operation] = js.native
  def submit(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def submit(params: ParamsDollarResourceDollarServicesDollarConfigsDollarSubmit): GaxiosPromise[Schema$Operation] = js.native
  def submit(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarSubmit,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def submit(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarSubmit,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def submit(params: ParamsDollarResourceDollarServicesDollarConfigsDollarSubmit, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def submit(
    params: ParamsDollarResourceDollarServicesDollarConfigsDollarSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

