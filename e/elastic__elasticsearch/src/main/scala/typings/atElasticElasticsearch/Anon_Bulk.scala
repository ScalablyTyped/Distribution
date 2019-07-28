package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.MonitoringBulk
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bulk extends js.Object {
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

