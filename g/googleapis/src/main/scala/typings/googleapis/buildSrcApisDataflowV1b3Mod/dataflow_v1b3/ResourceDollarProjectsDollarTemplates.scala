package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Templates")
@js.native
class ResourceDollarProjectsDollarTemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.templates.create
    * @desc Creates a Cloud Dataflow job from a template.
    * @alias dataflow.projects.templates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {().CreateJobFromTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Job] = js.native
  def create(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarCreate): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarCreate,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarCreate,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataflow.projects.templates.get
    * @desc Get the template associated with a template.
    * @alias dataflow.projects.templates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.gcsPath Required. A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.view The view to retrieve. Defaults to METADATA_ONLY.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GetTemplateResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$GetTemplateResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarGet): GaxiosPromise[Schema$GetTemplateResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarGet,
    callback: BodyResponseCallback[Schema$GetTemplateResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarGet,
    options: BodyResponseCallback[Schema$GetTemplateResponse],
    callback: BodyResponseCallback[Schema$GetTemplateResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GetTemplateResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetTemplateResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.templates.launch
    * @desc Launch a template.
    * @alias dataflow.projects.templates.launch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dynamicTemplate.gcsPath Path to dynamic template spec file on GCS. The file must be a Json serialized DynamicTemplateFieSpec object.
    * @param {string=} params.dynamicTemplate.stagingLocation Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`.
    * @param {string=} params.gcsPath A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    * @param {string} params.projectId Required. The ID of the Cloud Platform project that the job belongs to.
    * @param {boolean=} params.validateOnly If true, the request is validated but not actually executed. Defaults to false.
    * @param {().LaunchTemplateParameters} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def launch(): GaxiosPromise[Schema$LaunchTemplateResponse] = js.native
  def launch(callback: BodyResponseCallback[Schema$LaunchTemplateResponse]): Unit = js.native
  def launch(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarLaunch): GaxiosPromise[Schema$LaunchTemplateResponse] = js.native
  def launch(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarLaunch,
    callback: BodyResponseCallback[Schema$LaunchTemplateResponse]
  ): Unit = js.native
  def launch(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarLaunch,
    options: BodyResponseCallback[Schema$LaunchTemplateResponse],
    callback: BodyResponseCallback[Schema$LaunchTemplateResponse]
  ): Unit = js.native
  def launch(params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarLaunch, options: MethodOptions): GaxiosPromise[Schema$LaunchTemplateResponse] = js.native
  def launch(
    params: ParamsDollarResourceDollarProjectsDollarTemplatesDollarLaunch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LaunchTemplateResponse]
  ): Unit = js.native
}

