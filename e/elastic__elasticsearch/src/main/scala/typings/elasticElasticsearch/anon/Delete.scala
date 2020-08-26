package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.AsyncSearchDelete
import typings.elasticElasticsearch.requestParamsMod.AsyncSearchGet
import typings.elasticElasticsearch.requestParamsMod.AsyncSearchSubmit
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: AsyncSearchDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: AsyncSearchDelete, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: AsyncSearchDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: AsyncSearchDelete,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: AsyncSearchGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: AsyncSearchGet, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: AsyncSearchGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](
    params: AsyncSearchGet,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AsyncSearchSubmit[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AsyncSearchSubmit[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AsyncSearchSubmit[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: AsyncSearchSubmit[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

