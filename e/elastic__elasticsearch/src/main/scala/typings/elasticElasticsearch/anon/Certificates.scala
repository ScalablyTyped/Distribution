package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.SslCertificates
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificates extends js.Object {
  def certificates[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def certificates[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def certificates[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def certificates[TResponse, TContext](params: SslCertificates): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def certificates[TResponse, TContext](params: SslCertificates, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def certificates[TResponse, TContext](params: SslCertificates, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def certificates[TResponse, TContext](
    params: SslCertificates,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

