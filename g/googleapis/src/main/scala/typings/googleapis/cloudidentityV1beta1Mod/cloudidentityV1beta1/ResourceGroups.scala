package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Resource$Groups")
@js.native
class ResourceGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceGroupsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceGroupsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceGroupsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceGroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudidentity.groups.delete
    * @desc Deletes a Group.
    * @alias cloudidentity.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where `group_id` is the unique id assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceGroupsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudidentity.groups.get
    * @desc Retrieves a Group.
    * @alias cloudidentity.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where `group_id` is the unique id assigned to the Group.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceGroupsGet): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceGroupsGet, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def get(params: ParamsResourceGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
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
    * @param {string=} params.groupKey.id The id of the entity within the given namespace. The id must be unique within its namespace.
    * @param {string=} params.groupKey.namespace Namespaces provide isolation for ids, i.e an id only needs to be unique within its namespace.  Namespaces are currently only created as part of IdentitySource creation from Admin Console. A namespace `"identitysources/{identity_source_id}"` is created corresponding to every Identity Source `identity_source_id`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lookup(): GaxiosPromise[SchemaLookupGroupNameResponse] = js.native
  def lookup(callback: BodyResponseCallback[SchemaLookupGroupNameResponse]): Unit = js.native
  def lookup(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLookupGroupNameResponse] = js.native
  def lookup(params: ParamsResourceGroupsLookup): GaxiosPromise[SchemaLookupGroupNameResponse] = js.native
  def lookup(params: ParamsResourceGroupsLookup, callback: BodyResponseCallback[SchemaLookupGroupNameResponse]): Unit = js.native
  def lookup(
    params: ParamsResourceGroupsLookup,
    options: BodyResponseCallback[SchemaLookupGroupNameResponse],
    callback: BodyResponseCallback[SchemaLookupGroupNameResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceGroupsLookup, options: MethodOptions): GaxiosPromise[SchemaLookupGroupNameResponse] = js.native
  def lookup(
    params: ParamsResourceGroupsLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLookupGroupNameResponse]
  ): Unit = js.native
  
  var memberships: ResourceGroupsMemberships = js.native
  
  /**
    * cloudidentity.groups.patch
    * @desc Updates a Group.
    * @alias cloudidentity.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group in the format: `groups/{group_id}`, where group_id is the unique id assigned to the Group.  Must be left blank while creating a Group
    * @param {string=} params.updateMask Editable fields: `display_name`, `description`
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceGroupsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceGroupsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceGroupsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
    * @param {string=} params.query Query string for performing search on groups. Users can search on namespace and label attributes of groups. EXACT match ('=') is supported on namespace, and CONTAINS match (':') is supported on labels. This is a `required` field. Multiple queries can be combined using `AND` operator. The operator is case sensitive. An example query would be: "namespace=<namespace_value> AND labels:<labels_value>".
    * @param {string=} params.view Group resource view to be returned. Defaults to [GroupView.BASIC]().
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaSearchGroupsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchGroupsResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchGroupsResponse] = js.native
  def search(params: ParamsResourceGroupsSearch): GaxiosPromise[SchemaSearchGroupsResponse] = js.native
  def search(params: ParamsResourceGroupsSearch, callback: BodyResponseCallback[SchemaSearchGroupsResponse]): Unit = js.native
  def search(
    params: ParamsResourceGroupsSearch,
    options: BodyResponseCallback[SchemaSearchGroupsResponse],
    callback: BodyResponseCallback[SchemaSearchGroupsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceGroupsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchGroupsResponse] = js.native
  def search(
    params: ParamsResourceGroupsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchGroupsResponse]
  ): Unit = js.native
}
