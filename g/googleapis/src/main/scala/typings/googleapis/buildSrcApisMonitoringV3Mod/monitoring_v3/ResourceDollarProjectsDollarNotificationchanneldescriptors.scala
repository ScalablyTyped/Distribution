package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Notificationchanneldescriptors")
@js.native
class ResourceDollarProjectsDollarNotificationchanneldescriptors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.notificationChannelDescriptors.get
    * @desc Gets a single channel descriptor. The descriptor indicates which
    * fields are expected / permitted for a notification channel of the given
    * type.
    * @alias monitoring.projects.notificationChannelDescriptors.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The channel type for which to execute the request. The format is projects/[PROJECT_ID]/notificationChannelDescriptors/{channel_type}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$NotificationChannelDescriptor] = js.native
  def get(callback: BodyResponseCallback[Schema$NotificationChannelDescriptor]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarGet): GaxiosPromise[Schema$NotificationChannelDescriptor] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarGet,
    callback: BodyResponseCallback[Schema$NotificationChannelDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarGet,
    options: BodyResponseCallback[Schema$NotificationChannelDescriptor],
    callback: BodyResponseCallback[Schema$NotificationChannelDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$NotificationChannelDescriptor] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NotificationChannelDescriptor]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannelDescriptors.list
    * @desc Lists the descriptors for supported channel types. The use of
    * descriptors makes it possible for new channel types to be dynamically
    * added.
    * @alias monitoring.projects.notificationChannelDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The REST resource name of the parent from which to retrieve the notification channel descriptors. The expected syntax is: projects/[PROJECT_ID] Note that this names the parent container in which to look for the descriptors; to retrieve a single descriptor by name, use the GetNotificationChannelDescriptor operation, instead.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service.
    * @param {string=} params.pageToken If non-empty, page_token must contain a value returned as the next_page_token in a previous response to request the next set of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNotificationChannelDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNotificationChannelDescriptorsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarList): GaxiosPromise[Schema$ListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarList,
    callback: BodyResponseCallback[Schema$ListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarList,
    options: BodyResponseCallback[Schema$ListNotificationChannelDescriptorsResponse],
    callback: BodyResponseCallback[Schema$ListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotificationchanneldescriptorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
}

