package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Devices")
@js.native
class ResourceDollarEnterprisesDollarDevices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceDollarEnterprisesDollarDevicesDollarOperations = js.native
  /**
    * androidmanagement.enterprises.devices.delete
    * @desc Deletes a device. This operation wipes the device.
    * @alias androidmanagement.enterprises.devices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
    * @param {string=} params.wipeDataFlags Optional flags that control the device wiping behavior.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.get
    * @desc Gets a device.
    * @alias androidmanagement.enterprises.devices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Device] = js.native
  def get(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarGet): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarGet,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarGet,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.issueCommand
    * @desc Issues a command to a device. The Operation resource returned
    * contains a Command in its metadata field. Use the get operation method to
    * get the status of the command.
    * @alias androidmanagement.enterprises.devices.issueCommand
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
    * @param {().Command} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def issueCommand(): GaxiosPromise[Schema$Operation] = js.native
  def issueCommand(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def issueCommand(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarIssuecommand): GaxiosPromise[Schema$Operation] = js.native
  def issueCommand(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarIssuecommand,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def issueCommand(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarIssuecommand,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def issueCommand(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarIssuecommand,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def issueCommand(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarIssuecommand,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.list
    * @desc Lists devices for a given enterprise.
    * @alias androidmanagement.enterprises.devices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The requested page size. The actual page size may be fixed to a min or max value.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDevicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarList): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarList,
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarList,
    options: BodyResponseCallback[Schema$ListDevicesResponse],
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDevicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDevicesResponse]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.patch
    * @desc Updates a device.
    * @alias androidmanagement.enterprises.devices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
    * @param {string=} params.updateMask The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    * @param {().Device} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Device] = js.native
  def patch(callback: BodyResponseCallback[Schema$Device]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarPatch): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarPatch,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarPatch,
    options: BodyResponseCallback[Schema$Device],
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Device] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Device]
  ): Unit = js.native
}

