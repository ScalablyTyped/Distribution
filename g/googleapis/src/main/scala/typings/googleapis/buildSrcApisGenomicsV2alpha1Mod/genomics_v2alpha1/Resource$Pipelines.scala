package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Pipelines")
@js.native
class Resource$Pipelines protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * genomics.pipelines.run
    * @desc Runs a pipeline.  **Note:** Before you can use this method, the
    * Genomics Service Agent must have access to your project. This is done
    * automatically when the Cloud Genomics API is first enabled, but if you
    * delete this permission, or if you enabled the Cloud Genomics API before
    * the v2alpha1 API launch, you must disable and re-enable the API to grant
    * the Genomics Service Agent the required permissions. Authorization
    * requires the following [Google IAM](https://cloud.google.com/iam/)
    * permission:  * `genomics.operations.create`  [1]: /genomics/gsa
    * @alias genomics.pipelines.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RunPipelineRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$Operation] = js.native
  def run(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def run(params: ParamsDollarResourceDollarPipelinesDollarRun): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(params: ParamsDollarResourceDollarPipelinesDollarRun, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

