package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Devices")
@js.native
open class ResourceEnterprisesDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesDevicesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesDevicesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesDevicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a device. This operation wipes the device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.devices.delete({
    *     // The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *     // Optional flags that control the device wiping behavior.
    *     wipeDataFlags: 'placeholder-value',
    *     // Optional. A short message displayed to the user before wiping the work profile on personal devices. This has no effect on company owned devices. The maximum message length is 200 characters.
    *     wipeReasonMessage: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceEnterprisesDevicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEnterprisesDevicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet): GaxiosPromise[SchemaDevice] = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesDevicesGet, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Gets a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.devices.get({
    *     // The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiLevel": 0,
    *   //   "applicationReports": [],
    *   //   "appliedPasswordPolicies": [],
    *   //   "appliedPolicyName": "my_appliedPolicyName",
    *   //   "appliedPolicyVersion": "my_appliedPolicyVersion",
    *   //   "appliedState": "my_appliedState",
    *   //   "commonCriteriaModeInfo": {},
    *   //   "deviceSettings": {},
    *   //   "disabledReason": {},
    *   //   "displays": [],
    *   //   "enrollmentTime": "my_enrollmentTime",
    *   //   "enrollmentTokenData": "my_enrollmentTokenData",
    *   //   "enrollmentTokenName": "my_enrollmentTokenName",
    *   //   "hardwareInfo": {},
    *   //   "hardwareStatusSamples": [],
    *   //   "lastPolicyComplianceReportTime": "my_lastPolicyComplianceReportTime",
    *   //   "lastPolicySyncTime": "my_lastPolicySyncTime",
    *   //   "lastStatusReportTime": "my_lastStatusReportTime",
    *   //   "managementMode": "my_managementMode",
    *   //   "memoryEvents": [],
    *   //   "memoryInfo": {},
    *   //   "name": "my_name",
    *   //   "networkInfo": {},
    *   //   "nonComplianceDetails": [],
    *   //   "ownership": "my_ownership",
    *   //   "policyCompliant": false,
    *   //   "policyName": "my_policyName",
    *   //   "powerManagementEvents": [],
    *   //   "previousDeviceNames": [],
    *   //   "securityPosture": {},
    *   //   "softwareInfo": {},
    *   //   "state": "my_state",
    *   //   "systemProperties": {},
    *   //   "user": {},
    *   //   "userName": "my_userName"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceEnterprisesDevicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesDevicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def issueCommand(params: ParamsResourceEnterprisesDevicesIssuecommand, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def issueCommand(
    params: ParamsResourceEnterprisesDevicesIssuecommand,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status of the command.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.devices.issueCommand({
    *     // The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clearAppsDataParams": {},
    *       //   "clearAppsDataStatus": {},
    *       //   "createTime": "my_createTime",
    *       //   "duration": "my_duration",
    *       //   "errorCode": "my_errorCode",
    *       //   "newPassword": "my_newPassword",
    *       //   "resetPasswordFlags": [],
    *       //   "type": "my_type",
    *       //   "userName": "my_userName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def issueCommand(params: ParamsResourceEnterprisesDevicesIssuecommand, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def issueCommand(
    params: ParamsResourceEnterprisesDevicesIssuecommand,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    options: BodyResponseCallback[Readable | SchemaListDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDevicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesDevicesList, options: MethodOptions): GaxiosPromise[SchemaListDevicesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDevicesResponse]
  ): Unit = js.native
  /**
    * Lists devices for a given enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.devices.list({
    *     // The requested page size. The actual page size may be fixed to a min or max value.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "devices": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceEnterprisesDevicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesDevicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceEnterprisesDevicesOperations = js.native
  
  def patch(): GaxiosPromise[SchemaDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch): GaxiosPromise[SchemaDevice] = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch, callback: BodyResponseCallback[SchemaDevice]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesDevicesPatch,
    options: BodyResponseCallback[Readable | SchemaDevice],
    callback: BodyResponseCallback[Readable | SchemaDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesDevicesPatch, options: MethodOptions): GaxiosPromise[SchemaDevice] = js.native
  def patch(
    params: ParamsResourceEnterprisesDevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDevice]
  ): Unit = js.native
  /**
    * Updates a device.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.devices.patch({
    *     // The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    *     name: 'enterprises/my-enterprise/devices/my-device',
    *     // The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiLevel": 0,
    *       //   "applicationReports": [],
    *       //   "appliedPasswordPolicies": [],
    *       //   "appliedPolicyName": "my_appliedPolicyName",
    *       //   "appliedPolicyVersion": "my_appliedPolicyVersion",
    *       //   "appliedState": "my_appliedState",
    *       //   "commonCriteriaModeInfo": {},
    *       //   "deviceSettings": {},
    *       //   "disabledReason": {},
    *       //   "displays": [],
    *       //   "enrollmentTime": "my_enrollmentTime",
    *       //   "enrollmentTokenData": "my_enrollmentTokenData",
    *       //   "enrollmentTokenName": "my_enrollmentTokenName",
    *       //   "hardwareInfo": {},
    *       //   "hardwareStatusSamples": [],
    *       //   "lastPolicyComplianceReportTime": "my_lastPolicyComplianceReportTime",
    *       //   "lastPolicySyncTime": "my_lastPolicySyncTime",
    *       //   "lastStatusReportTime": "my_lastStatusReportTime",
    *       //   "managementMode": "my_managementMode",
    *       //   "memoryEvents": [],
    *       //   "memoryInfo": {},
    *       //   "name": "my_name",
    *       //   "networkInfo": {},
    *       //   "nonComplianceDetails": [],
    *       //   "ownership": "my_ownership",
    *       //   "policyCompliant": false,
    *       //   "policyName": "my_policyName",
    *       //   "powerManagementEvents": [],
    *       //   "previousDeviceNames": [],
    *       //   "securityPosture": {},
    *       //   "softwareInfo": {},
    *       //   "state": "my_state",
    *       //   "systemProperties": {},
    *       //   "user": {},
    *       //   "userName": "my_userName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiLevel": 0,
    *   //   "applicationReports": [],
    *   //   "appliedPasswordPolicies": [],
    *   //   "appliedPolicyName": "my_appliedPolicyName",
    *   //   "appliedPolicyVersion": "my_appliedPolicyVersion",
    *   //   "appliedState": "my_appliedState",
    *   //   "commonCriteriaModeInfo": {},
    *   //   "deviceSettings": {},
    *   //   "disabledReason": {},
    *   //   "displays": [],
    *   //   "enrollmentTime": "my_enrollmentTime",
    *   //   "enrollmentTokenData": "my_enrollmentTokenData",
    *   //   "enrollmentTokenName": "my_enrollmentTokenName",
    *   //   "hardwareInfo": {},
    *   //   "hardwareStatusSamples": [],
    *   //   "lastPolicyComplianceReportTime": "my_lastPolicyComplianceReportTime",
    *   //   "lastPolicySyncTime": "my_lastPolicySyncTime",
    *   //   "lastStatusReportTime": "my_lastStatusReportTime",
    *   //   "managementMode": "my_managementMode",
    *   //   "memoryEvents": [],
    *   //   "memoryInfo": {},
    *   //   "name": "my_name",
    *   //   "networkInfo": {},
    *   //   "nonComplianceDetails": [],
    *   //   "ownership": "my_ownership",
    *   //   "policyCompliant": false,
    *   //   "policyName": "my_policyName",
    *   //   "powerManagementEvents": [],
    *   //   "previousDeviceNames": [],
    *   //   "securityPosture": {},
    *   //   "softwareInfo": {},
    *   //   "state": "my_state",
    *   //   "systemProperties": {},
    *   //   "user": {},
    *   //   "userName": "my_userName"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceEnterprisesDevicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEnterprisesDevicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
