package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Devices")
@js.native
class ResourceEnterprisesDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesDevicesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesDevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
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
  def issueCommand(): GaxiosPromise[SchemaOperation] = js.native
  def issueCommand(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def issueCommand(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def issueCommand(params: ParamsResourceEnterprisesDevicesIssuecommand): GaxiosPromise[SchemaOperation] = js.native
  def issueCommand(
    params: ParamsResourceEnterprisesDevicesIssuecommand,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def issueCommand(
    params: ParamsResourceEnterprisesDevicesIssuecommand,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def issueCommand(params: ParamsResourceEnterprisesDevicesIssuecommand, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def issueCommand(
    params: ParamsResourceEnterprisesDevicesIssuecommand,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def list(): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDevicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(params: ParamsResourceEnterprisesDevicesList): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: BodyResponseCallback[SchemaListDevicesResponse],
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesDevicesList, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  
  var operations: ResourceEnterprisesDevicesOperations = js.native
  
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
  def patch(): GaxiosPromise[SchemaDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesDevicesPatch,
    options: BodyResponseCallback[SchemaDevice],
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(
    params: ParamsResourceEnterprisesDevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
}
