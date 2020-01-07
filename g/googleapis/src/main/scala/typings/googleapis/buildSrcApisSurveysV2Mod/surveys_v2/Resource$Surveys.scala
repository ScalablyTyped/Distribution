package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/surveys/v2", "surveys_v2.Resource$Surveys")
@js.native
class Resource$Surveys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * surveys.surveys.delete
    * @desc Removes a survey from view in all user GET requests.
    * @alias surveys.surveys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$SurveysDeleteResponse] = js.native
  def delete(callback: BodyResponseCallback[Schema$SurveysDeleteResponse]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSurveysDollarDelete): GaxiosPromise[Schema$SurveysDeleteResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarSurveysDollarDelete,
    callback: BodyResponseCallback[Schema$SurveysDeleteResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSurveysDollarDelete,
    options: BodyResponseCallback[Schema$SurveysDeleteResponse],
    callback: BodyResponseCallback[Schema$SurveysDeleteResponse]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSurveysDollarDelete, options: MethodOptions): GaxiosPromise[Schema$SurveysDeleteResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarSurveysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SurveysDeleteResponse]
  ): Unit = js.native
  /**
    * surveys.surveys.get
    * @desc Retrieves information about the specified survey.
    * @alias surveys.surveys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Survey] = js.native
  def get(callback: BodyResponseCallback[Schema$Survey]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSurveysDollarGet): GaxiosPromise[Schema$Survey] = js.native
  def get(params: ParamsDollarResourceDollarSurveysDollarGet, callback: BodyResponseCallback[Schema$Survey]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSurveysDollarGet,
    options: BodyResponseCallback[Schema$Survey],
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSurveysDollarGet, options: MethodOptions): GaxiosPromise[Schema$Survey] = js.native
  def get(
    params: ParamsDollarResourceDollarSurveysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  /**
    * surveys.surveys.insert
    * @desc Creates a survey.
    * @alias surveys.surveys.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Survey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Survey] = js.native
  def insert(callback: BodyResponseCallback[Schema$Survey]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSurveysDollarInsert): GaxiosPromise[Schema$Survey] = js.native
  def insert(
    params: ParamsDollarResourceDollarSurveysDollarInsert,
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSurveysDollarInsert,
    options: BodyResponseCallback[Schema$Survey],
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSurveysDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Survey] = js.native
  def insert(
    params: ParamsDollarResourceDollarSurveysDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  /**
    * surveys.surveys.list
    * @desc Lists the surveys owned by the authenticated user.
    * @alias surveys.surveys.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {integer=} params.startIndex
    * @param {string=} params.token
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SurveysListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SurveysListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSurveysDollarList): GaxiosPromise[Schema$SurveysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSurveysDollarList,
    callback: BodyResponseCallback[Schema$SurveysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSurveysDollarList,
    options: BodyResponseCallback[Schema$SurveysListResponse],
    callback: BodyResponseCallback[Schema$SurveysListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSurveysDollarList, options: MethodOptions): GaxiosPromise[Schema$SurveysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSurveysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SurveysListResponse]
  ): Unit = js.native
  /**
    * surveys.surveys.start
    * @desc Begins running a survey.
    * @alias surveys.surveys.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceId
    * @param {().SurveysStartRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$SurveysStartResponse] = js.native
  def start(callback: BodyResponseCallback[Schema$SurveysStartResponse]): Unit = js.native
  def start(params: ParamsDollarResourceDollarSurveysDollarStart): GaxiosPromise[Schema$SurveysStartResponse] = js.native
  def start(
    params: ParamsDollarResourceDollarSurveysDollarStart,
    callback: BodyResponseCallback[Schema$SurveysStartResponse]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarSurveysDollarStart,
    options: BodyResponseCallback[Schema$SurveysStartResponse],
    callback: BodyResponseCallback[Schema$SurveysStartResponse]
  ): Unit = js.native
  def start(params: ParamsDollarResourceDollarSurveysDollarStart, options: MethodOptions): GaxiosPromise[Schema$SurveysStartResponse] = js.native
  def start(
    params: ParamsDollarResourceDollarSurveysDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SurveysStartResponse]
  ): Unit = js.native
  /**
    * surveys.surveys.stop
    * @desc Stops a running survey.
    * @alias surveys.surveys.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceId
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Schema$SurveysStopResponse] = js.native
  def stop(callback: BodyResponseCallback[Schema$SurveysStopResponse]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarSurveysDollarStop): GaxiosPromise[Schema$SurveysStopResponse] = js.native
  def stop(
    params: ParamsDollarResourceDollarSurveysDollarStop,
    callback: BodyResponseCallback[Schema$SurveysStopResponse]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarSurveysDollarStop,
    options: BodyResponseCallback[Schema$SurveysStopResponse],
    callback: BodyResponseCallback[Schema$SurveysStopResponse]
  ): Unit = js.native
  def stop(params: ParamsDollarResourceDollarSurveysDollarStop, options: MethodOptions): GaxiosPromise[Schema$SurveysStopResponse] = js.native
  def stop(
    params: ParamsDollarResourceDollarSurveysDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SurveysStopResponse]
  ): Unit = js.native
  /**
    * surveys.surveys.update
    * @desc Updates a survey. Currently the only property that can be updated
    * is the owners property.
    * @alias surveys.surveys.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {().Survey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Survey] = js.native
  def update(callback: BodyResponseCallback[Schema$Survey]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSurveysDollarUpdate): GaxiosPromise[Schema$Survey] = js.native
  def update(
    params: ParamsDollarResourceDollarSurveysDollarUpdate,
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSurveysDollarUpdate,
    options: BodyResponseCallback[Schema$Survey],
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSurveysDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Survey] = js.native
  def update(
    params: ParamsDollarResourceDollarSurveysDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Survey]
  ): Unit = js.native
}

