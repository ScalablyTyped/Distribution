package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Channelpartnerlinks")
@js.native
open class ResourceAccountsChannelpartnerlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channelPartnerRepricingConfigs: ResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigs = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def create(params: ParamsResourceAccountsChannelpartnerlinksCreate): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsChannelpartnerlinksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  /**
    * Initiates a channel partner link between a distributor and a reseller, or between resellers in an n-tier reseller channel. Invited partners need to follow the invite_link_uri provided in the response to accept. After accepting the invitation, a link is set up between the two parties. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * ALREADY_EXISTS: The ChannelPartnerLink sent in the request already exists. * NOT_FOUND: No Cloud Identity customer exists for provided domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The new ChannelPartnerLink resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudchannel.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudchannel = google.cloudchannel('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudchannel.accounts.channelPartnerLinks.create({
    *     // Required. Create a channel partner link for the provided reseller account's resource name. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "channelPartnerCloudIdentityInfo": {},
    *       //   "createTime": "my_createTime",
    *       //   "inviteLinkUri": "my_inviteLinkUri",
    *       //   "linkState": "my_linkState",
    *       //   "name": "my_name",
    *       //   "publicId": "my_publicId",
    *       //   "resellerCloudIdentityId": "my_resellerCloudIdentityId",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channelPartnerCloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "inviteLinkUri": "my_inviteLinkUri",
    *   //   "linkState": "my_linkState",
    *   //   "name": "my_name",
    *   //   "publicId": "my_publicId",
    *   //   "resellerCloudIdentityId": "my_resellerCloudIdentityId",
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
  def create(params: ParamsResourceAccountsChannelpartnerlinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var customers: ResourceAccountsChannelpartnerlinksCustomers = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def get(params: ParamsResourceAccountsChannelpartnerlinksGet): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksGet,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsChannelpartnerlinksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  /**
    * Returns the requested ChannelPartnerLink resource. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: ChannelPartnerLink resource not found because of an invalid channel partner link name. Return value: The ChannelPartnerLink resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudchannel.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudchannel = google.cloudchannel('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudchannel.accounts.channelPartnerLinks.get({
    *     // Required. The resource name of the channel partner link to retrieve. Name uses the format: accounts/{account_id\}/channelPartnerLinks/{id\} where {id\} is the Cloud Identity ID of the partner.
    *     name: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink',
    *     // Optional. The level of granularity the ChannelPartnerLink will display.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channelPartnerCloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "inviteLinkUri": "my_inviteLinkUri",
    *   //   "linkState": "my_linkState",
    *   //   "name": "my_name",
    *   //   "publicId": "my_publicId",
    *   //   "resellerCloudIdentityId": "my_resellerCloudIdentityId",
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
  def get(params: ParamsResourceAccountsChannelpartnerlinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse] = js.native
  def list(params: ParamsResourceAccountsChannelpartnerlinksList): GaxiosPromise[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsChannelpartnerlinksList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListChannelPartnerLinksResponse]
  ): Unit = js.native
  /**
    * List ChannelPartnerLinks belonging to a distributor. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: The list of the distributor account's ChannelPartnerLink resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudchannel.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudchannel = google.cloudchannel('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudchannel.accounts.channelPartnerLinks.list({
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, server will pick a default size (25). The maximum value is 200; the server will coerce values above 200.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page. Obtained using ListChannelPartnerLinksResponse.next_page_token of the previous CloudChannelService.ListChannelPartnerLinks call.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the reseller account for listing channel partner links. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *     // Optional. The level of granularity the ChannelPartnerLink will display.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channelPartnerLinks": [],
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
  def list(params: ParamsResourceAccountsChannelpartnerlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def patch(params: ParamsResourceAccountsChannelpartnerlinksPatch): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsChannelpartnerlinksPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ChannelPartnerLink] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ChannelPartnerLink]
  ): Unit = js.native
  /**
    * Updates a channel partner link. Distributors call this method to change a link's status. For example, to suspend a partner link. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Link state cannot change from invited to active or suspended. * Cannot send reseller_cloud_identity_id, invite_url, or name in update mask. * NOT_FOUND: ChannelPartnerLink resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The updated ChannelPartnerLink resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudchannel.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudchannel = google.cloudchannel('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudchannel.accounts.channelPartnerLinks.patch({
    *     // Required. The resource name of the channel partner link to cancel. Name uses the format: accounts/{account_id\}/channelPartnerLinks/{id\} where {id\} is the Cloud Identity ID of the partner.
    *     name: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "channelPartnerLink": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channelPartnerCloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "inviteLinkUri": "my_inviteLinkUri",
    *   //   "linkState": "my_linkState",
    *   //   "name": "my_name",
    *   //   "publicId": "my_publicId",
    *   //   "resellerCloudIdentityId": "my_resellerCloudIdentityId",
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
  def patch(params: ParamsResourceAccountsChannelpartnerlinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
