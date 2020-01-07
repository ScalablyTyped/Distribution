package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/surveys/v2", "surveys_v2.Resource$Results")
@js.native
class Resource$Results protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * surveys.results.get
    * @desc Retrieves any survey results that have been produced so far.
    * Results are formatted as an Excel file. You must add "?alt=media" to the
    * URL as an argument to get results.
    * @alias surveys.results.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {().ResultsGetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SurveyResults] = js.native
  def get(callback: BodyResponseCallback[Schema$SurveyResults]): Unit = js.native
  def get(params: ParamsDollarResourceDollarResultsDollarGet): GaxiosPromise[Schema$SurveyResults] = js.native
  def get(
    params: ParamsDollarResourceDollarResultsDollarGet,
    callback: BodyResponseCallback[Schema$SurveyResults]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarResultsDollarGet,
    options: BodyResponseCallback[Schema$SurveyResults],
    callback: BodyResponseCallback[Schema$SurveyResults]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarResultsDollarGet, options: MethodOptions): GaxiosPromise[Schema$SurveyResults] = js.native
  def get(
    params: ParamsDollarResourceDollarResultsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SurveyResults]
  ): Unit = js.native
}

