package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Devices")
@js.native
class ResourceCustomersDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * androiddeviceprovisioning.customers.devices.applyConfiguration
    * @desc Applies a Configuration to the device to register the device for
    * zero-touch enrollment. After applying a configuration to a device, the
    * device automatically provisions itself on first boot, or next factory
    * reset.
    * @alias androiddeviceprovisioning.customers.devices.applyConfiguration
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer managing the device. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {().CustomerApplyConfigurationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def applyConfiguration(): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def applyConfiguration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(params: ParamsResourceCustomersDevicesApplyconfiguration): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def applyConfiguration(params: ParamsResourceCustomersDevicesApplyconfiguration, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def applyConfiguration(
    params: ParamsResourceCustomersDevicesApplyconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * androiddeviceprovisioning.customers.devices.get
    * @desc Gets the details of a device.
    * @alias androiddeviceprovisioning.customers.devices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The device to get. An API resource name in the format `customers/[CUSTOMER_ID]/devices/[DEVICE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceCustomersDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceCustomersDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceCustomersDevicesGet,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceCustomersDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  
  /**
    * androiddeviceprovisioning.customers.devices.list
    * @desc Lists a customer's devices.
    * @alias androiddeviceprovisioning.customers.devices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageSize The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive.
    * @param {string=} params.pageToken A token specifying which result page to return.
    * @param {string} params.parent Required. The customer managing the devices. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(params: ParamsResourceCustomersDevicesList): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    options: BodyResponseCallback[SchemaCustomerListDevicesResponse],
    callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersDevicesList, options: MethodOptions): GaxiosPromise[SchemaCustomerListDevicesResponse] = js.native
  def list(
    params: ParamsResourceCustomersDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListDevicesResponse]
  ): Unit = js.native
  
  /**
    * androiddeviceprovisioning.customers.devices.removeConfiguration
    * @desc Removes a configuration from device.
    * @alias androiddeviceprovisioning.customers.devices.removeConfiguration
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer managing the device in the format `customers/[CUSTOMER_ID]`.
    * @param {().CustomerRemoveConfigurationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeConfiguration(): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeConfiguration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(params: ParamsResourceCustomersDevicesRemoveconfiguration): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeConfiguration(params: ParamsResourceCustomersDevicesRemoveconfiguration, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeConfiguration(
    params: ParamsResourceCustomersDevicesRemoveconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * androiddeviceprovisioning.customers.devices.unclaim
    * @desc Unclaims a device from a customer and removes it from zero-touch
    * enrollment.  After removing a device, a customer must contact their
    * reseller to register the device into zero-touch enrollment again.
    * @alias androiddeviceprovisioning.customers.devices.unclaim
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer managing the device. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {().CustomerUnclaimDeviceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unclaim(): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unclaim(
    params: ParamsResourceCustomersDevicesUnclaim,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def unclaim(params: ParamsResourceCustomersDevicesUnclaim, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unclaim(
    params: ParamsResourceCustomersDevicesUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}
