package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Service_instances")
@js.native
class ResourceDollarProjectsDollarBrokersDollarService_instances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.service_instances.list
    * @desc Lists all the instances in the brokers This API is an extension and
    * not part of the OSB spec. Hence the path is a standard Google API URL.
    * @alias servicebroker.projects.brokers.service_instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarService_instancesDollarList): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarService_instancesDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarService_instancesDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarService_instancesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarService_instancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListServiceInstancesResponse]
  ): Unit = js.native
}

