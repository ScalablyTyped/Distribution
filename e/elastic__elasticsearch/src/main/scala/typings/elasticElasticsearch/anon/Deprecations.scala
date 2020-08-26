package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.MigrationDeprecations
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecations extends js.Object {
  def deprecations[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deprecations[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deprecations[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deprecations[TResponse, TContext](params: MigrationDeprecations): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deprecations[TResponse, TContext](params: MigrationDeprecations, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deprecations[TResponse, TContext](params: MigrationDeprecations, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deprecations[TResponse, TContext](
    params: MigrationDeprecations,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

