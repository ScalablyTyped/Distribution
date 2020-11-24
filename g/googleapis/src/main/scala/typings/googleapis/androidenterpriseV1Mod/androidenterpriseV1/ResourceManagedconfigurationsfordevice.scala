package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsfordevice")
@js.native
class ResourceManagedconfigurationsfordevice protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidenterprise.managedconfigurationsfordevice.delete
    * @desc Removes a per-device managed configuration for an app for the
    * specified device.
    * @alias androidenterprise.managedconfigurationsfordevice.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForDeviceId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsfordeviceDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedconfigurationsfordeviceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsfordeviceDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsfordevice.get
    * @desc Retrieves details of a per-device managed configuration.
    * @alias androidenterprise.managedconfigurationsfordevice.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForDeviceId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(params: ParamsResourceManagedconfigurationsfordeviceGet): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceManagedconfigurationsfordeviceGet, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsfordeviceGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsfordevice.list
    * @desc Lists all the per-device managed configurations for the specified
    * device. Only the ID is set.
    * @alias androidenterprise.managedconfigurationsfordevice.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationsfordeviceList): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    options: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse],
    callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationsfordeviceList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsfordeviceList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsfordevice.patch
    * @desc Adds or updates a per-device managed configuration for an app for
    * the specified device. This method supports patch semantics.
    * @alias androidenterprise.managedconfigurationsfordevice.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForDeviceId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().ManagedConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(params: ParamsResourceManagedconfigurationsfordevicePatch): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsfordevicePatch,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsfordevicePatch,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceManagedconfigurationsfordevicePatch, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsfordevicePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsfordevice.update
    * @desc Adds or updates a per-device managed configuration for an app for
    * the specified device.
    * @alias androidenterprise.managedconfigurationsfordevice.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForDeviceId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().ManagedConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(params: ParamsResourceManagedconfigurationsfordeviceUpdate): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceManagedconfigurationsfordeviceUpdate, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsfordeviceUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
}
