package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.IngestDeletePipeline
import typings.elasticElasticsearch.requestParamsMod.IngestGetPipeline
import typings.elasticElasticsearch.requestParamsMod.IngestProcessorGrok
import typings.elasticElasticsearch.requestParamsMod.IngestPutPipeline
import typings.elasticElasticsearch.requestParamsMod.IngestSimulate
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletepipeline extends StObject {
  
  def deletePipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](
    params: IngestDeletePipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_pipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_pipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](
    params: IngestDeletePipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getPipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](
    params: IngestGetPipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_pipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_pipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](
    params: IngestGetPipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def processorGrok[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processorGrok[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](
    params: IngestProcessorGrok,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def processor_grok[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processor_grok[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](
    params: IngestProcessorGrok,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestPutPipeline[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestPutPipeline[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestSimulate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
