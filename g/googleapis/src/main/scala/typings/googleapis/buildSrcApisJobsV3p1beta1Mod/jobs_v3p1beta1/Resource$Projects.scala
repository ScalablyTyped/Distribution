package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var clientEvents: ResourceDollarProjectsDollarClientevents = js.native
  var companies: ResourceDollarProjectsDollarCompanies = js.native
  var context: APIRequestContext = js.native
  var jobs: ResourceDollarProjectsDollarJobs = js.native
  var operations: ResourceDollarProjectsDollarOperations = js.native
  /**
    * jobs.projects.complete
    * @desc Completes the specified prefix with keyword suggestions. Intended
    * for use by a job search auto-complete search box.
    * @alias jobs.projects.complete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.companyName Optional.  If provided, restricts completion to specified company.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {string=} params.languageCode Deprecated. Use language_codes instead.  Optional.  The language of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For CompletionType.JOB_TITLE type, only open jobs with the same language_code are returned.  For CompletionType.COMPANY_NAME type, only companies having open jobs with the same language_code are returned.  For CompletionType.COMBINED type, only open jobs with the same language_code or companies having open jobs with the same language_code are returned.  The maximum number of allowed characters is 255.
    * @param {string=} params.languageCodes Optional.  The list of languages of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For CompletionType.JOB_TITLE type, only open jobs with the same language_codes are returned.  For CompletionType.COMPANY_NAME type, only companies having open jobs with the same language_codes are returned.  For CompletionType.COMBINED type, only open jobs with the same language_codes or companies having open jobs with the same language_codes are returned.  The maximum number of allowed characters is 255.
    * @param {string} params.name Required.  Resource name of project the completion is performed within.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {integer=} params.pageSize Required.  Completion result count.  The maximum allowed page size is 10.
    * @param {string=} params.query Required.  The query used to generate suggestions.  The maximum number of allowed characters is 255.
    * @param {string=} params.scope Optional.  The scope of the completion. The defaults is CompletionScope.PUBLIC.
    * @param {string=} params.type Optional.  The completion topic. The default is CompletionType.COMBINED.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def complete(): GaxiosPromise[Schema$CompleteQueryResponse] = js.native
  def complete(callback: BodyResponseCallback[Schema$CompleteQueryResponse]): Unit = js.native
  def complete(params: ParamsDollarResourceDollarProjectsDollarComplete): GaxiosPromise[Schema$CompleteQueryResponse] = js.native
  def complete(
    params: ParamsDollarResourceDollarProjectsDollarComplete,
    callback: BodyResponseCallback[Schema$CompleteQueryResponse]
  ): Unit = js.native
  def complete(
    params: ParamsDollarResourceDollarProjectsDollarComplete,
    options: BodyResponseCallback[Schema$CompleteQueryResponse],
    callback: BodyResponseCallback[Schema$CompleteQueryResponse]
  ): Unit = js.native
  def complete(params: ParamsDollarResourceDollarProjectsDollarComplete, options: MethodOptions): GaxiosPromise[Schema$CompleteQueryResponse] = js.native
  def complete(
    params: ParamsDollarResourceDollarProjectsDollarComplete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CompleteQueryResponse]
  ): Unit = js.native
}

