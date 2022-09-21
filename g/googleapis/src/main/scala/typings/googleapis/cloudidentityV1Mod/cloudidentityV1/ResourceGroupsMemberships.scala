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

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Groups$Memberships")
@js.native
open class ResourceGroupsMemberships protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def checkTransitiveMembership(): GaxiosPromise[SchemaCheckTransitiveMembershipResponse] = js.native
  def checkTransitiveMembership(callback: BodyResponseCallback[SchemaCheckTransitiveMembershipResponse]): Unit = js.native
  def checkTransitiveMembership(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckTransitiveMembershipResponse] = js.native
  def checkTransitiveMembership(params: ParamsResourceGroupsMembershipsChecktransitivemembership): GaxiosPromise[SchemaCheckTransitiveMembershipResponse] = js.native
  def checkTransitiveMembership(
    params: ParamsResourceGroupsMembershipsChecktransitivemembership,
    callback: BodyResponseCallback[SchemaCheckTransitiveMembershipResponse]
  ): Unit = js.native
  def checkTransitiveMembership(
    params: ParamsResourceGroupsMembershipsChecktransitivemembership,
    options: BodyResponseCallback[Readable | SchemaCheckTransitiveMembershipResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckTransitiveMembershipResponse]
  ): Unit = js.native
  def checkTransitiveMembership(params: ParamsResourceGroupsMembershipsChecktransitivemembership, options: MethodOptions): GaxiosPromise[SchemaCheckTransitiveMembershipResponse] = js.native
  def checkTransitiveMembership(
    params: ParamsResourceGroupsMembershipsChecktransitivemembership,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckTransitiveMembershipResponse]
  ): Unit = js.native
  /**
    * Check a potential member for membership in a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A member has membership to a group as long as there is a single viewable transitive membership between the group and the member. The actor must have view permissions to at least one transitive membership between the member and group.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.checkTransitiveMembership({
    *     // [Resource name](https://cloud.google.com/apis/design/resource_names) of the group to check the transitive membership in. Format: `groups/{group\}`, where `group` is the unique id assigned to the Group to which the Membership belongs to.
    *     parent: 'groups/my-group',
    *     // Required. A CEL expression that MUST include member specification. This is a `required` field. Certain groups are uniquely identified by both a 'member_key_id' and a 'member_key_namespace', which requires an additional query input: 'member_key_namespace'. Example query: `member_key_id == 'member_key_id_value'`
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasMembership": false
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
  def checkTransitiveMembership(params: ParamsResourceGroupsMembershipsChecktransitivemembership, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkTransitiveMembership(
    params: ParamsResourceGroupsMembershipsChecktransitivemembership,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceGroupsMembershipsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceGroupsMembershipsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a `Membership`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.create({
    *     // Required. The parent `Group` resource under which to create the `Membership`. Must be of the form `groups/{group\}`.
    *     parent: 'groups/my-group',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "preferredMemberKey": {},
    *       //   "roles": [],
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceGroupsMembershipsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceGroupsMembershipsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsMembershipsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceGroupsMembershipsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a `Membership`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.delete({
    *     // Required. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership` to delete. Must be of the form `groups/{group\}/memberships/{membership\}`
    *     name: 'groups/my-group/memberships/my-membership',
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
  def delete(params: ParamsResourceGroupsMembershipsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceGroupsMembershipsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMembership] = js.native
  def get(callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceGroupsMembershipsGet): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceGroupsMembershipsGet, callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(
    params: ParamsResourceGroupsMembershipsGet,
    options: BodyResponseCallback[Readable | SchemaMembership],
    callback: BodyResponseCallback[Readable | SchemaMembership]
  ): Unit = js.native
  def get(params: ParamsResourceGroupsMembershipsGet, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(
    params: ParamsResourceGroupsMembershipsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembership]
  ): Unit = js.native
  /**
    * Retrieves a `Membership`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.get({
    *     // Required. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership` to retrieve. Must be of the form `groups/{group\}/memberships/{membership\}`.
    *     name: 'groups/my-group/memberships/my-membership',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "preferredMemberKey": {},
    *   //   "roles": [],
    *   //   "type": "my_type",
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
  def get(params: ParamsResourceGroupsMembershipsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceGroupsMembershipsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getMembershipGraph(): GaxiosPromise[SchemaOperation] = js.native
  def getMembershipGraph(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def getMembershipGraph(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def getMembershipGraph(params: ParamsResourceGroupsMembershipsGetmembershipgraph): GaxiosPromise[SchemaOperation] = js.native
  def getMembershipGraph(
    params: ParamsResourceGroupsMembershipsGetmembershipgraph,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def getMembershipGraph(
    params: ParamsResourceGroupsMembershipsGetmembershipgraph,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def getMembershipGraph(params: ParamsResourceGroupsMembershipsGetmembershipgraph, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def getMembershipGraph(
    params: ParamsResourceGroupsMembershipsGetmembershipgraph,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Get a membership graph of just a member or both a member and a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. Given a member, the response will contain all membership paths from the member. Given both a group and a member, the response will contain all membership paths between the group and the member.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.getMembershipGraph({
    *     // Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the group to search transitive memberships in. Format: `groups/{group\}`, where `group` is the unique ID assigned to the Group to which the Membership belongs to. group can be a wildcard collection id "-". When a group is specified, the membership graph will be constrained to paths between the member (defined in the query) and the parent. If a wildcard collection is provided, all membership paths connected to the member will be returned.
    *     parent: 'groups/my-group',
    *     // Required. A CEL expression that MUST include member specification AND label(s). Certain groups are uniquely identified by both a 'member_key_id' and a 'member_key_namespace', which requires an additional query input: 'member_key_namespace'. Example query: `member_key_id == 'member_key_id_value' && in labels`
    *     query: 'placeholder-value',
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
  def getMembershipGraph(params: ParamsResourceGroupsMembershipsGetmembershipgraph, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMembershipGraph(
    params: ParamsResourceGroupsMembershipsGetmembershipgraph,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMembershipsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(params: ParamsResourceGroupsMembershipsList): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceGroupsMembershipsList,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGroupsMembershipsList,
    options: BodyResponseCallback[Readable | SchemaListMembershipsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsMembershipsList, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceGroupsMembershipsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  /**
    * Lists the `Membership`s within a `Group`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.list({
    *     // The maximum number of results to return. Note that the number of results returned may be less than this value even if there are more available results. To fetch all results, clients must continue calling this method repeatedly until the response no longer contains a `next_page_token`. If unspecified, defaults to 200 for `GroupView.BASIC` and to 50 for `GroupView.FULL`. Must not be greater than 1000 for `GroupView.BASIC` or 500 for `GroupView.FULL`.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous search request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent `Group` resource under which to lookup the `Membership` name. Must be of the form `groups/{group\}`.
    *     parent: 'groups/my-group',
    *     // The level of detail to be returned. If unspecified, defaults to `View.BASIC`.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "memberships": [],
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
  def list(params: ParamsResourceGroupsMembershipsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGroupsMembershipsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def lookup(): GaxiosPromise[SchemaLookupMembershipNameResponse] = js.native
  def lookup(callback: BodyResponseCallback[SchemaLookupMembershipNameResponse]): Unit = js.native
  def lookup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLookupMembershipNameResponse] = js.native
  def lookup(params: ParamsResourceGroupsMembershipsLookup): GaxiosPromise[SchemaLookupMembershipNameResponse] = js.native
  def lookup(
    params: ParamsResourceGroupsMembershipsLookup,
    callback: BodyResponseCallback[SchemaLookupMembershipNameResponse]
  ): Unit = js.native
  def lookup(
    params: ParamsResourceGroupsMembershipsLookup,
    options: BodyResponseCallback[Readable | SchemaLookupMembershipNameResponse],
    callback: BodyResponseCallback[Readable | SchemaLookupMembershipNameResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceGroupsMembershipsLookup, options: MethodOptions): GaxiosPromise[SchemaLookupMembershipNameResponse] = js.native
  def lookup(
    params: ParamsResourceGroupsMembershipsLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLookupMembershipNameResponse]
  ): Unit = js.native
  /**
    * Looks up the [resource name](https://cloud.google.com/apis/design/resource_names) of a `Membership` by its `EntityKey`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.lookup({
    *     // The ID of the entity. For Google-managed entities, the `id` should be the email address of an existing group or user. For external-identity-mapped entities, the `id` must be a string conforming to the Identity Source's requirements. Must be unique within a `namespace`.
    *     'memberKey.id': 'placeholder-value',
    *     // The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source\}`.
    *     'memberKey.namespace': 'placeholder-value',
    *     // Required. The parent `Group` resource under which to lookup the `Membership` name. Must be of the form `groups/{group\}`.
    *     parent: 'groups/my-group',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name"
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
  def lookup(params: ParamsResourceGroupsMembershipsLookup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookup(
    params: ParamsResourceGroupsMembershipsLookup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyMembershipRoles(): GaxiosPromise[SchemaModifyMembershipRolesResponse] = js.native
  def modifyMembershipRoles(callback: BodyResponseCallback[SchemaModifyMembershipRolesResponse]): Unit = js.native
  def modifyMembershipRoles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModifyMembershipRolesResponse] = js.native
  def modifyMembershipRoles(params: ParamsResourceGroupsMembershipsModifymembershiproles): GaxiosPromise[SchemaModifyMembershipRolesResponse] = js.native
  def modifyMembershipRoles(
    params: ParamsResourceGroupsMembershipsModifymembershiproles,
    callback: BodyResponseCallback[SchemaModifyMembershipRolesResponse]
  ): Unit = js.native
  def modifyMembershipRoles(
    params: ParamsResourceGroupsMembershipsModifymembershiproles,
    options: BodyResponseCallback[Readable | SchemaModifyMembershipRolesResponse],
    callback: BodyResponseCallback[Readable | SchemaModifyMembershipRolesResponse]
  ): Unit = js.native
  def modifyMembershipRoles(params: ParamsResourceGroupsMembershipsModifymembershiproles, options: MethodOptions): GaxiosPromise[SchemaModifyMembershipRolesResponse] = js.native
  def modifyMembershipRoles(
    params: ParamsResourceGroupsMembershipsModifymembershiproles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModifyMembershipRolesResponse]
  ): Unit = js.native
  /**
    * Modifies the `MembershipRole`s of a `Membership`.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.modifyMembershipRoles({
    *     // Required. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership` whose roles are to be modified. Must be of the form `groups/{group\}/memberships/{membership\}`.
    *     name: 'groups/my-group/memberships/my-membership',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addRoles": [],
    *       //   "removeRoles": [],
    *       //   "updateRolesParams": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "membership": {}
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
  def modifyMembershipRoles(params: ParamsResourceGroupsMembershipsModifymembershiproles, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyMembershipRoles(
    params: ParamsResourceGroupsMembershipsModifymembershiproles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchTransitiveGroups(): GaxiosPromise[SchemaSearchTransitiveGroupsResponse] = js.native
  def searchTransitiveGroups(callback: BodyResponseCallback[SchemaSearchTransitiveGroupsResponse]): Unit = js.native
  def searchTransitiveGroups(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchTransitiveGroupsResponse] = js.native
  def searchTransitiveGroups(params: ParamsResourceGroupsMembershipsSearchtransitivegroups): GaxiosPromise[SchemaSearchTransitiveGroupsResponse] = js.native
  def searchTransitiveGroups(
    params: ParamsResourceGroupsMembershipsSearchtransitivegroups,
    callback: BodyResponseCallback[SchemaSearchTransitiveGroupsResponse]
  ): Unit = js.native
  def searchTransitiveGroups(
    params: ParamsResourceGroupsMembershipsSearchtransitivegroups,
    options: BodyResponseCallback[Readable | SchemaSearchTransitiveGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchTransitiveGroupsResponse]
  ): Unit = js.native
  def searchTransitiveGroups(params: ParamsResourceGroupsMembershipsSearchtransitivegroups, options: MethodOptions): GaxiosPromise[SchemaSearchTransitiveGroupsResponse] = js.native
  def searchTransitiveGroups(
    params: ParamsResourceGroupsMembershipsSearchtransitivegroups,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchTransitiveGroupsResponse]
  ): Unit = js.native
  /**
    * Search transitive groups of a member. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud Identity Premium accounts. If the account of the member is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A transitive group is any group that has a direct or indirect membership to the member. Actor must have view permissions all transitive groups.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudidentity.groups.memberships.searchTransitiveGroups({
    *     // The default page size is 200 (max 1000).
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request, if any.
    *     pageToken: 'placeholder-value',
    *     // [Resource name](https://cloud.google.com/apis/design/resource_names) of the group to search transitive memberships in. Format: `groups/{group\}`, where `group` is always '-' as this API will search across all groups for a given member.
    *     parent: 'groups/my-group',
    *     // Required. A CEL expression that MUST include member specification AND label(s). This is a `required` field. Users can search on label attributes of groups. CONTAINS match ('in') is supported on labels. Identity-mapped groups are uniquely identified by both a `member_key_id` and a `member_key_namespace`, which requires an additional query input: `member_key_namespace`. Example query: `member_key_id == 'member_key_id_value' && in labels`
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "memberships": [],
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
  def searchTransitiveGroups(params: ParamsResourceGroupsMembershipsSearchtransitivegroups, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchTransitiveGroups(
    params: ParamsResourceGroupsMembershipsSearchtransitivegroups,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchTransitiveMemberships(): GaxiosPromise[SchemaSearchTransitiveMembershipsResponse] = js.native
  def searchTransitiveMemberships(callback: BodyResponseCallback[SchemaSearchTransitiveMembershipsResponse]): Unit = js.native
  def searchTransitiveMemberships(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchTransitiveMembershipsResponse] = js.native
  def searchTransitiveMemberships(params: ParamsResourceGroupsMembershipsSearchtransitivememberships): GaxiosPromise[SchemaSearchTransitiveMembershipsResponse] = js.native
  def searchTransitiveMemberships(
    params: ParamsResourceGroupsMembershipsSearchtransitivememberships,
    callback: BodyResponseCallback[SchemaSearchTransitiveMembershipsResponse]
  ): Unit = js.native
  def searchTransitiveMemberships(
    params: ParamsResourceGroupsMembershipsSearchtransitivememberships,
    options: BodyResponseCallback[Readable | SchemaSearchTransitiveMembershipsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchTransitiveMembershipsResponse]
  ): Unit = js.native
  def searchTransitiveMemberships(params: ParamsResourceGroupsMembershipsSearchtransitivememberships, options: MethodOptions): GaxiosPromise[SchemaSearchTransitiveMembershipsResponse] = js.native
  def searchTransitiveMemberships(
    params: ParamsResourceGroupsMembershipsSearchtransitivememberships,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchTransitiveMembershipsResponse]
  ): Unit = js.native
  /**
    * Search transitive memberships of a group. **Note:** This feature is only available to Google Workspace Enterprise Standard, Enterprise Plus, and Enterprise for Education; and Cloud Identity Premium accounts. If the account of the group is not one of these, a 403 (PERMISSION_DENIED) HTTP status code will be returned. A transitive membership is any direct or indirect membership of a group. Actor must have view permissions to all transitive memberships.
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
    *       'https://www.googleapis.com/auth/cloud-identity.groups',
    *       'https://www.googleapis.com/auth/cloud-identity.groups.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudidentity.groups.memberships.searchTransitiveMemberships({
    *       // The default page size is 200 (max 1000).
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // [Resource name](https://cloud.google.com/apis/design/resource_names) of the group to search transitive memberships in. Format: `groups/{group\}`, where `group` is the unique ID assigned to the Group.
    *       parent: 'groups/my-group',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "memberships": [],
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
  def searchTransitiveMemberships(params: ParamsResourceGroupsMembershipsSearchtransitivememberships, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchTransitiveMemberships(
    params: ParamsResourceGroupsMembershipsSearchtransitivememberships,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
