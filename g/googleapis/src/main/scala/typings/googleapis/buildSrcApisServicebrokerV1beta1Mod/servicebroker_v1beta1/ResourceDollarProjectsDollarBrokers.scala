package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers")
@js.native
class ResourceDollarProjectsDollarBrokers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var instances: ResourceDollarProjectsDollarBrokersDollarInstances = js.native
  var v2: ResourceDollarProjectsDollarBrokersDollarV2 = js.native
  /**
    * servicebroker.projects.brokers.create
    * @desc CreateBroker creates a Broker.
    * @alias servicebroker.projects.brokers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create broker.
    * @param {().GoogleCloudServicebrokerV1beta1__Broker} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Broker] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Broker]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarCreate): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Broker] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Broker]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Broker],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Broker]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__Broker] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__Broker]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.delete
    * @desc DeleteBroker deletes a Broker.
    * @alias servicebroker.projects.brokers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The broker to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarDelete): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobuf__Empty],
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  /**
    * servicebroker.projects.brokers.list
    * @desc ListBrokers lists brokers.
    * @alias servicebroker.projects.brokers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. Acceptable values are 0 to 200, inclusive. (Default: 100)
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarList): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1beta1__ListBrokersResponse]
  ): Unit = js.native
}

