package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Resource$Projects$Repos")
@js.native
class ResourceDollarProjectsDollarRepos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sourcerepo.projects.repos.create
    * @desc Creates a repo in the given project with the given name.  If the
    * named repository already exists, `CreateRepo` returns `ALREADY_EXISTS`.
    * @alias sourcerepo.projects.repos.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create the repo. Values are of the form `projects/<project>`.
    * @param {().Repo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Repo] = js.native
  def create(callback: BodyResponseCallback[Schema$Repo]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarReposDollarCreate): GaxiosPromise[Schema$Repo] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarCreate,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarCreate,
    options: BodyResponseCallback[Schema$Repo],
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarReposDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Repo] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.delete
    * @desc Deletes a repo.
    * @alias sourcerepo.projects.repos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the repo to delete. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarReposDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarReposDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.get
    * @desc Returns information about a repo.
    * @alias sourcerepo.projects.repos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested repository. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Repo] = js.native
  def get(callback: BodyResponseCallback[Schema$Repo]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarReposDollarGet): GaxiosPromise[Schema$Repo] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGet,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGet,
    options: BodyResponseCallback[Schema$Repo],
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarReposDollarGet, options: MethodOptions): GaxiosPromise[Schema$Repo] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias sourcerepo.projects.repos.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarReposDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarReposDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.list
    * @desc Returns all repos belonging to a project. The sizes of the repos
    * are not set by ListRepos.  To get the size of a repo, use GetRepo.
    * @alias sourcerepo.projects.repos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project ID whose repos should be listed. Values are of the form `projects/<project>`.
    * @param {integer=} params.pageSize Maximum number of repositories to return; between 1 and 500. If not set or zero, defaults to 100 at the server.
    * @param {string=} params.pageToken Resume listing repositories where a prior ListReposResponse left off. This is an opaque token that must be obtained from a recent, prior ListReposResponse's next_page_token field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListReposResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListReposResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarReposDollarList): GaxiosPromise[Schema$ListReposResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarList,
    callback: BodyResponseCallback[Schema$ListReposResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarList,
    options: BodyResponseCallback[Schema$ListReposResponse],
    callback: BodyResponseCallback[Schema$ListReposResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarReposDollarList, options: MethodOptions): GaxiosPromise[Schema$ListReposResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListReposResponse]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.patch
    * @desc Updates information about a repo.
    * @alias sourcerepo.projects.repos.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested repository. Values are of the form `projects/<project>/repos/<repo>`.
    * @param {().UpdateRepoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Repo] = js.native
  def patch(callback: BodyResponseCallback[Schema$Repo]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarReposDollarPatch): GaxiosPromise[Schema$Repo] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarPatch,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarPatch,
    options: BodyResponseCallback[Schema$Repo],
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarReposDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Repo] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Repo]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias sourcerepo.projects.repos.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarReposDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarReposDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * sourcerepo.projects.repos.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    * @alias sourcerepo.projects.repos.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarReposDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarReposDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

