package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Devices$Deviceusers$Clientstates")
@js.native
open class ResourceDevicesDeviceusersClientstates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ClientState]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(params: ParamsResourceDevicesDeviceusersClientstatesGet): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ClientState]
  ): Unit = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ClientState],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ClientState]
  ): Unit = js.native
  def get(params: ParamsResourceDevicesDeviceusersClientstatesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ClientState]
  ): Unit = js.native
  /**
    * Gets the client state for the device user
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *       'https://www.googleapis.com/auth/cloud-identity.devices.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.deviceUsers.clientStates.get({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device\}/deviceUsers/{device_user\}/clientStates/{partner\}`, where `device` is the unique ID assigned to the Device, `device_user` is the unique ID assigned to the User and `partner` identifies the partner storing the data. To get the client state for devices belonging to your own organization, the `partnerId` is in the format: `customerId-*anystring*`. Where the `customerId` is your organization's customer ID and `anystring` is any suffix. This suffix is used in setting up Custom Access Levels in Context-Aware Access. You may use `my_customer` instead of the customer ID for devices managed by your own organization. You may specify `-` in place of the `{device\}`, so the ClientState resource name can be: `devices/-/deviceUsers/{device_user_resource\}/clientStates/{partner\}`.
    *     name: 'devices/my-device/deviceUsers/my-deviceUser/clientStates/my-clientState',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetTags": [],
    *   //   "complianceState": "my_complianceState",
    *   //   "createTime": "my_createTime",
    *   //   "customId": "my_customId",
    *   //   "etag": "my_etag",
    *   //   "healthScore": "my_healthScore",
    *   //   "keyValuePairs": {},
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "managed": "my_managed",
    *   //   "name": "my_name",
    *   //   "ownerType": "my_ownerType",
    *   //   "scoreReason": "my_scoreReason"
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
  def get(params: ParamsResourceDevicesDeviceusersClientstatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(params: ParamsResourceDevicesDeviceusersClientstatesList): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersClientstatesList,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersClientstatesList,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDevicesDeviceusersClientstatesList, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersClientstatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  ): Unit = js.native
  /**
    * Lists the client states for the given search query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *       'https://www.googleapis.com/auth/cloud-identity.devices.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.deviceUsers.clientStates.list({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Optional. Additional restrictions when fetching list of client states.
    *     filter: 'placeholder-value',
    *     // Optional. Order specification for client states in the response.
    *     orderBy: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListClientStates` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListClientStates` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. To list all ClientStates, set this to "devices/-/deviceUsers/-". To list all ClientStates owned by a DeviceUser, set this to the resource name of the DeviceUser. Format: devices/{device\}/deviceUsers/{deviceUser\}
    *     parent: 'devices/my-device/deviceUsers/my-deviceUser',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientStates": [],
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
  def list(params: ParamsResourceDevicesDeviceusersClientstatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDevicesDeviceusersClientstatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceDevicesDeviceusersClientstatesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceDevicesDeviceusersClientstatesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceDevicesDeviceusersClientstatesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceDevicesDeviceusersClientstatesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceDevicesDeviceusersClientstatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the client state for the device user **Note**: This method is available only to customers who have one of the following SKUs: Enterprise Standard, Enterprise Plus, Enterprise for Education, and Cloud Identity Premium
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudidentity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-identity',
    *       'https://www.googleapis.com/auth/cloud-identity.devices',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.devices.deviceUsers.clientStates.patch({
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device\}/deviceUsers/{device_user\}/clientState/{partner\}`, where partner corresponds to the partner storing the data. For partners belonging to the "BeyondCorp Alliance", this is the partner ID specified to you by Google. For all other callers, this is a string of the form: `{customer\}-suffix`, where `customer` is your customer ID. The *suffix* is any string the caller specifies. This string will be displayed verbatim in the administration console. This suffix is used in setting up Custom Access Levels in Context-Aware Access. Your organization's customer ID can be obtained from the URL: `GET https://www.googleapis.com/admin/directory/v1/customers/my_customer` The `id` field in the response contains the customer ID starting with the letter 'C'. The customer ID to be used in this API is the string after the letter 'C' (not including 'C')
    *     name: 'devices/my-device/deviceUsers/my-deviceUser/clientStates/my-clientState',
    *     // Optional. Comma-separated list of fully qualified names of fields to be updated. If not specified, all updatable fields in ClientState are updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assetTags": [],
    *       //   "complianceState": "my_complianceState",
    *       //   "createTime": "my_createTime",
    *       //   "customId": "my_customId",
    *       //   "etag": "my_etag",
    *       //   "healthScore": "my_healthScore",
    *       //   "keyValuePairs": {},
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "managed": "my_managed",
    *       //   "name": "my_name",
    *       //   "ownerType": "my_ownerType",
    *       //   "scoreReason": "my_scoreReason"
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
  def patch(params: ParamsResourceDevicesDeviceusersClientstatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceDevicesDeviceusersClientstatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
