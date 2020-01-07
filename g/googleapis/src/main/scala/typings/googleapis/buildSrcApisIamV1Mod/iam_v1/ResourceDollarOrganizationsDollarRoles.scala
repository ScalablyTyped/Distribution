package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Organizations$Roles")
@js.native
class ResourceDollarOrganizationsDollarRoles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.organizations.roles.create
    * @desc Creates a new Role.
    * @alias iam.organizations.roles.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The resource name of the parent resource in one of the following formats: `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    * @param {().CreateRoleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Role] = js.native
  def create(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarCreate): GaxiosPromise[Schema$Role] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarCreate,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarCreate,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * iam.organizations.roles.delete
    * @desc Soft deletes a role. The role is suspended and cannot be used to
    * create new IAM Policy Bindings. The Role will not be included in
    * `ListRoles()` unless `show_deleted` is set in the `ListRolesRequest`. The
    * Role contains the deleted boolean set. Existing Bindings remains, but are
    * inactive. The Role can be undeleted within 7 days. After 7 days the Role
    * is deleted and all Bindings associated with the role are removed.
    * @alias iam.organizations.roles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.etag Used to perform a consistent read-modify-write.
    * @param {string} params.name The resource name of the role in one of the following formats: `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Role] = js.native
  def delete(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarDelete): GaxiosPromise[Schema$Role] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarDelete,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarDelete,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * iam.organizations.roles.get
    * @desc Gets a Role definition.
    * @alias iam.organizations.roles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `roles/{ROLE_NAME}` `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Role] = js.native
  def get(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarGet): GaxiosPromise[Schema$Role] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarGet,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarGet,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * iam.organizations.roles.list
    * @desc Lists the Roles defined on a resource.
    * @alias iam.organizations.roles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of roles to include in the response.
    * @param {string=} params.pageToken Optional pagination token returned in an earlier ListRolesResponse.
    * @param {string} params.parent The resource name of the parent resource in one of the following formats: `` (empty string) -- this refers to curated roles. `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    * @param {boolean=} params.showDeleted Include Roles that have been deleted.
    * @param {string=} params.view Optional view for the returned Role objects. When `FULL` is specified, the `includedPermissions` field is returned, which includes a list of all permissions in the role. The default value is `BASIC`, which does not return the `includedPermissions` field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListRolesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarList): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarList,
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarList,
    options: BodyResponseCallback[Schema$ListRolesResponse],
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  /**
    * iam.organizations.roles.patch
    * @desc Updates a Role definition.
    * @alias iam.organizations.roles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `roles/{ROLE_NAME}` `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {string=} params.updateMask A mask describing which fields in the Role have changed.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Role] = js.native
  def patch(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarPatch): GaxiosPromise[Schema$Role] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarPatch,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarPatch,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * iam.organizations.roles.undelete
    * @desc Undelete a Role, bringing it back in its previous state.
    * @alias iam.organizations.roles.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {().UndeleteRoleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Role] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarUndelete): GaxiosPromise[Schema$Role] = js.native
  def undelete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarUndelete,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarUndelete,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def undelete(
    params: ParamsDollarResourceDollarOrganizationsDollarRolesDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
}

