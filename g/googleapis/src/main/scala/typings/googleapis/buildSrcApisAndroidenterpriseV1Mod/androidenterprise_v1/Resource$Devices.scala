package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Devices")
@js.native
class Resource$Devices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.devices.get
    * @desc Retrieves the details of a device.
    * @alias androidenterprise.devices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Device] = js.native
  def get(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDevicesDollarGet): GaxiosPromise[Schema$Device] = js.native
  def get(params: ParamsDollarResourceDollarDevicesDollarGet, callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDevicesDollarGet,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarDevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * androidenterprise.devices.getState
    * @desc Retrieves whether a device's access to Google services is enabled
    * or disabled. The device state takes effect only if enforcing EMM policies
    * on Android devices is enabled in the Google Admin Console. Otherwise, the
    * device state is ignored and all devices are allowed access to Google
    * services. This is only supported for Google-managed users.
    * @alias androidenterprise.devices.getState
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getState(): GaxiosPromise[Schema$DeviceState] = js.native
  def getState(callback: BodyResponseCallback[Schema$DeviceState]): Unit = js.native
  def getState(params: ParamsDollarResourceDollarDevicesDollarGetstate): GaxiosPromise[Schema$DeviceState] = js.native
  def getState(
    params: ParamsDollarResourceDollarDevicesDollarGetstate,
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  def getState(
    params: ParamsDollarResourceDollarDevicesDollarGetstate,
    options: BodyResponseCallback[Schema$DeviceState],
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  def getState(params: ParamsDollarResourceDollarDevicesDollarGetstate, options: MethodOptions): GaxiosPromise[Schema$DeviceState] = js.native
  def getState(
    params: ParamsDollarResourceDollarDevicesDollarGetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  /**
    * androidenterprise.devices.list
    * @desc Retrieves the IDs of all of a user's devices.
    * @alias androidenterprise.devices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DevicesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DevicesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDevicesDollarList): GaxiosPromise[Schema$DevicesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDevicesDollarList,
    callback: BodyResponseCallback[Schema$DevicesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDevicesDollarList,
    options: BodyResponseCallback[Schema$DevicesListResponse],
    callback: BodyResponseCallback[Schema$DevicesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDevicesDollarList, options: MethodOptions): GaxiosPromise[Schema$DevicesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DevicesListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.devices.patch
    * @desc Updates the device policy. This method supports patch semantics.
    * @alias androidenterprise.devices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.updateMask Mask that identifies which fields to update. If not set, all modifiable fields will be modified.  When set in a query parameter, this field should be specified as updateMask=<field1>,<field2>,...
    * @param {string} params.userId The ID of the user.
    * @param {().Device} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Device] = js.native
  def patch(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDevicesDollarPatch): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarDevicesDollarPatch,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarDevicesDollarPatch,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDevicesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarDevicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * androidenterprise.devices.setState
    * @desc Sets whether a device's access to Google services is enabled or
    * disabled. The device state takes effect only if enforcing EMM policies on
    * Android devices is enabled in the Google Admin Console. Otherwise, the
    * device state is ignored and all devices are allowed access to Google
    * services. This is only supported for Google-managed users.
    * @alias androidenterprise.devices.setState
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {().DeviceState} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setState(): GaxiosPromise[Schema$DeviceState] = js.native
  def setState(callback: BodyResponseCallback[Schema$DeviceState]): Unit = js.native
  def setState(params: ParamsDollarResourceDollarDevicesDollarSetstate): GaxiosPromise[Schema$DeviceState] = js.native
  def setState(
    params: ParamsDollarResourceDollarDevicesDollarSetstate,
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  def setState(
    params: ParamsDollarResourceDollarDevicesDollarSetstate,
    options: BodyResponseCallback[Schema$DeviceState],
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  def setState(params: ParamsDollarResourceDollarDevicesDollarSetstate, options: MethodOptions): GaxiosPromise[Schema$DeviceState] = js.native
  def setState(
    params: ParamsDollarResourceDollarDevicesDollarSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceState]
  ): Unit = js.native
  /**
    * androidenterprise.devices.update
    * @desc Updates the device policy
    * @alias androidenterprise.devices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.updateMask Mask that identifies which fields to update. If not set, all modifiable fields will be modified.  When set in a query parameter, this field should be specified as updateMask=<field1>,<field2>,...
    * @param {string} params.userId The ID of the user.
    * @param {().Device} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Device] = js.native
  def update(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def update(params: ParamsDollarResourceDollarDevicesDollarUpdate): GaxiosPromise[Schema$Device] = js.native
  def update(
    params: ParamsDollarResourceDollarDevicesDollarUpdate,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarDevicesDollarUpdate,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarDevicesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def update(
    params: ParamsDollarResourceDollarDevicesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
}

