package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.MigrationDeprecations
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeprecations extends js.Object {
  @JSName("deprecations")
  var deprecations_Original: ApiMethod[MigrationDeprecations, _] = js.native
  // Promise API
  def deprecations(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deprecations(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

