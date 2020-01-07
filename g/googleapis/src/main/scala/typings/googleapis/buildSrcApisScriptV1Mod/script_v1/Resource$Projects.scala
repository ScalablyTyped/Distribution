package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var deployments: ResourceDollarProjectsDollarDeployments = js.native
  var versions: ResourceDollarProjectsDollarVersions = js.native
  /**
    * script.projects.create
    * @desc Creates a new, empty script project with no script files and a base
    * manifest file.
    * @alias script.projects.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Project] = js.native
  def create(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCreate): GaxiosPromise[Schema$Project] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  /**
    * script.projects.get
    * @desc Gets a script project's metadata.
    * @alias script.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Project] = js.native
  def get(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  /**
    * script.projects.getContent
    * @desc Gets the content of the script project, including the code source
    * and metadata for each script file.
    * @alias script.projects.getContent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {integer=} params.versionNumber The version number of the project to retrieve. If not provided, the project's HEAD version is returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getContent(): GaxiosPromise[Schema$Content] = js.native
  def getContent(callback: BodyResponseCallback[Schema$Content]): Unit = js.native
  def getContent(params: ParamsDollarResourceDollarProjectsDollarGetcontent): GaxiosPromise[Schema$Content] = js.native
  def getContent(
    params: ParamsDollarResourceDollarProjectsDollarGetcontent,
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
  def getContent(
    params: ParamsDollarResourceDollarProjectsDollarGetcontent,
    options: BodyResponseCallback[Schema$Content],
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
  def getContent(params: ParamsDollarResourceDollarProjectsDollarGetcontent, options: MethodOptions): GaxiosPromise[Schema$Content] = js.native
  def getContent(
    params: ParamsDollarResourceDollarProjectsDollarGetcontent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
  /**
    * script.projects.getMetrics
    * @desc Get metrics data for scripts, such as number of executions and
    * active users.
    * @alias script.projects.getMetrics
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.metricsFilter.deploymentId Optional field indicating a specific deployment to retrieve metrics from.
    * @param {string=} params.metricsGranularity Required field indicating what granularity of metrics are returned.
    * @param {string} params.scriptId Required field indicating the script to get metrics for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetrics(): GaxiosPromise[Schema$Metrics] = js.native
  def getMetrics(callback: BodyResponseCallback[Schema$Metrics]): Unit = js.native
  def getMetrics(params: ParamsDollarResourceDollarProjectsDollarGetmetrics): GaxiosPromise[Schema$Metrics] = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarGetmetrics,
    callback: BodyResponseCallback[Schema$Metrics]
  ): Unit = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarGetmetrics,
    options: BodyResponseCallback[Schema$Metrics],
    callback: BodyResponseCallback[Schema$Metrics]
  ): Unit = js.native
  def getMetrics(params: ParamsDollarResourceDollarProjectsDollarGetmetrics, options: MethodOptions): GaxiosPromise[Schema$Metrics] = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Metrics]
  ): Unit = js.native
  /**
    * script.projects.updateContent
    * @desc Updates the content of the specified script project. This content
    * is stored as the HEAD version, and is used when the script is executed as
    * a trigger, in the script editor, in add-on preview mode, or as a web app
    * or Apps Script API in development mode. This clears all the existing
    * files in the project.
    * @alias script.projects.updateContent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().Content} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateContent(): GaxiosPromise[Schema$Content] = js.native
  def updateContent(callback: BodyResponseCallback[Schema$Content]): Unit = js.native
  def updateContent(params: ParamsDollarResourceDollarProjectsDollarUpdatecontent): GaxiosPromise[Schema$Content] = js.native
  def updateContent(
    params: ParamsDollarResourceDollarProjectsDollarUpdatecontent,
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
  def updateContent(
    params: ParamsDollarResourceDollarProjectsDollarUpdatecontent,
    options: BodyResponseCallback[Schema$Content],
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
  def updateContent(params: ParamsDollarResourceDollarProjectsDollarUpdatecontent, options: MethodOptions): GaxiosPromise[Schema$Content] = js.native
  def updateContent(
    params: ParamsDollarResourceDollarProjectsDollarUpdatecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Content]
  ): Unit = js.native
}

