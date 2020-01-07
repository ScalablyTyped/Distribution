package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Roles")
@js.native
class Resource$Roles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.roles.get
    * @desc Gets a Role definition.
    * @alias iam.roles.get
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
  def get(params: ParamsDollarResourceDollarRolesDollarGet): GaxiosPromise[Schema$Role] = js.native
  def get(params: ParamsDollarResourceDollarRolesDollarGet, callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRolesDollarGet,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRolesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def get(
    params: ParamsDollarResourceDollarRolesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * iam.roles.list
    * @desc Lists the Roles defined on a resource.
    * @alias iam.roles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of roles to include in the response.
    * @param {string=} params.pageToken Optional pagination token returned in an earlier ListRolesResponse.
    * @param {string=} params.parent The resource name of the parent resource in one of the following formats: `` (empty string) -- this refers to curated roles. `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    * @param {boolean=} params.showDeleted Include Roles that have been deleted.
    * @param {string=} params.view Optional view for the returned Role objects. When `FULL` is specified, the `includedPermissions` field is returned, which includes a list of all permissions in the role. The default value is `BASIC`, which does not return the `includedPermissions` field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListRolesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRolesDollarList): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRolesDollarList,
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRolesDollarList,
    options: BodyResponseCallback[Schema$ListRolesResponse],
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRolesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListRolesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRolesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListRolesResponse]
  ): Unit = js.native
  /**
    * iam.roles.queryGrantableRoles
    * @desc Queries roles that can be granted on a particular resource. A role
    * is grantable if it can be used as the role in a binding for a policy for
    * that resource.
    * @alias iam.roles.queryGrantableRoles
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryGrantableRolesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def queryGrantableRoles(): GaxiosPromise[Schema$QueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(callback: BodyResponseCallback[Schema$QueryGrantableRolesResponse]): Unit = js.native
  def queryGrantableRoles(params: ParamsDollarResourceDollarRolesDollarQuerygrantableroles): GaxiosPromise[Schema$QueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(
    params: ParamsDollarResourceDollarRolesDollarQuerygrantableroles,
    callback: BodyResponseCallback[Schema$QueryGrantableRolesResponse]
  ): Unit = js.native
  def queryGrantableRoles(
    params: ParamsDollarResourceDollarRolesDollarQuerygrantableroles,
    options: BodyResponseCallback[Schema$QueryGrantableRolesResponse],
    callback: BodyResponseCallback[Schema$QueryGrantableRolesResponse]
  ): Unit = js.native
  def queryGrantableRoles(params: ParamsDollarResourceDollarRolesDollarQuerygrantableroles, options: MethodOptions): GaxiosPromise[Schema$QueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(
    params: ParamsDollarResourceDollarRolesDollarQuerygrantableroles,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$QueryGrantableRolesResponse]
  ): Unit = js.native
}

