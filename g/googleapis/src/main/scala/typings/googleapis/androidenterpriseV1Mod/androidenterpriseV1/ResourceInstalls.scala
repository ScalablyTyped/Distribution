package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Installs")
@js.native
class ResourceInstalls protected () extends StObject {
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInstallsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInstallsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceInstallsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceInstallsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInstallsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
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
  def get(): GaxiosPromise[SchemaInstall] = js.native
  def get(callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def get(params: ParamsResourceInstallsGet): GaxiosPromise[SchemaInstall] = js.native
  def get(params: ParamsResourceInstallsGet, callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def get(
    params: ParamsResourceInstallsGet,
    options: BodyResponseCallback[SchemaInstall],
    callback: BodyResponseCallback[SchemaInstall]
  ): Unit = js.native
  def get(params: ParamsResourceInstallsGet, options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def get(
    params: ParamsResourceInstallsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstall]
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
  def list(): GaxiosPromise[SchemaInstallsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInstallsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstallsListResponse] = js.native
  def list(params: ParamsResourceInstallsList): GaxiosPromise[SchemaInstallsListResponse] = js.native
  def list(params: ParamsResourceInstallsList, callback: BodyResponseCallback[SchemaInstallsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceInstallsList,
    options: BodyResponseCallback[SchemaInstallsListResponse],
    callback: BodyResponseCallback[SchemaInstallsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInstallsList, options: MethodOptions): GaxiosPromise[SchemaInstallsListResponse] = js.native
  def list(
    params: ParamsResourceInstallsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstallsListResponse]
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
  def patch(): GaxiosPromise[SchemaInstall] = js.native
  def patch(callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def patch(params: ParamsResourceInstallsPatch): GaxiosPromise[SchemaInstall] = js.native
  def patch(params: ParamsResourceInstallsPatch, callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def patch(
    params: ParamsResourceInstallsPatch,
    options: BodyResponseCallback[SchemaInstall],
    callback: BodyResponseCallback[SchemaInstall]
  ): Unit = js.native
  def patch(params: ParamsResourceInstallsPatch, options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def patch(
    params: ParamsResourceInstallsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstall]
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
  def update(): GaxiosPromise[SchemaInstall] = js.native
  def update(callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def update(params: ParamsResourceInstallsUpdate): GaxiosPromise[SchemaInstall] = js.native
  def update(params: ParamsResourceInstallsUpdate, callback: BodyResponseCallback[SchemaInstall]): Unit = js.native
  def update(
    params: ParamsResourceInstallsUpdate,
    options: BodyResponseCallback[SchemaInstall],
    callback: BodyResponseCallback[SchemaInstall]
  ): Unit = js.native
  def update(params: ParamsResourceInstallsUpdate, options: MethodOptions): GaxiosPromise[SchemaInstall] = js.native
  def update(
    params: ParamsResourceInstallsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstall]
  ): Unit = js.native
}
