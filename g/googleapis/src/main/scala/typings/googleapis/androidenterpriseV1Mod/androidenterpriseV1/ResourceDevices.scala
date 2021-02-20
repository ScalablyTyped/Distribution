package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Devices")
@js.native
class ResourceDevices protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceDevicesGet,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
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
  def getState(): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def getState(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(params: ParamsResourceDevicesGetstate): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(params: ParamsResourceDevicesGetstate, callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def getState(
    params: ParamsResourceDevicesGetstate,
    options: BodyResponseCallback[SchemaDeviceState],
    callback: BodyResponseCallback[SchemaDeviceState]
  ): Unit = js.native
  def getState(params: ParamsResourceDevicesGetstate, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def getState(
    params: ParamsResourceDevicesGetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceState]
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
  def list(): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDevicesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(params: ParamsResourceDevicesList): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(params: ParamsResourceDevicesList, callback: BodyResponseCallback[SchemaDevicesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: BodyResponseCallback[SchemaDevicesListResponse],
    callback: BodyResponseCallback[SchemaDevicesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDevicesList, options: MethodOptions): GaxiosPromise[SchemaDevicesListResponse] = js.native
  def list(
    params: ParamsResourceDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevicesListResponse]
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
  def patch(): GaxiosPromise[SchemaDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceDevicesPatch): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceDevicesPatch, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(
    params: ParamsResourceDevicesPatch,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(
    params: ParamsResourceDevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
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
  def setState(): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def setState(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(params: ParamsResourceDevicesSetstate): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(params: ParamsResourceDevicesSetstate, callback: BodyResponseCallback[SchemaDeviceState]): Unit = js.native
  def setState(
    params: ParamsResourceDevicesSetstate,
    options: BodyResponseCallback[SchemaDeviceState],
    callback: BodyResponseCallback[SchemaDeviceState]
  ): Unit = js.native
  def setState(params: ParamsResourceDevicesSetstate, options: MethodOptions): GaxiosPromise[SchemaDeviceState] = js.native
  def setState(
    params: ParamsResourceDevicesSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceState]
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
  def update(): GaxiosPromise[SchemaDevice] = js.native
  def update(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def update(params: ParamsResourceDevicesUpdate): GaxiosPromise[SchemaDevice] = js.native
  def update(params: ParamsResourceDevicesUpdate, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def update(
    params: ParamsResourceDevicesUpdate,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def update(params: ParamsResourceDevicesUpdate, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def update(
    params: ParamsResourceDevicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
}
