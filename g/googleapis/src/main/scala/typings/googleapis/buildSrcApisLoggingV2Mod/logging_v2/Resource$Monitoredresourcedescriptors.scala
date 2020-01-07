package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Monitoredresourcedescriptors")
@js.native
class Resource$Monitoredresourcedescriptors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.monitoredResourceDescriptors.list
    * @desc Lists the descriptors for monitored resource types used by Logging.
    * @alias logging.monitoredResourceDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMonitoredResourceDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMonitoredResourceDescriptorsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMonitoredresourcedescriptorsDollarList): GaxiosPromise[Schema$ListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMonitoredresourcedescriptorsDollarList,
    callback: BodyResponseCallback[Schema$ListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMonitoredresourcedescriptorsDollarList,
    options: BodyResponseCallback[Schema$ListMonitoredResourceDescriptorsResponse],
    callback: BodyResponseCallback[Schema$ListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMonitoredresourcedescriptorsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMonitoredresourcedescriptorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
}

