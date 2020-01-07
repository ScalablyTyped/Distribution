package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Devices")
@js.native
class ResourceDollarCustomersDollarDevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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
  def applyConfiguration(): GaxiosPromise[Schema$Empty] = js.native
  def applyConfiguration(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def applyConfiguration(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarApplyconfiguration): GaxiosPromise[Schema$Empty] = js.native
  def applyConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarApplyconfiguration,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def applyConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarApplyconfiguration,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def applyConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarApplyconfiguration,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def applyConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarApplyconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$Device] = js.native
  def get(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarGet): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarGet,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarGet,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
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
  def list(): GaxiosPromise[Schema$CustomerListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomerListDevicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarList): GaxiosPromise[Schema$CustomerListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarList,
    callback: BodyResponseCallback[Schema$CustomerListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarList,
    options: BodyResponseCallback[Schema$CustomerListDevicesResponse],
    callback: BodyResponseCallback[Schema$CustomerListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomerListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomerListDevicesResponse]
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
  def removeConfiguration(): GaxiosPromise[Schema$Empty] = js.native
  def removeConfiguration(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def removeConfiguration(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarRemoveconfiguration): GaxiosPromise[Schema$Empty] = js.native
  def removeConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarRemoveconfiguration,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removeConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarRemoveconfiguration,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removeConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarRemoveconfiguration,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def removeConfiguration(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarRemoveconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
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
  def unclaim(): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def unclaim(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarUnclaim): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarUnclaim,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def unclaim(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarUnclaim,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def unclaim(params: ParamsDollarResourceDollarCustomersDollarDevicesDollarUnclaim, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def unclaim(
    params: ParamsDollarResourceDollarCustomersDollarDevicesDollarUnclaim,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

