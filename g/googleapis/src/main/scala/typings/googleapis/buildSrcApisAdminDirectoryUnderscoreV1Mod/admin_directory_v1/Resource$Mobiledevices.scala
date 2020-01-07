package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Mobiledevices")
@js.native
class Resource$Mobiledevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.mobiledevices.action
    * @desc Take action on Mobile Device
    * @alias directory.mobiledevices.action
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {().MobileDeviceAction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: ParamsDollarResourceDollarMobiledevicesDollarAction): GaxiosPromise[Unit] = js.native
  def action(params: ParamsDollarResourceDollarMobiledevicesDollarAction, callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(
    params: ParamsDollarResourceDollarMobiledevicesDollarAction,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def action(params: ParamsDollarResourceDollarMobiledevicesDollarAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsDollarResourceDollarMobiledevicesDollarAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.mobiledevices.delete
    * @desc Delete Mobile Device
    * @alias directory.mobiledevices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMobiledevicesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarMobiledevicesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMobiledevicesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMobiledevicesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarMobiledevicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.mobiledevices.get
    * @desc Retrieve Mobile Device
    * @alias directory.mobiledevices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string} params.resourceId Immutable ID of Mobile Device
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$MobileDevice] = js.native
  def get(callback: BodyResponseCallback[Schema$MobileDevice]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobiledevicesDollarGet): GaxiosPromise[Schema$MobileDevice] = js.native
  def get(
    params: ParamsDollarResourceDollarMobiledevicesDollarGet,
    callback: BodyResponseCallback[Schema$MobileDevice]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMobiledevicesDollarGet,
    options: BodyResponseCallback[Schema$MobileDevice],
    callback: BodyResponseCallback[Schema$MobileDevice]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobiledevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$MobileDevice] = js.native
  def get(
    params: ParamsDollarResourceDollarMobiledevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileDevice]
  ): Unit = js.native
  /**
    * directory.mobiledevices.list
    * @desc Retrieve all Mobile Devices of a customer (paginated)
    * @alias directory.mobiledevices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.query Search string in the format given at http://support.google.com/a/bin/answer.py?answer=1408863#search
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$MobileDevices] = js.native
  def list(callback: BodyResponseCallback[Schema$MobileDevices]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobiledevicesDollarList): GaxiosPromise[Schema$MobileDevices] = js.native
  def list(
    params: ParamsDollarResourceDollarMobiledevicesDollarList,
    callback: BodyResponseCallback[Schema$MobileDevices]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMobiledevicesDollarList,
    options: BodyResponseCallback[Schema$MobileDevices],
    callback: BodyResponseCallback[Schema$MobileDevices]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobiledevicesDollarList, options: MethodOptions): GaxiosPromise[Schema$MobileDevices] = js.native
  def list(
    params: ParamsDollarResourceDollarMobiledevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileDevices]
  ): Unit = js.native
}

