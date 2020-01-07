package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Service_instances")
@js.native
class ResourceDollarProjectsDollarBrokersDollarV2DollarService_instances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var service_bindings: ResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindings = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.create
    * @desc Provisions a service instance. If `request.accepts_incomplete` is
    * false and Broker cannot execute request synchronously HTTP 422 error will
    * be returned along with FAILED_PRECONDITION status. If
    * `request.accepts_incomplete` is true and the Broker decides to execute
    * resource asynchronously then HTTP 202 response code will be returned and
    * a valid polling operation in the response will be included. If Broker
    * executes the request synchronously and it succeeds HTTP 201 response will
    * be furnished. If identical instance exists, then HTTP 200 response will
    * be returned. If an instance with identical ID but mismatching parameters
    * exists, then HTTP 409 status code will be returned.
    * @alias servicebroker.projects.brokers.v2.service_instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete Value indicating that API client supports asynchronous operations. If Broker cannot execute the request synchronously HTTP 422 code will be returned to HTTP clients along with FAILED_PRECONDITION error. If true and broker will execute request asynchronously 202 HTTP code will be returned. This broker always requires this to be true as all mutator operations are asynchronous.
    * @param {string} params.instance_id The id of the service instance. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {().GoogleCloudServicebrokerV1beta1__ServiceInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse] = js.native
  def create(
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarCreate): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.delete
    * @desc Deprovisions a service instance. For synchronous/asynchronous
    * request details see CreateServiceInstance method. If service instance
    * does not exist HTTP 410 status will be returned.
    * @alias servicebroker.projects.brokers.v2.service_instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` + `v2/service_instances/[INSTANCE_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {string=} params.planId The plan id of the service instance.
    * @param {string=} params.serviceId The service id of the service instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse] = js.native
  def delete(
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarDelete): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteServiceInstanceResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.get
    * @desc Gets the given service instance from the system. The API call
    * accepts both OSB style API and standard google style API resource path.
    * i.e. both `projects/x/brokers/x/instances/x`  and
    * `projects/x/brokers/x/v2/service_instances/x` are acceptable paths.
    * @alias servicebroker.projects.brokers.v2.service_instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the instance to return. Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` + `v2/service_instances/[INSTANCE_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGet): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.getLast_operation
    * @desc Returns the state of the last operation for the service instance.
    * Only last (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/`+    `service_instances/[INSTANCE_ID]`.
    * @param {string=} params.operation If `operation` was returned during mutation operation, this field must be populated with the provided value.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLast_operation(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGetlast_operation
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGetlast_operation,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGetlast_operation,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGetlast_operation,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarGetlast_operation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.patch
    * @desc Updates an existing service instance. See CreateServiceInstance for
    * possible response codes.
    * @alias servicebroker.projects.brokers.v2.service_instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]`.
    * @param {().GoogleCloudServicebrokerV1beta1__ServiceInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse] = js.native
  def patch(
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarPatch): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__UpdateServiceInstanceResponse]
  ): Unit = js.native
}

