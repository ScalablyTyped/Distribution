package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsfordevice")
@js.native
class Resource$Managedconfigurationsfordevice protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarDelete,
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
  def get(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarGet): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarGet,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarGet,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarGet, options: MethodOptions): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
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
  def list(): GaxiosPromise[Schema$ManagedConfigurationsForDeviceListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedConfigurationsForDeviceListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarList): GaxiosPromise[Schema$ManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarList,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarList,
    options: BodyResponseCallback[Schema$ManagedConfigurationsForDeviceListResponse],
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForDeviceListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedConfigurationsForDeviceListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForDeviceListResponse]
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
  def patch(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarPatch): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarPatch,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarPatch,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
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
  def update(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarUpdate): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarUpdate,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarUpdate,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsfordeviceDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
}

