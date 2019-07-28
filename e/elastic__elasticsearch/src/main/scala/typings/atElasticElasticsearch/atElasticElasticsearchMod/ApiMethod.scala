package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiMethod[TParams, TBody] extends js.Object {
  // Promise API
  def apply(): js.Promise[ApiResponse[TBody, _]] = js.native
  // Callback API
  def apply(callback: callbackFn[TBody]): TransportRequestCallback = js.native
  def apply(params: TParams): js.Promise[ApiResponse[TBody, _]] = js.native
  def apply(params: TParams, callback: callbackFn[TBody]): TransportRequestCallback = js.native
  def apply(params: TParams, options: TransportRequestOptions): js.Promise[ApiResponse[TBody, _]] = js.native
  def apply(params: TParams, options: TransportRequestOptions, callback: callbackFn[TBody]): TransportRequestCallback = js.native
}

