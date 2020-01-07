package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Instances")
@js.native
class ResourceDollarProjectsDollarBrokersDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var service_bindings: ResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindings = js.native
  /**
    * servicebroker.projects.brokers.instances.get
    * @desc Gets the given service instance from the system. This API is an
    * extension and not part of the OSB spec. Hence the path is a standard
    * Google API URL.
    * @alias servicebroker.projects.brokers.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the instance to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarGet): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ServiceInstance]
  ): Unit = js.native
}

