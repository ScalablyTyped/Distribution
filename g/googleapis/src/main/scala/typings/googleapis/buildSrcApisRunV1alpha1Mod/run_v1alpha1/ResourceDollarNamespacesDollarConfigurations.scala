package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces$Configurations")
@js.native
class ResourceDollarNamespacesDollarConfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.namespaces.configurations.get
    * @desc Rpc to get information about a configuration.
    * @alias run.namespaces.configurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the configuration being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Configuration] = js.native
  def get(callback: BodyResponseCallback[Schema$Configuration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarGet): GaxiosPromise[Schema$Configuration] = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarGet,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarGet,
    options: BodyResponseCallback[Schema$Configuration],
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Configuration] = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Configuration]
  ): Unit = js.native
  /**
    * run.namespaces.configurations.list
    * @desc Rpc to list configurations.
    * @alias run.namespaces.configurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the configurations should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListConfigurationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarList): GaxiosPromise[Schema$ListConfigurationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarList,
    callback: BodyResponseCallback[Schema$ListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarList,
    options: BodyResponseCallback[Schema$ListConfigurationsResponse],
    callback: BodyResponseCallback[Schema$ListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListConfigurationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarConfigurationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListConfigurationsResponse]
  ): Unit = js.native
}

