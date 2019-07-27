package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiMethod[TParams, TBody] extends js.Object {
  // Promise API
  def apply(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[TBody, _]] = js.native
  // Callback API
  def apply(callback: callbackFn[TBody]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def apply(params: TParams): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[TBody, _]] = js.native
  def apply(params: TParams, callback: callbackFn[TBody]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def apply(params: TParams, options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[TBody, _]] = js.native
  def apply(
    params: TParams,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[TBody]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

