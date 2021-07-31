package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Resource$Groups$Memberships")
@js.native
class ResourceGroupsMemberships protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudidentity.groups.memberships.create
    * @desc Creates a Membership.
    * @alias cloudidentity.groups.memberships.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to create Membership within. Format: `groups/{group_id}`, where `group_id` is the unique id assigned to the Group.
    * @param {().Membership} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceGroupsMembershipsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceGroupsMembershipsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceGroupsMembershipsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudidentity.groups.memberships.delete
    * @desc Deletes a Membership.
    * @alias cloudidentity.groups.memberships.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership to be deleted.  Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique id assigned to the Group to which Membership belongs to, and member_id is the unique id assigned to the member.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsMembershipsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsMembershipsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceGroupsMembershipsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudidentity.groups.memberships.get
    * @desc Retrieves a Membership.
    * @alias cloudidentity.groups.memberships.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership to be retrieved.  Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique id assigned to the Group to which Membership belongs to, and `member_id` is the unique id assigned to the member.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMembership] = js.native
  def get(callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceGroupsMembershipsGet): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceGroupsMembershipsGet, callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(
    params: ParamsResourceGroupsMembershipsGet,
    options: BodyResponseCallback[SchemaMembership],
    callback: BodyResponseCallback[SchemaMembership]
  ): Unit = js.native
  def get(params: ParamsResourceGroupsMembershipsGet, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(
    params: ParamsResourceGroupsMembershipsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembership]
  ): Unit = js.native
  
  /**
    * cloudidentity.groups.memberships.list
    * @desc List Memberships within a Group.
    * @alias cloudidentity.groups.memberships.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The default page size is 200 (max 1000) for the BASIC view, and 50 (max 500) for the FULL view.
    * @param {string=} params.pageToken The next_page_token value returned from a previous list request, if any
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to list Memberships within.  Format: `groups/{group_id}`, where `group_id` is the unique id assigned to the Group.
    * @param {string=} params.view Membership resource view to be returned. Defaults to MembershipView.BASIC.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaListMembershipsResponse],
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsMembershipsList, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceGroupsMembershipsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
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
    * @param {string=} params.memberKey.id The id of the entity within the given namespace. The id must be unique within its namespace.
    * @param {string=} params.memberKey.namespace Namespaces provide isolation for ids, i.e an id only needs to be unique within its namespace.  Namespaces are currently only created as part of IdentitySource creation from Admin Console. A namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity Source `identity_source_id`.
    * @param {string} params.parent [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group to lookup Membership within.  Format: `groups/{group_id}`, where `group_id` is the unique id assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaLookupMembershipNameResponse],
    callback: BodyResponseCallback[SchemaLookupMembershipNameResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceGroupsMembershipsLookup, options: MethodOptions): GaxiosPromise[SchemaLookupMembershipNameResponse] = js.native
  def lookup(
    params: ParamsResourceGroupsMembershipsLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLookupMembershipNameResponse]
  ): Unit = js.native
}
