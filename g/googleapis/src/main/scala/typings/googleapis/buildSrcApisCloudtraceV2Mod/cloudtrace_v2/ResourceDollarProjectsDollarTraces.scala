package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces")
@js.native
class ResourceDollarProjectsDollarTraces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var spans: ResourceDollarProjectsDollarTracesDollarSpans = js.native
  /**
    * cloudtrace.projects.traces.batchWrite
    * @desc Sends new spans to new or existing traces. You cannot update
    * existing spans.
    * @alias cloudtrace.projects.traces.batchWrite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
    * @param {().BatchWriteSpansRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchWrite(): GaxiosPromise[Schema$Empty] = js.native
  def batchWrite(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def batchWrite(params: ParamsDollarResourceDollarProjectsDollarTracesDollarBatchwrite): GaxiosPromise[Schema$Empty] = js.native
  def batchWrite(
    params: ParamsDollarResourceDollarProjectsDollarTracesDollarBatchwrite,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchWrite(
    params: ParamsDollarResourceDollarProjectsDollarTracesDollarBatchwrite,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchWrite(params: ParamsDollarResourceDollarProjectsDollarTracesDollarBatchwrite, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def batchWrite(
    params: ParamsDollarResourceDollarProjectsDollarTracesDollarBatchwrite,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

