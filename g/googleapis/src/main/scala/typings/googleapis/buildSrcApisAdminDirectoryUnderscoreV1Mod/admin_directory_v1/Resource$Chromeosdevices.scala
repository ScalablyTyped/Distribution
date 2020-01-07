package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Chromeosdevices")
@js.native
class Resource$Chromeosdevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.chromeosdevices.action
    * @desc Take action on Chrome OS Device
    * @alias directory.chromeosdevices.action
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Chrome OS Device
    * @param {().ChromeOsDeviceAction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: ParamsDollarResourceDollarChromeosdevicesDollarAction): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsDollarResourceDollarChromeosdevicesDollarAction,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def action(
    params: ParamsDollarResourceDollarChromeosdevicesDollarAction,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def action(params: ParamsDollarResourceDollarChromeosdevicesDollarAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsDollarResourceDollarChromeosdevicesDollarAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.chromeosdevices.get
    * @desc Retrieve Chrome OS Device
    * @alias directory.chromeosdevices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def get(callback: BodyResponseCallback[Schema$ChromeOsDevice]): Unit = js.native
  def get(params: ParamsDollarResourceDollarChromeosdevicesDollarGet): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def get(
    params: ParamsDollarResourceDollarChromeosdevicesDollarGet,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarChromeosdevicesDollarGet,
    options: BodyResponseCallback[Schema$ChromeOsDevice],
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarChromeosdevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def get(
    params: ParamsDollarResourceDollarChromeosdevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  /**
    * directory.chromeosdevices.list
    * @desc Retrieve all Chrome OS Devices of a customer (paginated)
    * @alias directory.chromeosdevices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.query Search string in the format given at http://support.google.com/chromeos/a/bin/answer.py?answer=1698333
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChromeOsDevices] = js.native
  def list(callback: BodyResponseCallback[Schema$ChromeOsDevices]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChromeosdevicesDollarList): GaxiosPromise[Schema$ChromeOsDevices] = js.native
  def list(
    params: ParamsDollarResourceDollarChromeosdevicesDollarList,
    callback: BodyResponseCallback[Schema$ChromeOsDevices]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChromeosdevicesDollarList,
    options: BodyResponseCallback[Schema$ChromeOsDevices],
    callback: BodyResponseCallback[Schema$ChromeOsDevices]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChromeosdevicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ChromeOsDevices] = js.native
  def list(
    params: ParamsDollarResourceDollarChromeosdevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChromeOsDevices]
  ): Unit = js.native
  /**
    * directory.chromeosdevices.moveDevicesToOu
    * @desc Move or insert multiple Chrome OS Devices to organizational unit
    * @alias directory.chromeosdevices.moveDevicesToOu
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the target organizational unit or its ID
    * @param {().ChromeOsMoveDevicesToOu} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def moveDevicesToOu(): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveDevicesToOu(params: ParamsDollarResourceDollarChromeosdevicesDollarMovedevicestoou): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(
    params: ParamsDollarResourceDollarChromeosdevicesDollarMovedevicestoou,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveDevicesToOu(
    params: ParamsDollarResourceDollarChromeosdevicesDollarMovedevicestoou,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveDevicesToOu(params: ParamsDollarResourceDollarChromeosdevicesDollarMovedevicestoou, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(
    params: ParamsDollarResourceDollarChromeosdevicesDollarMovedevicestoou,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.chromeosdevices.patch
    * @desc Update Chrome OS Device. This method supports patch semantics.
    * @alias directory.chromeosdevices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {().ChromeOsDevice} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def patch(callback: BodyResponseCallback[Schema$ChromeOsDevice]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarChromeosdevicesDollarPatch): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def patch(
    params: ParamsDollarResourceDollarChromeosdevicesDollarPatch,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarChromeosdevicesDollarPatch,
    options: BodyResponseCallback[Schema$ChromeOsDevice],
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarChromeosdevicesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def patch(
    params: ParamsDollarResourceDollarChromeosdevicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  /**
    * directory.chromeosdevices.update
    * @desc Update Chrome OS Device
    * @alias directory.chromeosdevices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {().ChromeOsDevice} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def update(callback: BodyResponseCallback[Schema$ChromeOsDevice]): Unit = js.native
  def update(params: ParamsDollarResourceDollarChromeosdevicesDollarUpdate): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def update(
    params: ParamsDollarResourceDollarChromeosdevicesDollarUpdate,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarChromeosdevicesDollarUpdate,
    options: BodyResponseCallback[Schema$ChromeOsDevice],
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarChromeosdevicesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ChromeOsDevice] = js.native
  def update(
    params: ParamsDollarResourceDollarChromeosdevicesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChromeOsDevice]
  ): Unit = js.native
}

