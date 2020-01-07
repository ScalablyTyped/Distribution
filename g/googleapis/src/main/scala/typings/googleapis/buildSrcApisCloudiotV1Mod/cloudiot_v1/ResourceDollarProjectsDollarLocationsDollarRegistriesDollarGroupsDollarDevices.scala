package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups$Devices")
@js.native
class ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var configVersions: ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarConfigversions = js.native
  var context: APIRequestContext = js.native
  var states: ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarStates = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.get
    * @desc Gets details about a device.
    * @alias cloudiot.projects.locations.registries.groups.devices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fieldMask The fields of the `Device` resource to be returned in the response. If the field mask is unset or empty, all fields are returned.
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Device] = js.native
  def get(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarGet
  ): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarGet,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarGet,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.list
    * @desc List devices in a device registry.
    * @alias cloudiot.projects.locations.registries.groups.devices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.deviceIds A list of device string IDs. For example, `['device0', 'device12']`. If empty, this field is ignored. Maximum IDs: 10,000
    * @param {string=} params.deviceNumIds A list of device numeric IDs. If empty, this field is ignored. Maximum IDs: 10,000.
    * @param {string=} params.fieldMask The fields of the `Device` resource to be returned in the response. The fields `id` and `num_id` are always returned, along with any other fields specified.
    * @param {string=} params.gatewayListOptions.associationsDeviceId If set, returns only the gateways with which the specified device is associated. The device ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `456` is specified, returns only the gateways to which the device with `num_id` 456 is bound.
    * @param {string=} params.gatewayListOptions.associationsGatewayId If set, only devices associated with the specified gateway are returned. The gateway ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `123` is specified, only devices bound to the gateway with `num_id` 123 are returned.
    * @param {string=} params.gatewayListOptions.gatewayType If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY` is specified, only non-gateway devices are returned. If `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    * @param {integer=} params.pageSize The maximum number of devices to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    * @param {string=} params.pageToken The value returned by the last `ListDevicesResponse`; indicates that this is a continuation of a prior `ListDevices` call and the system should return the next page of data.
    * @param {string} params.parent The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDevicesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarList
  ): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarList,
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarList,
    options: BodyResponseCallback[Schema$ListDevicesResponse],
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.modifyCloudToDeviceConfig
    * @desc Modifies the configuration for the device, which is eventually sent
    * from the Cloud IoT Core servers. Returns the modified configuration
    * version and its metadata.
    * @alias
    * cloudiot.projects.locations.registries.groups.devices.modifyCloudToDeviceConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {().ModifyCloudToDeviceConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyCloudToDeviceConfig(): GaxiosPromise[Schema$DeviceConfig] = js.native
  def modifyCloudToDeviceConfig(callback: BodyResponseCallback[Schema$DeviceConfig]): Unit = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarModifycloudtodeviceconfig
  ): GaxiosPromise[Schema$DeviceConfig] = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarModifycloudtodeviceconfig,
    callback: BodyResponseCallback[Schema$DeviceConfig]
  ): Unit = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarModifycloudtodeviceconfig,
    options: BodyResponseCallback[Schema$DeviceConfig],
    callback: BodyResponseCallback[Schema$DeviceConfig]
  ): Unit = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarModifycloudtodeviceconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeviceConfig] = js.native
  def modifyCloudToDeviceConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarModifycloudtodeviceconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceConfig]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.patch
    * @desc Updates a device.
    * @alias cloudiot.projects.locations.registries.groups.devices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
    * @param {string=} params.updateMask Only updates the `device` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `credentials`, `blocked`, and `metadata`
    * @param {().Device} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Device] = js.native
  def patch(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarPatch
  ): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarPatch,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarPatch,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.devices.sendCommandToDevice
    * @desc Sends a command to the specified device. In order for a device to
    * be able to receive commands, it must: 1) be connected to Cloud IoT Core
    * using the MQTT protocol, and 2) be subscribed to the group of MQTT topics
    * specified by    /devices/{device-id}/commands/#. This subscription will
    * receive commands    at the top-level topic /devices/{device-id}/commands
    * as well as commands    for subfolders, like
    * /devices/{device-id}/commands/subfolder.    Note that subscribing to
    * specific subfolders is not supported. If the command could not be
    * delivered to the device, this method will return an error; in particular,
    * if the device is not subscribed, this method will return
    * FAILED_PRECONDITION. Otherwise, this method will return OK. If the
    * subscription is QoS 1, at least once delivery will be guaranteed; for QoS
    * 0, no acknowledgment will be expected from the device.
    * @alias
    * cloudiot.projects.locations.registries.groups.devices.sendCommandToDevice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {().SendCommandToDeviceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendCommandToDevice(): GaxiosPromise[Schema$SendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(callback: BodyResponseCallback[Schema$SendCommandToDeviceResponse]): Unit = js.native
  def sendCommandToDevice(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarSendcommandtodevice
  ): GaxiosPromise[Schema$SendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarSendcommandtodevice,
    callback: BodyResponseCallback[Schema$SendCommandToDeviceResponse]
  ): Unit = js.native
  def sendCommandToDevice(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarSendcommandtodevice,
    options: BodyResponseCallback[Schema$SendCommandToDeviceResponse],
    callback: BodyResponseCallback[Schema$SendCommandToDeviceResponse]
  ): Unit = js.native
  def sendCommandToDevice(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarSendcommandtodevice,
    options: MethodOptions
  ): GaxiosPromise[Schema$SendCommandToDeviceResponse] = js.native
  def sendCommandToDevice(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevicesDollarSendcommandtodevice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SendCommandToDeviceResponse]
  ): Unit = js.native
}

