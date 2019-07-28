package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.GraphExplore
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Explore extends js.Object {
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

