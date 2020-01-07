package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Companies")
@js.native
class Resource$Companies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var jobs: ResourceDollarCompaniesDollarJobs = js.native
  /**
    * jobs.companies.create
    * @desc Creates a new company entity.
    * @alias jobs.companies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Company} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Company] = js.native
  def create(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCompaniesDollarCreate): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarCompaniesDollarCreate,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCompaniesDollarCreate,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCompaniesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarCompaniesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  /**
    * jobs.companies.delete
    * @desc Deletes the specified company.
    * @alias jobs.companies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be deleted, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCompaniesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCompaniesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCompaniesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCompaniesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCompaniesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.companies.get
    * @desc Retrieves the specified company.
    * @alias jobs.companies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  Resource name of the company to retrieve, such as "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Company] = js.native
  def get(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCompaniesDollarGet): GaxiosPromise[Schema$Company] = js.native
  def get(
    params: ParamsDollarResourceDollarCompaniesDollarGet,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCompaniesDollarGet,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCompaniesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def get(
    params: ParamsDollarResourceDollarCompaniesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  /**
    * jobs.companies.list
    * @desc Lists all companies associated with a Cloud Talent Solution
    * account.
    * @alias jobs.companies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.mustHaveOpenJobs Optional.  Set to true if the companies request must have open jobs.  Defaults to false.  If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    * @param {integer=} params.pageSize Optional.  The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    * @param {string=} params.pageToken Optional.  The starting indicator from which to return results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCompaniesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCompaniesDollarList): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCompaniesDollarList,
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCompaniesDollarList,
    options: BodyResponseCallback[Schema$ListCompaniesResponse],
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCompaniesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListCompaniesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCompaniesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCompaniesResponse]
  ): Unit = js.native
  /**
    * jobs.companies.patch
    * @desc Updates the specified company. Company names can't be updated. To
    * update a company name, delete the company and all jobs associated with
    * it, and only then re-create them.
    * @alias jobs.companies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during company update.  The resource name for a company. This is generated by the service when a company is created, for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {string=} params.updateCompanyFields Optional but strongly recommended to be provided for the best service experience.  If update_company_fields is provided, only the specified fields in company are updated. Otherwise all the fields are updated.  A field mask to specify the company fields to update. Valid values are:  * displayName * website * imageUrl * companySize * distributorBillingCompanyId * companyInfoSources * careerPageLink * hiringAgency * hqLocation * eeoText * keywordSearchableCustomAttributes * title (deprecated) * keywordSearchableCustomFields (deprecated)
    * @param {().Company} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Company] = js.native
  def patch(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCompaniesDollarPatch): GaxiosPromise[Schema$Company] = js.native
  def patch(
    params: ParamsDollarResourceDollarCompaniesDollarPatch,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCompaniesDollarPatch,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCompaniesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def patch(
    params: ParamsDollarResourceDollarCompaniesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
}

