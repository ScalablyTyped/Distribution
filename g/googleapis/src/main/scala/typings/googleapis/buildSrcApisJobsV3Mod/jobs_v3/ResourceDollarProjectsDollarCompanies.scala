package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v3", "jobs_v3.Resource$Projects$Companies")
@js.native
class ResourceDollarProjectsDollarCompanies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.projects.companies.create
    * @desc Creates a new company entity.
    * @alias jobs.projects.companies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  Resource name of the project under which the company is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().CreateCompanyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Company] = js.native
  def create(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarCreate): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarCreate,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarCreate,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  /**
    * jobs.projects.companies.delete
    * @desc Deletes specified company. Prerequisite: The company has no jobs
    * associated with it.
    * @alias jobs.projects.companies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be deleted.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.projects.companies.get
    * @desc Retrieves specified company.
    * @alias jobs.projects.companies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be retrieved.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Company] = js.native
  def get(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarGet): GaxiosPromise[Schema$Company] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarGet,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarGet,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  /**
    * jobs.projects.companies.list
    * @desc Lists all companies associated with the service account.
    * @alias jobs.projects.companies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional.  The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    * @param {string=} params.pageToken Optional.  The starting indicator from which to return results.
    * @param {string} params.parent Required.  Resource name of the project under which the company is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {boolean=} params.requireOpenJobs Optional.  Set to true if the companies requested must have open jobs.  Defaults to false.  If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCompaniesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarList): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarList,
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarList,
    options: BodyResponseCallback[Schema$ListCompaniesResponse],
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  /**
    * jobs.projects.companies.patch
    * @desc Updates specified company. Company names can't be updated. To
    * update a company name, delete the company and all jobs associated with
    * it, and only then re-create them.
    * @alias jobs.projects.companies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during company update.  The resource name for a company. This is generated by the service when a company is created.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {().UpdateCompanyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Company] = js.native
  def patch(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarPatch): GaxiosPromise[Schema$Company] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarPatch,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarPatch,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarCompaniesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
}

