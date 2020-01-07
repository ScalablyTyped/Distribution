package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Contactgroups")
@js.native
class Resource$Contactgroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var members: ResourceDollarContactgroupsDollarMembers = js.native
  /**
    * people.contactGroups.batchGet
    * @desc Get a list of contact groups owned by the authenticated user by
    * specifying a list of contact group resource names.
    * @alias people.contactGroups.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxMembers Specifies the maximum number of members to return for each group.
    * @param {string=} params.resourceNames The resource names of the contact groups to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$BatchGetContactGroupsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$BatchGetContactGroupsResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarContactgroupsDollarBatchget): GaxiosPromise[Schema$BatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarContactgroupsDollarBatchget,
    callback: BodyResponseCallback[Schema$BatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarContactgroupsDollarBatchget,
    options: BodyResponseCallback[Schema$BatchGetContactGroupsResponse],
    callback: BodyResponseCallback[Schema$BatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarContactgroupsDollarBatchget, options: MethodOptions): GaxiosPromise[Schema$BatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarContactgroupsDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetContactGroupsResponse]
  ): Unit = js.native
  /**
    * people.contactGroups.create
    * @desc Create a new contact group owned by the authenticated user.
    * @alias people.contactGroups.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateContactGroupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ContactGroup] = js.native
  def create(callback: BodyResponseCallback[Schema$ContactGroup]): Unit = js.native
  def create(params: ParamsDollarResourceDollarContactgroupsDollarCreate): GaxiosPromise[Schema$ContactGroup] = js.native
  def create(
    params: ParamsDollarResourceDollarContactgroupsDollarCreate,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarContactgroupsDollarCreate,
    options: BodyResponseCallback[Schema$ContactGroup],
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarContactgroupsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$ContactGroup] = js.native
  def create(
    params: ParamsDollarResourceDollarContactgroupsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  /**
    * people.contactGroups.delete
    * @desc Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    * @alias people.contactGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deleteContacts Set to true to also delete the contacts in the specified group.
    * @param {string} params.resourceName The resource name of the contact group to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContactgroupsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarContactgroupsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarContactgroupsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContactgroupsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarContactgroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * people.contactGroups.get
    * @desc Get a specific contact group owned by the authenticated user by
    * specifying a contact group resource name.
    * @alias people.contactGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxMembers Specifies the maximum number of members to return.
    * @param {string} params.resourceName The resource name of the contact group to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ContactGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$ContactGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarContactgroupsDollarGet): GaxiosPromise[Schema$ContactGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarContactgroupsDollarGet,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarContactgroupsDollarGet,
    options: BodyResponseCallback[Schema$ContactGroup],
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarContactgroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ContactGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarContactgroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  /**
    * people.contactGroups.list
    * @desc List all contact groups owned by the authenticated user. Members of
    * the contact groups are not populated.
    * @alias people.contactGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of resources to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous call to [ListContactGroups](/people/api/rest/v1/contactgroups/list). Requests the next page of resources.
    * @param {string=} params.syncToken A sync token, returned by a previous call to `contactgroups.list`. Only resources changed since the sync token was created will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListContactGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListContactGroupsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarContactgroupsDollarList): GaxiosPromise[Schema$ListContactGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContactgroupsDollarList,
    callback: BodyResponseCallback[Schema$ListContactGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarContactgroupsDollarList,
    options: BodyResponseCallback[Schema$ListContactGroupsResponse],
    callback: BodyResponseCallback[Schema$ListContactGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarContactgroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListContactGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContactgroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListContactGroupsResponse]
  ): Unit = js.native
  /**
    * people.contactGroups.update
    * @desc Update the name of an existing contact group owned by the
    * authenticated user.
    * @alias people.contactGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/`<var>contact_group_id</var>.
    * @param {().UpdateContactGroupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ContactGroup] = js.native
  def update(callback: BodyResponseCallback[Schema$ContactGroup]): Unit = js.native
  def update(params: ParamsDollarResourceDollarContactgroupsDollarUpdate): GaxiosPromise[Schema$ContactGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarContactgroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarContactgroupsDollarUpdate,
    options: BodyResponseCallback[Schema$ContactGroup],
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarContactgroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ContactGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarContactgroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContactGroup]
  ): Unit = js.native
}

