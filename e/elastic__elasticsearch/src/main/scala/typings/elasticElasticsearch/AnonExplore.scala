package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.GraphExplore
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplore extends js.Object {
  @JSName("explore")
  var explore_Original: ApiMethod[GraphExplore[_], _] = js.native
  // Promise API
  def explore(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explore(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

