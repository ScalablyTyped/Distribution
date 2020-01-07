package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Service_instances$Service_bindings")
@js.native
class ResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @desc CreateBinding generates a service binding to an existing service
    * instance. See ProviServiceInstance for async operation details.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.binding_id The id of the binding. Must be unique within GCP project. Maximum length is 64, GUID recommended. Required.
    * @param {string} params.parent The GCP container. Must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]`.
    * @param {().GoogleCloudServicebrokerV1beta1__Binding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__CreateBindingResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @desc Unbinds from a service instance. For synchronous/asynchronous
    * request details see CreateServiceInstance method. If binding does not
    * exist HTTP 410 status will be returned.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsIncomplete See CreateServiceInstanceRequest for details.
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` `v2/service_instances/[INSTANCE_ID]/service_bindings/[BINDING_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` `/instances/[INSTANCE_ID]/bindings/[BINDING_ID]`.
    * @param {string=} params.planId The plan id of the service instance.
    * @param {string=} params.serviceId Additional query parameter hints. The service id of the service instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarDelete
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__DeleteBindingResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @desc GetBinding returns the binding information.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]/service_bindings`.
    * @param {string=} params.planId Plan id.
    * @param {string=} params.serviceId Service id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @desc Returns the state of the last operation for the binding. Only last
    * (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.v2.service_instances.service_bindings.getLast_operation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]/service_binding/[BINDING_ID]`.
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
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGetlast_operation
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGetlast_operation,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGetlast_operation,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGetlast_operation,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGetlast_operation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
}

