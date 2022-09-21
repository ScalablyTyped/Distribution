package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Resource$Devices$Deviceusers$Clientstates")
@js.native
open class ResourceDevicesDeviceusersClientstates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaClientState] = js.native
  def get(callback: BodyResponseCallback[SchemaClientState]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientState] = js.native
  def get(params: ParamsResourceDevicesDeviceusersClientstatesGet): GaxiosPromise[SchemaClientState] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    callback: BodyResponseCallback[SchemaClientState]
  ): Unit = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    options: BodyResponseCallback[Readable | SchemaClientState],
    callback: BodyResponseCallback[Readable | SchemaClientState]
  ): Unit = js.native
  def get(params: ParamsResourceDevicesDeviceusersClientstatesGet, options: MethodOptions): GaxiosPromise[SchemaClientState] = js.native
  def get(
    params: ParamsResourceDevicesDeviceusersClientstatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientState]
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
    * const cloudidentity = google.cloudidentity('v1beta1');
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
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer_id\}`, where customer_id is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device_id\}/deviceUsers/{device_user_id\}/clientStates/{partner_id\}`, where `device_id` is the unique ID assigned to the Device, `device_user_id` is the unique ID assigned to the User and `partner_id` identifies the partner storing the data. To get the client state for devices belonging to your own organization, the `partnerId` is in the format: `customerId-*anystring*`. Where the `customerId` is your organization's customer ID and `anystring` is any suffix. This suffix is used in setting up Custom Access Levels in Context-Aware Access. You may use `my_customer` instead of the customer ID for devices managed by your own organization. You may specify `-` in place of the `{device_id\}`, so the ClientState resource name can be: `devices/-/deviceUsers/{device_user_resource_id\}/clientStates/{partner_id\}`.
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
    * const cloudidentity = google.cloudidentity('v1beta1');
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
    *     // Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer_id\}`, where customer_id is the customer to whom the device belongs.
    *     customer: 'placeholder-value',
    *     // Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device_id\}/deviceUsers/{device_user_id\}/clientState/{partner_id\}`, where partner_id corresponds to the partner storing the data.
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
