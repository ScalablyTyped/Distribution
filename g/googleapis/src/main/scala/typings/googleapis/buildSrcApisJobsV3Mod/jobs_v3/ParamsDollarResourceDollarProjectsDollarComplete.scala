package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarComplete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  If provided, restricts completion to specified company.  The
    * format is "projects/{project_id}/companies/{company_id}", for example,
    * "projects/api-test-project/companies/foo".
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use language_codes instead.  Optional.  The language of the
    * query. This is the BCP-47 language code, such as "en-US" or "sr-Latn".
    * For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same language_code
    * are returned.  For CompletionType.COMPANY_NAME type, only companies
    * having open jobs with the same language_code are returned.  For
    * CompletionType.COMBINED type, only open jobs with the same language_code
    * or companies having open jobs with the same language_code are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional.  The list of languages of the query. This is the BCP-47
    * language code, such as "en-US" or "sr-Latn". For more information, see
    * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same
    * language_codes are returned.  For CompletionType.COMPANY_NAME type, only
    * companies having open jobs with the same language_codes are returned. For
    * CompletionType.COMBINED type, only open jobs with the same language_codes
    * or companies having open jobs with the same language_codes are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required.  Resource name of project the completion is performed within.
    * The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required.  Completion result count.  The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Required.  The query used to generate suggestions.  The maximum number of
    * allowed characters is 255.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Optional.  The scope of the completion. The defaults is
    * CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Optional.  The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.native
}

