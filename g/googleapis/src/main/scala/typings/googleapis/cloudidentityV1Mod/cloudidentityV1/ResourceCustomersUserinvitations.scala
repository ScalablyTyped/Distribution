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

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Customers$Userinvitations")
@js.native
open class ResourceCustomersUserinvitations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaOperation] = js.native
  def cancel(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancel(params: ParamsResourceCustomersUserinvitationsCancel): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceCustomersUserinvitationsCancel,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceCustomersUserinvitationsCancel,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def cancel(params: ParamsResourceCustomersUserinvitationsCancel, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceCustomersUserinvitationsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Cancels a UserInvitation that was already sent.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-identity.userinvitations'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.customers.userinvitations.cancel({
    *     // Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    *     name: 'customers/my-customer/userinvitations/my-userinvitation',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def cancel(params: ParamsResourceCustomersUserinvitationsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceCustomersUserinvitationsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaUserInvitation] = js.native
  def get(callback: BodyResponseCallback[SchemaUserInvitation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserInvitation] = js.native
  def get(params: ParamsResourceCustomersUserinvitationsGet): GaxiosPromise[SchemaUserInvitation] = js.native
  def get(
    params: ParamsResourceCustomersUserinvitationsGet,
    callback: BodyResponseCallback[SchemaUserInvitation]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersUserinvitationsGet,
    options: BodyResponseCallback[Readable | SchemaUserInvitation],
    callback: BodyResponseCallback[Readable | SchemaUserInvitation]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersUserinvitationsGet, options: MethodOptions): GaxiosPromise[SchemaUserInvitation] = js.native
  def get(
    params: ParamsResourceCustomersUserinvitationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserInvitation]
  ): Unit = js.native
  /**
    * Retrieves a UserInvitation resource. **Note:** New consumer accounts with the customer's verified domain created within the previous 48 hours will not appear in the result. This delay also applies to newly-verified domains.
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
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations',
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.customers.userinvitations.get({
    *     // Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    *     name: 'customers/my-customer/userinvitations/my-userinvitation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mailsSentCount": "my_mailsSentCount",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceCustomersUserinvitationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersUserinvitationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def isInvitableUser(): GaxiosPromise[SchemaIsInvitableUserResponse] = js.native
  def isInvitableUser(callback: BodyResponseCallback[SchemaIsInvitableUserResponse]): Unit = js.native
  def isInvitableUser(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIsInvitableUserResponse] = js.native
  def isInvitableUser(params: ParamsResourceCustomersUserinvitationsIsinvitableuser): GaxiosPromise[SchemaIsInvitableUserResponse] = js.native
  def isInvitableUser(
    params: ParamsResourceCustomersUserinvitationsIsinvitableuser,
    callback: BodyResponseCallback[SchemaIsInvitableUserResponse]
  ): Unit = js.native
  def isInvitableUser(
    params: ParamsResourceCustomersUserinvitationsIsinvitableuser,
    options: BodyResponseCallback[Readable | SchemaIsInvitableUserResponse],
    callback: BodyResponseCallback[Readable | SchemaIsInvitableUserResponse]
  ): Unit = js.native
  def isInvitableUser(params: ParamsResourceCustomersUserinvitationsIsinvitableuser, options: MethodOptions): GaxiosPromise[SchemaIsInvitableUserResponse] = js.native
  def isInvitableUser(
    params: ParamsResourceCustomersUserinvitationsIsinvitableuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIsInvitableUserResponse]
  ): Unit = js.native
  /**
    * Verifies whether a user account is eligible to receive a UserInvitation (is an unmanaged account). Eligibility is based on the following criteria: * the email address is a consumer account and it's the primary email address of the account, and * the domain of the email address matches an existing verified Google Workspace or Cloud Identity domain If both conditions are met, the user is eligible. **Note:** This method is not supported for Workspace Essentials customers.
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
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations',
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.customers.userinvitations.isInvitableUser({
    *     // Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    *     name: 'customers/my-customer/userinvitations/my-userinvitation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "isInvitableUser": false
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
  def isInvitableUser(params: ParamsResourceCustomersUserinvitationsIsinvitableuser, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def isInvitableUser(
    params: ParamsResourceCustomersUserinvitationsIsinvitableuser,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUserInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserInvitationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserInvitationsResponse] = js.native
  def list(params: ParamsResourceCustomersUserinvitationsList): GaxiosPromise[SchemaListUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersUserinvitationsList,
    callback: BodyResponseCallback[SchemaListUserInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersUserinvitationsList,
    options: BodyResponseCallback[Readable | SchemaListUserInvitationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUserInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersUserinvitationsList, options: MethodOptions): GaxiosPromise[SchemaListUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersUserinvitationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserInvitationsResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of UserInvitation resources. **Note:** New consumer accounts with the customer's verified domain created within the previous 48 hours will not appear in the result. This delay also applies to newly-verified domains.
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
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations',
    *       'https://www.googleapis.com/auth/cloud-identity.userinvitations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.customers.userinvitations.list({
    *     // Optional. A query string for filtering `UserInvitation` results by their current state, in the format: `"state=='invited'"`.
    *     filter: 'placeholder-value',
    *     // Optional. The sort order of the list results. You can sort the results in descending order based on either email or last update timestamp but not both, using `order_by="email desc"`. Currently, sorting is supported for `update_time asc`, `update_time desc`, `email asc`, and `email desc`. If not specified, results will be returned based on `email asc` order.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of UserInvitation resources to return. If unspecified, at most 100 resources will be returned. The maximum value is 200; values above 200 will be set to 200.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListUserInvitations` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBooks` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The customer ID of the Google Workspace or Cloud Identity account the UserInvitation resources are associated with.
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userInvitations": []
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
  def list(params: ParamsResourceCustomersUserinvitationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersUserinvitationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def send(): GaxiosPromise[SchemaOperation] = js.native
  def send(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def send(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def send(params: ParamsResourceCustomersUserinvitationsSend): GaxiosPromise[SchemaOperation] = js.native
  def send(
    params: ParamsResourceCustomersUserinvitationsSend,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def send(
    params: ParamsResourceCustomersUserinvitationsSend,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def send(params: ParamsResourceCustomersUserinvitationsSend, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def send(
    params: ParamsResourceCustomersUserinvitationsSend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sends a UserInvitation to email. If the `UserInvitation` does not exist for this request and it is a valid request, the request creates a `UserInvitation`. **Note:** The `get` and `list` methods have a 48-hour delay where newly-created consumer accounts will not appear in the results. You can still send a `UserInvitation` to those accounts if you know the unmanaged email address and IsInvitableUser==True.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-identity.userinvitations'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.customers.userinvitations.send({
    *     // Required. `UserInvitation` name in the format `customers/{customer\}/userinvitations/{user_email_address\}`
    *     name: 'customers/my-customer/userinvitations/my-userinvitation',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def send(params: ParamsResourceCustomersUserinvitationsSend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def send(
    params: ParamsResourceCustomersUserinvitationsSend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
