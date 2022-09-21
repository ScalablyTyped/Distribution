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

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises")
@js.native
open class ResourceEnterprises protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var applications: ResourceEnterprisesApplications = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEnterprise] = js.native
  def create(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def create(params: ParamsResourceEnterprisesCreate): GaxiosPromise[SchemaEnterprise] = js.native
  def create(params: ParamsResourceEnterprisesCreate, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesCreate,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesCreate, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def create(
    params: ParamsResourceEnterprisesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Creates an enterprise. This is the last step in the enterprise signup flow.
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
    *   const res = await androidmanagement.enterprises.create({
    *     // Whether the enterprise admin has seen and agreed to the managed Google Play Agreement (https://www.android.com/enterprise/terms/). Do not set this field for any customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises). Set this to field to true for all EMM-managed enterprises (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    *     agreementAccepted: 'placeholder-value',
    *     // The enterprise token appended to the callback URL. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    *     enterpriseToken: 'placeholder-value',
    *     // The ID of the Google Cloud Platform project which will own the enterprise.
    *     projectId: 'placeholder-value',
    *     // The name of the SignupUrl used to sign up for the enterprise. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    *     signupUrlName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appAutoApprovalEnabled": false,
    *       //   "contactInfo": {},
    *       //   "enabledNotificationTypes": [],
    *       //   "enterpriseDisplayName": "my_enterpriseDisplayName",
    *       //   "logo": {},
    *       //   "name": "my_name",
    *       //   "primaryColor": 0,
    *       //   "pubsubTopic": "my_pubsubTopic",
    *       //   "signinDetails": [],
    *       //   "termsAndConditions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appAutoApprovalEnabled": false,
    *   //   "contactInfo": {},
    *   //   "enabledNotificationTypes": [],
    *   //   "enterpriseDisplayName": "my_enterpriseDisplayName",
    *   //   "logo": {},
    *   //   "name": "my_name",
    *   //   "primaryColor": 0,
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "signinDetails": [],
    *   //   "termsAndConditions": []
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
  def create(params: ParamsResourceEnterprisesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceEnterprisesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an enterprise. Only available for EMM-managed enterprises.
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
    *   const res = await androidmanagement.enterprises.delete({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     name: 'enterprises/my-enterprise',
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
  def delete(params: ParamsResourceEnterprisesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEnterprisesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var devices: ResourceEnterprisesDevices = js.native
  
  var enrollmentTokens: ResourceEnterprisesEnrollmenttokens = js.native
  
  def get(): GaxiosPromise[SchemaEnterprise] = js.native
  def get(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesGet, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Gets an enterprise.
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
    *   const res = await androidmanagement.enterprises.get({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     name: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appAutoApprovalEnabled": false,
    *   //   "contactInfo": {},
    *   //   "enabledNotificationTypes": [],
    *   //   "enterpriseDisplayName": "my_enterpriseDisplayName",
    *   //   "logo": {},
    *   //   "name": "my_name",
    *   //   "primaryColor": 0,
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "signinDetails": [],
    *   //   "termsAndConditions": []
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
  def get(params: ParamsResourceEnterprisesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEnterprisesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnterprisesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEnterprisesResponse] = js.native
  def list(params: ParamsResourceEnterprisesList): GaxiosPromise[SchemaListEnterprisesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    callback: BodyResponseCallback[SchemaListEnterprisesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: BodyResponseCallback[Readable | SchemaListEnterprisesResponse],
    callback: BodyResponseCallback[Readable | SchemaListEnterprisesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesList, options: MethodOptions): GaxiosPromise[SchemaListEnterprisesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnterprisesResponse]
  ): Unit = js.native
  /**
    * Lists EMM-managed enterprises. Only BASIC fields are returned.
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
    *   const res = await androidmanagement.enterprises.list({
    *     // The requested page size. The actual page size may be fixed to a min or max value.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // Required. The Cloud project ID of the EMM managing the enterprises.
    *     projectId: 'placeholder-value',
    *     // Specifies which Enterprise fields to return. This method only supports BASIC.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enterprises": [],
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
  def list(params: ParamsResourceEnterprisesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(params: ParamsResourceEnterprisesPatch): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(params: ParamsResourceEnterprisesPatch, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesPatch,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesPatch, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(
    params: ParamsResourceEnterprisesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Updates an enterprise.
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
    *   const res = await androidmanagement.enterprises.patch({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     name: 'enterprises/my-enterprise',
    *     // The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appAutoApprovalEnabled": false,
    *       //   "contactInfo": {},
    *       //   "enabledNotificationTypes": [],
    *       //   "enterpriseDisplayName": "my_enterpriseDisplayName",
    *       //   "logo": {},
    *       //   "name": "my_name",
    *       //   "primaryColor": 0,
    *       //   "pubsubTopic": "my_pubsubTopic",
    *       //   "signinDetails": [],
    *       //   "termsAndConditions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appAutoApprovalEnabled": false,
    *   //   "contactInfo": {},
    *   //   "enabledNotificationTypes": [],
    *   //   "enterpriseDisplayName": "my_enterpriseDisplayName",
    *   //   "logo": {},
    *   //   "name": "my_name",
    *   //   "primaryColor": 0,
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "signinDetails": [],
    *   //   "termsAndConditions": []
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
  def patch(params: ParamsResourceEnterprisesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEnterprisesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var policies: ResourceEnterprisesPolicies = js.native
  
  var webApps: ResourceEnterprisesWebapps = js.native
  
  var webTokens: ResourceEnterprisesWebtokens = js.native
}
