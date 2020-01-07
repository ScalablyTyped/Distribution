package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Groups$Memberships")
@js.native
class ResourceDollarGroupsDollarMemberships protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudidentity.groups.memberships.create
    * @desc Creates a Membership.
    * @alias cloudidentity.groups.memberships.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to create Membership within. Format: `groups/{group_id}`, where `group_id` is the unique ID assigned to the Group.
    * @param {().Membership} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudidentity.groups.memberships.delete
    * @desc Deletes a Membership.
    * @alias cloudidentity.groups.memberships.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership to be deleted.  Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique ID assigned to the Group to which Membership belongs to, and member_id is the unique ID assigned to the member.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudidentity.groups.memberships.get
    * @desc Retrieves a Membership.
    * @alias cloudidentity.groups.memberships.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership to be retrieved.  Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique id assigned to the Group to which Membership belongs to, and `member_id` is the unique ID assigned to the member.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Membership] = js.native
  def get(callback: BodyResponseCallback[Schema$Membership]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarGet): GaxiosPromise[Schema$Membership] = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarGet,
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarGet,
    options: BodyResponseCallback[Schema$Membership],
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Membership] = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  /**
    * cloudidentity.groups.memberships.list
    * @desc List Memberships within a Group.
    * @alias cloudidentity.groups.memberships.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The default page size is 200 (max 1000) for the BASIC view, and 50 (max 500) for the FULL view.
    * @param {string=} params.pageToken The next_page_token value returned from a previous list request, if any.
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to list Memberships within.  Format: `groups/{group_id}`, where `group_id` is the unique ID assigned to the Group.
    * @param {string=} params.view Membership resource view to be returned. Defaults to View.BASIC.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMembershipsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarList): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarList,
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarList,
    options: BodyResponseCallback[Schema$ListMembershipsResponse],
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
  /**
    * cloudidentity.groups.memberships.lookup
    * @desc Looks up [resource
    * name](https://cloud.google.com/apis/design/resource_names) of a
    * Membership within a Group by member's EntityKey.
    * @alias cloudidentity.groups.memberships.lookup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.memberKey.id The ID of the entity within the given namespace. The ID must be unique within its namespace.
    * @param {string=} params.memberKey.namespace Namespaces provide isolation for IDs, so an ID only needs to be unique within its namespace.  Namespaces are currently only created as part of IdentitySource creation from Admin Console. A namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity Source `identity_source_id`.
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to lookup Membership within.  Format: `groups/{group_id}`, where `group_id` is the unique ID assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lookup(): GaxiosPromise[Schema$LookupMembershipNameResponse] = js.native
  def lookup(callback: BodyResponseCallback[Schema$LookupMembershipNameResponse]): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarLookup): GaxiosPromise[Schema$LookupMembershipNameResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarLookup,
    callback: BodyResponseCallback[Schema$LookupMembershipNameResponse]
  ): Unit = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarLookup,
    options: BodyResponseCallback[Schema$LookupMembershipNameResponse],
    callback: BodyResponseCallback[Schema$LookupMembershipNameResponse]
  ): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarLookup, options: MethodOptions): GaxiosPromise[Schema$LookupMembershipNameResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarMembershipsDollarLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LookupMembershipNameResponse]
  ): Unit = js.native
}

