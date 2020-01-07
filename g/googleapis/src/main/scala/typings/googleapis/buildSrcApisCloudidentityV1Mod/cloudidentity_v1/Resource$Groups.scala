package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Resource$Groups")
@js.native
class Resource$Groups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var memberships: ResourceDollarGroupsDollarMemberships = js.native
  /**
    * cloudidentity.groups.create
    * @desc Creates a Group.
    * @alias cloudidentity.groups.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarGroupsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarGroupsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarGroupsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudidentity.groups.delete
    * @desc Deletes a Group.
    * @alias cloudidentity.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where `group_id` is the unique ID assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudidentity.groups.get
    * @desc Retrieves a Group.
    * @alias cloudidentity.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where `group_id` is the unique ID assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Group] = js.native
  def get(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet): GaxiosPromise[Schema$Group] = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  /**
    * cloudidentity.groups.list
    * @desc List groups within a customer or a domain.
    * @alias cloudidentity.groups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The default page size is 200 (max 1000) for the BASIC view, and 50 (max 500) for the FULL view.
    * @param {string=} params.pageToken The next_page_token value returned from a previous list request, if any.
    * @param {string=} params.parent `Required`. May be made Optional in the future. Customer ID to list all groups from.
    * @param {string=} params.view Group resource view to be returned. Defaults to [View.BASIC]().
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListGroupsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: BodyResponseCallback[Schema$ListGroupsResponse],
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  /**
    * cloudidentity.groups.lookup
    * @desc Looks up [resource
    * name](https://cloud.google.com/apis/design/resource_names) of a Group by
    * its EntityKey.
    * @alias cloudidentity.groups.lookup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.groupKey.id The ID of the entity within the given namespace. The ID must be unique within its namespace.
    * @param {string=} params.groupKey.namespace Namespaces provide isolation for IDs, so an ID only needs to be unique within its namespace.  Namespaces are currently only created as part of IdentitySource creation from Admin Console. A namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity Source `identity_source_id`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lookup(): GaxiosPromise[Schema$LookupGroupNameResponse] = js.native
  def lookup(callback: BodyResponseCallback[Schema$LookupGroupNameResponse]): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarGroupsDollarLookup): GaxiosPromise[Schema$LookupGroupNameResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarLookup,
    callback: BodyResponseCallback[Schema$LookupGroupNameResponse]
  ): Unit = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarLookup,
    options: BodyResponseCallback[Schema$LookupGroupNameResponse],
    callback: BodyResponseCallback[Schema$LookupGroupNameResponse]
  ): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarGroupsDollarLookup, options: MethodOptions): GaxiosPromise[Schema$LookupGroupNameResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarGroupsDollarLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LookupGroupNameResponse]
  ): Unit = js.native
  /**
    * cloudidentity.groups.patch
    * @desc Updates a Group.
    * @alias cloudidentity.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where group_id is the unique ID assigned to the Group.  Must be left blank while creating a Group.
    * @param {string=} params.updateMask Editable fields: `display_name`, `description`
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudidentity.groups.search
    * @desc Searches for Groups.
    * @alias cloudidentity.groups.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The default page size is 200 (max 1000) for the BASIC view, and 50 (max 500) for the FULL view.
    * @param {string=} params.pageToken The next_page_token value returned from a previous search request, if any.
    * @param {string=} params.query `Required`. Query string for performing search on groups. Users can search on parent and label attributes of groups. EXACT match ('==') is supported on parent, and CONTAINS match ('in') is supported on labels.
    * @param {string=} params.view Group resource view to be returned. Defaults to [View.BASIC]().
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchGroupsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchGroupsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarGroupsDollarSearch): GaxiosPromise[Schema$SearchGroupsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarGroupsDollarSearch,
    callback: BodyResponseCallback[Schema$SearchGroupsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarGroupsDollarSearch,
    options: BodyResponseCallback[Schema$SearchGroupsResponse],
    callback: BodyResponseCallback[Schema$SearchGroupsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarGroupsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchGroupsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarGroupsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchGroupsResponse]
  ): Unit = js.native
}

