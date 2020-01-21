package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.MonitoringBulk
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBulk extends js.Object {
  @JSName("bulk")
  var bulk_Original: ApiMethod[MonitoringBulk[_], _] = js.native
  // Promise API
  def bulk(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def bulk(callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_]): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

