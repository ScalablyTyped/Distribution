package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Projects$Serviceaccounts")
@js.native
class ResourceDollarProjectsDollarServiceaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var keys: ResourceDollarProjectsDollarServiceaccountsDollarKeys = js.native
  /**
    * iam.projects.serviceAccounts.create
    * @desc Creates a ServiceAccount and returns it.
    * @alias iam.projects.serviceAccounts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the project associated with the service accounts, such as `projects/my-project-123`.
    * @param {().CreateServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ServiceAccount] = js.native
  def create(callback: BodyResponseCallback[Schema$ServiceAccount]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarCreate): GaxiosPromise[Schema$ServiceAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarCreate,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarCreate,
    options: BodyResponseCallback[Schema$ServiceAccount],
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServiceAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.delete
    * @desc Deletes a ServiceAccount.
    * @alias iam.projects.serviceAccounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.disable
    * @desc Disables a ServiceAccount. The API is currently in alpha phase.
    * @alias iam.projects.serviceAccounts.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().DisableServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[Schema$Empty] = js.native
  def disable(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def disable(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDisable): GaxiosPromise[Schema$Empty] = js.native
  def disable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDisable,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def disable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDisable,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def disable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDisable,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def disable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.enable
    * @desc Enables a ServiceAccount.  The API is currently in alpha phase.
    * @alias iam.projects.serviceAccounts.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_UNIQUE_ID}'. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account.
    * @param {().EnableServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[Schema$Empty] = js.native
  def enable(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def enable(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarEnable): GaxiosPromise[Schema$Empty] = js.native
  def enable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarEnable,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def enable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarEnable,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def enable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarEnable,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def enable(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.get
    * @desc Gets a ServiceAccount.
    * @alias iam.projects.serviceAccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(callback: BodyResponseCallback[Schema$ServiceAccount]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGet): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGet,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGet,
    options: BodyResponseCallback[Schema$ServiceAccount],
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.getIamPolicy
    * @desc Returns the Cloud IAM access control policy for a ServiceAccount.
    * Note: Service accounts are both [resources and
    * identities](/iam/docs/service-accounts#service_account_permissions). This
    * method treats the service account as a resource. It returns the Cloud IAM
    * policy that reflects what members have access to the service account.
    * This method does not return what resources the service account has access
    * to. To see if a service account has access to a resource, call the
    * `getIamPolicy` method on the target resource. For example, to view grants
    * for a project, call the
    * [projects.getIamPolicy](/resource-manager/reference/rest/v1/projects/getIamPolicy)
    * method.
    * @alias iam.projects.serviceAccounts.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.list
    * @desc Lists ServiceAccounts for a project.
    * @alias iam.projects.serviceAccounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the project associated with the service accounts, such as `projects/my-project-123`.
    * @param {integer=} params.pageSize Optional limit on the number of service accounts to include in the response. Further accounts can subsequently be obtained by including the ListServiceAccountsResponse.next_page_token in a subsequent request.
    * @param {string=} params.pageToken Optional pagination token returned in an earlier ListServiceAccountsResponse.next_page_token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServiceAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServiceAccountsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarList): GaxiosPromise[Schema$ListServiceAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarList,
    callback: BodyResponseCallback[Schema$ListServiceAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarList,
    options: BodyResponseCallback[Schema$ListServiceAccountsResponse],
    callback: BodyResponseCallback[Schema$ListServiceAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServiceAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServiceAccountsResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.patch
    * @desc Patches a ServiceAccount.  Currently, only the following fields are
    * updatable: `display_name` and `description`.  Only fields specified in
    * the request are guaranteed to be returned in the response. Other fields
    * in the response may be empty.  Note: The field mask is required.
    * @alias iam.projects.serviceAccounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account` and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.  In responses the resource name will always be in the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    * @param {().PatchServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ServiceAccount] = js.native
  def patch(callback: BodyResponseCallback[Schema$ServiceAccount]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarPatch): GaxiosPromise[Schema$ServiceAccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarPatch,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarPatch,
    options: BodyResponseCallback[Schema$ServiceAccount],
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ServiceAccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.setIamPolicy
    * @desc Sets the Cloud IAM access control policy for a ServiceAccount.
    * Note: Service accounts are both [resources and
    * identities](/iam/docs/service-accounts#service_account_permissions). This
    * method treats the service account as a resource. Use it to grant members
    * access to the service account, such as when they need to impersonate it.
    * This method does not grant the service account access to other resources,
    * such as projects. To grant a service account access to resources, include
    * the service account in the Cloud IAM policy for the desired resource,
    * then call the appropriate `setIamPolicy` method on the target resource.
    * For example, to grant a service account access to a project, call the
    * [projects.setIamPolicy](/resource-manager/reference/rest/v1/projects/setIamPolicy)
    * method.
    * @alias iam.projects.serviceAccounts.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.signBlob
    * @desc **Note**: This method is in the process of being deprecated. Call
    * the
    * [`signBlob()`](/iam/credentials/reference/rest/v1/projects.serviceAccounts/signBlob)
    * method of the Cloud IAM Service Account Credentials API instead.  Signs a
    * blob using a service account's system-managed private key.
    * @alias iam.projects.serviceAccounts.signBlob
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().SignBlobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signBlob(): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(callback: BodyResponseCallback[Schema$SignBlobResponse]): Unit = js.native
  def signBlob(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: BodyResponseCallback[Schema$SignBlobResponse],
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: MethodOptions
  ): GaxiosPromise[Schema$SignBlobResponse] = js.native
  def signBlob(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignblob,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignBlobResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.signJwt
    * @desc **Note**: This method is in the process of being deprecated. Call
    * the
    * [`signJwt()`](/iam/credentials/reference/rest/v1/projects.serviceAccounts/signJwt)
    * method of the Cloud IAM Service Account Credentials API instead.  Signs a
    * JWT using a service account's system-managed private key.  If no expiry
    * time (`exp`) is provided in the `SignJwtRequest`, IAM sets an an expiry
    * time of one hour by default. If you request an expiry time of more than
    * one hour, the request will fail.
    * @alias iam.projects.serviceAccounts.signJwt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    * @param {().SignJwtRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signJwt(): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(callback: BodyResponseCallback[Schema$SignJwtResponse]): Unit = js.native
  def signJwt(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: BodyResponseCallback[Schema$SignJwtResponse],
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: MethodOptions
  ): GaxiosPromise[Schema$SignJwtResponse] = js.native
  def signJwt(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarSignjwt,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignJwtResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.testIamPermissions
    * @desc Tests the specified permissions against the IAM access control
    * policy for a ServiceAccount.
    * @alias iam.projects.serviceAccounts.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.undelete
    * @desc Restores a deleted ServiceAccount. This is to be used as an action
    * of last resort.  A service account may not always be restorable.
    * @alias iam.projects.serviceAccounts.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_UNIQUE_ID}'. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account.
    * @param {().UndeleteServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$UndeleteServiceAccountResponse] = js.native
  def undelete(callback: BodyResponseCallback[Schema$UndeleteServiceAccountResponse]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUndelete): GaxiosPromise[Schema$UndeleteServiceAccountResponse] = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUndelete,
    callback: BodyResponseCallback[Schema$UndeleteServiceAccountResponse]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUndelete,
    options: BodyResponseCallback[Schema$UndeleteServiceAccountResponse],
    callback: BodyResponseCallback[Schema$UndeleteServiceAccountResponse]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUndelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$UndeleteServiceAccountResponse] = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UndeleteServiceAccountResponse]
  ): Unit = js.native
  /**
    * iam.projects.serviceAccounts.update
    * @desc Note: This method is in the process of being deprecated. Use
    * PatchServiceAccount instead.  Updates a ServiceAccount.  Currently, only
    * the following fields are updatable: `display_name` . The `etag` is
    * mandatory.
    * @alias iam.projects.serviceAccounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account in the following format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account` and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.  In responses the resource name will always be in the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    * @param {().ServiceAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ServiceAccount] = js.native
  def update(callback: BodyResponseCallback[Schema$ServiceAccount]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate): GaxiosPromise[Schema$ServiceAccount] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate,
    options: BodyResponseCallback[Schema$ServiceAccount],
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServiceAccount] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
}

