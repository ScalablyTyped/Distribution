package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$Instances$Bindings")
@js.native
class ResourceDollarProjectsDollarBrokersDollarInstancesDollarBindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.instances.bindings.getLast_operation
    * @desc Returns the state of the last operation for the binding. Only last
    * (or current) operation can be polled.
    * @alias
    * servicebroker.projects.brokers.instances.bindings.getLast_operation
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
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarGetlast_operation
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarGetlast_operation,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarGetlast_operation,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarGetlast_operation,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Operation] = js.native
  def getLast_operation(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarGetlast_operation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.instances.bindings.list
    * @desc Lists all the bindings in the instance.
    * @alias servicebroker.projects.brokers.instances.bindings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. Acceptable values are 0 to 200, inclusive. (Default: 100)
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` + `v2/service_instances/[INSTANCE_ID]` or `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBindingsResponse]
  ): Unit = js.native
}

