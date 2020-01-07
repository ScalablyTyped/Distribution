package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Installs")
@js.native
class Resource$Installs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.installs.delete
    * @desc Requests to remove an app from a device. A call to get or list will
    * still show the app as installed on the device until it is actually
    * removed.
    * @alias androidenterprise.installs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.installId The ID of the product represented by the install, e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstallsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarInstallsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInstallsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstallsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstallsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.installs.get
    * @desc Retrieves details of an installation of an app on a device.
    * @alias androidenterprise.installs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.installId The ID of the product represented by the install, e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Install] = js.native
  def get(callback: BodyResponseCallback[Schema$Install]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstallsDollarGet): GaxiosPromise[Schema$Install] = js.native
  def get(
    params: ParamsDollarResourceDollarInstallsDollarGet,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInstallsDollarGet,
    options: BodyResponseCallback[Schema$Install],
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstallsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Install] = js.native
  def get(
    params: ParamsDollarResourceDollarInstallsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  /**
    * androidenterprise.installs.list
    * @desc Retrieves the details of all apps installed on the specified
    * device.
    * @alias androidenterprise.installs.list
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
  def list(): GaxiosPromise[Schema$InstallsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$InstallsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstallsDollarList): GaxiosPromise[Schema$InstallsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInstallsDollarList,
    callback: BodyResponseCallback[Schema$InstallsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInstallsDollarList,
    options: BodyResponseCallback[Schema$InstallsListResponse],
    callback: BodyResponseCallback[Schema$InstallsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstallsDollarList, options: MethodOptions): GaxiosPromise[Schema$InstallsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInstallsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstallsListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.installs.patch
    * @desc Requests to install the latest version of an app to a device. If
    * the app is already installed, then it is updated to the latest version if
    * necessary. This method supports patch semantics.
    * @alias androidenterprise.installs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.installId The ID of the product represented by the install, e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().Install} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Install] = js.native
  def patch(callback: BodyResponseCallback[Schema$Install]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInstallsDollarPatch): GaxiosPromise[Schema$Install] = js.native
  def patch(
    params: ParamsDollarResourceDollarInstallsDollarPatch,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarInstallsDollarPatch,
    options: BodyResponseCallback[Schema$Install],
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInstallsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Install] = js.native
  def patch(
    params: ParamsDollarResourceDollarInstallsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  /**
    * androidenterprise.installs.update
    * @desc Requests to install the latest version of an app to a device. If
    * the app is already installed, then it is updated to the latest version if
    * necessary.
    * @alias androidenterprise.installs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceId The Android ID of the device.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.installId The ID of the product represented by the install, e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().Install} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Install] = js.native
  def update(callback: BodyResponseCallback[Schema$Install]): Unit = js.native
  def update(params: ParamsDollarResourceDollarInstallsDollarUpdate): GaxiosPromise[Schema$Install] = js.native
  def update(
    params: ParamsDollarResourceDollarInstallsDollarUpdate,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarInstallsDollarUpdate,
    options: BodyResponseCallback[Schema$Install],
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarInstallsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Install] = js.native
  def update(
    params: ParamsDollarResourceDollarInstallsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Install]
  ): Unit = js.native
}

