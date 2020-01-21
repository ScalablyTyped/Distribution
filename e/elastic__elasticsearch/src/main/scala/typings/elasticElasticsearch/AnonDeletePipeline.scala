package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.IngestDeletePipeline
import typings.elasticElasticsearch.requestParamsMod.IngestGetPipeline
import typings.elasticElasticsearch.requestParamsMod.IngestProcessorGrok
import typings.elasticElasticsearch.requestParamsMod.IngestPutPipeline
import typings.elasticElasticsearch.requestParamsMod.IngestSimulate
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletePipeline extends js.Object {
  @JSName("deletePipeline")
  var deletePipeline_Original: ApiMethod[IngestDeletePipeline, _] = js.native
  @JSName("delete_pipeline")
  var delete_pipeline_Original: ApiMethod[IngestDeletePipeline, _] = js.native
  @JSName("getPipeline")
  var getPipeline_Original: ApiMethod[IngestGetPipeline, _] = js.native
  @JSName("get_pipeline")
  var get_pipeline_Original: ApiMethod[IngestGetPipeline, _] = js.native
  @JSName("processorGrok")
  var processorGrok_Original: ApiMethod[IngestProcessorGrok, _] = js.native
  @JSName("processor_grok")
  var processor_grok_Original: ApiMethod[IngestProcessorGrok, _] = js.native
  @JSName("putPipeline")
  var putPipeline_Original: ApiMethod[IngestPutPipeline[_], _] = js.native
  @JSName("put_pipeline")
  var put_pipeline_Original: ApiMethod[IngestPutPipeline[_], _] = js.native
  @JSName("simulate")
  var simulate_Original: ApiMethod[IngestSimulate[_], _] = js.native
  // Promise API
  def deletePipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deletePipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePipeline(params: IngestDeletePipeline): js.Promise[ApiResponse[_, _]] = js.native
  def deletePipeline(params: IngestDeletePipeline, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePipeline(params: IngestDeletePipeline, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deletePipeline(params: IngestDeletePipeline, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_pipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_pipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_pipeline(params: IngestDeletePipeline): js.Promise[ApiResponse[_, _]] = js.native
  def delete_pipeline(params: IngestDeletePipeline, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_pipeline(params: IngestDeletePipeline, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_pipeline(params: IngestDeletePipeline, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getPipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getPipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPipeline(params: IngestGetPipeline): js.Promise[ApiResponse[_, _]] = js.native
  def getPipeline(params: IngestGetPipeline, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPipeline(params: IngestGetPipeline, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getPipeline(params: IngestGetPipeline, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_pipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_pipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_pipeline(params: IngestGetPipeline): js.Promise[ApiResponse[_, _]] = js.native
  def get_pipeline(params: IngestGetPipeline, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_pipeline(params: IngestGetPipeline, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_pipeline(params: IngestGetPipeline, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def processorGrok(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def processorGrok(callback: callbackFn[_]): TransportRequestCallback = js.native
  def processorGrok(params: IngestProcessorGrok): js.Promise[ApiResponse[_, _]] = js.native
  def processorGrok(params: IngestProcessorGrok, callback: callbackFn[_]): TransportRequestCallback = js.native
  def processorGrok(params: IngestProcessorGrok, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def processorGrok(params: IngestProcessorGrok, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def processor_grok(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def processor_grok(callback: callbackFn[_]): TransportRequestCallback = js.native
  def processor_grok(params: IngestProcessorGrok): js.Promise[ApiResponse[_, _]] = js.native
  def processor_grok(params: IngestProcessorGrok, callback: callbackFn[_]): TransportRequestCallback = js.native
  def processor_grok(params: IngestProcessorGrok, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def processor_grok(params: IngestProcessorGrok, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putPipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putPipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPipeline(params: IngestPutPipeline[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putPipeline(params: IngestPutPipeline[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPipeline(params: IngestPutPipeline[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putPipeline(params: IngestPutPipeline[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_pipeline(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_pipeline(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_pipeline(params: IngestPutPipeline[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_pipeline(params: IngestPutPipeline[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_pipeline(params: IngestPutPipeline[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_pipeline(params: IngestPutPipeline[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def simulate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def simulate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def simulate(params: IngestSimulate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def simulate(params: IngestSimulate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def simulate(params: IngestSimulate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def simulate(params: IngestSimulate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

